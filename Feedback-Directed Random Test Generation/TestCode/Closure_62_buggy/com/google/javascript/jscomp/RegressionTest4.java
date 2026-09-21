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
        com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter lineNumberingFormatter0 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
        com.google.javascript.jscomp.Region region1 = null;
        java.lang.String str2 = lineNumberingFormatter0.formatRegion(region1);
        com.google.javascript.jscomp.Region region3 = null;
        java.lang.String str4 = lineNumberingFormatter0.formatRegion(region3);
        java.lang.String str7 = lineNumberingFormatter0.formatLine("", 10);
        com.google.javascript.jscomp.Region region8 = null;
        java.lang.String str9 = lineNumberingFormatter0.formatRegion(region8);
        java.lang.String str12 = lineNumberingFormatter0.formatLine("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Region region13 = null;
        java.lang.String str14 = lineNumberingFormatter0.formatRegion(region13);
        java.lang.String str17 = lineNumberingFormatter0.formatLine("hi!", 0);
        java.lang.String str20 = lineNumberingFormatter0.formatLine("", (int) ' ');
        com.google.javascript.jscomp.Region region21 = null;
        java.lang.String str22 = lineNumberingFormatter0.formatRegion(region21);
        com.google.javascript.jscomp.Region region23 = null;
        java.lang.String str24 = lineNumberingFormatter0.formatRegion(region23);
        java.lang.String str27 = lineNumberingFormatter0.formatLine("", (int) '4');
        com.google.javascript.jscomp.Region region28 = null;
        java.lang.String str29 = lineNumberingFormatter0.formatRegion(region28);
        com.google.javascript.jscomp.Region region30 = null;
        java.lang.String str31 = lineNumberingFormatter0.formatRegion(region30);
        com.google.javascript.jscomp.Region region32 = null;
        java.lang.String str33 = lineNumberingFormatter0.formatRegion(region32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter lineNumberingFormatter0 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
        com.google.javascript.jscomp.Region region1 = null;
        java.lang.String str2 = lineNumberingFormatter0.formatRegion(region1);
        com.google.javascript.jscomp.Region region3 = null;
        java.lang.String str4 = lineNumberingFormatter0.formatRegion(region3);
        java.lang.String str7 = lineNumberingFormatter0.formatLine("", 10);
        com.google.javascript.jscomp.Region region8 = null;
        java.lang.String str9 = lineNumberingFormatter0.formatRegion(region8);
        java.lang.String str12 = lineNumberingFormatter0.formatLine("", (int) (short) 0);
        java.lang.String str15 = lineNumberingFormatter0.formatLine("hi!", (int) ' ');
        com.google.javascript.jscomp.Region region16 = null;
        java.lang.String str17 = lineNumberingFormatter0.formatRegion(region16);
        java.lang.String str20 = lineNumberingFormatter0.formatLine("", (int) (byte) -1);
        java.lang.String str23 = lineNumberingFormatter0.formatLine("", 100);
        com.google.javascript.jscomp.Region region24 = null;
        java.lang.String str25 = lineNumberingFormatter0.formatRegion(region24);
        com.google.javascript.jscomp.Region region26 = null;
        java.lang.String str27 = lineNumberingFormatter0.formatRegion(region26);
        com.google.javascript.jscomp.Region region28 = null;
        java.lang.String str29 = lineNumberingFormatter0.formatRegion(region28);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter lineNumberingFormatter0 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
        com.google.javascript.jscomp.Region region1 = null;
        java.lang.String str2 = lineNumberingFormatter0.formatRegion(region1);
        com.google.javascript.jscomp.Region region3 = null;
        java.lang.String str4 = lineNumberingFormatter0.formatRegion(region3);
        com.google.javascript.jscomp.Region region5 = null;
        java.lang.String str6 = lineNumberingFormatter0.formatRegion(region5);
        com.google.javascript.jscomp.Region region7 = null;
        java.lang.String str8 = lineNumberingFormatter0.formatRegion(region7);
        com.google.javascript.jscomp.Region region9 = null;
        java.lang.String str10 = lineNumberingFormatter0.formatRegion(region9);
        java.lang.String str13 = lineNumberingFormatter0.formatLine("hi!", (int) (byte) 10);
        com.google.javascript.jscomp.Region region14 = null;
        java.lang.String str15 = lineNumberingFormatter0.formatRegion(region14);
        java.lang.String str18 = lineNumberingFormatter0.formatLine("", (int) (byte) 10);
        java.lang.String str21 = lineNumberingFormatter0.formatLine("hi!", (int) ' ');
        java.lang.String str24 = lineNumberingFormatter0.formatLine("", (int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter lineNumberingFormatter0 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
        com.google.javascript.jscomp.Region region1 = null;
        java.lang.String str2 = lineNumberingFormatter0.formatRegion(region1);
        com.google.javascript.jscomp.Region region3 = null;
        java.lang.String str4 = lineNumberingFormatter0.formatRegion(region3);
        java.lang.String str7 = lineNumberingFormatter0.formatLine("", 10);
        com.google.javascript.jscomp.Region region8 = null;
        java.lang.String str9 = lineNumberingFormatter0.formatRegion(region8);
        java.lang.String str12 = lineNumberingFormatter0.formatLine("hi!", (int) (short) -1);
        java.lang.String str15 = lineNumberingFormatter0.formatLine("hi!", (int) '#');
        java.lang.String str18 = lineNumberingFormatter0.formatLine("", 100);
        com.google.javascript.jscomp.Region region19 = null;
        java.lang.String str20 = lineNumberingFormatter0.formatRegion(region19);
        java.lang.Class<?> wildcardClass21 = lineNumberingFormatter0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter lineNumberingFormatter0 = new com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter();
        com.google.javascript.jscomp.Region region1 = null;
        java.lang.String str2 = lineNumberingFormatter0.formatRegion(region1);
        com.google.javascript.jscomp.Region region3 = null;
        java.lang.String str4 = lineNumberingFormatter0.formatRegion(region3);
        java.lang.String str7 = lineNumberingFormatter0.formatLine("", 10);
        java.lang.String str10 = lineNumberingFormatter0.formatLine("", (int) (short) 10);
        java.lang.String str13 = lineNumberingFormatter0.formatLine("hi!", (int) (short) 0);
        com.google.javascript.jscomp.Region region14 = null;
        java.lang.String str15 = lineNumberingFormatter0.formatRegion(region14);
        com.google.javascript.jscomp.Region region16 = null;
        java.lang.String str17 = lineNumberingFormatter0.formatRegion(region16);
        com.google.javascript.jscomp.Region region18 = null;
        java.lang.String str19 = lineNumberingFormatter0.formatRegion(region18);
        java.lang.String str22 = lineNumberingFormatter0.formatLine("hi!", (int) (byte) 0);
        java.lang.String str25 = lineNumberingFormatter0.formatLine("hi!", 0);
        java.lang.String str28 = lineNumberingFormatter0.formatLine("", (int) '4');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }
}

