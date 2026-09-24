package org.jsoup.helper;

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
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "hi!");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray3);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", false);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String[] strArray2 = org.jsoup.helper.StringUtil.padding;
        boolean boolean3 = org.jsoup.helper.StringUtil.in(" ", strArray2);
        boolean boolean4 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                    hi!hi!", "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray4, " ");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!" + "'", str9, " hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                   hi!", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray3);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                   ", strArray2);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray2, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                 ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                   ", strArray2);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray2);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray2, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("", strArray4);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray4);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi!hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray4);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray4);
        java.lang.Class<?> wildcardClass19 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray9);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray9, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray9);
        java.lang.Class<?> wildcardClass21 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!" + "'", str15, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str17, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str19, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", "hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                 hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                 ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.in("                                ", strArray3);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray3);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", strArray7);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray7, "                                ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str18, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", strArray3);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray9);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                                                                                                                                                      ");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!", strArray9);
        java.lang.Class<?> wildcardClass17 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!" + "'", str15, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray3, "hi!");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("          ", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "");
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray0, "                                                                                                    ");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray0, "                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray0, "                                                                                                 ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.Class<?> wildcardClass11 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.lang.String[] strArray6 = new java.lang.String[] { "                                                                                                 ", " hi!", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                                                                                 ", " hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        java.lang.Class<?> wildcardClass31 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                    hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray4);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray4);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", true);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                ");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray10);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray10, "");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                                                                                                                                  ");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray10);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("                                   hi!", strArray10);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                                                                                                                                  hi!" + "'", str19, "                                                                                                                                                                                                                  hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", "hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray2);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray2, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("          ", strArray2);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray9, "");
        java.lang.Class<?> wildcardClass23 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!" + "'", str20, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi!", "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("          ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str11, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray1, "                                                    ");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!                                hi!hi!                                hi!hi!                                hi!hi!", strArray1);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray1, "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, " hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", strArray8);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray8, "                                   ");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! hi!hi! hi!hi! hi!hi!" + "'", str12, "hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!                                   hi!                                   hi!                                   hi!" + "'", str16, "hi!                                   hi!                                   hi!                                   hi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str1, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray10);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray10, "");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                ", strArray10);
        java.lang.Class<?> wildcardClass19 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!", "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                   hi!                                   hi!                                   hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", false);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("                                                                                                 hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!hi!" + "'", str1, " hi!hi!");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                    hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ", "hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray8);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray8, "                                                                                                                                                                                                                                      ");
        java.lang.Class<?> wildcardClass15 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!" + "'", str14, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray7);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    " + "'", str15, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                                                                 hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("          ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean16 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", strArray6);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray6);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                ", strArray6);
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", true);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                   ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", strArray7);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "                                hi!hi!");
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    " + "'", str16, "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                                                                 hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "          hi!");
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    " + "'", str13, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    " + "'", str16, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! " + "'", str1, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                      ", "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "          hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:           hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                    ", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray2);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray2, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("          ", strArray2);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!                                   hi!                                   hi!                                   hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi!", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, " hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray8);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray8, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!hi!" + "'", str12, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!" + "'", str17, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray8);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str16, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!", "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, " hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!                                hi!hi!                                hi!hi!                                hi!hi!", strArray8);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!          hi!          hi!          hi!", strArray8);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!hi!" + "'", str12, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!" + "'", str17, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str20, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                  hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!", " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                    ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray5);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str14, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.in(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                    hi!                                                    hi!                                                    hi!", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, "                                                                                                    ");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray8);
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!" + "'", str12, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!" + "'", str14, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!", "hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                 ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", strArray3);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass17 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        java.lang.Class<?> wildcardClass7 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray3);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                                                                                                                                  hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray9);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!", strArray9);
        java.lang.Class<?> wildcardClass19 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                  hi!hi!" + "'", str16, "                                                                                                                                                                                                                  hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! ");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ", "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!          hi!          hi!          hi!", "                                   hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray9, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, "");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray9);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray9);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                    ");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray9);
        java.lang.Class<?> wildcardClass21 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str13, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!" + "'", str19, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                hi!", strArray4);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" ", strArray4);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray4);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        java.lang.Class<?> wildcardClass21 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "          ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray6);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray6, "          ");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi!", strArray6);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray6, "hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray6);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi! hi! hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!", strArray6);
        java.lang.Class<?> wildcardClass21 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str10, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str13, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str16, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    " + "'", str19, "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "          hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!                                   hi!                                   hi!                                   hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                                   hi!                                   hi!                                   hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("          ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray7);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray7, "hi! hi!hi! hi!hi! hi!hi!");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray7, "                                hi!");
        java.lang.Class<?> wildcardClass15 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str12, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                hi!hi!                                hi!hi!                                hi!hi!" + "'", str14, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray4);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, " hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray4);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray4);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!", " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("                                                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  ");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray7, " ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("          ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!" + "'", str12, " hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                   ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "hi! hi! hi! hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    " + "'", str15, "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray4);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!" + "'", str10, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray5);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                  ", strArray5);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str11, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray4);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "          ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in(" hi!", strArray4);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray4, " ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                      " + "'", str11, "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                  ", "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                 ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray2);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                   hi!", strArray2);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray1, "                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                 ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray1);
        java.lang.Class<?> wildcardClass11 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", "                                                                                                 hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", true);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray12);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray12);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray12);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray12);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", strArray12);
        boolean boolean19 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray12);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi!", strArray12);
        java.lang.Class<?> wildcardClass21 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!", "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!                                hi!hi!                                hi!hi!                                hi!hi!", strArray7);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                 hi!");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!hi!" + "'", str11, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                 hi!hi!" + "'", str16, "                                                                                                 hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!" + "'", str18, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String[] strArray7 = new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                          ", "hi!", "                                                    ", "                                   " };
        boolean boolean8 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                          ", "hi!", "                                                    ", "                                   " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str1, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi!", "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!", "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!" + "'", str1, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! " + "'", str1, "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str1, " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                    ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                   hi!hi!", strArray5);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                                                                                                                                  hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  hi!", strArray5);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                    ", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!          hi!hi!          hi!hi!          hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!          hi!hi!          hi!hi!          hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                   hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        java.lang.Class<?> wildcardClass15 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!hi!" + "'", str11, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                    ", strArray4);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray4);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray9);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray9, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray9);
        java.lang.Class<?> wildcardClass21 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str17, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!" + "'", str19, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                hi!hi!", strArray5);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!" + "'", str9, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str12, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "                                                                                                 hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                  hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                          ", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        java.lang.Class<?> wildcardClass22 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "          ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!", strArray6);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray6, " ");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray6);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!", strArray6);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str10, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                                                                                                      " + "'", str13, "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", true);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", strArray2);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", " hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!" + "'", str1, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.String[] strArray8 = org.jsoup.helper.StringUtil.padding;
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, "          ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" hi!", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray8);
        boolean boolean17 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray8);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", strArray8);
        java.lang.Class<?> wildcardClass19 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str12, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray4);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "          ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "                                   hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray5, "                                                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi!", strArray5);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!                                hi!hi!                                hi!hi!                                hi!hi!", strArray5);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("", strArray5);
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                 ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                   ", strArray2);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                                                                                                                                  ");
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray2, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!", strArray2);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray2, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass19 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray3);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi!", strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray1, "                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                 ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                   ", strArray1);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                                                                                                                                  ");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray1, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        java.lang.Class<?> wildcardClass15 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi!hi!", "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!                                   hi!                                   hi!                                   hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray12);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray12);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray12);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray12);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray12, "");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("                                ", strArray12);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray12);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        boolean boolean6 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray2);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str1, "hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str1, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                   ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray4);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi!hi!", "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "hi!");
        boolean boolean9 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray2);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!", "hi!                                   hi!                                   hi!                                   hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("          ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                                                                                                                                                      ");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!" + "'", str13, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", true);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str10, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!", "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray9);
        java.lang.Class<?> wildcardClass15 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray8, "");
        boolean boolean15 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", strArray8);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray8, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray8);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass21 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str12, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!" + "'", str17, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray5);
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!", " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "");
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray0, "                                                                                                    ");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray0, "                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray0, "                                                                                                 ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray0, "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                 ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.in("                                ", strArray3);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray3);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        java.lang.Class<?> wildcardClass19 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                    hi!hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "          ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray6, " hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str10, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    " + "'", str14, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    " + "'", str17, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", true);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", true);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray9, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, "");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray9);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray9);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray9, "");
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray9, "                                   hi!hi!");
        boolean boolean22 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray9);
        java.lang.Class<?> wildcardClass23 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str13, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!" + "'", str21, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, " hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!hi!" + "'", str12, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("", strArray3);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray3);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray3);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        java.lang.Class<?> wildcardClass19 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray4);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray4);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray4, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray5, "                                                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("", strArray5);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray5);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi!hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray5);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        boolean boolean21 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray5);
        java.lang.String str23 = org.jsoup.helper.StringUtil.join(strArray5, "                                   hi!");
        boolean boolean24 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray8, "");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray8, " ");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("          ", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!          hi!          hi!          hi!", strArray8);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray8);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!" + "'", str13, " hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "                                                                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "                                                    ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray6);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", strArray6);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                   hi!                                   hi!                                   hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi!hi!" + "'", str1, "hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("          ", strArray11);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray11, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray11, "");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray11);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray11);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray11);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", strArray11);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray11);
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray11, " ");
        java.lang.Class<?> wildcardClass25 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str15, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! hi! hi! hi!" + "'", str24, "hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray8, "");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray8, " ");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("          ", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", strArray8);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray8);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!" + "'", str13, " hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray9);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                 ");
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray9, "                                                    ");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!", strArray9);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray9, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!" + "'", str15, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!                                                    hi!                                                    hi!                                                    hi!" + "'", str17, "hi!                                                    hi!                                                    hi!                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str20, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!", true);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "  hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                   ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                hi!", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi!hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                   ", strArray4);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray4);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray4);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!", strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray8, "");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("          ", strArray11);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray11, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray11, "");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray11);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray11);
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray11, "");
        java.lang.String str23 = org.jsoup.helper.StringUtil.join(strArray11, "                                   hi!hi!");
        boolean boolean24 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray11);
        java.lang.String str26 = org.jsoup.helper.StringUtil.join(strArray11, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        boolean boolean27 = org.jsoup.helper.StringUtil.inSorted("                                hi!hi!", strArray11);
        boolean boolean28 = org.jsoup.helper.StringUtil.in("hi!hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str15, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!" + "'", str23, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!" + "'", str26, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!                                                    hi!                                                    hi!                                                    hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str13, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "hi!          hi!          hi!          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                 ");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray10);
        java.lang.Class<?> wildcardClass19 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!" + "'", str16, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", "hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.in("                                   ", strArray3);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, " hi!");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    " + "'", str7, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("                                   ", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("                                   ", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                  hi!hi!", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                hi!hi!", strArray8);
        java.lang.Class<?> wildcardClass13 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                   hi!hi!", "hi!                                   hi!                                   hi!                                   hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi! hi! hi!");
        java.lang.Class<?> wildcardClass23 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                   hi!                                   hi!                                   hi!", "                                hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        boolean boolean4 = org.jsoup.helper.StringUtil.in("hi!", strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", "                                   hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "                                   hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                    hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", true);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ", "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!                                   hi!                                   hi!                                   hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!          hi!          hi!          hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                    hi!                                                    hi!                                                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi!hi!hi!" + "'", str1, "hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!                                                    hi!                                                    hi!                                                    hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!hi!", false);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!          hi!          hi!          hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass31 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", "                                   hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "                                hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                hi!hi!" + "'", str9, "                                hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray7);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "                                hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                hi!hi!" + "'", str16, "                                hi!hi!");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                hi!hi!                                hi!hi!                                hi!hi!", true);
        java.lang.Class<?> wildcardClass22 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", true);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                   ", strArray2);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray2, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray2, "                                hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "hi!");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray4);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, " hi!hi!");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, " hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ", strArray4);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi!hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str7, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    " + "'", str10, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    " + "'", str12, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "                                                    hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                     hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                    hi!                                                    hi!                                                    hi!", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("          ", strArray11);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray11, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray11, "");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray11);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray11);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray11);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", strArray11);
        boolean boolean22 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str15, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray13);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray13);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray13);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray13);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray13);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", strArray13);
        boolean boolean20 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray13);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi!hi!", strArray13);
        boolean boolean22 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!          hi!          hi!          hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "  hi!hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", false);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!  hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.in("                                   ", strArray3);
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted(" ", strArray3);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray3, "hi!");
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.lang.String[] strArray9 = org.jsoup.helper.StringUtil.padding;
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi!", strArray9);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray9, "          ");
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray9);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray9);
        boolean boolean18 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", strArray9);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", strArray9);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  hi!hi!", strArray9);
        java.lang.Class<?> wildcardClass21 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str13, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray11);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" ", strArray11);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray11);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray11);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray11);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray11, "          hi!");
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray11, "hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean22 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!          hi!hi!          hi!hi!          hi!hi!" + "'", str19, "hi!          hi!hi!          hi!hi!          hi!hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str21, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ", "hi!          hi!          hi!          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("          ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray6);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray6);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray6, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray7, " ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("          ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", strArray7);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray7, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass19 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!" + "'", str12, " hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!" + "'", str18, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi!hi!", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!", strArray5);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray5, " ");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                                      " + "'", str12, "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        boolean boolean4 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray3);
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray3, " ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " hi!" + "'", str8, " hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str10, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String[] strArray2 = org.jsoup.helper.StringUtil.padding;
        boolean boolean3 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray2);
        boolean boolean4 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "  hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!hi!" + "'", str11, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!" + "'", str16, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray4);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                ");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi!", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!hi!", strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "          ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                  ", strArray6);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str10, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("          ", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray5);
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray9);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray9);
        java.lang.Class<?> wildcardClass17 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!" + "'", str15, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                    ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray5);
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                   ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean17 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray7);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray7);
        java.lang.Class<?> wildcardClass19 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    " + "'", str15, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        java.lang.Class<?> wildcardClass10 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!   hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", "hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray12);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray12);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray12);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray12);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("          hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi!", "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi!  hi! hi!hi! hi!hi! hi!hi!hi!   hi! hi!hi! hi!hi! hi!hi!hi!    hi! hi!hi! hi!hi! hi!hi!hi!     hi! hi!hi! hi!hi! hi!hi!hi!      hi! hi!hi! hi!hi! hi!hi!hi!       hi! hi!hi! hi!hi! hi!hi!hi!        hi! hi!hi! hi!hi! hi!hi!hi!         hi! hi!hi! hi!hi! hi!hi!hi!          hi! hi!hi! hi!hi! hi!hi!hi!           hi! hi!hi! hi!hi! hi!hi!hi!            hi! hi!hi! hi!hi! hi!hi!hi!             hi! hi!hi! hi!hi! hi!hi!hi!              hi! hi!hi! hi!hi! hi!hi!hi!               hi! hi!hi! hi!hi! hi!hi!hi!                hi! hi!hi! hi!hi! hi!hi!hi!                 hi! hi!hi! hi!hi! hi!hi!hi!                  hi! hi!hi! hi!hi! hi!hi!hi!                   hi! hi!hi! hi!hi! hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! " + "'", str1, "hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! ");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray10);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray10, "");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray10);
        java.lang.Class<?> wildcardClass19 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! " + "'", str1, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!", "hi!          hi!          hi!          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi!  hi! hi!hi! hi!hi! hi!hi!hi!   hi! hi!hi! hi!hi! hi!hi!hi!    hi! hi!hi! hi!hi! hi!hi!hi!     hi! hi!hi! hi!hi! hi!hi!hi!      hi! hi!hi! hi!hi! hi!hi!hi!       hi! hi!hi! hi!hi! hi!hi!hi!        hi! hi!hi! hi!hi! hi!hi!hi!         hi! hi!hi! hi!hi! hi!hi!hi!          hi! hi!hi! hi!hi! hi!hi!hi!           hi! hi!hi! hi!hi! hi!hi!hi!            hi! hi!hi! hi!hi! hi!hi!hi!             hi! hi!hi! hi!hi! hi!hi!hi!              hi! hi!hi! hi!hi! hi!hi!hi!               hi! hi!hi! hi!hi! hi!hi!hi!                hi! hi!hi! hi!hi! hi!hi!hi!                 hi! hi!hi! hi!hi! hi!hi!hi!                  hi! hi!hi! hi!hi! hi!hi!hi!                   hi! hi!hi! hi!hi! hi!hi!hi!                    ", "hi!                                                    hi!                                                    hi!                                                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          ", "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray4);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!", false);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!", "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray5);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ", strArray5);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray5, "                                                    ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!" + "'", str11, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                    hi!" + "'", str14, "                                                    hi!");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace(" hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str1, " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray4);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!" + "'", str10, " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                   ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!hi!hi!", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi!", " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

