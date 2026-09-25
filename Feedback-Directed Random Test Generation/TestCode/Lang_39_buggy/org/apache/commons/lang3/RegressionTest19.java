package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

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
    public void test09501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a", 57, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09502");
        int int1 = org.apache.commons.lang3.StringUtils.length("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 201 + "'", int1 == 201);
    }

    @Test
    public void test09503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09503");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09504");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h", "001001   01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah00h00h00h00h00h00h00h00h00   ...001001   01", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09505");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                       !IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 71 + "'", int14 == 71);
    }

    @Test
    public void test09506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("      10hi 1010 10       ", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       10hi 1010 10        " + "'", str2, "       10hi 1010 10        ");
    }

    @Test
    public void test09507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("404HI!010101!IH0100000000000000000000000000000000000000000000000000000000000000000000000000000000", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "404HI!010101!IH0100000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "404HI!010101!IH0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test09508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09508");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09509");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("01 0101 !ih01", "44444444444444444444444444444444444444444444444444444444444444444", 129, 192);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "01 0101 !ih0144444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "01 0101 !ih0144444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!ih!ih01!ih01", "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      " + "'", str2, "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ");
    }

    @Test
    public void test09511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     " + "'", str1, "                                     ");
    }

    @Test
    public void test09512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09512");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   11 1 11 1 11 1 11 1 11 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi", (int) (short) 100, "hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi" + "'", str3, "!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi");
    }

    @Test
    public void test09514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############", "          1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############" + "'", str2, "44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############");
    }

    @Test
    public void test09515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09515");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("00000000000000000000000000000000000", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             " + "'", str2, "0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test09517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09517");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                               10", "!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09518");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10                                                                                               1010                                                                                               10hi!", "00hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1010hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("hi!", 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("10HI! 1010 10", strArray7, strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '#', (int) (byte) 1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10                                                                                               1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                                                               1010                                                                                               " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "10                                                                                               1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "10                                                                                               1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10HI! 1010 10" + "'", str11, "10HI! 1010 10");
    }

    @Test
    public void test09519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("        1    ", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        1    " + "'", str2, "        1    ");
    }

    @Test
    public void test09520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("h00h00h00h00h00h00h00haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09522");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                            HI!       ..                                                                                            ", "1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test09523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09523");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaa00");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaa00" });
    }

    @Test
    public void test09524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("014444444444!!!!!!!!!!!", "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09526");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09527");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0!IH!IH01!IH010!IH!IH01!IH0144i!144i!4i!", "00", 363);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("    !ih!i", "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09529");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#######################################################################444444", 67, "4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################444444" + "'", str3, "#######################################################################444444");
    }

    @Test
    public void test09531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44444444104444444410444444441044444!ih!ih01!ih", "                                              0404HI!              ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "0hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09534");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                       !IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test09536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09536");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444");
    }

    @Test
    public void test09537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09537");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!0!ih!ih01!ih010!ih!ih01!ih01hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!0!ih!ih01!ih010!ih!ih01!ih01hi" });
    }

    @Test
    public void test09538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   11 1 11 1 11 1 11 1 11 1", 167, "#######################################################################444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################" + "'", str3, "######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################");
    }

    @Test
    public void test09539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09539");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih01!ih", "                      4444444aaa", 186);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("#######  #######  #######  #######  #######  ############  #######  #######  #######  #######  #####", "000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09541");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                                       111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09542");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("h00h00h00h00h00h00h00h00", '4', 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09543");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00h", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h" + "'", str3, "00h");
    }

    @Test
    public void test09545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09545");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("00H!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09546");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("00H!ih!ih0", "            00", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i", "144I41");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test09548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                                                                                               00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hh hh hh hh hh hh hh hh hhhhhhhhh444hhhhhhhhhhhh444444hhhhhhhhhhhh444hhhhhhhhhhhh444hhhhhhhhhhhh444" + "'", str3, " hh hh hh hh hh hh hh hh hhhhhhhhh444hhhhhhhhhhhh444444hhhhhhhhhhhh444hhhhhhhhhhhh444hhhhhhhhhhhh444");
    }

    @Test
    public void test09550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("#####################################################################################################################################################################         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################################################################################         00h00h00h00h00h00" + "'", str1, "#####################################################################################################################################################################         00h00h00h00h00h00");
    }

    @Test
    public void test09551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444                                                                                                                                                                            ", "   00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444                                                                                                                                                                            " + "'", str2, "4444444444                                                                                                                                                                            ");
    }

    @Test
    public void test09552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("i 1010 1", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i 1010 1" + "'", str2, "i 1010 1");
    }

    @Test
    public void test09553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00..." + "'", str2, "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00...");
    }

    @Test
    public void test09554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09554");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("            00", "4441444444444444444444444414444444444444444444444144444444444444444444441");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test09555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09556");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!", "4444444  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!" });
    }

    @Test
    public void test09557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "0H!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str2, "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test09558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("H00h00h00h00h00h00h00h00h", 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "H00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test09559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!" + "'", str2, "4i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!");
    }

    @Test
    public void test09560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#######  H00H00H00H#######  H00H00H00H#######  H00H00H00H#######  ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  #  H00H00H00H#  H00H00H00H#  H00H00H00H" + "'", str2, "  #  H00H00H00H#  H00H00H00H#  H00H00H00H");
    }

    @Test
    public void test09561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09561");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 144i!144i!4i!0H!                            0404HI!                                               ", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 144i!144i!4i!0H!                            0404HI!                                               " + "'", str2, " 144i!144i!4i!0H!                            0404HI!                                               ");
    }

    @Test
    public void test09563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09563");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("144I!1", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("                                              0404HI!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("01 0101 !ih0", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("00H", "#################################################################################################################################################         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H" + "'", str2, "00H");
    }

    @Test
    public void test09565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" 144i!144i!4i!                                              0404HI!                                               ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 144i!144i!4i!                                              0404HI!                                               " + "'", str2, " 144i!144i!4i!                                              0404HI!                                               ");
    }

    @Test
    public void test09566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09566");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0a0ahi!", " 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09567");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("a", "...         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09568");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("######", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                   a                    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaa                                                                                         aaaaaaaa                                                                                         a", "aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144i!144444444444444444444444444444444444444444444", 176);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10" });
    }

    @Test
    public void test09572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09572");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aa11401444444440144444444", "hh01h01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aa", "                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa" + "'", str2, "aa");
    }

    @Test
    public void test09574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                              10hi!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                              10HI!10" + "'", str1, "                                                                                                                                                                                              10HI!10");
    }

    @Test
    public void test09575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    ..." + "'", str1, "...    ...");
    }

    @Test
    public void test09577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09577");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("0        1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test09579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0h00h00h00h00h00h00h00h00h", "hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ", "                      44...                       ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           " });
    }

    @Test
    public void test09581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         ", "1    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         " + "'", str2, "                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         ");
    }

    @Test
    public void test09582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09583");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!10##########", "                                                                                                                                                                                                                                                                                                                                                                         ..", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaa00", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa00" + "'", str2, "aaaaaaaaaaaa00");
    }

    @Test
    public void test09585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                 44444444444444444444444444444444444", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str2, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test09586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09587");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H00", ' ', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09588");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" 10                                                                                          ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "10", "                                                                                          ", "..." });
    }

    @Test
    public void test09589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("1  ...", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  ..." + "'", str2, "1  ...");
    }

    @Test
    public void test09590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09590");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00000000000000000000000000010", "100I0100I00I0", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00000000000000000000000000010" });
    }

    @Test
    public void test09591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09591");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!", "hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test09592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09592");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09593");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               000                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "   0444444444");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!       ..HI!       ..HI!       .", "                                                  ", 188);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("0404hi!444444444444444444444444444444444444444444444                                             ", strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                              0404hi!          0h00h00h                                                           0404hi!           ", strArray9, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                               000                                               " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "HI!", "", "", "", "", "", "", "..HI!", "", "", "", "", "", "", "..HI!", "", "", "", "", "", "", "." });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09594");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test09595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09595");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444104444444410444444441044444!ih!ih01!ih100.........................................", "######################### ########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09596");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                 00000000000000000000000000000000000", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                   10hi 1010 10       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 00000000000000000000000000000000000" + "'", str3, "                                                                 00000000000000000000000000000000000");
    }

    @Test
    public void test09598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!ih!ih01!ih01!ih!ih01!ih01!ih!ih01!ih01!ih!ih01!ih01", "1            00h00h00h00h00h00                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09599");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..", "I!144I!4I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444" + "'", str1, "4444444");
    }

    @Test
    public void test09601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("h00h00h        ##", "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h        ##" + "'", str2, "h00h00h        ##");
    }

    @Test
    public void test09602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09602");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("1    ", "   0444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ", "                      44...                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09605");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00H!ih!ih0Hi!                                                                                                 ", "1         ", 13);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H!ih!ih0Hi!", "", "", "", "", "", "", "", "", "", "", "", "                                                                                     " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00H!ih!ih0Hi!                                                                                     " + "'", str4, "00H!ih!ih0Hi!                                                                                     ");
    }

    @Test
    public void test09607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..44444444", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..aaaaaaaa" + "'", str3, "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..aaaaaaaa");
    }

    @Test
    public void test09608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09608");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "1                                                      ", (-1), (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1                                                      000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str4, "1                                                      000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test09609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09609");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(".............................................................................................................", "aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09610");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("144I!1    ..", "         ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test09611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         1                                                                                                                                       ", 198, "H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H00H00H00H00H00H00H00H00HH00H00H00H00H00H00H00H00HH00         1                                                                                                                                       " + "'", str3, "H00H00H00H00H00H00H00H00HH00H00H00H00H00H00H00H00HH00         1                                                                                                                                       ");
    }

    @Test
    public void test09612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0404hi!444444444444444444444444444444444444444444444", "01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("             ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test09615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09615");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..        H4H4!I!                                    ..", "                                    4444444", 51);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..        H4H4!I!                                    .." });
    }

    @Test
    public void test09616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09616");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("Aa", "0404HI!              ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("         1                                                                                                                                       ", "#         1                                                                                                                                       ##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1                                                                                                                                       " + "'", str2, "         1                                                                                                                                       ");
    }

    @Test
    public void test09619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa", 39, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...00h00h00haaa" + "'", str3, "...00h00h00haaa");
    }

    @Test
    public void test09621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("          1 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          1 " + "'", str2, "          1 ");
    }

    @Test
    public void test09623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                              0404HI!              ..", "...                                      00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!              .." + "'", str2, "                                              0404HI!              ..");
    }

    @Test
    public void test09624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09624");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...    ...", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...", "", "", "", "..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 96 + "'", int4 == 96);
    }

    @Test
    public void test09625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01", "...h!i..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01" + "'", str2, "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01");
    }

    @Test
    public void test09626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09626");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aa1140144444444014444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aa", "1140144444444014444444" });
    }

    @Test
    public void test09627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09627");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10                                                                                               10100h00h00h00h00h00h00h00h00h       ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10                                                                                               10100h00h00h00h00h00h00h00h00h       " });
    }

    @Test
    public void test09628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09628");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", 41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I" });
    }

    @Test
    public void test09629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", "                                    ..", "aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                               40", "...44400h00h...44400h00h...4...44400h00h...44400h00h...44", 414);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                               40" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                               40" + "'", str4, "                                                                                               40");
    }

    @Test
    public void test09631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09631");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!", "                                                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaHI!    144I!144444444444444444444444444444444444444444444HI!     aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09633");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444410444444441041144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444104444444410411a44444444104444444410411aa", "                                                                                                                                                        a                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444410444444441041144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444410444444441041144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09634");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test09635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09635");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   hi!   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test09636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09636");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                      " + "'", str1, "                                                                                                      ");
    }

    @Test
    public void test09637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("h11111111                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h11111111" + "'", str1, "h11111111");
    }

    @Test
    public void test09638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09638");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("4444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444444444444444", "######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09639");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                              0404HI!                                               ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test09640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!0404hi!", "#################################################################################################AAA", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hh01h01", "0hi 1010 10");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09642");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H00h00h00h00h00h00h00h00h", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("###00", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("H!ih!ih000H!ih!ih00...", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("HI!       ..HI!       ..HI!       .", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a  ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4  " + "'", str3, "4  ");
    }

    @Test
    public void test09644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09644");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1  I 1 01 0101 !ih01  I 1 ", "HI!       ..4444444410", 182);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1  I 1 01 0101 !ih01  I 1 " });
    }

    @Test
    public void test09645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09645");
        char[] charArray10 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("            00H00H00H00H00H00H00H00H00H             ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaa#0404HI!##aaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("                h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test09646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09646");
        int int1 = org.apache.commons.lang3.StringUtils.length("00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test09647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("01", "                                                                                                !ih40                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09648");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "144I!144I!4I!00h00h00h00h00h00h00h00h00h             4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!hi!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!hi!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!hi!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09650");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" 144i!144i!4i!                                              0404HI!                                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "144", "i", "!", "144", "i", "!", "4", "i", "!", "                                              ", "0404", "HI", "!", "                                               " });
    }

    @Test
    public void test09651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09651");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "            00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi! 1010 10", 26, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi! 1010 10        " + "'", str3, "       hi! 1010 10        ");
    }

    @Test
    public void test09655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("00H!ih!ih0Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH0hi!hi!H00" + "'", str1, "iH0hi!hi!H00");
    }

    @Test
    public void test09657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                              0404101                                               ", 761, "...aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa                                              0404101                                               ...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa." + "'", str3, "...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa                                              0404101                                               ...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa.");
    }

    @Test
    public void test09658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                       ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444                ...4444444      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...4444444" + "'", str1, "4444444...4444444");
    }

    @Test
    public void test09660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("A", "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09661");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                       111", "                                                                                                                                  HI!                                                                 ", "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test09662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I" + "'", str1, "00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I");
    }

    @Test
    public void test09663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                 444444444444444444444444444...", "104hi4 410104 410");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09666");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", (int) (short) 10);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "1", "1", "1", "1", "1", "11" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test09667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410" + "'", str1, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
    }

    @Test
    public void test09668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "0h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str2, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test09669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09669");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("aa", "...!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09670");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("0H!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09672");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       ", "hi!", 143);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       " });
    }

    @Test
    public void test09673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09673");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                     ih4444444444000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                     ih4444444444        aaa...", "HI!    144I!1444444444444444444444444444444444444", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih", "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "ih", "aaa..." });
    }

    @Test
    public void test09674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09674");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", "00h", (int) (short) 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "1");
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("000", strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', (int) (byte) 0, (int) (byte) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaa", strArray5, strArray9);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "         00h00h00h00h00h00");
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("00h00h00h00h00h00h00h00h00h             4", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "00" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str11, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str17, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaaaaaaaaa" + "'", str18, "aaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test09675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("1  i 1 01 0101 !ih01  i 1 ", "404HI!              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09676");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                              0404HI!                                               ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("00000000000000000000000000000000000", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("00h00h00h00haaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                              0404hi!          0h00h00h                                                           0404hi!           ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih10hi!10hi!  ...!ih10hi!10hi!h", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih10hi!10hi!  ...!ih10hi!10hi!h" });
    }

    @Test
    public void test09678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa                                              0404101                                               ...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa.", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa                                              0404101                                               ...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa." + "'", str2, "...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa                                              0404101                                               ...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa.");
    }

    @Test
    public void test09679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                            HI!       ..", 23, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                            HI!       .." + "'", str3, "                                                            HI!       ..");
    }

    @Test
    public void test09680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09680");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0###00###00###00###00", "                                !IH!i10i!10i!i!010i!10i!i!0                                !IH!i10i!10i!i!010i!10i!i!0                                !IH", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0###00###00###00###00" });
    }

    @Test
    public void test09681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("..        0404HI!                                    ..", "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..        0404HI!                                    .." + "'", str2, "..        0404HI!                                    ..");
    }

    @Test
    public void test09682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09682");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 " + "'", str3, "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
    }

    @Test
    public void test09683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str1, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test09684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09684");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("h00h00h00h00h00h00h00h             444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test09686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                   i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1" + "'", str1, "                                                                                                                                                                                                                                                                                   i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1");
    }

    @Test
    public void test09687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "      10hi 1010 10       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09688");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0", "0000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aa11401444444440144444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa                                              0404101                                               ...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa404!ih", 156, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09692");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                ########################   #########################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I" + "'", str1, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
    }

    @Test
    public void test09695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                            hi!       ..                                                                                            ", "                                                                                                                                                        a                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09696");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44..." });
    }

    @Test
    public void test09697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("...aaa                           ...aaa             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaa                           ...aaa             " + "'", str1, "...aaa                           ...aaa             ");
    }

    @Test
    public void test09698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09698");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00H00H00H00H00H00H00H00H00", '4', 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("00H!ih!ih0H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!ih!ih0H" + "'", str1, "00H!ih!ih0H");
    }

    @Test
    public void test09700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09701");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1  I 1 01 0101 !ih01  I 1 ", 'a', 204);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09702");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a0aaaaaa0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!", "1         ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a0aaaaaa0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!" + "'", str3, "a0aaaaaa0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!");
    }

    @Test
    public void test09703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("10                                                                      00h00h00h00h0!ih!ih01!ih010!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                      00h00h00h00h0!ih!ih01!ih010!" + "'", str1, "10                                                                      00h00h00h00h0!ih!ih01!ih010!");
    }

    @Test
    public void test09704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444", "00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...h!i...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...h!i..." });
    }

    @Test
    public void test09707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09708");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHHHHHH", "10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHH" + "'", str3, "HHHHHHHHH");
    }

    @Test
    public void test09709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00", "#0404HI!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00H!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa144i!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!" + "'", str2, "00H!");
    }

    @Test
    public void test09711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                               00h00h00h00h00h00h00h00h00h", "0404hi!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00h" + "'", str2, "                                                                                                               00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test09712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09713");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444                                                                                            ", "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa", "aa", 57);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444                                                                                            " + "'", str4, "4444444                                                                                            ");
    }

    @Test
    public void test09714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09714");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("Hi!                                                                                                 ", "44444444104444444410411a44444444104444444410411aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444", "4444444...4444444", "                                                                             10HI! 1010 10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test09716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09716");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("    a!aiha!ai", "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09717");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                               10", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("                  0000000000000000000000000000000000000000000000000000000000000000000000", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("00h00h00h00h00h00h00h00h00h                                                                      ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09718");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444" });
    }

    @Test
    public void test09719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09719");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("h11111111                                                                               ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test09720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                                                                                                                                                                11!11!11!11!11!11!11!11!11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09721");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("10101010hi!", "####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "###############################################000###############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str2, "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test09723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     " + "'", str1, "                                     ");
    }

    @Test
    public void test09724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09724");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...", 201, "                                                                                                               00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ..." + "'", str3, "             01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...");
    }

    @Test
    public void test09725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09725");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test09726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                   a                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                   A                                                    " + "'", str1, "                                                   A                                                    ");
    }

    @Test
    public void test09727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa", "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("11 1 11 1 11 1 11 1 11 1", "                                       1ahia1ahiahia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444410                                                                                4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444                                                                                0144444444" + "'", str1, "4444444                                                                                0144444444");
    }

    @Test
    public void test09730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09730");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!0!ih!ih01!ih010!ih!ih01!ih01hi", "..                                    !I!4H4H        ..", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09731");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                aaa                                ", "H00H00H00H00H00H00H00H00H", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test09733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09733");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("H00h00h00h00h00h00h00h00h                                                                      ", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii          1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00h00h00h00h00h00h00h00h                                                                      " + "'", str2, "H00h00h00h00h00h00h00h00h                                                                      ");
    }

    @Test
    public void test09735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444AAA                                    44444444444444AAA                                    44444444444444444444AAA                                    44444444444444AAA           10hi 1010 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("00H00H00H00H00H00H00H00H00", "10HI! 1010 10                                                                                                 AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09737");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!..", "...h!i...", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09738");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444###########    !IH!I############" + "'", str1, "44444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444###########    !IH!I############");
    }

    @Test
    public void test09739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("144i!144i!4i!", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144i!144i!4i!" + "'", str2, "144i!144i!4i!");
    }

    @Test
    public void test09740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09740");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("######", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa######################################################", "HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("H00H00H00H00H00H00H00H00H0", "!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "        1    IH0HI!HI!H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09744");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                 ", "00000000000000000000000000000000000" });
    }

    @Test
    public void test09745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("   0444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0444444444" + "'", str1, "0444444444");
    }

    @Test
    public void test09747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "                                                ########################   #########################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!000404hi!000404hi!000404hi!000404hi!000404hi!000404hi!" + "'", str1, "hi!000404hi!000404hi!000404hi!000404hi!000404hi!000404hi!");
    }

    @Test
    public void test09749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444441");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444441" + "'", str1, "444444441");
    }

    @Test
    public void test09750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09751");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          ...", "144i!1", 184);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          ..." });
    }

    @Test
    public void test09752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09752");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                               000", "                                                                                               10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("1aaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1aaaaaaaaa" + "'", str2, "1aaaaaaaaa");
    }

    @Test
    public void test09754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("404hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "404hi" + "'", str1, "404hi");
    }

    @Test
    public void test09755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000", "11111111                                                                                         11111111                                                                                         1  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000");
    }

    @Test
    public void test09756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    !IH!I", "144i!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !IH!I" + "'", str2, "    !IH!I");
    }

    @Test
    public void test09757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "         00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                    ..", 761, "11!11!11!11!11!11!11!11!11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!                                    .." + "'", str3, "11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!                                    ..");
    }

    @Test
    public void test09759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09759");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!..", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("H00h00h00h00h00h00h00h00h              144I!144I!4I!", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00h00h00..." + "'", str2, "H00h00h00...");
    }

    @Test
    public void test09761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09761");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10hi!", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", 25);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "4444444", 43, (int) (byte) 1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0404HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                               00h00h00h00h00h00h00h00h00", strArray4, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 25 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "                                                                         1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "1010                                                                                               10hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "0404HI!" });
    }

    @Test
    public void test09762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!IH4040AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", " 00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test09764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01", "hhhhhhhh                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01" + "'", str2, "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01");
    }

    @Test
    public void test09765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09765");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", "I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09767");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h00h00h00h00h00h                                                                      ", ' ', 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test09768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("######################", "##############################################################################################################################################################                                              ", 196);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test09769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09769");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("00000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00000000000000000000000000000000000" });
    }

    @Test
    public void test09770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!..                                   ih..                                   !..                                   ih..                                   01..                                   !..                                   ih..                                   01..                                                                          ", "..                                    !i!4h4h        ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!..                                   ih..                                   !..                                   ih..                                   01..                                   !..                                   ih..                                   01..                                                                          " + "'", str2, "!..                                   ih..                                   !..                                   ih..                                   01..                                   !..                                   ih..                                   01..                                                                          ");
    }

    @Test
    public void test09771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09771");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   ", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(".  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  1  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   " + "'", str5, "1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("01 0101 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 " + "'", str1, "01 0101 ");
    }

    @Test
    public void test09774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!" + "'", str1, "i!");
    }

    @Test
    public void test09775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09775");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("h00h00h00h00h00h00h00haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("    !ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09777");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0404hi!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09779");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 ", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("144i!144i!4i!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#################################################################################################" + "'", str6, "#################################################################################################");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test09780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09781");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("00h00h00h00h             ", "4444444444                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09782");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00h00h00h00h00h00h00h00h00h", "", 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test09783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444441");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444####", "aaaaaaaaa11401444444440144444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09786");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("01 0101 !ih01       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 !ih01       " + "'", str1, "01 0101 !ih01       ");
    }

    @Test
    public void test09787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09787");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("00H!IH!IH0HI!                                                                                     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih!ih!ih0                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih!ih!ih0                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih" + "'", str1, "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih!ih!ih0                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih");
    }

    @Test
    public void test09789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09789");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                             ...", '#', 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaahhhhhhhh" + "'", str1, "aaaaaaahhhhhhhh");
    }

    @Test
    public void test09791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###00###00###00###00###00", "                                                    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###00###00###00###00###00" + "'", str3, "###00###00###00###00###00");
    }

    @Test
    public void test09792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih01!ih010!ih!ih01!ih01hi!", "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test09793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09793");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH0");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("0h00h             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09795");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444####", "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             " + "'", str2, "hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ");
    }

    @Test
    public void test09797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   11 1 11 1 11 1 11 1 11 1" + "'", str2, "   11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test09798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09798");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                00H00H00H00H00H00H00H00H00", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09799");
        char[] charArray14 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("00h", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("                    ...", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                    144I!144I!4I!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test09800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                            100                    ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                                ", "                                                   a                                                    ", 168);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test09802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09802");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    ", '#', 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404                           000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09804");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "00000000000000000000000000010", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09805");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 50);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09806");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("01 0101 ", "4444444410                                                       ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09807");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("141414444444414444144444444144441444141414");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09808");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" 1                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test09809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                 4444...", "!IH10HI!10HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 4444..." + "'", str2, "                                                                 4444...");
    }

    @Test
    public void test09811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09811");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!######################" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
    }

    @Test
    public void test09813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i", "aaaaaaaa#0404HI!##aaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#################################################################################################AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA#################################################################################################" + "'", str1, "AAA#################################################################################################");
    }

    @Test
    public void test09815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!                                4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                4444444" + "'", str1, "hi!                                4444444");
    }

    @Test
    public void test09816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("##############################################################################################################################################################                                              ", 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################################################################################                                              " + "'", str2, "##############################################################################################################################################################                                              ");
    }

    @Test
    public void test09817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test09818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044" + "'", str1, "444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044");
    }

    @Test
    public void test09819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "H00H00H00H00H00H00H00H             H00H00H00H00H00H00H00H             H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 " + "'", str1, "                                 ");
    }

    @Test
    public void test09821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09822");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("      10hi 1010 10       ", "", 178, 156);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      10hi 1010 10       " + "'", str4, "      10hi 1010 10       ");
    }

    @Test
    public void test09823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!", 178, "aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09824");
        char[] charArray14 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("00h00h00h00h00h00h00h00h00h                                                                      ", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("          1 ", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("                              11", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("   0444444444", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!ih0#####################################################################################################################################################################################", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test09825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09825");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444", "                                                                                                               00", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09826");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String[] strArray9 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', (int) '#', 3);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "1");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, '4');
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray16);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int23 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                 4444444444444444444444         1", strArray16, strArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("10                                                                                               1010                                                                                               10HI!", strArray4, strArray22);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray22);
        boolean boolean27 = org.apache.commons.lang3.StringUtils.startsWithAny("4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", strArray22);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0404hi!" + "'", str18, "0404hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str24, "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str25, "10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test09827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                                               10hi!10hi!hi!                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09829");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("404hi", "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "404hi" });
    }

    @Test
    public void test09830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444444   4444444410", "44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09831");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09833");
        char[] charArray6 = new char[] { '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("4444444                                                                                           ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("0404HI!                                             ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("...                                      00", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09834");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", "", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000" });
    }

    @Test
    public void test09835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II" + "'", str2, "1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II");
    }

    @Test
    public void test09836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                              11                 ", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              11                 " + "'", str3, "                              11                 ");
    }

    @Test
    public void test09837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I" + "'", str1, "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
    }

    @Test
    public void test09839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                            100                    ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                               ", "1010hi!", 651);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09841");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("014444444444", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "014444444444" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test09842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09842");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444410                                                                                               1010                                                                                               10HI!44", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("   ..   ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(" 144i!144i!4i!                                              0404HI!                                               ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("                                             4444444444444444444444         ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test09843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09843");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###########    !IH!I############", "4444410411", 167);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###########    !IH!I############" });
    }

    @Test
    public void test09844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test09845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09845");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("                                                  ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test09846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("00H", "                                                                                                                                                        00                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09847");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaa4444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test09848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test09849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444##h##h##h##h##h##h#...444444444444444", 6, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444##h##h##h##h##h##h#...444444444444444" + "'", str3, "444444444444444##h##h##h##h##h##h#...444444444444444");
    }

    @Test
    public void test09850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09850");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00H00H00H00H00H00H00H00H00H                                                                      ", "", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H00H00H00H00H00H00H00H00H                                                                      " });
    }

    @Test
    public void test09851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("..                                    !i!4h4h        ..", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..                           ..." + "'", str2, "..                           ...");
    }

    @Test
    public void test09853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a44i!a44i!4i!                                              a4a4HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a44i!a44i!4i!a4a4HI!" + "'", str1, "a44i!a44i!4i!a4a4HI!");
    }

    @Test
    public void test09854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!       ..4444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0144444444..       !IH" + "'", str1, "0144444444..       !IH");
    }

    @Test
    public void test09855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09855");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("...aaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "10                                                                                               1010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09857");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10HI!", "                              ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a', 133, (int) (short) 0);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "10                                                                                               1010                                                                                               10HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                   ", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 191 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi" });
    }

    @Test
    public void test09858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      10hi 1010 10       ", 740, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      10hi 1010 10       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "      10hi 1010 10       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09859");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test09860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01" + "'", str3, "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01");
    }

    @Test
    public void test09861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09861");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Aa", 3, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aa4" + "'", str3, "Aa4");
    }

    @Test
    public void test09862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("1001001001001", "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09864");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(" 1                                                                                                                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09865");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("100", "44444444444444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                               10", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "100" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
    }

    @Test
    public void test09866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa" + "'", str1, "aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa");
    }

    @Test
    public void test09867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("         44444444104444444410411a44444444104444444410411aa", "0h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         44444444104444444410411a44444444104444444410411aa" + "'", str2, "         44444444104444444410411a44444444104444444410411aa");
    }

    @Test
    public void test09868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("...0h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11401444444440144444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444104444444410411");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410411" + "'", str1, "44444444104444444410411");
    }

    @Test
    public void test09871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09871");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", 8);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "#######  ", 42);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str9, "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test09872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09872");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("h00h00h00h00h00h00h00haaaaaaaaaaaaa", "00h00h00h00h00h", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09873");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaa44444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("..        0404hi!                                    ..", "!ia!iaa1!ia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..        0404hi!                                    .." + "'", str2, "..        0404hi!                                    ..");
    }

    @Test
    public void test09875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                HI!                                                                 ", 51, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                HI!                                                                 " + "'", str3, "                                HI!                                                                 ");
    }

    @Test
    public void test09876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!       ..4444444410", "                               hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               hi" + "'", str2, "                               hi");
    }

    @Test
    public void test09878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         " + "'", str2, "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ");
    }

    @Test
    public void test09879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09879");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0h00h00h00h00h00h00h00h00h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test09880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09880");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                            00H!i", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("444444                                    ..444444", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("100100100100", "    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i0    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i    !ih!i ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09882");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                                               00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AAA                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09885");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1", "1");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 928, 173);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", 182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010" + "'", str2, "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010");
    }

    @Test
    public void test09887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 66, "                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                  " + "'", str3, "                                                                  ");
    }

    @Test
    public void test09888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("H00H00H00H00H00H00H00H             ", "                                       1ahia1ahiahia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00H00H00H00H00H00H00H             " + "'", str2, "H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test09889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("H00h00h00...", "                            4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00h00h00..." + "'", str2, "H00h00h00...");
    }

    @Test
    public void test09890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                   00h00h00h00h00h00h00h00h00h                                                                                            ", "!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   00h00h00h00h00h00h00h00h00h                                                                                            " + "'", str2, "                                   00h00h00h00h00h00h00h00h00h                                                                                            ");
    }

    @Test
    public void test09891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("01 0101 !ih0", 140, "0h00h00h00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h0001 0101 !ih00h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00" + "'", str3, "0h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h0001 0101 !ih00h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00");
    }

    @Test
    public void test09892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("              AAA    10HI!10", "HI!0404HI!0404HI!0404HI!0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              AAA    10HI!10" + "'", str2, "              AAA    10HI!10");
    }

    @Test
    public void test09893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09893");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa", "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09894");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("        1    ", '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100..." + "'", str2, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
    }

    @Test
    public void test09896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("00hi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!" + "'", str2, "00hi!");
    }

    @Test
    public void test09897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("..", "..        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ....        0404HI!                                    ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test09898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444#############h00h00h0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         4444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444#############h00h00h0" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444#############h00h00h0");
    }

    @Test
    public void test09899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                aaa                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "11111111                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0H00H00H00H00H00H00H00H00H", "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0H00H00H00H00H00H00H00H00H" + "'", str2, "0H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test09902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09903");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444104444444410444444441044444", "!", "ih", "!", "ih", "01", "!", "ih" });
    }

    @Test
    public void test09904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h" + "'", str2, "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h");
    }

    @Test
    public void test09905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09905");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         44444444104444444410411a44444444104444444410411aa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test09906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("0h00h...44400h00h...4...44400h00h...44400h00h...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09907");
        char[] charArray10 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("   ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h00h00h00h00h00h00h00h00", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test09908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09908");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                 ", "0hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa", "1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaa", "...aaaaaaaaaa", "aaaaaaaaaaa", "aaaaaaaa" });
    }

    @Test
    public void test09910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09910");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", 129);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test09911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ", "100100100100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09912");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09913");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("1010hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("10HI!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10HI!10" + "'", str1, "10HI!10");
    }

    @Test
    public void test09915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09915");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "4444444                                                                                           ", 91);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test09916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09916");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                  144i!144i!4i!0H!                            0404HI!                                               ", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("########################   ######...########################   #######", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!" + "'", str1, "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
    }

    @Test
    public void test09918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09918");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("10                                                                                               1010                                                                                               10hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly(" 11 1 11 1 11 1 11 1 11 1", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test09919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                            hi!       ..", "                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09920");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        1", '#', 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444401 0101 !ih01  I 1  ...444444444444", "10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...", "AAA00H00H00H00HAAA00H00H00H00HAAA00H00H00H00HAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." });
    }

    @Test
    public void test09923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100, "01                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0" + "'", str3, "0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0");
    }

    @Test
    public void test09924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 191);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     " + "'", str4, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ");
    }

    @Test
    public void test09925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!       ..4444444410                                                                                       ", "                                    ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       ..4444444410" + "'", str2, "HI!       ..4444444410");
    }

    @Test
    public void test09926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09926");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00h00h00h00h00h00h00h00h00h", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test09927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "######################", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test09928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaa11401444444440144444444", "                                              0404HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09929");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                              0404HI!                                               ", "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444", 97);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0", "0", "HI!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "0", "0", "HI!" });
    }

    @Test
    public void test09930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("a  ", "!I4!I441!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("..                                    !I!4H4H        ..", "#         1                                                                                                                                       ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   11 1 11 1 11 1 11 1 11 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09933");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("h00h00h        ##");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09934");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0404HI!                                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09935");
        int int1 = org.apache.commons.lang3.StringUtils.length(" a44i!a44i!4i!                                              a4a4HI!                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114 + "'", int1 == 114);
    }

    @Test
    public void test09936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H0", "!IH10HI!10HI!HI!010HI!10HI!HI!01!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0", "     10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H0" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H0");
    }

    @Test
    public void test09937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH0#####################################################################################################################################################################################" + "'", str1, "!IH!IH0#####################################################################################################################################################################################");
    }

    @Test
    public void test09938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09938");
        char[] charArray14 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("144I!144I!4I!", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("141414444444414444144444444144441444141414", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("    10   ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone("00000000000000000000000000000000000", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test09939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" 144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!144I!4I!" + "'", str1, "144I!144I!4I!");
    }

    @Test
    public void test09940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09940");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   0444444", "hi!       ..hi!       ..hi!       .");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   0444444" });
    }

    @Test
    public void test09941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("H!ih!ih0", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih0" + "'", str2, "H!ih!ih0");
    }

    @Test
    public void test09942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "aa4a4hi!aa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test09943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                         ..", "4444444  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                         .." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                         ..");
    }

    @Test
    public void test09944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09944");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0h00h00h             0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h", "", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test09945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09946");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("101011aaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "101011" });
    }

    @Test
    public void test09947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09947");
        char[] charArray5 = new char[] { '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("Aa", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09948");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "10                                                                                               1010                                            ", 192);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                    ", 544, 199);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test09949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test09950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    " + "'", str1, "4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ");
    }

    @Test
    public void test09951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09951");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("            00h00h00h00h00h00h00h00h00h             ", "                                                                 4444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test09952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09952");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#################################################################################################################################################         00h00h00h00h00h00", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################################################################################################", "00h00h00h00h00h00" });
    }

    @Test
    public void test09953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09953");
        char[] charArray11 = new char[] { 'a', ' ' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("                                       10hi!10", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("44...", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih01!ih0", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("4444410411", charArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("0h00h00h00h00h00h00h00", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("0404hi!444444444444444444444444444444444444444444444                                             ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test09954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaa                                                                                         aaaaaaaa                                                                                         a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAA                                                                                         AAAAAAAA                                                                                         A" + "'", str1, "AAAAAAAA                                                                                         AAAAAAAA                                                                                         A");
    }

    @Test
    public void test09955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09955");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10101010HI!                          ", 'a', 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H00H00H00H00H00H00H00H             ", 651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H00H00H00H00H00H00H00H             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test09957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  1  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  .", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("01 0101 !ih01", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "01 0101 !ih01" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test09959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("1444444444444444444444414444444444444444444444144444444444444444444441", "                                                                              ", "...H!I..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1444444444444444444444414444444444444444444444144444444444444444444441" + "'", str3, "1444444444444444444444414444444444444444444444144444444444444444444441");
    }

    @Test
    public void test09961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                    ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    ..." + "'", str2, "                                    ...");
    }

    @Test
    public void test09962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09962");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4441444444444444444444444414444444444444444444444144444444444444444444441", '#', 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test09963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################", 90, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################" + "'", str3, "######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################");
    }

    @Test
    public void test09964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010" + "'", str2, "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010");
    }

    @Test
    public void test09965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09965");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                               00", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                    ...");
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h00h00h        ##", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test09966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("...####...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09967");
        char[] charArray5 = new char[] { '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09968");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0!IH!IH01!IH010!IH!IH01!IH0144i!144i!4i!", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444", 43, 20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0!IH!IH01!IH010!IH!Iih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444" + "'", str4, "0!IH!IH01!IH010!IH!Iih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test09969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09969");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                               000                                               ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("!IH!IH0#####################################################################################################################################################################################", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                               ", "000", "                                               " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                               000                                               " + "'", str8, "                                               000                                               ");
    }

    @Test
    public void test09970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#######  H00H00H00H#######  H00H00H00H#######  H00H00H00H#######  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######  H00H00H00H#######  H00H00H00H#######  H00H00H00H#######  " + "'", str1, "#######  H00H00H00H#######  H00H00H00H#######  H00H00H00H#######  ");
    }

    @Test
    public void test09971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("1aaaaaaaaa", "#####################################################################################################################################################################           1  1  1  1  1  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1aaaaaaaaa" + "'", str2, "1aaaaaaaaa");
    }

    @Test
    public void test09972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09973");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("##############################################################################################################################################################                                              ", "###00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test09975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("         1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "         ", "1" });
    }

    @Test
    public void test09976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444                                    ", "144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    " + "'", str2, "                                    ");
    }

    @Test
    public void test09977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("101010!ih!ih01!ih010!ih!ih01!ih01hi!101010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101010!ih!ih01!ih010!ih!ih01!ih01hi!101010" + "'", str1, "101010!ih!ih01!ih010!ih!ih01!ih01hi!101010");
    }

    @Test
    public void test09978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "                                       111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!######################" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
    }

    @Test
    public void test09979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("0h00h00h00h00h00h00h00", "            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444" + "'", str2, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444");
    }

    @Test
    public void test09981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                              ", "                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09983");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H00H00H00H00H00H00H00H00HH00H00H00H00H00H00H00H00HH00         1                                                                                                                                       ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test09985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                             10HI! 1010 10", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             10HI! 1010 10" + "'", str2, "                                                                             10HI! 1010 10");
    }

    @Test
    public void test09986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" 1                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                               1 " + "'", str1, "                                                                                               1 ");
    }

    @Test
    public void test09987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1         4444444444444444444444" + "'", str1, "1         4444444444444444444444");
    }

    @Test
    public void test09988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09988");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10   100100...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10   100100", "H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   ", "...   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   " });
    }

    @Test
    public void test09989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09989");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test09990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09990");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                              ", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test09991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100100100100100100100100100100100" + "'", str1, "100100100100100100100100100100100100");
    }

    @Test
    public void test09992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...aaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...aaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test09994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("H!ih!ih000H!ih!ih00...", "        1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih00..." + "'", str2, "H!ih!ih000H!ih!ih00...");
    }

    @Test
    public void test09995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "44444444104444444410411AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test09996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 114);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test09998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaa                                                                                           ", "101010!ih!ih01!ih010!ih!ih01!ih01hi!101010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                                                                                           " + "'", str2, "aaaaaaa                                                                                           ");
    }

    @Test
    public void test09999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test09999");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                         ", "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest19.test10000");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("H", "HI!HI!HI!HI!HI!HI!HI!HI!Haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaHI!HI!HI!HI!HI!HI!HI!HI!H", 75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
    }
}

