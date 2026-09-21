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
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int13 = preloaded3.getLineOffset((int) (byte) 1);
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str7 = preloaded3.getLine((int) 'a');
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.getCode();
        int int8 = preloaded4.getNumLines();
        java.lang.String str9 = preloaded4.toString();
        java.lang.String str10 = preloaded4.getOriginalPath();
        preloaded4.clearCachedSource();
        java.io.Reader reader12 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.toString();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.setIsExtern(false);
        java.lang.String str17 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(false);
        boolean boolean13 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        java.lang.String str12 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        boolean boolean11 = sourceFile9.hasSourceInMemory();
        java.lang.String str12 = sourceFile9.getOriginalPath();
        boolean boolean13 = sourceFile9.isExtern();
        int int14 = sourceFile9.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean5 = generated2.hasSourceInMemory();
        generated2.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str11 = generated2.getCodeNoCache();
        java.lang.String str12 = generated2.toString();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        int int9 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded2.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.getName();
        boolean boolean14 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        java.lang.String str17 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        preloaded2.setIsExtern(true);
        java.lang.String str10 = preloaded2.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        boolean boolean10 = preloaded6.hasSourceInMemory();
        boolean boolean11 = preloaded6.hasSourceInMemory();
        preloaded6.setOriginalPath("");
        java.io.Reader reader14 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        int int10 = preloaded3.getNumLines();
        int int12 = preloaded3.getLineOffset(1);
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        java.lang.Class<?> wildcardClass18 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = preloaded3.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        java.io.Reader reader16 = preloaded3.getCodeReader();
        java.lang.String str17 = preloaded3.getName();
        java.lang.String str18 = preloaded3.getName();
        preloaded3.clearCachedSource();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) 'a');
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region19 = preloaded3.getRegion((int) (short) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertNull(region19);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str12 = preloaded3.getLine((int) (byte) 1);
        boolean boolean13 = preloaded3.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.getCode();
        java.lang.String str8 = preloaded2.getCode();
        boolean boolean9 = preloaded2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = preloaded2.getRegion((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str7 = preloaded3.getLine((int) 'a');
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(region9);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        boolean boolean10 = generated2.hasSourceInMemory();
        java.lang.Class<?> wildcardClass11 = generated2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region7 = preloaded3.getRegion((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        java.io.Reader reader16 = preloaded3.getCodeReader();
        java.lang.String str17 = preloaded3.getName();
        boolean boolean18 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        sourceFile2.setOriginalPath("hi!");
        int int8 = sourceFile2.getLineOffset(1);
        sourceFile2.setOriginalPath("hi!");
        java.lang.String str11 = sourceFile2.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        java.lang.String str9 = preloaded3.getName();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded3.setIsExtern(false);
        boolean boolean6 = preloaded3.hasSourceInMemory();
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        java.lang.String str15 = preloaded3.getLine((int) (byte) -1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        java.lang.String str10 = preloaded3.toString();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        boolean boolean12 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        java.lang.String str15 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str10 = preloaded3.getOriginalPath();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getLine((int) (byte) 100);
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        sourceFile9.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = sourceFile9.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) -1);
        java.lang.String str6 = sourceFile3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str12 = preloaded3.getName();
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        java.lang.String str10 = preloaded3.toString();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        boolean boolean12 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        java.lang.String str15 = preloaded3.toString();
        java.lang.String str16 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        boolean boolean15 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.getName();
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        boolean boolean11 = preloaded3.isExtern();
        java.lang.String str12 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        java.lang.String str11 = sourceFile3.getLine((int) (short) 10);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        java.io.Reader reader16 = preloaded3.getCodeReader();
        java.lang.String str17 = preloaded3.getName();
        java.lang.String str18 = preloaded3.getName();
        boolean boolean19 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion(0);
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = sourceFile2.getLineOffset((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile10.clearCachedSource();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        int int10 = preloaded3.getNumLines();
        int int12 = preloaded3.getLineOffset(1);
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        java.lang.String str10 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        java.lang.String str10 = sourceFile3.getLine((int) ' ');
        int int12 = sourceFile3.getLineOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        java.lang.String str9 = preloaded4.toString();
        boolean boolean10 = preloaded4.isExtern();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        java.lang.String str13 = sourceFile12.getCodeNoCache();
        java.lang.String str14 = sourceFile12.getCodeNoCache();
        sourceFile12.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
            com.google.javascript.jscomp.Region region13 = generated2.getRegion((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str6 = sourceFile5.getOriginalPath();
        java.io.Reader reader7 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion(1);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        java.lang.String str10 = preloaded5.getOriginalPath();
        preloaded5.setOriginalPath("hi!");
        java.lang.String str13 = preloaded5.getName();
        java.io.Reader reader14 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.toString();
        java.lang.String str14 = preloaded3.getCodeNoCache();
        boolean boolean15 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) 'a');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        java.lang.String str11 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        java.lang.String str15 = preloaded3.getLine((int) '4');
        java.lang.String str17 = preloaded3.getLine((int) (byte) -1);
        java.lang.String str19 = preloaded3.getLine((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = sourceFile2.getCode();
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.io.Reader reader12 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        preloaded4.setOriginalPath("");
        java.io.Reader reader13 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        java.lang.String str15 = sourceFile14.toString();
        int int16 = sourceFile14.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass12 = generated2.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        java.io.Reader reader12 = preloaded3.getCodeReader();
        java.lang.String str13 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion(10);
        java.lang.String str15 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        com.google.javascript.jscomp.Region region4 = preloaded2.getRegion((int) 'a');
        boolean boolean5 = preloaded2.hasSourceInMemory();
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        sourceFile3.setOriginalPath("hi!");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean10 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.Class<?> wildcardClass9 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str12 = preloaded3.getLine((int) (byte) 1);
        java.lang.String str13 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        preloaded2.setOriginalPath("hi!");
        java.lang.String str11 = preloaded2.getCode();
        boolean boolean12 = preloaded2.hasSourceInMemory();
        java.lang.String str13 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        java.lang.String str6 = preloaded3.getLine((int) (short) 0);
        java.lang.String str8 = preloaded3.getLine(10);
        java.lang.Class<?> wildcardClass9 = preloaded3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) '4');
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.clearCachedSource();
        java.lang.String str13 = sourceFile11.toString();
        sourceFile11.setIsExtern(false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.lang.String str17 = preloaded3.getLine((int) (byte) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.clearCachedSource();
        boolean boolean13 = sourceFile11.isExtern();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) 'a');
        preloaded3.clearCachedSource();
        java.lang.String str19 = preloaded3.getLine((int) '#');
        int int20 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCodeNoCache();
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        boolean boolean18 = sourceFile9.hasSourceInMemory();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.String str17 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.toString();
        java.io.Reader reader12 = sourceFile10.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        int int14 = sourceFile13.getNumLines();
        int int15 = sourceFile13.getNumLines();
        java.lang.String str16 = sourceFile13.getCodeNoCache();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        java.lang.String str13 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean6 = sourceFile5.isExtern();
        int int7 = sourceFile5.getNumLines();
        java.io.Reader reader8 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("", reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        sourceFile9.setOriginalPath("hi!");
        int int12 = sourceFile9.getNumLines();
        java.io.Reader reader13 = sourceFile9.getCodeReader();
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) (byte) -1);
        boolean boolean16 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(region15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.getCode();
        java.lang.String str8 = preloaded2.getCode();
        boolean boolean9 = preloaded2.hasSourceInMemory();
        java.lang.String str10 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.lang.String str12 = preloaded3.getCode();
        java.lang.String str13 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        java.lang.String str7 = sourceFile2.getLine((int) (byte) -1);
        sourceFile2.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        java.lang.String str10 = sourceFile3.getName();
        java.lang.String str11 = sourceFile3.toString();
        int int12 = sourceFile3.getNumLines();
        java.lang.String str14 = sourceFile3.getLine((int) '#');
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion(1);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        sourceFile3.clearCachedSource();
        sourceFile3.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = sourceFile3.getRegion((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getLine(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str12 = preloaded3.getCode();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str6 = sourceFile2.getLine((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile2.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        boolean boolean16 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        boolean boolean13 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getCodeNoCache();
        java.lang.String str10 = preloaded3.getLine((int) (byte) 100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) (short) 0);
        boolean boolean13 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(region12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        java.lang.String str9 = preloaded4.getOriginalPath();
        preloaded4.setOriginalPath("hi!");
        java.lang.String str12 = preloaded4.getCode();
        com.google.javascript.jscomp.Region region14 = preloaded4.getRegion((int) (short) 1);
        int int15 = preloaded4.getNumLines();
        java.io.Reader reader16 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("", reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) (byte) 100);
        preloaded3.setIsExtern(true);
        java.lang.String str13 = preloaded3.getLine(0);
        java.lang.String str14 = preloaded3.getName();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.getLine(0);
        java.io.Reader reader14 = preloaded3.getCodeReader();
        java.lang.String str15 = preloaded3.getCode();
        int int16 = preloaded3.getNumLines();
        java.io.Reader reader17 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(reader17);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        java.lang.String str7 = sourceFile2.getCodeNoCache();
        java.lang.String str8 = sourceFile2.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getOriginalPath();
        sourceFile9.setIsExtern(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int5 = preloaded4.getNumLines();
        java.lang.String str6 = preloaded4.toString();
        int int7 = preloaded4.getNumLines();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        int int10 = sourceFile9.getNumLines();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getName();
        preloaded2.setOriginalPath("hi!");
        java.io.Reader reader6 = preloaded2.getCodeReader();
        java.lang.String str8 = preloaded2.getLine((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getCode();
        com.google.javascript.jscomp.Region region13 = sourceFile10.getRegion((-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getLine((int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        boolean boolean13 = preloaded3.isExtern();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        com.google.javascript.jscomp.Region region17 = preloaded3.getRegion(0);
        java.lang.String str18 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(region17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.toString();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        int int4 = sourceFile3.getNumLines();
        java.lang.String str5 = sourceFile3.toString();
        java.lang.String str6 = sourceFile3.getName();
        sourceFile3.setIsExtern(true);
        sourceFile3.clearCachedSource();
        java.lang.String str10 = sourceFile3.getName();
        int int11 = sourceFile3.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str10 = preloaded3.getLine((int) (short) 100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion(1);
        preloaded3.setIsExtern(true);
        boolean boolean15 = preloaded3.isExtern();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        java.lang.String str12 = preloaded3.getLine((int) ' ');
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        boolean boolean17 = sourceFile16.isExtern();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        java.lang.String str15 = sourceFile11.getLine(10);
        java.lang.String str16 = sourceFile11.getCodeNoCache();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        java.lang.String str10 = sourceFile3.getName();
        java.io.Reader reader11 = sourceFile3.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        int int7 = sourceFile3.getLineOffset((int) (byte) 1);
        boolean boolean8 = sourceFile3.isExtern();
        sourceFile3.setOriginalPath("hi!");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        java.io.Reader reader12 = preloaded3.getCodeReader();
        boolean boolean13 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        java.lang.String str11 = preloaded6.getOriginalPath();
        preloaded6.setOriginalPath("hi!");
        java.lang.String str14 = preloaded6.getName();
        java.io.Reader reader15 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader15);
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader15);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("", reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        java.lang.String str9 = preloaded4.toString();
        boolean boolean10 = preloaded4.isExtern();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        java.lang.String str13 = sourceFile12.getCodeNoCache();
        java.lang.String str14 = sourceFile12.getCodeNoCache();
        java.io.Reader reader15 = sourceFile12.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean10 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        java.lang.String str9 = preloaded3.getName();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (short) 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        boolean boolean5 = sourceFile2.hasSourceInMemory();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile2.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str12 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.io.Reader reader14 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getName();
        int int12 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str8 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        int int12 = preloaded3.getNumLines();
        java.lang.String str13 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean13 = sourceFile12.hasSourceInMemory();
        java.io.Reader reader14 = sourceFile12.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("", reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) 'a');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        java.lang.String str8 = generated2.getName();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader12 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine((int) (byte) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        java.lang.String str5 = sourceFile3.toString();
        java.lang.String str6 = sourceFile3.getOriginalPath();
        java.io.Reader reader7 = sourceFile3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = sourceFile3.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        java.lang.String str18 = sourceFile9.getOriginalPath();
        java.lang.Class<?> wildcardClass19 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        preloaded3.setOriginalPath("");
        java.lang.String str16 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getName();
        generated2.clearCachedSource();
        boolean boolean10 = generated2.isExtern();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        int int9 = preloaded3.getNumLines();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        java.lang.Class<?> wildcardClass13 = generated2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.setIsExtern(true);
        java.lang.String str9 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region11 = generated2.getRegion((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getName();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) '4');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int5 = preloaded3.getLineOffset((int) (byte) 1);
        preloaded3.setIsExtern(false);
        java.lang.String str8 = preloaded3.toString();
        boolean boolean9 = preloaded3.isExtern();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("", reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getOriginalPath();
        int int6 = sourceFile3.getLineOffset((int) (byte) 1);
        java.lang.String str7 = sourceFile3.getCodeNoCache();
        com.google.javascript.jscomp.Region region9 = sourceFile3.getRegion((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean6 = generated2.hasSourceInMemory();
        boolean boolean7 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (byte) -1);
        java.lang.String str14 = sourceFile9.getCodeNoCache();
        java.lang.String str15 = sourceFile9.toString();
        boolean boolean16 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        java.lang.String str5 = preloaded2.getLine((int) '4');
        int int6 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getCodeNoCache();
        com.google.javascript.jscomp.Region region9 = preloaded2.getRegion((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean8 = generated2.hasSourceInMemory();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        java.lang.String str10 = preloaded2.getName();
        java.lang.String str11 = preloaded2.getCode();
        int int12 = preloaded2.getNumLines();
        preloaded2.setOriginalPath("hi!");
        java.lang.String str15 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setOriginalPath("hi!");
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) '4');
        boolean boolean14 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str11 = sourceFile9.getLine(10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        sourceFile9.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getLine((int) (short) 10);
        boolean boolean10 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded2.getCode();
        preloaded2.clearCachedSource();
        java.lang.String str11 = preloaded2.getOriginalPath();
        java.lang.String str12 = preloaded2.getCode();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        preloaded3.setOriginalPath("hi!");
        java.lang.String str9 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        preloaded3.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            int int17 = preloaded3.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int9 = preloaded3.getLineOffset(1);
        java.lang.String str10 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        java.lang.String str4 = sourceFile3.getCode();
        java.lang.String str5 = sourceFile3.getName();
        int int6 = sourceFile3.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getOriginalPath();
        int int12 = sourceFile9.getNumLines();
        boolean boolean13 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        preloaded2.setIsExtern(false);
        preloaded2.setIsExtern(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        java.lang.String str15 = preloaded3.getLine((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getOriginalPath();
        int int6 = sourceFile3.getLineOffset((int) (byte) 1);
        java.lang.String str7 = sourceFile3.getCodeNoCache();
        com.google.javascript.jscomp.Region region9 = sourceFile3.getRegion((int) (byte) 1);
        java.lang.String str11 = sourceFile3.getLine((int) (byte) 100);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        int int12 = preloaded3.getNumLines();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        java.lang.String str16 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion(10);
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        java.lang.String str12 = preloaded3.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = sourceFile9.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int12 = preloaded3.getNumLines();
        boolean boolean13 = preloaded3.hasSourceInMemory();
        java.lang.String str14 = preloaded3.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        boolean boolean10 = sourceFile9.hasSourceInMemory();
        java.lang.String str12 = sourceFile9.getLine(0);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass11 = generated2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        sourceFile3.setOriginalPath("hi!");
        sourceFile3.setOriginalPath("hi!");
        java.lang.String str9 = sourceFile3.getLine((int) (short) -1);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.toString();
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion(100);
        int int14 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        java.io.Reader reader17 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(reader17);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        boolean boolean6 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        sourceFile2.setIsExtern(true);
        sourceFile2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader10 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        java.lang.String str13 = generated2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.toString();
        boolean boolean15 = preloaded3.hasSourceInMemory();
        boolean boolean16 = preloaded3.hasSourceInMemory();
        boolean boolean17 = preloaded3.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = preloaded3.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        com.google.javascript.jscomp.Region region14 = sourceFile9.getRegion(0);
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(region14);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(region13);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        int int11 = preloaded3.getNumLines();
        preloaded3.setIsExtern(false);
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(false);
        preloaded2.setIsExtern(false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        java.lang.String str8 = generated2.getName();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        boolean boolean8 = preloaded2.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        java.lang.String str13 = sourceFile9.getLine(0);
        sourceFile9.setOriginalPath("hi!");
        java.lang.String str16 = sourceFile9.getCode();
        java.lang.String str17 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        preloaded3.setOriginalPath("");
        java.lang.String str19 = preloaded3.getLine((int) ' ');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        preloaded4.clearCachedSource();
        java.lang.String str10 = preloaded4.getCode();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("", reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getLine((int) '4');
        com.google.javascript.jscomp.Region region16 = sourceFile9.getRegion(10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(region16);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int9 = preloaded3.getLineOffset(1);
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        java.lang.String str9 = preloaded4.getOriginalPath();
        preloaded4.setOriginalPath("hi!");
        java.lang.String str12 = preloaded4.getName();
        java.io.Reader reader13 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        int int15 = sourceFile14.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        java.lang.String str8 = preloaded3.getCodeNoCache();
        java.lang.String str9 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getCodeNoCache();
        java.lang.String str10 = preloaded3.getLine((int) (byte) 100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) (short) 0);
        java.lang.String str13 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        java.lang.String str12 = generated2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        java.lang.String str10 = sourceFile7.getOriginalPath();
        com.google.javascript.jscomp.Region region12 = sourceFile7.getRegion((int) (byte) 100);
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getOriginalPath();
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) (byte) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) (short) 1);
        java.lang.String str17 = preloaded3.getCodeNoCache();
        java.lang.String str18 = preloaded3.getCodeNoCache();
        java.lang.String str19 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        java.lang.String str13 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getCode();
        java.lang.String str15 = sourceFile9.getCode();
        boolean boolean16 = sourceFile9.isExtern();
        java.lang.Class<?> wildcardClass17 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine(0);
        java.lang.String str7 = preloaded3.getCodeNoCache();
        java.lang.String str8 = preloaded3.getCodeNoCache();
        java.io.Reader reader9 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        int int11 = preloaded3.getNumLines();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        boolean boolean13 = preloaded3.isExtern();
        java.lang.String str14 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        int int13 = sourceFile9.getNumLines();
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) '4');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getLine(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("hi!");
        java.io.Reader reader13 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str12 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        int int13 = preloaded3.getNumLines();
        java.lang.String str15 = preloaded3.getLine(0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str12 = preloaded3.getLine(0);
        java.lang.String str13 = preloaded3.toString();
        java.lang.String str14 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str6 = sourceFile2.getLine((int) '#');
        java.lang.String str7 = sourceFile2.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.io.Reader reader12 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        com.google.javascript.jscomp.Region region8 = preloaded2.getRegion((int) (short) 1);
        preloaded2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(region8);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) (byte) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(region16);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(false);
        java.lang.String str11 = preloaded3.getName();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        sourceFile13.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass16 = sourceFile13.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (byte) -1);
        java.lang.String str14 = sourceFile9.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str4 = preloaded2.getLine((int) (short) 1);
        java.lang.String str5 = preloaded2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = preloaded2.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region16 = generated2.getRegion((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        java.lang.String str11 = preloaded3.toString();
        boolean boolean12 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
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
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str8 = sourceFile7.getOriginalPath();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        sourceFile3.clearCachedSource();
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.toString();
        int int7 = sourceFile3.getNumLines();
        boolean boolean8 = sourceFile3.hasSourceInMemory();
        java.lang.String str9 = sourceFile3.toString();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        java.lang.String str16 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        boolean boolean10 = generated2.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getOriginalPath();
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion(100);
        java.lang.Class<?> wildcardClass14 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        java.lang.String str5 = sourceFile3.toString();
        sourceFile3.clearCachedSource();
        sourceFile3.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) -1);
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        sourceFile3.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        java.io.Reader reader7 = sourceFile3.getCodeReader();
        java.lang.Class<?> wildcardClass8 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getCode();
        int int10 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.getCode();
        int int8 = preloaded4.getNumLines();
        preloaded4.clearCachedSource();
        java.io.Reader reader10 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("", reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        java.lang.String str18 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        java.lang.String str18 = sourceFile9.getOriginalPath();
        java.lang.String str19 = sourceFile9.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region17 = preloaded3.getRegion((int) '4');
        java.lang.String str18 = preloaded3.getCode();
        java.io.Reader reader19 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(region17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(reader19);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.toString();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        java.io.Reader reader5 = preloaded2.getCodeReader();
        java.io.Reader reader6 = preloaded2.getCodeReader();
        boolean boolean7 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!");
        java.lang.String str3 = sourceFile2.getCodeNoCache();
        java.lang.String str4 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region6 = sourceFile2.getRegion((-1));
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(region6);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str6 = sourceFile2.getLine((int) '#');
        java.lang.String str8 = sourceFile2.getLine(10);
        java.lang.String str10 = sourceFile2.getLine((int) (byte) 10);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        java.io.Reader reader14 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        java.lang.String str9 = preloaded2.getCode();
        java.lang.String str10 = preloaded2.getName();
        preloaded2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        sourceFile9.clearCachedSource();
        boolean boolean17 = sourceFile9.isExtern();
        boolean boolean18 = sourceFile9.hasSourceInMemory();
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        sourceFile9.setOriginalPath("hi!");
        boolean boolean14 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(false);
        boolean boolean5 = preloaded2.hasSourceInMemory();
        java.io.Reader reader6 = preloaded2.getCodeReader();
        java.io.Reader reader7 = preloaded2.getCodeReader();
        java.io.Reader reader8 = preloaded2.getCodeReader();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        preloaded4.setOriginalPath("");
        preloaded4.clearCachedSource();
        preloaded4.setIsExtern(false);
        preloaded4.setOriginalPath("hi!");
        java.io.Reader reader19 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromReader("", reader19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reader19);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        java.lang.String str13 = sourceFile9.getOriginalPath();
        java.io.Reader reader14 = sourceFile9.getCodeReader();
        java.lang.Class<?> wildcardClass15 = reader14.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        boolean boolean5 = preloaded2.hasSourceInMemory();
        java.lang.String str7 = preloaded2.getLine((int) '4');
        java.lang.String str8 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        boolean boolean15 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.setIsExtern(false);
        boolean boolean11 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.toString();
        java.lang.String str8 = generated2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded3.setIsExtern(false);
        boolean boolean6 = preloaded3.hasSourceInMemory();
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("", reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("");
        java.lang.String str18 = preloaded3.toString();
        boolean boolean19 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
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
        java.lang.Class<?> wildcardClass15 = generated2.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
            int int12 = generated2.getLineOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        int int4 = sourceFile3.getNumLines();
        java.lang.String str5 = sourceFile3.toString();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = sourceFile3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 0);
        preloaded3.clearCachedSource();
        boolean boolean15 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(false);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        int int15 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.lang.String str9 = sourceFile7.getOriginalPath();
        java.lang.String str10 = sourceFile7.getCode();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        boolean boolean7 = sourceFile2.isExtern();
        boolean boolean8 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCode();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        boolean boolean7 = sourceFile3.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.Class<?> wildcardClass11 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.isExtern();
        java.lang.String str10 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region7 = sourceFile2.getRegion((int) (byte) 0);
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
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.io.Reader reader16 = preloaded3.getCodeReader();
        java.lang.String str17 = preloaded3.getName();
        java.lang.String str18 = preloaded3.getName();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setIsExtern(true);
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        java.lang.String str7 = sourceFile3.getName();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        boolean boolean9 = sourceFile3.isExtern();
        sourceFile3.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass12 = sourceFile3.getClass();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        preloaded4.setOriginalPath("");
        java.lang.String str13 = preloaded4.getName();
        java.lang.String str14 = preloaded4.getCode();
        boolean boolean15 = preloaded4.hasSourceInMemory();
        java.io.Reader reader16 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("", reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        sourceFile7.setOriginalPath("hi!");
        java.lang.String str12 = sourceFile7.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region14 = sourceFile7.getRegion((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getName();
        boolean boolean13 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        boolean boolean14 = preloaded3.hasSourceInMemory();
        int int15 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        java.lang.String str7 = generated2.getCodeNoCache();
        java.lang.String str8 = generated2.toString();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        int int7 = sourceFile3.getNumLines();
        java.io.Reader reader8 = sourceFile3.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.getName();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sourceFile2.getLine((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        java.lang.String str15 = generated2.getName();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) (byte) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(region14);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        java.lang.String str10 = sourceFile3.getName();
        sourceFile3.setOriginalPath("");
        boolean boolean13 = sourceFile3.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
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
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        boolean boolean8 = preloaded2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded2.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion((-1));
        java.lang.String str11 = preloaded3.getName();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str14 = preloaded3.getLine((int) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertNotNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str15 = preloaded3.getLine(100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.lang.String str20 = sourceFile9.getName();
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
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        java.lang.String str4 = preloaded2.toString();
        java.lang.String str5 = preloaded2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        preloaded3.setIsExtern(false);
        java.lang.String str13 = preloaded3.getCodeNoCache();
        java.lang.String str14 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        java.lang.String str3 = sourceFile2.getName();
        sourceFile2.setIsExtern(false);
        java.lang.String str7 = sourceFile2.getLine(1);
        java.lang.String str8 = sourceFile2.getName();
        java.lang.String str9 = sourceFile2.getOriginalPath();
        java.lang.String str10 = sourceFile2.getCode();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
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
        java.lang.String str16 = preloaded3.getName();
        java.lang.String str17 = preloaded3.toString();
        java.lang.String str18 = preloaded3.getCodeNoCache();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        boolean boolean12 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        java.lang.String str9 = preloaded2.getCode();
        java.lang.String str10 = preloaded2.getName();
        boolean boolean11 = preloaded2.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        int int11 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        java.lang.String str16 = generated2.getCodeNoCache();
        boolean boolean17 = generated2.isExtern();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        java.lang.String str10 = sourceFile3.getCode();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) -1);
        java.lang.String str7 = sourceFile3.getLine((int) (short) 10);
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        int int13 = preloaded3.getLineOffset((int) (byte) 1);
        boolean boolean14 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.toString();
        java.lang.Class<?> wildcardClass12 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        int int10 = preloaded2.getNumLines();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        java.lang.String str3 = generated2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        java.lang.Class<?> wildcardClass18 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str13 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) -1);
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(region15);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader5 = sourceFile2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        java.lang.Class<?> wildcardClass8 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.toString();
        java.lang.String str5 = sourceFile2.toString();
        sourceFile2.setIsExtern(true);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        java.io.Reader reader5 = preloaded2.getCodeReader();
        java.lang.String str6 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        java.lang.String str6 = preloaded3.toString();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getName();
        java.lang.String str10 = preloaded3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getOriginalPath();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str10 = preloaded3.getCodeNoCache();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) (byte) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getName();
        boolean boolean7 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.lang.String str9 = sourceFile7.getOriginalPath();
        java.lang.String str10 = sourceFile7.getOriginalPath();
        java.io.Reader reader11 = sourceFile7.getCodeReader();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
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
        java.io.Reader reader16 = preloaded3.getCodeReader();
        java.lang.String str17 = preloaded3.getName();
        java.lang.String str18 = preloaded3.getName();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion((-1));
        preloaded3.clearCachedSource();
        java.lang.String str12 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(region10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(false);
        java.lang.String str11 = preloaded3.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.io.Reader reader12 = preloaded3.getCodeReader();
        java.lang.String str13 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.lang.String str7 = sourceFile3.getLine((int) (byte) 100);
        java.lang.String str9 = sourceFile3.getLine((int) (short) 100);
        java.lang.String str11 = sourceFile3.getLine((int) (short) 1);
        java.lang.String str13 = sourceFile3.getLine((int) '4');
        java.lang.String str14 = sourceFile3.getName();
        java.lang.String str15 = sourceFile3.getCode();
        java.lang.String str16 = sourceFile3.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str6 = sourceFile5.getOriginalPath();
        java.io.Reader reader7 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        java.lang.String str10 = sourceFile9.getCode();
        boolean boolean11 = sourceFile9.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = sourceFile9.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getName();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str14 = preloaded3.getLine(100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        sourceFile3.clearCachedSource();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        java.lang.String str10 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass13 = generated2.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        java.lang.String str16 = sourceFile9.getCode();
        java.lang.Class<?> wildcardClass17 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        java.lang.String str5 = sourceFile3.toString();
        java.lang.String str6 = sourceFile3.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile3.getLineOffset((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        boolean boolean13 = sourceFile9.hasSourceInMemory();
        java.lang.Class<?> wildcardClass14 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        java.lang.String str4 = sourceFile3.getCode();
        sourceFile3.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        com.google.javascript.jscomp.Region region5 = sourceFile2.getRegion((int) '#');
        sourceFile2.setIsExtern(true);
        sourceFile2.setIsExtern(false);
        int int10 = sourceFile2.getNumLines();
        sourceFile2.setOriginalPath("hi!");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str7 = preloaded3.getLine((int) 'a');
        int int8 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(1);
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        boolean boolean3 = sourceFile2.hasSourceInMemory();
        sourceFile2.setIsExtern(false);
        sourceFile2.clearCachedSource();
        int int8 = sourceFile2.getLineOffset(1);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCodeNoCache();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str11 = preloaded3.getLine((int) (byte) 0);
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (byte) 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(region13);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("hi!");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        boolean boolean14 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        boolean boolean17 = preloaded3.hasSourceInMemory();
        boolean boolean18 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        java.lang.String str15 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (short) 1);
        sourceFile9.clearCachedSource();
        java.lang.String str15 = sourceFile9.toString();
        boolean boolean16 = sourceFile9.isExtern();
        boolean boolean17 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getLine((-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str10 = preloaded3.getLine((int) (short) 100);
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        java.lang.String str7 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded6.toString();
        int int10 = preloaded6.getNumLines();
        com.google.javascript.jscomp.Region region12 = preloaded6.getRegion((int) '#');
        java.lang.String str13 = preloaded6.toString();
        java.io.Reader reader14 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        sourceFile17.clearCachedSource();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        java.lang.String str15 = preloaded3.getLine((int) '4');
        java.lang.String str16 = preloaded3.toString();
        boolean boolean17 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("");
        java.lang.String str18 = preloaded3.toString();
        java.lang.String str19 = preloaded3.getCode();
        java.lang.String str20 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        boolean boolean13 = sourceFile9.hasSourceInMemory();
        sourceFile9.setIsExtern(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) 'a');
        java.lang.String str13 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.toString();
        java.io.Reader reader12 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) (short) 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!");
        java.lang.String str3 = sourceFile2.getCode();
        java.lang.String str4 = sourceFile2.getOriginalPath();
        java.lang.String str6 = sourceFile2.getLine((int) (byte) 0);
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str11 = preloaded3.getLine((int) '#');
        boolean boolean12 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        java.io.Reader reader5 = sourceFile3.getCodeReader();
        sourceFile3.setIsExtern(false);
        boolean boolean8 = sourceFile3.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getName();
        preloaded2.setOriginalPath("hi!");
        java.lang.String str6 = preloaded2.getCodeNoCache();
        java.lang.String str7 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        boolean boolean11 = preloaded4.isExtern();
        boolean boolean12 = preloaded4.isExtern();
        java.io.Reader reader13 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        sourceFile14.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        boolean boolean9 = generated2.hasSourceInMemory();
        java.lang.String str10 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str13 = preloaded3.getCode();
        java.lang.String str14 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        boolean boolean15 = generated2.hasSourceInMemory();
        java.lang.String str16 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        java.lang.String str12 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.isExtern();
        java.lang.String str16 = preloaded3.getLine(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        preloaded2.setIsExtern(false);
        java.lang.String str8 = preloaded2.getCode();
        boolean boolean9 = preloaded2.hasSourceInMemory();
        int int10 = preloaded2.getNumLines();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        sourceFile9.clearCachedSource();
        java.lang.String str17 = sourceFile9.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        java.lang.String str16 = generated2.getCodeNoCache();
        java.lang.String str17 = generated2.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        preloaded3.clearCachedSource();
        java.lang.String str15 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str10 = preloaded3.getLine((int) '#');
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        java.lang.String str8 = preloaded2.getName();
        java.lang.String str9 = preloaded2.getCode();
        java.lang.String str10 = preloaded2.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion(10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = preloaded3.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        java.lang.String str10 = preloaded3.toString();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        boolean boolean12 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        java.lang.String str15 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        boolean boolean6 = preloaded4.hasSourceInMemory();
        java.lang.String str7 = preloaded4.getName();
        com.google.javascript.jscomp.Region region9 = preloaded4.getRegion((int) (short) 0);
        boolean boolean10 = preloaded4.hasSourceInMemory();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(sourceFile12);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        preloaded2.setIsExtern(true);
        boolean boolean10 = preloaded2.isExtern();
        java.lang.String str12 = preloaded2.getLine((int) '#');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        int int6 = preloaded3.getNumLines();
        java.lang.String str7 = preloaded3.getName();
        java.lang.Class<?> wildcardClass8 = preloaded3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        boolean boolean4 = preloaded2.isExtern();
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        com.google.javascript.jscomp.Region region9 = preloaded2.getRegion((int) (short) 100);
        java.lang.String str10 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str15 = preloaded3.getCode();
        java.lang.String str16 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        generated2.clearCachedSource();
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
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        java.lang.String str8 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = generated2.getLineOffset(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        boolean boolean8 = sourceFile3.isExtern();
        boolean boolean9 = sourceFile3.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (byte) 10);
        java.lang.String str12 = preloaded3.getCode();
        java.lang.String str13 = preloaded3.getCode();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str15 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
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
        java.lang.String str19 = sourceFile9.getCodeNoCache();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getCode();
        sourceFile10.clearCachedSource();
        sourceFile10.setIsExtern(false);
        sourceFile10.clearCachedSource();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(true);
        java.lang.Class<?> wildcardClass19 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str6 = sourceFile2.getLine((int) (short) 10);
        java.lang.String str7 = sourceFile2.toString();
        java.lang.String str8 = sourceFile2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getLine(10);
        java.io.Reader reader15 = preloaded3.getCodeReader();
        java.io.Reader reader16 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        java.lang.String str6 = preloaded3.toString();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile4.setIsExtern(true);
        java.io.Reader reader7 = sourceFile4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        java.lang.Class<?> wildcardClass9 = sourceFile8.getClass();
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.toString();
        java.lang.String str13 = sourceFile9.getName();
        java.lang.String str15 = sourceFile9.getLine((int) '#');
        java.io.Reader reader16 = sourceFile9.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setOriginalPath("");
        sourceFile9.clearCachedSource();
        sourceFile9.setIsExtern(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        java.lang.String str21 = preloaded3.getOriginalPath();
        java.lang.Class<?> wildcardClass22 = preloaded3.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region10 = generated2.getRegion((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = generated2.getLine((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        sourceFile2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        boolean boolean9 = preloaded5.hasSourceInMemory();
        boolean boolean10 = preloaded5.hasSourceInMemory();
        preloaded5.setOriginalPath("");
        java.io.Reader reader13 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        java.lang.String str17 = sourceFile15.getLine((int) ' ');
        java.lang.String str18 = sourceFile15.getCodeNoCache();
        com.google.javascript.jscomp.Region region20 = sourceFile15.getRegion((int) (short) 10);
        sourceFile15.clearCachedSource();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(region20);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        boolean boolean4 = preloaded2.isExtern();
        boolean boolean5 = preloaded2.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean13 = sourceFile12.hasSourceInMemory();
        java.io.Reader reader14 = sourceFile12.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        int int16 = sourceFile15.getNumLines();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        java.lang.String str12 = preloaded3.getLine((int) (byte) 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.toString();
        java.io.Reader reader12 = preloaded3.getCodeReader();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean9 = generated2.isExtern();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        boolean boolean4 = sourceFile2.isExtern();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        boolean boolean6 = sourceFile2.isExtern();
        java.lang.String str7 = sourceFile2.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region9 = sourceFile2.getRegion((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (byte) 100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        sourceFile9.clearCachedSource();
        int int18 = sourceFile9.getNumLines();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        boolean boolean6 = preloaded2.hasSourceInMemory();
        java.lang.String str8 = preloaded2.getLine((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.toString();
        java.lang.String str9 = generated2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) ' ');
        boolean boolean12 = preloaded3.isExtern();
        java.lang.String str13 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str15 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        java.lang.String str7 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        boolean boolean19 = sourceFile13.isExtern();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        boolean boolean3 = sourceFile2.isExtern();
        sourceFile2.setIsExtern(true);
        java.lang.Class<?> wildcardClass6 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        int int5 = sourceFile3.getNumLines();
        com.google.javascript.jscomp.Region region7 = sourceFile3.getRegion((int) '#');
        boolean boolean8 = sourceFile3.hasSourceInMemory();
        java.lang.String str9 = sourceFile3.getCode();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.clearCachedSource();
        sourceFile3.setIsExtern(false);
        int int8 = sourceFile3.getLineOffset(1);
        boolean boolean9 = sourceFile3.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.getCodeNoCache();
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str7 = preloaded2.getLine(100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = generated2.getLineOffset(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        java.lang.String str14 = sourceFile11.getCodeNoCache();
        sourceFile11.clearCachedSource();
        java.lang.String str17 = sourceFile11.getLine(0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        java.lang.String str18 = preloaded3.getLine((int) (byte) -1);
        java.lang.String str19 = preloaded3.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        boolean boolean12 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        boolean boolean7 = preloaded2.isExtern();
        com.google.javascript.jscomp.Region region9 = preloaded2.getRegion((int) '4');
        java.lang.String str10 = preloaded2.getOriginalPath();
        com.google.javascript.jscomp.Region region12 = preloaded2.getRegion((int) (byte) 100);
        java.lang.String str14 = preloaded2.getLine(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setIsExtern(true);
        java.lang.String str6 = sourceFile3.toString();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        int int8 = preloaded3.getNumLines();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str14 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        java.lang.String str10 = sourceFile3.getLine((int) ' ');
        java.lang.String str11 = sourceFile3.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        preloaded3.setOriginalPath("hi!");
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        preloaded2.setIsExtern(false);
        java.lang.String str8 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        java.lang.String str13 = preloaded3.getCodeNoCache();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine(100);
        java.lang.String str15 = preloaded3.getLine((int) '4');
        java.lang.String str16 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        int int4 = sourceFile3.getNumLines();
        java.lang.String str5 = sourceFile3.getCode();
        java.lang.String str6 = sourceFile3.getCode();
        int int7 = sourceFile3.getNumLines();
        java.lang.String str8 = sourceFile3.getName();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean5 = generated2.hasSourceInMemory();
        boolean boolean6 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str6 = sourceFile5.getOriginalPath();
        java.io.Reader reader7 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        java.lang.String str10 = sourceFile9.getCode();
        boolean boolean11 = sourceFile9.hasSourceInMemory();
        boolean boolean12 = sourceFile9.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean8 = generated2.hasSourceInMemory();
        generated2.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 100);
        boolean boolean14 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        boolean boolean7 = preloaded2.hasSourceInMemory();
        preloaded2.setOriginalPath("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        boolean boolean9 = sourceFile3.isExtern();
        sourceFile3.setOriginalPath("hi!");
        java.lang.String str12 = sourceFile3.getCodeNoCache();
        int int13 = sourceFile3.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        sourceFile2.clearCachedSource();
        sourceFile2.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass10 = sourceFile2.getClass();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
        java.lang.String str17 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = preloaded3.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean4 = preloaded3.hasSourceInMemory();
        java.lang.String str5 = preloaded3.getCode();
        java.io.Reader reader6 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("");
        java.io.Reader reader9 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        int int7 = sourceFile3.getLineOffset((int) (byte) 1);
        boolean boolean8 = sourceFile3.isExtern();
        java.lang.String str9 = sourceFile3.getCode();
        sourceFile3.setIsExtern(false);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        java.lang.String str15 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        sourceFile9.setOriginalPath("hi!");
        java.lang.String str15 = sourceFile9.getLine(1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        int int13 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        boolean boolean16 = preloaded3.isExtern();
        int int17 = preloaded3.getNumLines();
        preloaded3.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = preloaded3.getLineOffset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str4 = preloaded3.getOriginalPath();
        int int5 = preloaded3.getNumLines();
        int int6 = preloaded3.getNumLines();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        sourceFile9.setIsExtern(true);
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str12 = preloaded3.getLine(0);
        int int13 = preloaded3.getNumLines();
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str10 = preloaded3.getLine((int) (short) 100);
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        boolean boolean14 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        java.lang.String str7 = preloaded3.toString();
        java.lang.String str8 = preloaded3.toString();
        boolean boolean9 = preloaded3.isExtern();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        java.lang.String str6 = preloaded2.getOriginalPath();
        java.io.Reader reader7 = preloaded2.getCodeReader();
        java.lang.String str8 = preloaded2.getCodeNoCache();
        boolean boolean9 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setIsExtern(true);
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        sourceFile3.setOriginalPath("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Region region10 = sourceFile3.getRegion((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine(10);
        java.lang.String str13 = sourceFile9.toString();
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        int int12 = preloaded3.getNumLines();
        int int13 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        preloaded3.setIsExtern(false);
        java.lang.String str15 = preloaded3.getLine((int) (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 0);
        java.lang.String str14 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str17 = preloaded3.toString();
        java.lang.Class<?> wildcardClass18 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader8 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        boolean boolean11 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(region15);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        sourceFile2.clearCachedSource();
        sourceFile2.setOriginalPath("hi!");
        int int10 = sourceFile2.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        preloaded2.clearCachedSource();
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        preloaded2.setOriginalPath("");
        java.lang.String str9 = preloaded2.getCode();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        java.lang.String str5 = sourceFile2.getCodeNoCache();
        int int6 = sourceFile2.getNumLines();
        boolean boolean7 = sourceFile2.isExtern();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
        java.lang.String str19 = sourceFile9.getName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
        boolean boolean14 = generated2.isExtern();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        boolean boolean11 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(true);
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        preloaded4.setIsExtern(true);
        preloaded4.clearCachedSource();
        java.lang.String str12 = preloaded4.getOriginalPath();
        java.lang.String str14 = preloaded4.getLine((int) (short) 1);
        java.lang.String str15 = preloaded4.getOriginalPath();
        java.lang.String str16 = preloaded4.getCode();
        java.io.Reader reader17 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("", reader17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(reader17);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        int int5 = sourceFile3.getNumLines();
        java.lang.String str6 = sourceFile3.getOriginalPath();
        java.io.Reader reader7 = sourceFile3.getCodeReader();
        sourceFile3.setIsExtern(true);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str9 = generated2.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        boolean boolean12 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        boolean boolean8 = preloaded4.hasSourceInMemory();
        boolean boolean9 = preloaded4.hasSourceInMemory();
        preloaded4.setOriginalPath("");
        com.google.javascript.jscomp.Region region13 = preloaded4.getRegion(0);
        preloaded4.setIsExtern(true);
        java.io.Reader reader16 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("", reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertNotNull(reader16);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        boolean boolean4 = preloaded2.isExtern();
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        com.google.javascript.jscomp.Region region9 = preloaded2.getRegion((int) (short) 100);
        java.lang.String str10 = preloaded2.getCode();
        int int11 = preloaded2.getNumLines();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        java.lang.String str7 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.isExtern();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass11 = reader10.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        int int4 = preloaded2.getLineOffset((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        sourceFile2.clearCachedSource();
        sourceFile2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
        java.lang.String str13 = sourceFile9.getCodeNoCache();
        boolean boolean14 = sourceFile9.hasSourceInMemory();
        java.lang.String str15 = sourceFile9.getCode();
        java.lang.String str16 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
        preloaded3.setOriginalPath("");
        int int21 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        java.lang.String str11 = preloaded2.getLine((int) (short) 1);
        preloaded2.setOriginalPath("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getCode();
        sourceFile10.clearCachedSource();
        java.io.Reader reader13 = sourceFile10.getCodeReader();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded4.getLine(10);
        preloaded4.clearCachedSource();
        java.lang.String str11 = preloaded4.getLine(100);
        java.lang.String str12 = preloaded4.toString();
        java.lang.String str14 = preloaded4.getLine(100);
        java.lang.String str16 = preloaded4.getLine((int) '4');
        java.lang.String str17 = preloaded4.toString();
        java.lang.String str18 = preloaded4.getName();
        java.io.Reader reader19 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile20 = com.google.javascript.jscomp.SourceFile.fromReader("", reader19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(reader19);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str10 = generated2.toString();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        boolean boolean16 = preloaded3.isExtern();
        int int17 = preloaded3.getNumLines();
        java.io.Reader reader18 = preloaded3.getCodeReader();
        boolean boolean19 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "");
        java.lang.Class<?> wildcardClass4 = preloaded3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        java.io.Reader reader11 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        java.lang.String str11 = preloaded4.toString();
        java.io.Reader reader12 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        java.lang.String str14 = sourceFile13.getCodeNoCache();
        com.google.javascript.jscomp.Region region16 = sourceFile13.getRegion(10);
        boolean boolean17 = sourceFile13.isExtern();
        java.lang.String str18 = sourceFile13.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded2.getCode();
        preloaded2.clearCachedSource();
        java.lang.String str11 = preloaded2.getOriginalPath();
        java.lang.String str12 = preloaded2.getOriginalPath();
        java.lang.String str13 = preloaded2.getCode();
        boolean boolean14 = preloaded2.isExtern();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str11 = generated2.toString();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        boolean boolean20 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }
}

