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
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.io.Reader reader9 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.String str16 = generated2.getName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        com.google.javascript.jscomp.Region region22 = preloaded3.getRegion((int) (byte) 1);
        java.lang.String str23 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(region17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        preloaded3.setOriginalPath("");
        java.lang.String str20 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded3.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        boolean boolean5 = preloaded2.hasSourceInMemory();
        preloaded2.setIsExtern(false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str8 = preloaded3.getOriginalPath();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        boolean boolean4 = preloaded2.isExtern();
        java.lang.String str5 = preloaded2.getOriginalPath();
        boolean boolean6 = preloaded2.hasSourceInMemory();
        preloaded2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        boolean boolean13 = preloaded3.hasSourceInMemory();
        java.lang.String str14 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
        generated2.setIsExtern(true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        boolean boolean19 = preloaded3.isExtern();
        java.lang.String str20 = preloaded3.getCode();
        java.io.Reader reader21 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(region17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(reader21);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        sourceFile9.setOriginalPath("hi!");
        java.lang.Class<?> wildcardClass12 = sourceFile9.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        sourceFile11.setIsExtern(false);
        com.google.javascript.jscomp.Region region15 = sourceFile11.getRegion((int) (byte) 1);
        boolean boolean16 = sourceFile11.isExtern();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        int int9 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setOriginalPath("");
        boolean boolean12 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getCode();
        boolean boolean12 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = preloaded3.getLineOffset((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str8 = preloaded3.getCodeNoCache();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str17 = preloaded3.getLine((int) (byte) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getName();
        generated2.setIsExtern(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        preloaded3.setOriginalPath("");
        java.lang.String str13 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        java.lang.String str7 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.toString();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.toString();
        java.io.Reader reader12 = sourceFile10.getCodeReader();
        java.lang.String str13 = sourceFile10.getCode();
        com.google.javascript.jscomp.Region region15 = sourceFile10.getRegion((int) (byte) 10);
        boolean boolean16 = sourceFile10.isExtern();
        java.io.Reader reader17 = sourceFile10.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = sourceFile18.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(sourceFile18);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        java.lang.String str11 = preloaded3.toString();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 10);
        preloaded3.setIsExtern(true);
        java.lang.String str17 = preloaded3.getLine((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getName();
        preloaded2.setOriginalPath("hi!");
        java.lang.String str6 = preloaded2.getCodeNoCache();
        java.lang.String str7 = preloaded2.getName();
        java.lang.String str8 = preloaded2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        boolean boolean5 = preloaded2.hasSourceInMemory();
        preloaded2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getLine((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
            com.google.javascript.jscomp.Region region15 = generated2.getRegion((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        java.lang.String str6 = preloaded2.getOriginalPath();
        java.io.Reader reader7 = preloaded2.getCodeReader();
        java.lang.String str8 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile3.setOriginalPath("");
        sourceFile3.setOriginalPath("");
        java.lang.String str8 = sourceFile3.getCodeNoCache();
        boolean boolean9 = sourceFile3.isExtern();
        sourceFile3.setOriginalPath("hi!");
        boolean boolean12 = sourceFile3.hasSourceInMemory();
        java.lang.String str13 = sourceFile3.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded4.getRegion((int) '#');
        java.lang.String str11 = preloaded4.toString();
        java.io.Reader reader12 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        java.lang.String str14 = sourceFile13.getName();
        int int15 = sourceFile13.getNumLines();
        boolean boolean16 = sourceFile13.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        java.lang.String str20 = preloaded3.getCode();
        int int22 = preloaded3.getLineOffset(1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) '#');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertNull(region16);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str13 = preloaded3.getCodeNoCache();
        java.lang.String str14 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        com.google.javascript.jscomp.Region region18 = sourceFile9.getRegion((int) (short) 1);
        java.lang.String str20 = sourceFile9.getLine((int) (short) 100);
        java.lang.String str21 = sourceFile9.getOriginalPath();
        java.lang.String str22 = sourceFile9.getCode();
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
        org.junit.Assert.assertNull(region18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
            int int11 = generated2.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        boolean boolean13 = sourceFile9.isExtern();
        boolean boolean14 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        java.io.Reader reader7 = sourceFile3.getCodeReader();
        sourceFile3.clearCachedSource();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        boolean boolean10 = preloaded2.isExtern();
        boolean boolean11 = preloaded2.hasSourceInMemory();
        java.lang.String str12 = preloaded2.getName();
        java.lang.String str13 = preloaded2.getOriginalPath();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        java.lang.String str10 = sourceFile7.getOriginalPath();
        sourceFile7.clearCachedSource();
        java.lang.String str12 = sourceFile7.getCodeNoCache();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = generated2.getLine((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        com.google.javascript.jscomp.Region region18 = preloaded3.getRegion((int) 'a');
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertNull(region18);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        boolean boolean7 = preloaded2.hasSourceInMemory();
        java.lang.String str8 = preloaded2.toString();
        java.io.Reader reader9 = preloaded2.getCodeReader();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = preloaded3.getLineOffset((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        preloaded3.clearCachedSource();
        java.lang.String str17 = preloaded3.toString();
        int int19 = preloaded3.getLineOffset(1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        java.lang.String str14 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str17 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) ' ');
        boolean boolean12 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) (short) 100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        java.lang.String str8 = sourceFile3.getLine((int) (short) -1);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) ' ');
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.getCode();
        sourceFile9.clearCachedSource();
        java.lang.String str13 = sourceFile9.getOriginalPath();
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) '4');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str10 = generated2.toString();
        boolean boolean11 = generated2.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        preloaded3.setIsExtern(false);
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
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(region15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
            int int14 = generated2.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.getCode();
        int int8 = preloaded4.getNumLines();
        java.lang.String str9 = preloaded4.getName();
        boolean boolean10 = preloaded4.hasSourceInMemory();
        java.lang.String str11 = preloaded4.getName();
        java.lang.String str12 = preloaded4.getCode();
        preloaded4.clearCachedSource();
        java.lang.String str15 = preloaded4.getLine(10);
        java.io.Reader reader16 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.toString();
        generated2.clearCachedSource();
        java.lang.String str10 = generated2.getCodeNoCache();
        java.lang.String str11 = generated2.getOriginalPath();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded2.getCode();
        preloaded2.clearCachedSource();
        java.lang.String str11 = preloaded2.getOriginalPath();
        int int12 = preloaded2.getNumLines();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded5.getRegion((int) '#');
        boolean boolean12 = preloaded5.isExtern();
        boolean boolean13 = preloaded5.isExtern();
        java.lang.String str14 = preloaded5.getOriginalPath();
        java.lang.String str15 = preloaded5.getName();
        java.io.Reader reader16 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        java.lang.Class<?> wildcardClass19 = reader16.getClass();
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
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        com.google.javascript.jscomp.Region region7 = preloaded3.getRegion(100);
        preloaded3.setOriginalPath("");
        int int10 = preloaded3.getNumLines();
        java.lang.Class<?> wildcardClass11 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        int int9 = preloaded3.getNumLines();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        preloaded3.setOriginalPath("hi!");
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        boolean boolean19 = preloaded3.isExtern();
        java.lang.String str20 = preloaded3.getCode();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(region17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        java.lang.String str10 = preloaded2.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        sourceFile2.setOriginalPath("hi!");
        int int8 = sourceFile2.getLineOffset(1);
        sourceFile2.setIsExtern(true);
        boolean boolean11 = sourceFile2.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(10);
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(region8);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!");
        boolean boolean3 = sourceFile2.isExtern();
        java.lang.String str4 = sourceFile2.getCode();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.toString();
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        java.lang.String str8 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion((int) (short) 0);
        preloaded3.setIsExtern(false);
        preloaded3.setOriginalPath("hi!");
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(region10);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(region15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        java.lang.String str7 = preloaded3.toString();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str7 = preloaded3.getLine((int) 'a');
        int int8 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(1);
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCode();
        java.lang.Class<?> wildcardClass13 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setOriginalPath("");
        java.lang.String str12 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getName();
        java.lang.String str14 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        boolean boolean6 = generated2.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        boolean boolean7 = sourceFile3.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        boolean boolean19 = preloaded3.isExtern();
        boolean boolean20 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        java.lang.Class<?> wildcardClass18 = generated2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.toString();
        java.lang.String str8 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile4.getOriginalPath();
        java.io.Reader reader6 = sourceFile4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        java.lang.Class<?> wildcardClass8 = sourceFile7.getClass();
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int9 = preloaded3.getLineOffset(1);
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str11 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        java.lang.String str17 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        sourceFile2.clearCachedSource();
        sourceFile2.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        java.lang.String str11 = preloaded6.getOriginalPath();
        preloaded6.setOriginalPath("hi!");
        java.lang.String str14 = preloaded6.getName();
        java.io.Reader reader15 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile16 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader15);
        java.io.Reader reader17 = sourceFile16.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader17);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile19 = com.google.javascript.jscomp.SourceFile.fromReader("", reader17);
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
        org.junit.Assert.assertNotNull(reader17);
        org.junit.Assert.assertNotNull(sourceFile18);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) -1);
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        java.io.Reader reader7 = sourceFile3.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(reader7);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        preloaded2.setIsExtern(false);
        java.io.Reader reader8 = preloaded2.getCodeReader();
        preloaded2.setIsExtern(true);
        java.lang.String str12 = preloaded2.getLine((int) '4');
        java.lang.String str14 = preloaded2.getLine((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        boolean boolean18 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(region17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getCodeNoCache();
        java.lang.String str10 = preloaded3.getLine((int) (byte) 100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) (short) 0);
        java.lang.String str13 = preloaded3.getName();
        java.io.Reader reader14 = preloaded3.getCodeReader();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "");
        boolean boolean3 = sourceFile2.hasSourceInMemory();
        sourceFile2.setIsExtern(false);
        int int6 = sourceFile2.getNumLines();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str5 = generated2.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        boolean boolean3 = sourceFile1.hasSourceInMemory();
        java.lang.String str4 = sourceFile1.getCode();
        boolean boolean5 = sourceFile1.isExtern();
        sourceFile1.setOriginalPath("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        preloaded3.setIsExtern(false);
        java.lang.String str13 = preloaded3.getCodeNoCache();
        java.io.Reader reader14 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region7 = preloaded3.getRegion((int) (byte) 1);
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(region7);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str11 = preloaded3.getLine((int) '#');
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion(1);
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(region13);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str13 = sourceFile9.getCode();
        java.lang.String str14 = sourceFile9.toString();
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.lang.String str13 = preloaded3.toString();
        java.lang.String str14 = preloaded3.getCode();
        java.lang.String str16 = preloaded3.getLine(100);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        sourceFile3.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = sourceFile3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getLine((int) '4');
        java.lang.String str15 = sourceFile9.getOriginalPath();
        java.lang.String str16 = sourceFile9.getOriginalPath();
        java.lang.String str17 = sourceFile9.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        sourceFile9.setIsExtern(true);
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion(1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        generated2.clearCachedSource();
        generated2.setIsExtern(false);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) (short) 0);
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.io.Reader reader10 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass11 = preloaded3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        boolean boolean6 = preloaded2.hasSourceInMemory();
        int int7 = preloaded2.getNumLines();
        java.lang.String str8 = preloaded2.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = generated2.getLine((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean5 = generated2.hasSourceInMemory();
        boolean boolean6 = generated2.hasSourceInMemory();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Reader reader7 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        java.lang.String str18 = preloaded3.getCode();
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getLine((int) '4');
        java.lang.String str15 = sourceFile9.getOriginalPath();
        java.lang.String str16 = sourceFile9.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded4.toString();
        int int8 = preloaded4.getNumLines();
        preloaded4.clearCachedSource();
        java.lang.String str10 = preloaded4.toString();
        preloaded4.setOriginalPath("hi!");
        java.io.Reader reader13 = preloaded4.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("", reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(0);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.toString();
        boolean boolean12 = preloaded3.isExtern();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("");
        java.lang.String str8 = preloaded3.getCodeNoCache();
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "");
        com.google.javascript.jscomp.Region region5 = sourceFile3.getRegion(10);
        boolean boolean6 = sourceFile3.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region6 = preloaded3.getRegion(0);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) 'a');
        java.io.Reader reader9 = preloaded3.getCodeReader();
        java.lang.Class<?> wildcardClass10 = preloaded3.getClass();
        org.junit.Assert.assertNotNull(region6);
        org.junit.Assert.assertNull(region8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        java.lang.String str17 = preloaded3.getLine((int) '#');
        java.lang.String str19 = preloaded3.getLine((int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = sourceFile2.getLineOffset((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        sourceFile9.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        boolean boolean10 = preloaded2.isExtern();
        boolean boolean11 = preloaded2.hasSourceInMemory();
        com.google.javascript.jscomp.Region region13 = preloaded2.getRegion((int) (byte) 10);
        int int14 = preloaded2.getNumLines();
        java.lang.String str16 = preloaded2.getLine((int) (byte) -1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.lang.String str11 = sourceFile9.toString();
        java.lang.String str12 = sourceFile9.getName();
        boolean boolean13 = sourceFile9.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = sourceFile2.getCode();
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str5 = generated2.toString();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        boolean boolean16 = preloaded3.hasSourceInMemory();
        java.lang.String str17 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        generated2.clearCachedSource();
        generated2.setIsExtern(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str7 = preloaded3.getLine((int) 'a');
        int int8 = preloaded3.getNumLines();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        int int4 = sourceFile3.getNumLines();
        java.lang.String str5 = sourceFile3.toString();
        java.lang.String str6 = sourceFile3.getName();
        java.lang.String str7 = sourceFile3.getName();
        boolean boolean8 = sourceFile3.isExtern();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.setOriginalPath("");
        boolean boolean10 = preloaded3.hasSourceInMemory();
        boolean boolean11 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        java.lang.String str19 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(region17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        int int10 = preloaded3.getNumLines();
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str16 = preloaded3.getLine(0);
        int int17 = preloaded3.getNumLines();
        java.io.Reader reader18 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(reader18);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str7 = preloaded3.getLine((int) 'a');
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.toString();
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(region11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getName();
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        sourceFile1.setIsExtern(true);
        java.lang.String str4 = sourceFile1.getCode();
        java.lang.String str5 = sourceFile1.toString();
        boolean boolean6 = sourceFile1.hasSourceInMemory();
        sourceFile1.clearCachedSource();
        boolean boolean8 = sourceFile1.hasSourceInMemory();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        java.lang.String str16 = generated2.toString();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) (short) 0);
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        java.lang.String str18 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        java.lang.String str10 = generated2.toString();
        generated2.setOriginalPath("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCodeNoCache();
        java.lang.String str14 = sourceFile9.getLine((int) '4');
        java.lang.String str15 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        boolean boolean18 = preloaded3.isExtern();
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
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromGenerator("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = sourceFile2.getLineOffset(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(sourceFile2);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded3.setIsExtern(true);
        preloaded3.setIsExtern(true);
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        boolean boolean10 = preloaded3.isExtern();
        boolean boolean11 = preloaded3.isExtern();
        java.io.Reader reader12 = preloaded3.getCodeReader();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("", reader12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        boolean boolean8 = preloaded2.hasSourceInMemory();
        java.lang.String str10 = preloaded2.getLine((int) '4');
        boolean boolean11 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        java.lang.Class<?> wildcardClass5 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getOriginalPath();
        java.lang.String str12 = sourceFile10.getOriginalPath();
        java.lang.String str13 = sourceFile10.toString();
        java.lang.String str14 = sourceFile10.toString();
        java.lang.String str15 = sourceFile10.toString();
        java.io.Reader reader16 = sourceFile10.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        int int8 = preloaded3.getNumLines();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine((int) ' ');
        java.lang.String str15 = preloaded3.getLine((int) (short) 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        java.lang.String str7 = preloaded3.getOriginalPath();
        boolean boolean8 = preloaded3.isExtern();
        java.lang.String str9 = preloaded3.getCode();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getLine((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        int int14 = preloaded3.getLineOffset(1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getName();
        java.lang.String str11 = sourceFile9.toString();
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion(100);
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) (short) 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("hi!");
        boolean boolean5 = sourceFile1.hasSourceInMemory();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str5 = sourceFile3.getLine((int) (short) 0);
        boolean boolean6 = sourceFile3.hasSourceInMemory();
        java.lang.String str8 = sourceFile3.getLine((int) (byte) 10);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion((int) (short) 0);
        boolean boolean9 = preloaded3.hasSourceInMemory();
        int int10 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getLine((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.SourceFile sourceFile5 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str6 = sourceFile5.getOriginalPath();
        java.io.Reader reader7 = sourceFile5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader7);
        java.lang.String str10 = sourceFile9.getCode();
        java.lang.String str11 = sourceFile9.toString();
        org.junit.Assert.assertNotNull(sourceFile5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        preloaded3.setIsExtern(false);
        boolean boolean12 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        int int12 = preloaded3.getNumLines();
        boolean boolean13 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region15 = preloaded3.getRegion((int) (byte) -1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(region15);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean14 = sourceFile13.hasSourceInMemory();
        com.google.javascript.jscomp.Region region16 = sourceFile13.getRegion((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = sourceFile13.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.getCode();
        int int5 = sourceFile3.getNumLines();
        java.lang.String str6 = sourceFile3.getCodeNoCache();
        java.lang.String str7 = sourceFile3.getOriginalPath();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) '4');
        preloaded3.setOriginalPath("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        sourceFile1.setIsExtern(true);
        java.lang.String str4 = sourceFile1.getCode();
        java.lang.String str5 = sourceFile1.toString();
        boolean boolean6 = sourceFile1.hasSourceInMemory();
        java.lang.Class<?> wildcardClass7 = sourceFile1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        int int9 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        int int11 = preloaded2.getNumLines();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        boolean boolean22 = preloaded3.isExtern();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.setOriginalPath("");
        java.lang.String str10 = preloaded3.getCodeNoCache();
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str4 = preloaded3.getName();
        java.lang.String str5 = preloaded3.getOriginalPath();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        boolean boolean7 = preloaded2.isExtern();
        int int8 = preloaded2.getNumLines();
        java.lang.String str9 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int5 = preloaded4.getNumLines();
        java.lang.String str6 = preloaded4.getCodeNoCache();
        java.lang.String str7 = preloaded4.getCodeNoCache();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        int int11 = sourceFile10.getNumLines();
        java.lang.String str12 = sourceFile10.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean6 = generated2.hasSourceInMemory();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = generated2.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.toString();
        preloaded3.clearCachedSource();
        java.io.Reader reader14 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        boolean boolean13 = generated2.isExtern();
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        java.lang.String str15 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        boolean boolean3 = preloaded2.isExtern();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str14 = preloaded3.getCodeNoCache();
        java.io.Reader reader15 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        java.lang.String str18 = sourceFile9.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        int int9 = sourceFile7.getNumLines();
        com.google.javascript.jscomp.Region region11 = sourceFile7.getRegion((int) ' ');
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) (short) 100);
        java.lang.String str10 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        sourceFile3.clearCachedSource();
        int int8 = sourceFile3.getNumLines();
        java.lang.String str9 = sourceFile3.getName();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getName();
        java.lang.String str9 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.String str8 = preloaded2.getLine(100);
        boolean boolean9 = preloaded2.hasSourceInMemory();
        java.lang.String str11 = preloaded2.getLine((-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getName();
        java.lang.String str6 = preloaded3.toString();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str13 = preloaded3.getCodeNoCache();
        java.lang.String str14 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.lang.String str16 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getName();
        generated2.clearCachedSource();
        boolean boolean10 = generated2.isExtern();
        java.lang.String str11 = generated2.getOriginalPath();
        java.lang.String str12 = generated2.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str11 = generated2.toString();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        java.lang.String str11 = generated2.getName();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        sourceFile9.setIsExtern(true);
        java.lang.String str17 = sourceFile9.getLine((int) (short) 1);
        sourceFile9.clearCachedSource();
        com.google.javascript.jscomp.Region region20 = sourceFile9.getRegion((int) (byte) 1);
        sourceFile9.setIsExtern(false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(region20);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.Class<?> wildcardClass9 = generated2.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        boolean boolean5 = preloaded2.hasSourceInMemory();
        int int6 = preloaded2.getNumLines();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = preloaded2.getLineOffset((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        com.google.javascript.jscomp.Region region11 = sourceFile9.getRegion((int) '#');
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (short) 1);
        sourceFile9.clearCachedSource();
        java.lang.String str15 = sourceFile9.toString();
        java.lang.String str16 = sourceFile9.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "", "hi!");
        int int4 = sourceFile3.getNumLines();
        sourceFile3.setOriginalPath("");
        java.lang.String str7 = sourceFile3.getCodeNoCache();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        java.lang.String str14 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        java.lang.String str10 = sourceFile7.getOriginalPath();
        sourceFile7.clearCachedSource();
        sourceFile7.clearCachedSource();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        int int13 = sourceFile9.getNumLines();
        boolean boolean14 = sourceFile9.isExtern();
        java.lang.String str16 = sourceFile9.getLine((int) '#');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str8 = preloaded3.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = preloaded3.getLineOffset(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.lang.String str8 = preloaded4.getOriginalPath();
        preloaded4.setIsExtern(true);
        preloaded4.setOriginalPath("");
        java.io.Reader reader13 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str10 = generated2.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getName();
        preloaded3.setOriginalPath("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        java.lang.String str9 = preloaded2.getCode();
        preloaded2.clearCachedSource();
        java.lang.String str11 = preloaded2.getCode();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.setIsExtern(true);
        int int9 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        preloaded3.setOriginalPath("");
        java.lang.String str11 = preloaded3.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = sourceFile9.getLineOffset((-1));
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
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded4.getLine(10);
        boolean boolean9 = preloaded4.isExtern();
        preloaded4.setIsExtern(true);
        preloaded4.setOriginalPath("hi!");
        java.lang.String str14 = preloaded4.getCodeNoCache();
        boolean boolean15 = preloaded4.isExtern();
        java.io.Reader reader16 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        sourceFile17.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(sourceFile17);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.lang.String str7 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(10);
        java.lang.String str13 = preloaded3.getLine((int) (byte) 1);
        int int14 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        boolean boolean16 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str9 = preloaded3.getLine((int) (short) 10);
        com.google.javascript.jscomp.Region region11 = preloaded3.getRegion(0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(region11);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        com.google.javascript.jscomp.Region region19 = preloaded3.getRegion((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(region19);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        boolean boolean3 = generated2.isExtern();
        generated2.setOriginalPath("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        preloaded2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        com.google.javascript.jscomp.Region region6 = preloaded2.getRegion((-1));
        preloaded2.clearCachedSource();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(region6);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str11 = sourceFile9.getName();
        com.google.javascript.jscomp.Region region13 = sourceFile9.getRegion((int) (byte) -1);
        sourceFile9.setIsExtern(true);
        java.lang.String str17 = sourceFile9.getLine((int) (byte) -1);
        sourceFile9.clearCachedSource();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        preloaded2.setIsExtern(true);
        java.lang.String str8 = preloaded2.getLine((int) (byte) 10);
        boolean boolean9 = preloaded2.isExtern();
        java.lang.String str10 = preloaded2.getOriginalPath();
        boolean boolean11 = preloaded2.isExtern();
        int int12 = preloaded2.getNumLines();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.getCodeNoCache();
        generated2.setIsExtern(false);
        java.lang.String str10 = generated2.toString();
        generated2.clearCachedSource();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        preloaded2.clearCachedSource();
        preloaded2.setIsExtern(true);
        java.lang.Class<?> wildcardClass9 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.SourceFile sourceFile4 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        sourceFile4.setOriginalPath("");
        sourceFile4.setOriginalPath("");
        java.lang.String str9 = sourceFile4.getCodeNoCache();
        java.io.Reader reader10 = sourceFile4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        boolean boolean12 = sourceFile11.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str7 = generated2.toString();
        boolean boolean8 = generated2.isExtern();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        boolean boolean13 = preloaded3.hasSourceInMemory();
        preloaded3.setOriginalPath("");
        int int16 = preloaded3.getNumLines();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        sourceFile13.setOriginalPath("hi!");
        java.lang.String str17 = sourceFile13.getLine(100);
        java.io.Reader reader18 = sourceFile13.getCodeReader();
        java.lang.String str19 = sourceFile13.getName();
        sourceFile13.setIsExtern(false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        java.lang.String str17 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        boolean boolean19 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        boolean boolean5 = sourceFile3.hasSourceInMemory();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(reader6);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        preloaded3.setOriginalPath("");
        preloaded3.setOriginalPath("hi!");
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(false);
        boolean boolean15 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str13 = sourceFile9.getCode();
        java.lang.String str15 = sourceFile9.getLine((int) (byte) 0);
        java.lang.String str16 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str11 = preloaded3.getOriginalPath();
        java.lang.String str13 = preloaded3.getLine((int) (short) 1);
        java.lang.String str14 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getOriginalPath();
        preloaded3.clearCachedSource();
        java.lang.String str17 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.getCodeNoCache();
        sourceFile1.setOriginalPath("");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        int int5 = preloaded2.getNumLines();
        java.lang.String str7 = preloaded2.getLine(10);
        java.lang.String str9 = preloaded2.getLine(0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = preloaded2.getLineOffset((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        java.lang.String str10 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.jscomp.SourceFile sourceFile1 = new com.google.javascript.jscomp.SourceFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        sourceFile1.setOriginalPath("hi!");
        boolean boolean5 = sourceFile1.isExtern();
        java.lang.String str6 = sourceFile1.getCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        boolean boolean14 = preloaded3.isExtern();
        boolean boolean15 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        int int12 = preloaded3.getNumLines();
        java.lang.String str14 = preloaded3.getLine((int) (byte) 0);
        boolean boolean15 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        preloaded2.setOriginalPath("");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        com.google.javascript.jscomp.Region region4 = sourceFile2.getRegion((int) '4');
        boolean boolean5 = sourceFile2.isExtern();
        java.lang.String str6 = sourceFile2.getCodeNoCache();
        sourceFile2.setOriginalPath("");
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertNull(region4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        java.lang.String str19 = preloaded3.getLine((int) (byte) 100);
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str8 = generated2.getOriginalPath();
        generated2.setOriginalPath("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        java.lang.String str18 = sourceFile17.getCodeNoCache();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertNotNull(sourceFile16);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) '4');
        int int18 = preloaded3.getLineOffset(1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str15 = preloaded3.getLine((int) (short) -1);
        preloaded3.setOriginalPath("");
        boolean boolean18 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.getCode();
        java.lang.String str8 = preloaded2.getCode();
        boolean boolean9 = preloaded2.hasSourceInMemory();
        preloaded2.setIsExtern(true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        java.lang.String str14 = preloaded3.getCode();
        java.lang.String str15 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        java.lang.String str15 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        int int14 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!", "");
        java.lang.String str5 = preloaded4.getName();
        preloaded4.setOriginalPath("hi!");
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        boolean boolean10 = sourceFile9.isExtern();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        java.lang.String str6 = sourceFile3.getLine((int) (short) -1);
        int int7 = sourceFile3.getNumLines();
        java.lang.String str9 = sourceFile3.getLine(0);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        java.io.Reader reader15 = sourceFile9.getCodeReader();
        java.lang.String str16 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str5 = preloaded3.getOriginalPath();
        preloaded3.setIsExtern(true);
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        int int8 = preloaded3.getNumLines();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine(0);
        java.lang.String str7 = preloaded3.getCode();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.String str17 = sourceFile9.getCodeNoCache();
        java.lang.String str18 = sourceFile9.getCode();
        sourceFile9.setOriginalPath("");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        sourceFile9.setIsExtern(true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
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
        sourceFile9.setIsExtern(false);
        java.lang.String str20 = sourceFile9.getOriginalPath();
        java.lang.String str21 = sourceFile9.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(region14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        boolean boolean4 = sourceFile3.isExtern();
        int int5 = sourceFile3.getNumLines();
        java.io.Reader reader6 = sourceFile3.getCodeReader();
        int int7 = sourceFile3.getNumLines();
        sourceFile3.setIsExtern(false);
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getCodeNoCache();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str9 = generated2.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str11 = preloaded3.getLine((int) '#');
        boolean boolean12 = preloaded3.isExtern();
        java.lang.String str13 = preloaded3.getOriginalPath();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        java.lang.String str9 = preloaded4.toString();
        boolean boolean10 = preloaded4.isExtern();
        java.io.Reader reader11 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile12 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader11);
        java.lang.String str13 = sourceFile12.getCodeNoCache();
        java.lang.String str14 = sourceFile12.getOriginalPath();
        boolean boolean15 = sourceFile12.hasSourceInMemory();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        com.google.javascript.jscomp.Region region8 = preloaded3.getRegion(0);
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion((-1));
        boolean boolean11 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 100);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(region8);
        org.junit.Assert.assertNotNull(region10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(region13);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        boolean boolean8 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getOriginalPath();
        java.lang.String str11 = preloaded3.toString();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        preloaded3.setIsExtern(false);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) (short) 1);
        preloaded3.setOriginalPath("hi!");
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.SourceFile sourceFile2 = com.google.javascript.jscomp.SourceFile.fromFile("hi!", charset1);
        java.lang.String str3 = sourceFile2.getOriginalPath();
        int int4 = sourceFile2.getNumLines();
        sourceFile2.setOriginalPath("hi!");
        int int8 = sourceFile2.getLineOffset(1);
        sourceFile2.setOriginalPath("hi!");
        sourceFile2.clearCachedSource();
        java.lang.String str12 = sourceFile2.toString();
        boolean boolean13 = sourceFile2.hasSourceInMemory();
        boolean boolean14 = sourceFile2.hasSourceInMemory();
        org.junit.Assert.assertNotNull(sourceFile2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str12 = preloaded3.toString();
        preloaded3.setIsExtern(true);
        java.lang.String str15 = preloaded3.getOriginalPath();
        java.lang.Class<?> wildcardClass16 = preloaded3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        preloaded3.setIsExtern(true);
        preloaded3.setOriginalPath("hi!");
        com.google.javascript.jscomp.Region region14 = preloaded3.getRegion((int) '4');
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region14);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
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
        java.lang.String str17 = preloaded3.getLine((int) '#');
        java.lang.String str19 = preloaded3.getLine((int) (byte) -1);
        boolean boolean20 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        java.lang.String str8 = preloaded3.getLine((int) '#');
        java.lang.String str9 = preloaded3.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        java.lang.String str12 = preloaded3.getCodeNoCache();
        java.io.Reader reader13 = preloaded3.getCodeReader();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        boolean boolean15 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        preloaded2.setOriginalPath("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        int int6 = preloaded3.getNumLines();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.setOriginalPath("hi!");
        int int10 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine(10);
        java.lang.String str13 = sourceFile9.toString();
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) '4');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(region15);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion(0);
        java.lang.String str14 = preloaded3.getOriginalPath();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = preloaded3.getLineOffset((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        boolean boolean16 = preloaded3.hasSourceInMemory();
        boolean boolean17 = preloaded3.hasSourceInMemory();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        java.lang.String str3 = preloaded2.getCodeNoCache();
        boolean boolean4 = preloaded2.isExtern();
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        int int8 = preloaded2.getNumLines();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.toString();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.getCodeNoCache();
        java.lang.String str6 = preloaded3.getCodeNoCache();
        preloaded3.clearCachedSource();
        int int8 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getCodeNoCache();
        java.lang.String str11 = preloaded3.getLine((int) '#');
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion(1);
        java.lang.String str14 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.setIsExtern(true);
        java.lang.String str9 = generated2.getName();
        generated2.clearCachedSource();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.setOriginalPath("");
        java.lang.String str6 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        generated2.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = generated2.getLine((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        java.lang.String str14 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(false);
        int int5 = preloaded2.getNumLines();
        java.lang.Class<?> wildcardClass6 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        java.io.Reader reader9 = preloaded5.getCodeReader();
        java.lang.String str10 = preloaded5.toString();
        boolean boolean11 = preloaded5.isExtern();
        java.io.Reader reader12 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile13 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader12);
        java.lang.String str15 = sourceFile14.getName();
        sourceFile14.clearCachedSource();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
            java.lang.String str15 = generated2.getCode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
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
        preloaded3.clearCachedSource();
        preloaded3.setOriginalPath("hi!");
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
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine(0);
        java.lang.String str7 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) (byte) 0);
        java.lang.String str10 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(region9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        preloaded3.setOriginalPath("");
        preloaded3.clearCachedSource();
        int int22 = preloaded3.getNumLines();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        int int9 = preloaded2.getLineOffset((int) (byte) 1);
        java.lang.String str10 = preloaded2.getCode();
        preloaded2.setOriginalPath("hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        java.lang.String str7 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.toString();
        java.lang.String str10 = preloaded3.getCode();
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) (short) 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(region12);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        java.lang.String str7 = preloaded3.getCode();
        java.lang.String str8 = preloaded3.getOriginalPath();
        java.lang.String str9 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        preloaded2.setOriginalPath("hi!");
        java.lang.String str10 = preloaded2.getName();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.clearCachedSource();
        java.lang.String str6 = preloaded2.toString();
        java.lang.String str7 = preloaded2.getOriginalPath();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        preloaded2.setIsExtern(true);
        boolean boolean5 = preloaded2.isExtern();
        java.lang.String str6 = preloaded2.getName();
        java.lang.Class<?> wildcardClass7 = preloaded2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
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
        sourceFile13.setOriginalPath("");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertNotNull(sourceFile12);
        org.junit.Assert.assertNotNull(sourceFile13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        java.lang.String str12 = sourceFile11.toString();
        java.io.Reader reader13 = sourceFile11.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        java.lang.String str16 = sourceFile15.getOriginalPath();
        boolean boolean17 = sourceFile15.hasSourceInMemory();
        sourceFile15.clearCachedSource();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        java.io.Reader reader18 = preloaded3.getCodeReader();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(reader18);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        java.io.Reader reader7 = preloaded3.getCodeReader();
        preloaded3.clearCachedSource();
        java.lang.String str9 = preloaded3.toString();
        preloaded3.setOriginalPath("hi!");
        com.google.javascript.jscomp.Region region13 = preloaded3.getRegion((int) '4');
        java.lang.String str14 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reader7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        sourceFile9.setOriginalPath("");
        sourceFile9.setIsExtern(false);
        java.lang.String str15 = sourceFile9.toString();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
            java.io.Reader reader11 = generated2.getCodeReader();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        java.lang.String str17 = sourceFile9.getCodeNoCache();
        java.lang.String str18 = sourceFile9.getOriginalPath();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "hi!");
        boolean boolean3 = preloaded2.hasSourceInMemory();
        java.lang.String str4 = preloaded2.getCode();
        boolean boolean5 = preloaded2.hasSourceInMemory();
        java.lang.String str7 = preloaded2.getLine((int) '4');
        boolean boolean8 = preloaded2.hasSourceInMemory();
        boolean boolean9 = preloaded2.hasSourceInMemory();
        java.io.Reader reader10 = preloaded2.getCodeReader();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(reader10);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.google.javascript.jscomp.SourceFile sourceFile1 = com.google.javascript.jscomp.SourceFile.fromFile("hi!");
        java.lang.String str2 = sourceFile1.toString();
        org.junit.Assert.assertNotNull(sourceFile1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        com.google.javascript.jscomp.Region region9 = preloaded3.getRegion((int) '#');
        boolean boolean10 = preloaded3.isExtern();
        java.lang.String str11 = preloaded3.getOriginalPath();
        boolean boolean12 = preloaded3.hasSourceInMemory();
        java.lang.String str13 = preloaded3.getCode();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        boolean boolean5 = generated2.hasSourceInMemory();
        java.lang.String str6 = generated2.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.toString();
        int int7 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        boolean boolean11 = preloaded3.hasSourceInMemory();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded4.clearCachedSource();
        java.lang.String str7 = preloaded4.getLine((int) (byte) -1);
        int int8 = preloaded4.getNumLines();
        java.io.Reader reader9 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile10 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader9);
        java.lang.String str11 = sourceFile10.getCode();
        sourceFile10.clearCachedSource();
        sourceFile10.setIsExtern(false);
        java.lang.String str15 = sourceFile10.getCodeNoCache();
        java.lang.String str17 = sourceFile10.getLine((-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(sourceFile10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded2 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        int int4 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setIsExtern(false);
        java.lang.String str7 = preloaded2.toString();
        int int9 = preloaded2.getLineOffset((int) (byte) 1);
        preloaded2.setOriginalPath("");
        boolean boolean12 = preloaded2.hasSourceInMemory();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.clearCachedSource();
        preloaded3.setIsExtern(false);
        java.lang.String str10 = preloaded3.getCode();
        java.lang.String str12 = preloaded3.getLine(0);
        int int14 = preloaded3.getLineOffset((int) (byte) 1);
        java.lang.String str15 = preloaded3.getCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader6 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        com.google.javascript.jscomp.SourceFile sourceFile8 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader6);
        java.lang.String str9 = sourceFile8.getCode();
        java.io.Reader reader10 = sourceFile8.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        org.junit.Assert.assertNotNull(reader6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertNotNull(sourceFile8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(0);
        java.lang.String str11 = preloaded3.getCodeNoCache();
        java.lang.String str12 = preloaded3.toString();
        java.lang.String str13 = preloaded3.getName();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        java.lang.String str15 = preloaded3.getCode();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.setIsExtern(true);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = generated2.getNumLines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "");
        java.io.Reader reader5 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile6 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        com.google.javascript.jscomp.SourceFile sourceFile7 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader5);
        java.lang.String str8 = sourceFile7.getCode();
        java.io.Reader reader9 = sourceFile7.getCodeReader();
        java.lang.String str10 = sourceFile7.getOriginalPath();
        sourceFile7.clearCachedSource();
        boolean boolean12 = sourceFile7.hasSourceInMemory();
        org.junit.Assert.assertNotNull(reader5);
        org.junit.Assert.assertNotNull(sourceFile6);
        org.junit.Assert.assertNotNull(sourceFile7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        java.lang.String str14 = preloaded3.getCode();
        java.lang.String str15 = preloaded3.getCodeNoCache();
        java.lang.String str16 = preloaded3.getCodeNoCache();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) '4');
        java.lang.String str17 = preloaded3.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        java.lang.String str8 = preloaded5.toString();
        int int9 = preloaded5.getNumLines();
        com.google.javascript.jscomp.Region region11 = preloaded5.getRegion((int) '#');
        boolean boolean12 = preloaded5.isExtern();
        boolean boolean13 = preloaded5.isExtern();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(region11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        com.google.javascript.jscomp.SourceFile sourceFile3 = com.google.javascript.jscomp.SourceFile.fromCode("hi!", "hi!", "");
        java.lang.String str4 = sourceFile3.toString();
        java.lang.String str5 = sourceFile3.toString();
        java.lang.String str6 = sourceFile3.getCode();
        java.lang.String str7 = sourceFile3.toString();
        java.lang.String str8 = sourceFile3.getName();
        org.junit.Assert.assertNotNull(sourceFile3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        preloaded3.clearCachedSource();
        java.lang.String str10 = preloaded3.getLine(100);
        com.google.javascript.jscomp.Region region12 = preloaded3.getRegion((int) ' ');
        java.lang.String str13 = preloaded3.getOriginalPath();
        boolean boolean14 = preloaded3.hasSourceInMemory();
        com.google.javascript.jscomp.Region region16 = preloaded3.getRegion((int) '4');
        preloaded3.clearCachedSource();
        com.google.javascript.jscomp.Region region19 = preloaded3.getRegion((int) (byte) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(region16);
        org.junit.Assert.assertNull(region19);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.toString();
        java.io.Reader reader11 = sourceFile9.getCodeReader();
        java.lang.String str12 = sourceFile9.getCode();
        java.lang.String str13 = sourceFile9.getCode();
        com.google.javascript.jscomp.Region region15 = sourceFile9.getRegion((int) (short) 10);
        sourceFile9.setIsExtern(false);
        java.lang.String str18 = sourceFile9.getName();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(sourceFile9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(region15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int14 = preloaded3.getLineOffset((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Expected line number between 1 and 1?Actual: -1");
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
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        int int4 = preloaded3.getNumLines();
        java.lang.String str5 = preloaded3.toString();
        boolean boolean6 = preloaded3.isExtern();
        preloaded3.setOriginalPath("hi!");
        java.lang.String str9 = preloaded3.getCode();
        boolean boolean10 = preloaded3.isExtern();
        int int11 = preloaded3.getNumLines();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        java.io.Reader reader8 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile9 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader8);
        java.lang.String str10 = sourceFile9.getOriginalPath();
        java.lang.String str12 = sourceFile9.getLine((int) (short) 10);
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
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded5 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str7 = preloaded5.getLine((int) (byte) 10);
        boolean boolean8 = preloaded5.isExtern();
        boolean boolean9 = preloaded5.hasSourceInMemory();
        boolean boolean10 = preloaded5.hasSourceInMemory();
        preloaded5.setOriginalPath("");
        java.io.Reader reader13 = preloaded5.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        java.lang.String str16 = sourceFile15.getOriginalPath();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        boolean boolean5 = preloaded3.hasSourceInMemory();
        java.lang.String str6 = preloaded3.getName();
        preloaded3.clearCachedSource();
        java.io.Reader reader8 = preloaded3.getCodeReader();
        java.io.Reader reader9 = preloaded3.getCodeReader();
        boolean boolean10 = preloaded3.hasSourceInMemory();
        java.lang.String str11 = preloaded3.getCode();
        preloaded3.setIsExtern(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        preloaded3.setIsExtern(false);
        java.lang.String str20 = preloaded3.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        boolean boolean10 = preloaded6.hasSourceInMemory();
        boolean boolean11 = preloaded6.hasSourceInMemory();
        preloaded6.setOriginalPath("");
        com.google.javascript.jscomp.Region region15 = preloaded6.getRegion(0);
        java.io.Reader reader16 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile17 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        com.google.javascript.jscomp.SourceFile sourceFile18 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        com.google.javascript.jscomp.SourceFile sourceFile19 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader16);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(region15);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(sourceFile17);
        org.junit.Assert.assertNotNull(sourceFile18);
        org.junit.Assert.assertNotNull(sourceFile19);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str7 = preloaded3.getLine(10);
        boolean boolean8 = preloaded3.isExtern();
        com.google.javascript.jscomp.Region region10 = preloaded3.getRegion(100);
        java.lang.String str11 = preloaded3.getName();
        java.lang.String str13 = preloaded3.getLine(1);
        preloaded3.setOriginalPath("");
        boolean boolean16 = preloaded3.isExtern();
        java.lang.String str17 = preloaded3.getOriginalPath();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        boolean boolean6 = preloaded3.isExtern();
        boolean boolean7 = preloaded3.hasSourceInMemory();
        java.lang.String str9 = preloaded3.getLine((int) (short) 0);
        java.lang.String str10 = preloaded3.getCode();
        preloaded3.setOriginalPath("");
        preloaded3.setIsExtern(true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
        java.io.Reader reader18 = preloaded3.getCodeReader();
        java.lang.String str20 = preloaded3.getLine((int) (byte) 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(region12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str5 = preloaded3.getLine((int) (byte) 10);
        java.lang.String str6 = preloaded3.getCode();
        int int7 = preloaded3.getNumLines();
        java.lang.String str8 = preloaded3.getName();
        boolean boolean9 = preloaded3.hasSourceInMemory();
        preloaded3.clearCachedSource();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded6 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str8 = preloaded6.getLine((int) (byte) 10);
        boolean boolean9 = preloaded6.isExtern();
        java.io.Reader reader10 = preloaded6.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile11 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader10);
        java.lang.String str12 = sourceFile11.toString();
        java.io.Reader reader13 = sourceFile11.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile14 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader13);
        java.lang.String str16 = sourceFile15.getOriginalPath();
        java.lang.String str17 = sourceFile15.getOriginalPath();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertNotNull(sourceFile11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(sourceFile14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
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
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded3 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        preloaded3.clearCachedSource();
        java.lang.String str6 = preloaded3.getLine((int) (byte) -1);
        int int7 = preloaded3.getNumLines();
        java.lang.String str9 = preloaded3.getLine((int) (byte) 10);
        preloaded3.clearCachedSource();
        int int11 = preloaded3.getNumLines();
        preloaded3.clearCachedSource();
        boolean boolean13 = preloaded3.isExtern();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.google.javascript.jscomp.SourceFile.Generator generator1 = null;
        com.google.javascript.jscomp.SourceFile.Generated generated2 = new com.google.javascript.jscomp.SourceFile.Generated("hi!", generator1);
        generated2.setOriginalPath("hi!");
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        generated2.clearCachedSource();
        java.lang.String str9 = generated2.getName();
        java.lang.String str10 = generated2.getOriginalPath();
        generated2.clearCachedSource();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.google.javascript.jscomp.SourceFile.Preloaded preloaded4 = new com.google.javascript.jscomp.SourceFile.Preloaded("hi!", "", "hi!");
        java.lang.String str6 = preloaded4.getLine((int) (byte) 10);
        boolean boolean7 = preloaded4.isExtern();
        boolean boolean8 = preloaded4.hasSourceInMemory();
        boolean boolean9 = preloaded4.hasSourceInMemory();
        preloaded4.setOriginalPath("");
        com.google.javascript.jscomp.Region region13 = preloaded4.getRegion(0);
        java.io.Reader reader14 = preloaded4.getCodeReader();
        com.google.javascript.jscomp.SourceFile sourceFile15 = com.google.javascript.jscomp.SourceFile.fromReader("hi!", reader14);
        java.lang.String str16 = sourceFile15.getCodeNoCache();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(region13);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(sourceFile15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }
}

