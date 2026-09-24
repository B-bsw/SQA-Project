package org.jsoup.helper;

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
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "                                ");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                hi!" + "'", str15, "                                hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "                                hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                 hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                hi!hi!                                hi!hi!                                hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("          ", strArray3);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str8, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "hi!");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                ", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str7, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!", "                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                    ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                   hi!hi!", strArray5);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                                                                                                                                  hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  hi!", strArray5);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray5);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray5, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        java.lang.Class<?> wildcardClass19 = strArray5.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray4);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("          hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str14, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                   hi!hi!", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!          hi!          hi!          hi!", strArray3);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray3, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "                                                                                                                                                                                                                  hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                          ", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        java.lang.Class<?> wildcardClass19 = strArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("          ", strArray3);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.String[] strArray2 = org.jsoup.helper.StringUtil.padding;
        boolean boolean3 = org.jsoup.helper.StringUtil.in("", strArray2);
        boolean boolean4 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, " ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("          ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!" + "'", str11, " hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi!");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ", "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                                                                                                                                                                                  hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("                                   hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("", strArray3);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray3);
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, " hi!");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    " + "'", str16, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str1, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!                                                    hi!                                                    hi!                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("                                   ", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                hi!", strArray5);
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                  " + "'", str10, "                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" ", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", strArray5);
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray3, "hi!");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "                                ");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                hi!" + "'", str15, "                                hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                 ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                   ", strArray2);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray2);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray2, "          ");
        java.lang.Class<?> wildcardClass15 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str1, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        java.lang.Class<?> wildcardClass21 = strArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("", strArray4);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray4);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi!hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray4);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray4);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                ", "                                   hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!  hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str9, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("          ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                    ");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!" + "'", str11, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!" + "'", str13, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                                                                 hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                  ", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("          ", strArray3);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, " hi!hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                  hi!hi!", strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi! hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.lang.String[] strArray2 = org.jsoup.helper.StringUtil.padding;
        boolean boolean3 = org.jsoup.helper.StringUtil.in("", strArray2);
        boolean boolean4 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", "hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "                                hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray1, "hi!");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray1, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                hi!", strArray1);
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                          ", true);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!  hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray8);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray8, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!" + "'", str16, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:           hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str1, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!hi!", "hi!                                                    hi!                                                    hi!                                                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 ", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray7);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!hi!" + "'", str11, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!" + "'", str16, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", strArray3);
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray2);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray2, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("          ", strArray2);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, " hi!hi!");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray2, "                                ");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray2, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  hi!hi!", false);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str1, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray2);
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray2);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray3);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray3);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, " ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("          ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray6);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!" + "'", str11, " hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!" + "'", str15, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                  hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray3);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!" + "'", str1, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                  ", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!          hi!          hi!          hi!", strArray3);
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!                                                    hi!                                                    hi!                                                    hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!" + "'", str1, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                ", " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray4, " ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("          ", strArray4);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi!");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", true);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!          hi!          hi!          hi!", false);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "  hi!hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray3);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                   ", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str1, "hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                          ", "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                 ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.in("                                ", strArray3);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray3);
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("          hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi!hi!hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!", strArray10);
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        java.lang.Class<?> wildcardClass23 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!" + "'", str22, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!                                                    hi!                                                    hi!                                                    hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                                                    hi!                                                    hi!                                                    hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", true);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", "hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", false);
        java.lang.Class<?> wildcardClass22 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        java.lang.Class<?> wildcardClass10 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray7);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                hi!", strArray8);
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray5);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray5, " hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray5);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("                                   hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray4);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "          ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray4);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray4, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                  hi!hi!", strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "hi!");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str7, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                   ", strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" ", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("                                   hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                   ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", "hi!                                                    hi!                                                    hi!                                                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("                                hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", false);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!  hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!          hi!          hi!          hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray1, "hi!");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray1, "hi! hi!hi! hi!hi! hi!hi!");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray1, "");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                  hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!" + "'", str7, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! " + "'", str1, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("                                   ", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.in(" ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted(" ", strArray1);
        java.lang.Class<?> wildcardClass7 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                 ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray2);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray2, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                hi!", strArray2);
        java.lang.Class<?> wildcardClass15 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray3);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        java.lang.Class<?> wildcardClass34 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray7);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!", strArray7);
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
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!", "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray9);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", "                                   hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray11);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray11);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray11);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray11);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray11);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray11, "hi!hi!hi!hi!");
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!", strArray11);
        java.lang.String str23 = org.jsoup.helper.StringUtil.join(strArray11, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!" + "'", str23, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray7);
        java.lang.Class<?> wildcardClass13 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! hi!hi! hi!hi! hi!hi!" + "'", str11, "hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        java.lang.Class<?> wildcardClass17 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                   ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray7);
        java.lang.Class<?> wildcardClass15 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "          ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", strArray5);
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str9, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    " + "'", str13, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray8);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray8, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.Class<?> wildcardClass15 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str14, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray7);
        java.lang.Class<?> wildcardClass13 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!          hi!          hi!          hi!" + "'", str11, "hi!          hi!          hi!          hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "                                                                                                 hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:                                                                                                  hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "                                                                                                                                                                                                                  hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!", " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi!", strArray4);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("", strArray4);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray4);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!", strArray2);
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
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!                                                    hi!                                                    hi!                                                    hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi!", "          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          ", "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "          ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                    hi!                                                    hi!                                                    hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!  hi! hi! hi! hi!");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                                                                                                                                                                                  hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray9);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass19 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi!hi! hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!hi! hi!hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray3);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    " + "'", str7, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!" + "'", str1, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, " hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray8);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray8, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("          hi!", strArray8);
        java.lang.Class<?> wildcardClass19 = strArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray7);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray7, "                                   hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str11, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    " + "'", str17, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi!", "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("                                ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi! hi! hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", strArray6);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!" + "'", str9, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "          hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "");
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray0, "                                                                                                    ");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray0, "hi!");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str1, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                   hi!", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "          hi!" + "'", str15, "          hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray3);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray6);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str9, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!          hi!          hi!          hi!", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!", strArray4);
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
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                ");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray3);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    " + "'", str10, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                  hi!hi!", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                          ", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "hi!");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  ", strArray4);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray4);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!          hi!          hi!          hi!", strArray4);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray4);
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray4);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str8, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray4);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!" + "'", str10, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass31 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                hi!hi!                                hi!hi!                                hi!hi!", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", true);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!  hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
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
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                  hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                    ", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                   hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                      ", "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!          hi!          hi!          hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("          ", strArray3);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray3);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray3, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!" + "'", str1, "hi!hi!");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray3);
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
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                                                                 hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!hi! hi!hi! hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                    hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray8);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!" + "'", str16, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi!hi! hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", true);
        java.lang.Class<?> wildcardClass22 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray8, "                                hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray8);
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str11, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!                                hi!hi!                                hi!hi!                                hi!hi!" + "'", str13, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                    hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                 ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                   ", strArray3);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!", strArray3);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!", strArray3);
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
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray9);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray9);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray9, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.Class<?> wildcardClass21 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str17, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str20, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.Class<?> wildcardClass21 = strArray3.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", true);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("          ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!" + "'", str1, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi!hi!" + "'", str1, "hi! hi! hi! hi!hi!");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray2);
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
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("                                                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!hi!" + "'", str1, " hi!hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray7);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!hi!" + "'", str11, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!" + "'", str16, "hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "                                hi!");
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str8, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!                                hi!hi!                                hi!hi!                                hi!hi!" + "'", str10, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray11);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray11);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray11);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray11);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray11);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray11, "hi!hi!hi!hi!");
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!", strArray11);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray11);
        java.lang.Class<?> wildcardClass23 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!                                hi!hi!                                hi!hi!                                hi!hi!", strArray7);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!hi!" + "'", str11, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!" + "'", str16, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("          ", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                   hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, "          ");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray8);
        java.lang.Class<?> wildcardClass15 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!          hi!          hi!          hi!" + "'", str12, "hi!          hi!          hi!          hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ", "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!", "                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi!hi!", "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", false);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", "                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray9, " hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray9);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", strArray9);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray9);
        java.lang.Class<?> wildcardClass19 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!hi!" + "'", str13, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                 ");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                   hi!hi!", strArray10);
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                          ", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                hi!hi!", strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!" + "'", str9, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.lang.String[] strArray4 = org.jsoup.helper.StringUtil.padding;
        boolean boolean5 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "hi!");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray4);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, " hi!hi!");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, " hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray4);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray4);
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "                                                    hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray3, "hi!");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray3);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                  ", strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str9, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!", false);
        java.lang.Class<?> wildcardClass10 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("                                                    ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! " + "'", str1, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ", "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", false);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                   ", strArray4);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray4);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray4);
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
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray4);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray4);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!" + "'", str10, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str12, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String str3 = org.jsoup.helper.StringUtil.join(strArray1, "");
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray1, "                                                                                                    ");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray1, "hi!");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray1, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray1);
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!", "hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!", "                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray8);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray8, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str16, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, " ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("          ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!          hi!          hi!          hi!", strArray6);
        java.lang.Class<?> wildcardClass15 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!" + "'", str11, " hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("          ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!", strArray10);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                                                                                                                                                      ");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!" + "'", str16, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!", "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi!                                                    hi!                                                    hi!                                                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol:  hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        java.lang.Class<?> wildcardClass10 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.StringBuilder stringBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ", "hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
        java.lang.Class<?> wildcardClass21 = strArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        java.lang.Class<?> wildcardClass19 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "                                                    hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi! hi! hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!" + "'", str9, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "          ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", true);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.String[] strArray3 = org.jsoup.helper.StringUtil.padding;
        boolean boolean4 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean5 = org.jsoup.helper.StringUtil.in("hi!", strArray3);
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "          ");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str7, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray9);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray9, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", strArray9);
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
    }
}

