package org.jsoup.helper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

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
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!", "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!hi!hi!", strArray7);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray7, " hi!");
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray7, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi!hi!hi! hi! hi! hi! hi!hi!hi!  hi! hi! hi! hi!hi!hi!   hi! hi! hi! hi!hi!hi!    hi! hi! hi! hi!hi!hi!     hi! hi! hi! hi!hi!hi!      hi! hi! hi! hi!hi!hi!       hi! hi! hi! hi!hi!hi!        hi! hi! hi! hi!hi!hi!         hi! hi! hi! hi!hi!hi!          hi! hi! hi! hi!hi!hi!           hi! hi! hi! hi!hi!hi!            hi! hi! hi! hi!hi!hi!             hi! hi! hi! hi!hi!hi!              hi! hi! hi! hi!hi!hi!               hi! hi! hi! hi!hi!hi!                hi! hi! hi! hi!hi!hi!                 hi! hi! hi! hi!hi!hi!                  hi! hi! hi! hi!hi!hi!                   hi! hi! hi! hi!hi!hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", "hi!                                   hi!hi!                                   hi!hi!                                   hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                   ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray8);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray8, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        java.lang.Class<?> wildcardClass17 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!" + "'", str16, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("          ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!", strArray6);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("                                hi!", strArray6);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ", strArray6);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray6, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("", "hi!                                   hi!                                   hi!                                   hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!                                                                                                                                                                                                                  hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! ", "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!" };
        boolean boolean5 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!", strArray4);
        boolean boolean6 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                hi!                                hi!                                hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!hi! hi! hi!hi!hi!hi!hi!hi!", "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray6);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray6);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!hi!", strArray6);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    hi!hi!", strArray6);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, " hi!hi!hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        java.lang.String[] strArray7 = org.jsoup.helper.StringUtil.padding;
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray7);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "          ");
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                    ", strArray7);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray7, "                                   hi!");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi!", strArray7);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                                                                                                                                  " + "'", str19, "                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                  hi!hi! hi!                                                                                                 hi!hi!hi!hi!                                                                                                                                                                                                  hi!hi! hi!                                                                                                 hi!hi!hi!hi!                                                                                                                                                                                                  hi!hi! hi!                                                                                                 hi!hi!hi!hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!hi! hi! hi!hi!hi!hi!", strArray5);
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
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray10);
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
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                   hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        java.lang.String[] strArray11 = new java.lang.String[] { "", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray11);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray11);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("          ", strArray11);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray11);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray11, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray11);
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray11, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!", strArray11);
        java.lang.String str25 = org.jsoup.helper.StringUtil.join(strArray11, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        boolean boolean26 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!", strArray11);
        java.lang.Class<?> wildcardClass27 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!" + "'", str19, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str22, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!hi!" + "'", str25, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!                                   hi!                                   hi!                                   hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi!", false);
        java.lang.Class<?> wildcardClass25 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "                                                                                                 hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "                                                    hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray6, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                    hi!hi!hi!" + "'", str12, "                                                    hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str16, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "                                                                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "                                                    ");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray6);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi!hi!");
        boolean boolean19 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray6);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", strArray6);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!", strArray6);
        boolean boolean22 = org.jsoup.helper.StringUtil.in("          ", strArray6);
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray6, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi!");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray4);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!", strArray4);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray4);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray4);
        java.lang.Class<?> wildcardClass19 = strArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                hi!hi!", strArray5);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray5, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!" + "'", str9, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!" + "'", str12, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi!" + "'", str16, "hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi!");
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!", "hi! hi!hi! hi! hi!hi!hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("", strArray2);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray2, "hi! hi!hi! hi!hi! hi!hi!");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray2, "");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("          ", strArray12);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray12, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray12, "");
        boolean boolean19 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray12);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray12);
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray12, "");
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray12, "                                   hi!hi!");
        boolean boolean25 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", strArray12);
        boolean boolean26 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", strArray12);
        boolean boolean27 = org.jsoup.helper.StringUtil.inSorted("                                   hi!hi!", strArray12);
        boolean boolean28 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str16, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!" + "'", str24, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                    ");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", strArray9);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!" + "'", str15, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("", strArray4);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                   ", strArray4);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ", strArray4);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!", strArray4);
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
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray5, "                                                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("", strArray5);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray5);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray5);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!", strArray5);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted(" hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", false);
        java.lang.Class<?> wildcardClass22 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!   hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!", strArray7);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray7);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi!hi!" + "'", str15, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray3);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray3);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                ", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray10);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray10, "");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                                                                                                                                  ");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray10);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray10);
        boolean boolean22 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!", strArray10);
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
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                          ", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray9, "                                hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", strArray9);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray9);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!", strArray9);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray9, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str12, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                hi!hi!                                hi!hi!                                hi!hi!" + "'", str14, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        java.lang.String[] strArray9 = org.jsoup.helper.StringUtil.padding;
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                   ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in(" ", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray9);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi!hi!hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", strArray9);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!", strArray9);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi!hi!                                                    hi!                                                    hi!                                                    hi!hi!hi!                                                    hi!                                                    hi!                                                    hi!hi!hi!                                                    hi!                                                    hi!                                                    hi!hi!hi!", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    " + "'", str17, "hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray6);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str11, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!" + "'", str13, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str16, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                ", false);
        java.lang.Class<?> wildcardClass31 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace(" hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, " hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                                    ", strArray3);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray10, "");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.in(" ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", strArray10);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!", strArray10);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray9);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("          ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray9);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray9, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray9);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray9, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!" + "'", str17, "hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray7, " ");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("          ", strArray7);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!", strArray7);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray7);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!", strArray7);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray7, "hi!                                   hi!                                   hi!                                   hi!");
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray7, "hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!" + "'", str12, " hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!                                   hi!                                   hi!                                   hi!hi!" + "'", str18, "hi!                                   hi!                                   hi!                                   hi!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!" + "'", str20, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("          hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", strArray10);
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
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str1, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        boolean boolean6 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, " ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi! hi!hi!hi!hi!hi!  hi!hi! hi! hi!hi!hi!hi!hi!   hi!hi! hi! hi!hi!hi!hi!hi!    hi!hi! hi! hi!hi!hi!hi!hi!     hi!hi! hi! hi!hi!hi!hi!hi!      hi!hi! hi! hi!hi!hi!hi!hi!       hi!hi! hi! hi!hi!hi!hi!hi!        hi!hi! hi! hi!hi!hi!hi!hi!         hi!hi! hi! hi!hi!hi!hi!hi!          hi!hi! hi! hi!hi!hi!hi!hi!           hi!hi! hi! hi!hi!hi!hi!hi!            hi!hi! hi! hi!hi!hi!hi!hi!             hi!hi! hi! hi!hi!hi!hi!hi!              hi!hi! hi! hi!hi!hi!hi!hi!               hi!hi! hi! hi!hi!hi!hi!hi!                hi!hi! hi! hi!hi!hi!hi!hi!                 hi!hi! hi! hi!hi!hi!hi!hi!                  hi!hi! hi! hi!hi!hi!hi!hi!                   hi!hi! hi! hi!hi!hi!hi!hi!                    hi!hi! hi! hi!hi!hi!hi!hi!                    ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " hi!" + "'", str10, " hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                    ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.in(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", strArray5);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray5);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
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
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", strArray6);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray6, "                                ");
        java.lang.Class<?> wildcardClass17 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str9, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str16, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("", strArray4);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray4);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi!hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray4);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!hi!hi!", strArray4);
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
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray12);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" ", strArray12);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray12, " hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray12);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("", strArray12);
        boolean boolean19 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray12);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", strArray12);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray12);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray12);
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray12, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        boolean boolean25 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray12);
        boolean boolean26 = org.jsoup.helper.StringUtil.in("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!", strArray12);
        java.lang.String str28 = org.jsoup.helper.StringUtil.join(strArray12, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        java.lang.Class<?> wildcardClass29 = strArray12.getClass();
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " hi!hi!" + "'", str16, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str24, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str28, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
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
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi!", true);
        java.lang.Class<?> wildcardClass34 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! ");
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray10, " hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("                                   hi!", strArray10);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray10);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("                                hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " hi!hi!" + "'", str14, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.in("", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray9);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!", strArray9);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray9, "                                                                                                                                                                                                                  hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi!  hi! hi!hi! hi!hi! hi!hi!hi!   hi! hi!hi! hi!hi! hi!hi!hi!    hi! hi!hi! hi!hi! hi!hi!hi!     hi! hi!hi! hi!hi! hi!hi!hi!      hi! hi!hi! hi!hi! hi!hi!hi!       hi! hi!hi! hi!hi! hi!hi!hi!        hi! hi!hi! hi!hi! hi!hi!hi!         hi! hi!hi! hi!hi! hi!hi!hi!          hi! hi!hi! hi!hi! hi!hi!hi!           hi! hi!hi! hi!hi! hi!hi!hi!            hi! hi!hi! hi!hi! hi!hi!hi!             hi! hi!hi! hi!hi! hi!hi!hi!              hi! hi!hi! hi!hi! hi!hi!hi!               hi! hi!hi! hi!hi! hi!hi!hi!                hi! hi!hi! hi!hi! hi!hi!hi!                 hi! hi!hi! hi!hi! hi!hi!hi!                  hi! hi!hi! hi!hi! hi!hi!hi!                   hi! hi!hi! hi!hi! hi!hi!hi!                    ", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", strArray9);
        java.lang.Class<?> wildcardClass17 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                                                                                                                                                                                                  hi!hi!                                                                                                                                                                                                                  hi!hi!                                                                                                                                                                                                                  hi!hi!" + "'", str14, "hi!                                                                                                                                                                                                                  hi!hi!                                                                                                                                                                                                                  hi!hi!                                                                                                                                                                                                                  hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("                                   ", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                hi!", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "                                                    ");
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("", strArray3);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray3);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray3);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                    hi!                                                    hi!                                                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "                                                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("", strArray4);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray4);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi!hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                      ", strArray4);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!", strArray4);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!  hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!   hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!    hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!     hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!      hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!       hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!        hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!         hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!          hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!           hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!            hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!             hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!              hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!               hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                  hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                   hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                    ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!  hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", "                                                                                                 hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!                                hi!                                hi!                                hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!                                hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", "hi!                                hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray10, "");
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray10);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!hi!hi!", strArray10);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!", strArray10);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ", strArray10);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!          hi!          hi!          hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray5);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        boolean boolean7 = org.jsoup.helper.StringUtil.in("hi!", strArray5);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray5);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in(" hi!hi! hi! hi!hi!hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("          ", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray6);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   hi!", strArray6);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray6);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray6, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray3, "hi!");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  ", strArray3);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray3);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", strArray3);
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray10, " hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray10);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("                                                    hi!hi!", strArray10);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!", strArray10);
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray10, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!");
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " hi!hi!" + "'", str14, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!" + "'", str22, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!hi!hi!" + "'", str24, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!hi!hi!");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.URL uRL2 = org.jsoup.helper.StringUtil.resolve(uRL0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no protocol: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        } catch (java.net.MalformedURLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray4);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray4, "hi! hi!hi! hi!hi! hi!hi!hi!");
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!hi!hi!");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        java.lang.Class<?> wildcardClass19 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!          hi!          hi!          hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, " hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!                                hi!hi!                                hi!hi!                                hi!hi!hi!", strArray8);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray8, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray8);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!hi!" + "'", str12, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!hi!" + "'", str17, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!" + "'", str20, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!", "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean13 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray12);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray12, "          ");
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", strArray12);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray12);
        boolean boolean19 = org.jsoup.helper.StringUtil.in(" hi!", strArray12);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", strArray12);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi!  hi! hi!hi! hi!hi! hi!hi!hi!   hi! hi!hi! hi!hi! hi!hi!hi!    hi! hi!hi! hi!hi! hi!hi!hi!     hi! hi!hi! hi!hi! hi!hi!hi!      hi! hi!hi! hi!hi! hi!hi!hi!       hi! hi!hi! hi!hi! hi!hi!hi!        hi! hi!hi! hi!hi! hi!hi!hi!         hi! hi!hi! hi!hi! hi!hi!hi!          hi! hi!hi! hi!hi! hi!hi!hi!           hi! hi!hi! hi!hi! hi!hi!hi!            hi! hi!hi! hi!hi! hi!hi!hi!             hi! hi!hi! hi!hi! hi!hi!hi!              hi! hi!hi! hi!hi! hi!hi!hi!               hi! hi!hi! hi!hi! hi!hi!hi!                hi! hi!hi! hi!hi! hi!hi!hi!                 hi! hi!hi! hi!hi! hi!hi!hi!                  hi! hi!hi! hi!hi! hi!hi!hi!                   hi! hi!hi! hi!hi! hi!hi!hi!                    ", strArray12);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!          hi!          hi!          hi!" + "'", str16, "hi!          hi!          hi!          hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ", "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", "hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", "hi!                                                    hi!                                                    hi!                                                    hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi!  hi! hi!hi! hi!hi! hi!hi!hi!   hi! hi!hi! hi!hi! hi!hi!hi!    hi! hi!hi! hi!hi! hi!hi!hi!     hi! hi!hi! hi!hi! hi!hi!hi!      hi! hi!hi! hi!hi! hi!hi!hi!       hi! hi!hi! hi!hi! hi!hi!hi!        hi! hi!hi! hi!hi! hi!hi!hi!         hi! hi!hi! hi!hi! hi!hi!hi!          hi! hi!hi! hi!hi! hi!hi!hi!           hi! hi!hi! hi!hi! hi!hi!hi!            hi! hi!hi! hi!hi! hi!hi!hi!             hi! hi!hi! hi!hi! hi!hi!hi!              hi! hi!hi! hi!hi! hi!hi!hi!               hi! hi!hi! hi!hi! hi!hi!hi!                hi! hi!hi! hi!hi! hi!hi!hi!                 hi! hi!hi! hi!hi! hi!hi!hi!                  hi! hi!hi! hi!hi! hi!hi!hi!                   hi! hi!hi! hi!hi! hi!hi!hi!                    ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! ");
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("          ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray5);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray5);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!hi!");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", "hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray8, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray8);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray8);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        java.lang.String str23 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        boolean boolean24 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray8);
        boolean boolean25 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", strArray8);
        boolean boolean26 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!", true);
        java.lang.Class<?> wildcardClass13 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi! hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray5);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray5, " hi!hi!");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray5, " hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray5);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ", strArray5);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    " + "'", str11, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    " + "'", str13, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!hi!", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "                                                                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "                                                    ");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray6);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi!hi!");
        boolean boolean19 = org.jsoup.helper.StringUtil.in("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray6);
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray6, "hi!");
        boolean boolean22 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          hi!", strArray6);
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray6, " hi!");
        boolean boolean25 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray6);
        java.lang.String str27 = org.jsoup.helper.StringUtil.join(strArray6, "                                                                                                                                                                                                                                                                                                                                                                                                                          hi!hi!");
        boolean boolean28 = org.jsoup.helper.StringUtil.in("", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray8, " hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", strArray8);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " hi!hi!" + "'", str12, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!" + "'", str18, "hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", "hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray15);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" ", strArray15);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray15);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("", strArray15);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray15);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray15);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray15);
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray15, "hi!hi!hi!hi!");
        boolean boolean25 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi!hi!", strArray15);
        java.lang.String str27 = org.jsoup.helper.StringUtil.join(strArray15, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        boolean boolean28 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray15);
        boolean boolean29 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!", strArray15);
        boolean boolean30 = org.jsoup.helper.StringUtil.inSorted("", strArray15);
        java.lang.String str32 = org.jsoup.helper.StringUtil.join(strArray15, "                                                                                                                                                                                                                                      ");
        boolean boolean33 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!hi!hi!", strArray15);
        boolean boolean34 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    ", strArray15);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str24, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!" + "'", str27, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "                                                                                                                                                                                                                                      hi!" + "'", str32, "                                                                                                                                                                                                                                      hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "hi!");
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray4);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", strArray4);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray4);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    ", true);
        java.lang.Class<?> wildcardClass16 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric(" hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                   ", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str1, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray10);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray10, "");
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray10, "                                                                                                                                                                                                                  ");
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray10);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray10);
        java.lang.String str23 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!");
        java.lang.String str25 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        boolean boolean26 = org.jsoup.helper.StringUtil.in("hi!                                   hi!                                   hi!                                   hi!", strArray10);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!" + "'", str23, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!" + "'", str25, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "          hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! ", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray7, "");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                    ");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray7, "                                                    ");
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                 ");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                   ", strArray7);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray7);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray7);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray7);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!                                                                                                                                                                                                                  hi!", strArray7);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray7);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi! ", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray8, "");
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray8);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!", strArray8);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.in("", strArray7);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray7, "hi! hi! hi! hi!");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!" + "'", str10, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray5, "");
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                    ");
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray5, "                                                    ");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray5, "                                                                                                 ");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray5, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean17 = org.jsoup.helper.StringUtil.in("                                hi!", strArray5);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray5);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray5);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!hi!hi!hi!", strArray5);
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray5, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                          ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                 ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                   ", strArray2);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray2);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str4 = org.jsoup.helper.StringUtil.join(strArray2, "");
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray2, "                                                                                                    ");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray2, "hi!");
        boolean boolean9 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray2);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi! hi!hi! hi!hi! hi!hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                hi!hi!                                hi!hi!                                hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray10, "                                hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray10);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray10, " hi!hi!hi!");
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!");
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi! hi!hi!hi!hi!", strArray10);
        boolean boolean24 = org.jsoup.helper.StringUtil.in("hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!" + "'", str13, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!                                hi!hi!                                hi!hi!                                hi!hi!" + "'", str15, "hi!                                hi!hi!                                hi!hi!                                hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!" + "'", str20, "hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!" + "'", str22, "hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi!", false);
        java.lang.Class<?> wildcardClass31 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
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
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "          ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! ");
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray4, "                                                                                                    ");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray4, "hi!");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                  ", strArray4);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray4);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray4);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!hi! hi! hi! hi!hi!hi!", strArray4);
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
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        boolean boolean1 = org.jsoup.helper.StringUtil.isNumeric("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray10, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" hi!hi!", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                      ", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray10);
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
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi!hi! hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                          ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", true);
        java.lang.Class<?> wildcardClass34 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!" };
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray14);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted(" ", strArray14);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray14, " hi!");
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray14);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("", strArray14);
        boolean boolean21 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray14);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", strArray14);
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray14);
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray14);
        java.lang.String str26 = org.jsoup.helper.StringUtil.join(strArray14, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        boolean boolean27 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray14);
        boolean boolean28 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi! hi!", strArray14);
        boolean boolean29 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!", strArray14);
        boolean boolean30 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                  hi!hi! hi!                                                                                                 hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                  hi!hi! hi!                                                                                                 hi!hi!hi!hi!hi!hi!                                                                                                                                                                                                  hi!hi! hi!                                                                                                 hi!hi!hi!hi!hi!hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " hi!hi!" + "'", str18, " hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!" + "'", str26, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace(" hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! " + "'", str1, " hi! hi!hi! hi!hi! hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi!hi! hi!hi! hi!hi!hi! ");
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!", strArray6);
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "          ");
        boolean boolean11 = org.jsoup.helper.StringUtil.in(" hi!", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted(" ", strArray6);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi!");
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        java.lang.String str17 = org.jsoup.helper.StringUtil.join(strArray6, "          hi!");
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!hi!", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str10, "                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    " + "'", str14, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    " + "'", str17, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!                                   hi!hi!                                   hi!hi!                                   hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi!hi! hi!hi! hi!hi!hi!" + "'", str1, "hi! hi!hi! hi!hi! hi!hi!hi!");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        java.lang.String[] strArray10 = new java.lang.String[] { "", "hi!" };
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray10);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray10, "");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.in(" ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted(" hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!", strArray10);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", strArray10);
        boolean boolean19 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!", strArray10);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi!   hi! hi! hi! hi!    hi! hi! hi! hi!     hi! hi! hi! hi!      hi! hi! hi! hi!       hi! hi! hi! hi!        hi! hi! hi! hi!         hi! hi! hi! hi!          hi! hi! hi! hi!           hi! hi! hi! hi!            hi! hi! hi! hi!             hi! hi! hi! hi!              hi! hi! hi! hi!               hi! hi! hi! hi!                hi! hi! hi! hi!                 hi! hi! hi! hi!                  hi! hi! hi! hi!                   hi! hi! hi! hi!                    hi!", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(strArray0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean15 = org.jsoup.helper.StringUtil.in("", strArray14);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("          ", strArray14);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray14, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ");
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray14, "");
        boolean boolean21 = org.jsoup.helper.StringUtil.in("                                                                                                 ", strArray14);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray14);
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray14);
        boolean boolean24 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", strArray14);
        boolean boolean25 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray14);
        boolean boolean26 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!", strArray14);
        boolean boolean27 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!hi!", strArray14);
        boolean boolean28 = org.jsoup.helper.StringUtil.inSorted("                                                    hi!hi!", strArray14);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!" + "'", str18, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        java.lang.String[] strArray9 = new java.lang.String[] { "", "hi!" };
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray9);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted(" ", strArray9);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray9, " hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray9);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("", strArray9);
        boolean boolean16 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray9);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", strArray9);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray9);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray9, "");
        java.lang.String str22 = org.jsoup.helper.StringUtil.join(strArray9, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray9, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! ");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!" + "'", str22, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!" + "'", str24, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean12 = org.jsoup.helper.StringUtil.in("", strArray11);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray11);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" ", strArray11);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray11);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray11);
        boolean boolean17 = org.jsoup.helper.StringUtil.in(" hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray11);
        boolean boolean18 = org.jsoup.helper.StringUtil.inSorted("", strArray11);
        java.lang.String str20 = org.jsoup.helper.StringUtil.join(strArray11, " ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! hi! hi! hi!" + "'", str20, "hi! hi! hi! hi!");
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        java.lang.String[] strArray6 = org.jsoup.helper.StringUtil.padding;
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray6);
        java.lang.String str9 = org.jsoup.helper.StringUtil.join(strArray6, "hi!");
        boolean boolean10 = org.jsoup.helper.StringUtil.in("          ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("                                                                                                    ", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! hi! hi! hi! hi!hi! ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    " + "'", str9, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!                                                    hi!                                                    hi!                                                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("                                                    hi!hi!hi!", "hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!" };
        boolean boolean7 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray6);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray6);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        java.lang.String str7 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                    ");
        boolean boolean8 = org.jsoup.helper.StringUtil.in("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", strArray3);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", strArray3);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "                                                                                                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!");
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!                    ", "hi!          hi!          hi!          hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                  hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!                                 hi!                                  hi!                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!  hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        java.lang.String[] strArray5 = org.jsoup.helper.StringUtil.padding;
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray5);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray5, "hi!");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray5);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!", strArray5);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                    ", strArray5);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi!", strArray5);
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
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray7);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted(" ", strArray7);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray7);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray7);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("          ", strArray7);
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray7, "                                                                                                                                                                                                                  hi!");
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray7, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                                                                                                                                  hi!hi!" + "'", str14, "                                                                                                                                                                                                                  hi!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    hi!" + "'", str16, "          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                     hi!                      hi!                       hi!                        hi!                         hi!                          hi!                           hi!                            hi!                             hi!                    hi!");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        java.util.Iterator iterator0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(iterator0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "                                                                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "                                                    ");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray6);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi!hi!");
        boolean boolean19 = org.jsoup.helper.StringUtil.in("hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!", strArray6);
        boolean boolean20 = org.jsoup.helper.StringUtil.in("hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!", strArray6);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray6);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   hi!                                    hi!                                     hi!                                      hi!                                       hi!                                        hi!                                         hi!                                          hi!                                           hi!                                            hi!                                             hi!                                              hi!                                               hi!                                                hi!                                                 hi!                                                  hi!                                                   hi!                                                    hi!                                                     hi!                                                      hi!                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!          hi!hi!          hi!hi!          hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str5 = org.jsoup.helper.StringUtil.join(strArray3, "");
        boolean boolean6 = org.jsoup.helper.StringUtil.in("", strArray3);
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray3, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("                                                    ", strArray3);
        java.lang.String str11 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!");
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray3, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        boolean boolean14 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, " hi!hi! hi! hi!hi!hi!hi!  hi!hi! hi! hi!hi!hi!hi!   hi!hi! hi! hi!hi!hi!hi!    hi!hi! hi! hi!hi!hi!hi!     hi!hi! hi! hi!hi!hi!hi!      hi!hi! hi! hi!hi!hi!hi!       hi!hi! hi! hi!hi!hi!hi!        hi!hi! hi! hi!hi!hi!hi!         hi!hi! hi! hi!hi!hi!hi!          hi!hi! hi! hi!hi!hi!hi!           hi!hi! hi! hi!hi!hi!hi!            hi!hi! hi! hi!hi!hi!hi!             hi!hi! hi! hi!hi!hi!hi!              hi!hi! hi! hi!hi!hi!hi!               hi!hi! hi! hi!hi!hi!hi!                hi!hi! hi! hi!hi!hi!hi!                 hi!hi! hi! hi!hi!hi!hi!                  hi!hi! hi! hi!hi!hi!hi!                   hi!hi! hi! hi!hi!hi!hi!                    hi!hi! hi! hi!hi!hi!hi!                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!", "hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi!hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!          hi!hi!          hi!hi!          hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        java.lang.String[] strArray10 = org.jsoup.helper.StringUtil.padding;
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray10);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("                                   ", strArray10);
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted(" ", strArray10);
        boolean boolean14 = org.jsoup.helper.StringUtil.in(" ", strArray10);
        boolean boolean15 = org.jsoup.helper.StringUtil.in(" hi!hi!  hi!hi!   hi!hi!    hi!hi!     hi!hi!      hi!hi!       hi!hi!        hi!hi!         hi!hi!          hi!hi!           hi!hi!            hi!hi!             hi!hi!              hi!hi!               hi!hi!                hi!hi!                 hi!hi!                  hi!hi!                   hi!hi!                    hi!hi!                    ", strArray10);
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! ", strArray10);
        boolean boolean17 = org.jsoup.helper.StringUtil.in("hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!", strArray10);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray10, "                                hi!hi!");
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi!hi!hi!", strArray10);
        boolean boolean21 = org.jsoup.helper.StringUtil.inSorted("hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!", strArray10);
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi!  hi!hi!hi!hi!hi!hi!   hi!hi!hi!hi!hi!hi!    hi!hi!hi!hi!hi!hi!     hi!hi!hi!hi!hi!hi!      hi!hi!hi!hi!hi!hi!       hi!hi!hi!hi!hi!hi!        hi!hi!hi!hi!hi!hi!         hi!hi!hi!hi!hi!hi!          hi!hi!hi!hi!hi!hi!           hi!hi!hi!hi!hi!hi!            hi!hi!hi!hi!hi!hi!             hi!hi!hi!hi!hi!hi!              hi!hi!hi!hi!hi!hi!               hi!hi!hi!hi!hi!hi!                hi!hi!hi!hi!hi!hi!                 hi!hi!hi!hi!hi!hi!                  hi!hi!hi!hi!hi!hi!                   hi!hi!hi!hi!hi!hi!                    ", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    " });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    " + "'", str19, "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        java.lang.String str1 = org.jsoup.helper.StringUtil.normaliseWhitespace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        java.lang.String str2 = org.jsoup.helper.StringUtil.resolve("hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi! hi!hi! hi! hi!hi!hi!hi!hi!", "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                      ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                 ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                hi!hi!                                 hi!hi!                                  hi!hi!                                   hi!hi!                                    hi!hi!                                     hi!hi!                                      hi!hi!                                       hi!hi!                                        hi!hi!                                         hi!hi!                                          hi!hi!                                           hi!hi!                                            hi!hi!                                             hi!hi!                                              hi!hi!                                               hi!hi!                                                hi!hi!                                                 hi!hi!                                                  hi!hi!                                                   hi!hi!                    hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), " hi!hi!hi!  hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str6 = org.jsoup.helper.StringUtil.join(strArray4, "");
        boolean boolean7 = org.jsoup.helper.StringUtil.in("", strArray4);
        boolean boolean8 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray4);
        boolean boolean9 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray4);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray4);
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray4, " hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    ");
        java.lang.String str14 = org.jsoup.helper.StringUtil.join(strArray4, "hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass15 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        boolean boolean1 = org.jsoup.helper.StringUtil.isBlank("hi! hi!hi!hi! hi!hi!hi! hi!hi!hi! hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!  hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!   hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!    hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!     hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!      hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!       hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!        hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!         hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!          hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!           hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!            hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!             hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!              hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!               hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                 hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                  hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                   hi! hi!hi!hi! hi!hi!hi! hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                    ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi! hi! hi!hi! hi!hi! hi!hi!  hi! hi!hi! hi!hi! hi!hi!   hi! hi!hi! hi!hi! hi!hi!    hi! hi!hi! hi!hi! hi!hi!     hi! hi!hi! hi!hi! hi!hi!      hi! hi!hi! hi!hi! hi!hi!       hi! hi!hi! hi!hi! hi!hi!        hi! hi!hi! hi!hi! hi!hi!         hi! hi!hi! hi!hi! hi!hi!          hi! hi!hi! hi!hi! hi!hi!           hi! hi!hi! hi!hi! hi!hi!            hi! hi!hi! hi!hi! hi!hi!             hi! hi!hi! hi!hi! hi!hi!              hi! hi!hi! hi!hi! hi!hi!               hi! hi!hi! hi!hi! hi!hi!                hi! hi!hi! hi!hi! hi!hi!                 hi! hi!hi! hi!hi! hi!hi!                  hi! hi!hi! hi!hi! hi!hi!                   hi! hi!hi! hi!hi! hi!hi!                    ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!", false);
        java.lang.Class<?> wildcardClass28 = stringBuilder0.getClass();
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        java.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.jsoup.helper.StringUtil.join(collection0, "hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray8, "");
        boolean boolean11 = org.jsoup.helper.StringUtil.in("", strArray8);
        java.lang.String str13 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ");
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("          ", strArray8);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" ", strArray8);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("                                                                                                                                                                                                                                                                                                                                                                                                                          ", strArray8);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray8);
        java.lang.String str19 = org.jsoup.helper.StringUtil.join(strArray8, "hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!");
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray8, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!");
        boolean boolean22 = org.jsoup.helper.StringUtil.inSorted("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    ", strArray8);
        boolean boolean23 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", strArray8);
        boolean boolean24 = org.jsoup.helper.StringUtil.inSorted("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" };
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray8);
        boolean boolean10 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    ", strArray8);
        boolean boolean11 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!", strArray8);
        boolean boolean12 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 hi!", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "                                   ", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, " hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!hi! hi!hi! hi!hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!          hi!          hi!          hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!hi!", false);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "  hi!hi!hi! hi!hi! hi!hi! hi!hi!hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi! hi!hi!hi!");
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        java.lang.String[] strArray12 = new java.lang.String[] { "", "hi!" };
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("hi!", strArray12);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted(" ", strArray12);
        boolean boolean15 = org.jsoup.helper.StringUtil.inSorted(" hi!hi!", strArray12);
        boolean boolean16 = org.jsoup.helper.StringUtil.in("", strArray12);
        boolean boolean17 = org.jsoup.helper.StringUtil.inSorted("                                   ", strArray12);
        boolean boolean18 = org.jsoup.helper.StringUtil.in("hi! hi!hi! hi!hi! hi!hi!", strArray12);
        boolean boolean19 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray12);
        java.lang.String str21 = org.jsoup.helper.StringUtil.join(strArray12, "hi!hi!hi!hi!");
        boolean boolean22 = org.jsoup.helper.StringUtil.in("hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!                                                                                                                                                                                                                                      hi!", strArray12);
        boolean boolean23 = org.jsoup.helper.StringUtil.in("                                   ", strArray12);
        boolean boolean24 = org.jsoup.helper.StringUtil.in("hi!                                hi!hi!hi!                                hi!hi!hi!                                hi!hi!hi!hi!", strArray12);
        java.lang.String str26 = org.jsoup.helper.StringUtil.join(strArray12, "hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!");
        java.lang.String str28 = org.jsoup.helper.StringUtil.join(strArray12, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!hi!hi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!" + "'", str28, " hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi! hi!hi!");
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        java.lang.String str10 = org.jsoup.helper.StringUtil.join(strArray6, "                                                                                                    ");
        java.lang.String str12 = org.jsoup.helper.StringUtil.join(strArray6, "                                                    ");
        boolean boolean13 = org.jsoup.helper.StringUtil.inSorted("", strArray6);
        java.lang.String str15 = org.jsoup.helper.StringUtil.join(strArray6, "hi! hi!hi! hi!hi! hi!hi!");
        boolean boolean16 = org.jsoup.helper.StringUtil.inSorted("                                ", strArray6);
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi!hi!hi!hi!");
        boolean boolean19 = org.jsoup.helper.StringUtil.in("hi! hi! hi! hi!", strArray6);
        boolean boolean20 = org.jsoup.helper.StringUtil.inSorted("hi!                                   hi!hi!hi!                                   hi!hi!hi!                                   hi!hi!hi!hi!hi!", strArray6);
        boolean boolean21 = org.jsoup.helper.StringUtil.in("                                                                                                 hi!hi!", strArray6);
        boolean boolean22 = org.jsoup.helper.StringUtil.in("          ", strArray6);
        java.lang.String str24 = org.jsoup.helper.StringUtil.join(strArray6, "hi!                                                                                                    hi!                                                                                                    hi!                                                                                                    hi!hi!");
        java.lang.String str26 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi! hi!hi! hi!hi! hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str8 = org.jsoup.helper.StringUtil.join(strArray6, "");
        boolean boolean9 = org.jsoup.helper.StringUtil.in("", strArray6);
        boolean boolean10 = org.jsoup.helper.StringUtil.inSorted("                                                                                                 ", strArray6);
        boolean boolean11 = org.jsoup.helper.StringUtil.inSorted("                                                    ", strArray6);
        boolean boolean12 = org.jsoup.helper.StringUtil.in("hi!hi!hi!hi! hi!hi!hi!hi!  hi!hi!hi!hi!   hi!hi!hi!hi!    hi!hi!hi!hi!     hi!hi!hi!hi!      hi!hi!hi!hi!       hi!hi!hi!hi!        hi!hi!hi!hi!         hi!hi!hi!hi!          hi!hi!hi!hi!           hi!hi!hi!hi!            hi!hi!hi!hi!             hi!hi!hi!hi!              hi!hi!hi!hi!               hi!hi!hi!hi!                hi!hi!hi!hi!                 hi!hi!hi!hi!                  hi!hi!hi!hi!                   hi!hi!hi!hi!                    hi!", strArray6);
        boolean boolean13 = org.jsoup.helper.StringUtil.in("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!                    hi!hi!", strArray6);
        boolean boolean14 = org.jsoup.helper.StringUtil.inSorted("hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!", strArray6);
        java.lang.String str16 = org.jsoup.helper.StringUtil.join(strArray6, "                                                                                                 hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                     hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi!");
        java.lang.String str18 = org.jsoup.helper.StringUtil.join(strArray6, "hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!hi! hi!  hi!   hi!    hi!     hi!      hi!       hi!        hi!         hi!          hi!           hi!            hi!             hi!              hi!               hi!                hi!                 hi!                  hi!                   hi!                    hi!hi!");
        java.lang.Class<?> wildcardClass19 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        java.lang.StringBuilder stringBuilder0 = org.jsoup.helper.StringUtil.stringBuilder();
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!", false);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "", true);
        org.jsoup.helper.StringUtil.appendNormalisedWhitespace(stringBuilder0, "hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!                                                                                                 hi!                                                                                                 hi!                                                                                                 hi!hi!hi!hi!", true);
        org.junit.Assert.assertNotNull(stringBuilder0);
        org.junit.Assert.assertEquals(stringBuilder0.toString(), "hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi! hi! hi! hi!hi!hi!hi!");
    }
}

