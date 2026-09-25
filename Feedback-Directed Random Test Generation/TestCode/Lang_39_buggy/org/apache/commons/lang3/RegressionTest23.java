package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         ...", 43, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                        ..." + "'", str3, "                                        ...");
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("##h##h##h##h##aaaaaaaaaaaaaa", "...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                      4444444                                    ..444444", "100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      4444444                                    ..444444" + "'", str2, "                      4444444                                    ..444444");
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("100i!100i!0i!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "100", "i", "!", "100", "i", "!", "0", "i", "!" });
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("############################################################################################################################################################aaaaaaaaa11401444444440144444444", "#######################################################################444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", "444444   4444444410                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa104104hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa104104hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "        10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10" + "'", str2, "        10");
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("       ", "HI!    144I!1444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("... ...", "404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         1                                                      ", "1111111111111");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "444444444444444444444444444410444444441041144444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("   00H00H00H00H00H00H00H0        ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "... ..." });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "         ", "                                                      " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "         ", "                                                      " });
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaa1a", "              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA 444444   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "11111111111111", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("144I!144444444444444444444444444444444444444444444", "                            HHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "144I!144444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                    ", "                      44...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                    ");
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444                ...4444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444", "                ", "...", "4444444" });
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("444444    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("         1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                       1ahia1ahiahia", 'a', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444440   ", "0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1         4444444444444444444444                                                                 ", "0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...                                                                                  ...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         4444444444444444444444                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "1         4444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "         4444444444444444444444" });
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("001001   01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah00h00h00h00h00h00h00h00h00   ...001001   01", "0h00h00h             0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             #####################################################################################################################", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aa4a4hi!aa", "11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!                                    ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!                                    .." + "'", str2, "11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!                                    ..");
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441", "1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441" + "'", str3, "4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441");
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("...aaa", "00H!IH!IH0#####################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH!IH0#####################################################################################################################################################################################", "1                                                      000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "#####################################################################################################################################################################################" });
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaaaaaaaaa1a", '#', 199);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1  i 1 01 0101 !ih01  i 1 ", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  i 1 01 0101 !ih01  i 1 " + "'", str2, "1  i 1 01 0101 !ih01  i 1 ");
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("4444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444441044H!ih!ih000H!ih!ih00...444444441044");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                        a                                          ", "aaaaaaaaaaaaa", 67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                        a                                          " });
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H0", "                                          ...00h00h                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0" + "'", str3, "10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0");
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4444410411", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0!ih!ih01!ih010!ih!ih01!ih01hi!11111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        char[] charArray10 = new char[] { 'a', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("                                       10hi!10", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("44...", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih01!ih0", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("############################################################################################144I!1    ..100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!       ..4444444410                                                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h0001 0101 !ih00h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00h00h000h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H0001 0101 !IH00H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H00" + "'", str1, "0H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H0001 0101 !IH00H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H00H00H000H00");
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444" + "'", str1, "4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444");
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!", "1                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("A", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str4, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4" + "'", str1, "4");
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone("", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("###############################################000###############################################", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("4...", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!", 67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " });
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                      0404HI!         ", 928, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0404HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0404HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444    ", "...                                                                                  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444    " + "'", str2, "444444    ");
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444", "10                                   ##                                   10                                   ##                                   hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("         ...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..." });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("0hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("100", strArray3, strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0", "                                                ########################   #########################");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                   11                                   ", strArray3, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                   11                                   " + "'", str12, "                                   11                                   ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str13, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str14, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", ' ', 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                          ...00h00h                                           ", "1         4444444444444444444444", "0404hi!444444444444444444444444444444444444444444444                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444...00h00h4444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444...00h00h4444444444444444444444444444444444444444444");
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I", "                                                     144i!144i!4i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!       ..", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!       .." + "'", str4, "HI!       ..");
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 740);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######" + "'", str1, "######");
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str2, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("   ..   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   ..   " + "'", str1, "   ..   ");
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I", "#######  #######  #######  #######  #######  ############  #######  #######  #######  #######  #####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!       ..4444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       ..4444444410" + "'", str1, "HI!       ..4444444410");
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410444444441044444!IH!IH01!IH" + "'", str1, "44444444104444444410444444441044444!IH!IH01!IH");
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("...         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("101011aaaaaaaaa#################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "101011", "aaaaaaaaa", "#################" });
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0H!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                HI!                                                                 ", "         44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!                                                                 " + "'", str2, "                                HI!                                                                 ");
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410", 2, "144i!144i!4i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410" + "'", str3, "HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410HI!       ..4444444410");
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "I!H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       10hi!10hi!hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("00", "10hi 1010 10", (int) '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444                                                                                                              ", strArray3, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444                ...4444444", strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4', 626, 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                       ", "10", "hi", "!", "10", "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       10hi!10hi!hi!" + "'", str4, "                                       10hi!10hi!hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44444444444444444444444444444444444                                                                                                              " + "'", str9, "44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                    ...", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "11!11!11!11!11!11!11!11!11", 87, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                    ..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0h00h00h0...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h0..." + "'", str2, "0h00h00h0...");
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("H!ih!ih000H!ih!ih00...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!ih!ih000H!ih!ih00..." + "'", str1, "H!ih!ih000H!ih!ih00...");
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("00h00h00h00h00h00h00h00h00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444", 16, 114);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h00h00h00h00h00h00h00h00h                                                                      ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        1", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("###00", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   444444444444444444444444444444444444", "4I4       aaaaaaa                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...aaa00h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "10                                                                                               1010                                                                                               10hi");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("10hi 1010 10", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi 1010 1" + "'", str2, "10hi 1010 1");
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("10hi!10hi!hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa40        1    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10", "hi", "!", "10", "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("h             00000h00h00h00h00h00h00h00h00h      ", "4444444444444444444444         1                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        char[] charArray15 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("", charArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("0404hi!", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("141414444444414444144444444144441444141414", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("        1   ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly("H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny("0144444444..       !IH", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("i!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", " 144i!144i!4i!0H!                            0404HI!                                               ", 27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                       ...   0aa11401444444440144444444aa114014444444401444", 86, 301);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 86 out of bounds for length 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h" });
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444" + "'", str2, "!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("00h00h00h00haaa");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00", "h", "00", "h", "00", "h", "00", "haaa" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 " + "'", str1, "                                                 ");
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      ", 87, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      " + "'", str3, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      ");
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi", "   !iH   ", "    4!4ih4!4i");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                    01", "0        1    ", " hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    01" + "'", str3, "                                                                    01");
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("H00h00h00...", "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", 57);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H00h00h00..." });
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                               40", "h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               40" + "'", str2, "                                                                                               40");
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0", '4', 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) '#', 3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 0 hi!" + "'", str12, "0 0 hi!");
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("   11 1 11 1 11 1 11 1 11 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   11 1 11 1 11 1 11 1 11 " + "'", str1, "   11 1 11 1 11 1 11 1 11 ");
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("            00", 188, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "            00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("11111111                                                                                         11111111                                                                                         1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111                                                                                         11111111                                                                                         1 " + "'", str1, "11111111                                                                                         11111111                                                                                         1 ");
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "0!IH!IH01!IH010!IH!Iih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("####", "aaa44444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", "!ia!iaa1!ia", "                            HHHH", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..        0404HI!                                    ..", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..        0404HI!                                    .." });
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h", "                                              0404HI!              ..", 198);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0h00h00h#############4444444444444444444444444444444444444444444444444444444444444444444444444444444", "0404HI!              ...");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("...h!i..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444         1                                                                                                                   ", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444         1                                                                                                                   " + "'", str3, "4444444444444444444444         1                                                                                                                   ");
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444410                                                                                4444444", "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ", 40);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444410                                                                                4444444" });
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("###################################h##h##h##h##h##h#...#################################", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", "...!ih10hi!10hi!hi!010hi!10hi!hi!", "4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "                                              0404HI!              ..");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("10hi 1010 10");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("1010hi!", strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AAAAAAAAAAAAAAAAA!ih!ih01!ih0", 133, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10", "hi", " ", "1010", " ", "10" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "101011aaaaaaaaa#################", "a44i!a44i!4i!a4a4HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 144I!144I!4I!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "144I!144I!4I!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444144I!144I!4I!" + "'", str3, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444144I!144I!4I!");
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone("", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("###############################################000###############################################", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                              11                 ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       " + "'", str1, "       ");
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##h##h##h##h##aaaaaaaaaaaaaa", "4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                00h00h00h00h00h00h00h00h00", "!iH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                00h00h00h00h00h00h00h00h00" });
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                              0404101                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404101" + "'", str1, "0404101");
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("144I!144444444444444444444444444444444444444444444", 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              144I!144444444444444444444444444444444444444444444                                               " + "'", str2, "                                              144I!144444444444444444444444444444444444444444444                                               ");
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          ...", "1         ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 0, 188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          ..." });
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0", 196, "                                                                                    144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0" + "'", str3, "10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0");
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0!ih!ih01!ih010!ih!ih01!ih01hi!11111111111", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" 144i!144i!4i!                                              0404HI!                                               ", 441);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 144i!144i!4i!                                              0404HI!                                               " + "'", str2, " 144i!144i!4i!                                              0404HI!                                               ");
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444                ...4444444      ", "4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                ...4444444      " + "'", str2, "4444444                ...4444444      ");
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1", "h0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "1001001001001", 70);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" });
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("404HI!010101!IH0100000000000000000000000000000000000000000000000000000000000000000000000000000000", 114, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "404HI!010101!IH0100000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaa" + "'", str3, "404HI!010101!IH0100000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", '#', 148);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("4444444444444444444444444444444444444444444444444444444444444444444444444444444#############h00h00h0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                     ", "                                            00h!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "aa4a4hi!aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444                                                                                           ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
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
        int int27 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Aaaaaaaaaa1a", strArray22);
        java.lang.Class<?> wildcardClass28 = strArray22.getClass();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         ", 582, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         " + "'", str3, "                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         ");
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 199, "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("   00H00H00H00H00H00H00H00H00H             ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("########################");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("            00", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaa44444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "########################" + "'", str5, "########################");
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410HI 1010 1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410HI", "1010", "1" });
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("..        0404HI!                                    .", "                                    ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                              00H!IH!IH0HI                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              00H!IH!IH0HI                                                                                              " + "'", str1, "                                                                                              00H!IH!IH0HI                                                                                              ");
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "10HI! 1010 10");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4", "4", "4", "4", "4", "4", "4", "4", "4", "4", "4", "4" });
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        int int1 = org.apache.commons.lang3.StringUtils.length("#######################################################################444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 77 + "'", int1 == 77);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("####");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                      0404HI!         ", "0404HI!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                      0404HI!         " + "'", str2, "                                                      0404HI!         ");
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa144i!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                     aa11401444444440144444444a11401444444440144444444", "0404HI!              ..", 140);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aa11", "1", "1", "a11", "1", "1" });
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                      44...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                      44..." + "'", str1, "                      44...");
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00..." });
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###############################################000###############################################", "1aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################000###############################################" + "'", str2, "###############################################000###############################################");
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                                                                    ", 148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                                                                    " + "'", str2, "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                                                                    ");
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!", "110                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("              AAA    10HI!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!aIHa10aHIa!a10aHIa!aHIa!a010aHIa!a10aHIa!aHIa!", "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!aIHa10aHIa!a10aHIa!aHIa!a010aHIa!a10aHIa!aHIa!" });
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("   ", "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  " + "'", str2, "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("1", "                                                                  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih10hi!10hi!  ...1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih10hi!10hi!  ...1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1" + "'", str1, "!ih10hi!10hi!  ...1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1");
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                       hhhhhhhh", "###00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h", "..0404HI!.", 441);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h", "   hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h" + "'", str2, "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h");
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                    a", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    a" + "'", str2, "                                    a");
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444441", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("iiiiiiiiii...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444", "                                                                                            hi!       ..                                                                                            ", "0000000000000000000000000000000000000000000");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("144i!1", "4444444hI!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "144i!1" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi" + "'", str1, "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi");
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        char[] charArray5 = new char[] { 'a', ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                                                                    ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("10                                                                                               10100h00h00h00h00h00h00h00h00h       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                 4444..", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", 57);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                 4444.." });
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 22, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 22 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0" });
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             #####################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!" + "'", str2, "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!");
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaahhhhhhhh", 198, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################aaaaaaahhhhhhhh############################################################################################" + "'", str3, "###########################################################################################aaaaaaahhhhhhhh############################################################################################");
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHHHHHHHH", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "                                       44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("          ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "          ", "..." });
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#################################################################################################################################################         00h00h00h00h00h00", 40, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################################################################         00h00h00h00h00h00" + "'", str3, "#################################################################################################################################################         00h00h00h00h00h00");
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410hi", "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410hi" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410hi");
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", "101001001001001001001001001001001001001001001001001001001001001001001001001001001001001001010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaa4444444               ...aaaaa", "00H!IH!IH0HI!                                        H00h00h00h00h00h00h00h00h              144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("0 0 hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "HI!10##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                            HHHH", "Aaaaaaaaaa1a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!hi!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                      014444444401444444440144444444!ih10hi!10hi!hi!010hi!10hi!hi!44444014444444401444444440144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                      014444444401444444440144444444!ih10hi!10hi!hi!010hi!10hi!hi!44444014444444401444444440144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         4444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("0144444444..       !IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("144i!144i!4i!", 'a');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("aa", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "144i!144i!4i!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "144i!144i!4i!" + "'", str8, "144i!144i!4i!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "144i!144i!4i!" + "'", str10, "144i!144i!4i!");
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              0404HI!              ..", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("            00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00H00H00H00H00H00H00H00H00H            " + "'", str1, "            00H00H00H00H00H00H00H00H00H            ");
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00" });
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                            hi!       ..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00H", "00h00h00h00h00h00h00h00h00h", 5);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                 ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00H" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "...aaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str2, "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            !IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01" + "'", str2, "                                            !IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01");
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0000000000000000000000000", (int) (byte) 100, "Aa4a4HI!AA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a40000000000000000000000000" + "'", str3, "Aa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a40000000000000000000000000");
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        char[] charArray4 = new char[] { 'a', ' ' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11", "444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                 ..", 184);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aaa00000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1         ", "                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00H00H00H00H00H00H00H00H00", "00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "1", "         ", "4444444444444444444444", "                                                                 " });
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("0000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("0404HI!              ..", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!10hi!hi!01010101010101010101010101010101010101010101010101", "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", 197, 930);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444");
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("1         4444444444444444444444                                                                 ", "..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH", "44444444444444AAA                                    44444444444444AAA                                    444444", 25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1         4444444444444444444444                                                                 " + "'", str4, "1         4444444444444444444444                                                                 ");
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                   ", "00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h" + "'", str2, "00h00h00h00h");
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "h00h00h00h00h00h00h00h00h");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("014444444444!!!!!!!!!!!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("000", "         1", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("            00h00h00h00h00h00");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", strArray4, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "...0H                        00H00H00H00H0001                                                                                               ...0H                        00H00H00H00H00H");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "000" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "00h00h00h00h00h00" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str7, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00h00h00h00h00h00" + "'", str9, "00h00h00h00h00h00");
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1", "144i!144i!4i!10                                                                                          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1" + "'", str2, "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1          1");
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1                                                      ", "100100100...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                ", "!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 144i!144i!4i!", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " 144i!144i!4i!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!", "00H!i", "!IH!I");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih", "   0444444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih" });
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("10hi", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi" + "'", str2, "10hi");
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("10HI! 1010 10                                                   !ih!i     AAA", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10HI! 1010 10                                                   !ih!i     AAA" + "'", str2, "10HI! 1010 10                                                   !ih!i     AAA");
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      ", "                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("        1 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                hi!                                                                 ", "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa" + "'", str2, "4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa");
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00haaa", '4', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        char[] charArray6 = new char[] { 'a', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("0H00H00H00H00H             00000H00H00H00H00H00H00H00H00H             ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                 11                              ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00" + "'", str8, "00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0404hi!444444444444444444444444444444", "!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!444444444444444444444444444444" + "'", str2, "0404hi!444444444444444444444444444444");
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("..        0404hi!                                    ..", "                                                                                      0hi!10hi!hi!                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..        0404hi!                                    .." + "'", str2, "..        0404hi!                                    ..");
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!       ..HI!       ..HI!       .", "h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I", "###00###00###00###00###00", 77);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I" });
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1  I 1  I  I");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "1", "  ", "I", " ", "1", "  ", "I", "  ", "I" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  I 1  I  I" + "'", str2, "1  I 1  I  I");
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("10HI! 1010 10                                                                                                 AAA", 81, 192);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             AAA" + "'", str3, "                             AAA");
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         " + "'", str2, "                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ");
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 ", "144i!144444444444444444444444444444444444444444444", 26);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("          1 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Aa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a4HI!AAAa4a40000000000000000000000000", "                                                                                                               00h00h00h00h00h00h00h00h00", 97);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", "aaaaaaaaaaaaa", "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("            00h00h00h00h00h00h00h00h00h             ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("######################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################" + "'", str2, "######################");
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!!I!!I!!IIH", "                                                                                             1014040                                                                                             1014040                                                                                             1014040                                                                                             1014040                                              !Ih01hi!!ih!ih01!ih010!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0000000000000000000000000", 34, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00h00h00h00h   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h" + "'", str1, "00h00h00h00h");
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h00h00h00h00h00haaaaaaaaaaaa", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h00h00h00h00h00haaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h00h00h00h00h00haaaaaaaaaaaa");
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                          ...00h00h                                           ", "01 0101 !ih01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                 44444444444444444444444444444444444", "                                                                 4444444444444444444444         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ", ' ');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0404hi!                                             ", "0404hi!", 5, 34);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0404h0404hi!                  " + "'", str4, "0404h0404hi!                  ");
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("404HI!010101!IH0100000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaa", 39, 191);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaa" + "'", str3, "0000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    144I!1    ..      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "00h00h00h00h00h00h00h             ", 133, 441);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00h00h00h00h00h00h00h             " + "'", str4, "00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("01 0101 !ih01       ", "I!H00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444104444444410444444441044444!ih!ih01!ih100.........................................4444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaa                                                                                         aaaaaaaa                                                                                         a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa40        1    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     " });
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..        0404HI!                                    ..");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("H00H00H00H", "!ih!ih01!ih01!ih!ih01!ih01!ih!ih01!ih01!ih!ih01!ih01");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h0" + "'", str1, "00h00h00h00h00h00h00h0");
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h", "01 0101 !ih01  I 1  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                            4444444444444444444444         ", "                                                                                         11111111                                                                                         ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("...    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("104104hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "104104HI!" + "'", str1, "104104HI!");
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("1  I 1  I  I 1  I 1  I  I 1  I...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("404HI!              ...", "aaa00000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH4040AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!IH4040AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444", "h00h00h00h00h00h00h00h             444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         1                                                                                                                                       ", "                                              0404HI!              ..");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 142, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         1                                                                                                                                       " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             #####################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                    00H00H00H00H00H00H00H00H00H                                     ", 129);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    00H00H00H00H00H00H00H00H00H                                     " + "'", str2, "                                    00H00H00H00H00H00H00H00H00H                                     ");
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("  ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("00H!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("444444444444444##h##h##h##h##h##h#...444444444444444", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444" + "'", str2, "444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444444444444444444##h##h##h##h##h##h#...444444444444444");
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             " });
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("4444444410                                                                                       4444444410                                                                                       411", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("          ...                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          ...                                                                                                                                                                             " + "'", str1, "          ...                                                                                                                                                                             ");
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("404hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "404hi" + "'", str1, "404hi");
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1                                                                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                      014444444401444444440144444444!ih10hi!10hi!hi!010hi!10hi!hi!44444014444444401444444440144444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1                                                                                               " });
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H00H00H00H00H00H" + "'", str1, "00H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "            00h00h00h00h00h00");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray10);
        java.lang.Class<?> wildcardClass12 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "i!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!ih!ih01!ih01", "                                                                                  00h00h00h00haaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih01" + "'", str2, "!ih!ih01!ih01");
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!I" + "'", str1, "!IH!I");
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("........ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..........");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        int int1 = org.apache.commons.lang3.StringUtils.length("...44400h00h...44400h00h...4...44400h00h...44400h00h...44");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 57 + "'", int1 == 57);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  " + "'", str1, "  ");
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00H!ih!ih0Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!", 544, "aaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hIH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!" + "'", str3, "aaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hIH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!");
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hIH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hIH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!" + "'", str3, "aaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaa!ih10hi!10hi!hi!010hIH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!");
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("000", "                                        1 i ! 1 i ! i !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("h11111111                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h11111111" + "'", str1, "h11111111");
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                                11!11!11!11!11!11!11!11!11", "01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                          ", "                                                                                                                                                                00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11", "0444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "11", "                              11", "                              11", "                              11", "                              11", "                              11", "                              11", "                              11", "                              11", "                              11" });
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("0H00H00H00H00H00H00H0", "44444444104444444410411AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00H!ih!ih0");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                       10HI!10");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "0000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00H!ih!ih0" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih!ih" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00H!ih!ih0" + "'", str5, "00H!ih!ih0");
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaa11401444444440144444444", "444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "", "aaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("         1                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410hi 1010 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############################################################################################################################################################                                              ", "aaaaaaaaaaaaaaaaaaaHI!    144I!144444444444444444444444444444444444444444444HI!     aaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "144I!144I!4I!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                              10hi!10", "                                           iiiiiiiiii...                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                              10hi!10" + "'", str2, "                                                                                                                                                                                              10hi!10");
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                   ..", "Aaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   .." + "'", str2, "                                   ..");
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
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
        java.lang.String[] strArray28 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int32 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray31);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("100", strArray28, strArray31);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray31, ' ', 90, 72);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray31);
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                             10HI! 1010 10                                                   !ih!i     AAA", strArray4, strArray31);
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
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "100" + "'", str33, "100");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "                                                                                                             10HI! 1010 10                                                   !ih!i     AAA" + "'", str39, "                                                                                                             10HI! 1010 10                                                   !ih!i     AAA");
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!", "######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("1 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444  ", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                                                               " + "'", str2, "4444444                                                               ");
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Hi!", "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!", "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444###########    !IH!I############", (-1), '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444###########    !IH!I############" + "'", str3, "44444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444###########    !IH!I############");
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("100I!100I!0I!                                       ", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("00hi!00hi!00hi!00hi!00hi!00hi!  ...", "    !IH!I");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("00H!I", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                                                   404hi!", "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "     10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!" });
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00H!", 301, "h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih000H!" + "'", str3, "h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih000H!");
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!" + "'", str1, "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!");
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010hi! 1010 10", "0404hi!010101!ih01000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444444         1                                                                                                                    ", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("############################################################################################144I!1    ..100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001", '#', 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 88 + "'", int3 == 88);
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!" + "'", str2, "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!");
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 455 + "'", int2 == 455);
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                             4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             4444444444444444444444         " + "'", str1, "                                             4444444444444444444444         ");
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("          ", "!ih01010101");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!ih", "     01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("             01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...", 200);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...aaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa", "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444" + "'", str1, "                h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        char[] charArray6 = new char[] { 'a', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h00h00h00h00h00h00h00h00h                                                                      ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("                                            00H!i", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!", 180, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!" + "'", str3, "00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     144I!1    ..      ", "h00h00h00h00h00h00h00h             444444444444444444444444444444444444444444444444444444444444", "0h00h00h00h00h00h00h0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "                                                                                            hi!       ..                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("144I!1    ..", "0404HI!...    ......    ......  ", "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410                                                                                                                                                                  00H00H00H00H00H00H00H00H00H" + "'", str1, "4444444410                                                                                                                                                                  00H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaa1a", "00h00h00h00h00h", 544);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Aaaaaaaaaa1a" });
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                     144i!144i!4i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144i!144i!4i" + "'", str1, "144i!144i!4i");
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("h00h00h00h00h00h00h00h                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AA!IH4a4aA", 37, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444AA!IH4a4aA" + "'", str3, "444444444444444444444444444AA!IH4a4aA");
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "####10###10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444104444444410411aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410411aaaaaaaa" + "'", str1, "44444444104444444410411aaaaaaaa");
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  " + "'", str1, "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...   0##########################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone("", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone("        1    ", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("014444444444", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("AAAAAAA                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("1         ", "..   ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1" });
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH", "                                                   a                                                    ", 71, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a                                                   a                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH" + "'", str4, "a                                                   a                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH");
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                    !ih10hi!10hi!  ...                                                                                    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111", 66, 16);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih10hi!10hi!", "..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        char[] charArray6 = new char[] { 'a', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("144I!1", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!       ..", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00aaaaaaaaaaaa########################################################################################################################################aaaaaaaaaaaa", '4', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("1 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa104104hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0h00h00h00", "                                                                                                     aa11401444444440144444444a11401444444440144444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!" + "'", str1, "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!");
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "            00H00H00H00H00H00H00H00H00H            ", 26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h00h00h00h00h00h00h00h" + "'", str1, "h00h00h00h00h00h00h00h");
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("     H  H  H  H  H  H  H  H  H             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     H  H  H  H  H  H  H  H  H             " + "'", str1, "     H  H  H  H  H  H  H  H  H             ");
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ..." + "'", str1, "01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...");
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##h##h##h##h##h##h##h##h##h                                                                      ", 96, "                                                                 4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##h##h##h##h##h##h##h##h##h                                                                      " + "'", str3, "##h##h##h##h##h##h##h##h##h                                                                      ");
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    144I!1    ..      ", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    144I!1    ..      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    144I!1    ..      ");
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("H00", "                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00" + "'", str2, "H00");
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaa1111111111111", "01 0101 !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !i" + "'", str2, "01 0101 !i");
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     144I!1    ..      ", "104HI4 410104 410", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     144I!1    ..      " });
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10HI! 1010 10", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10HI! 1010 10" + "'", str3, "10HI! 1010 10");
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        char[] charArray8 = new char[] { '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                               10", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("H!ih!ih000H!ih!ih00...", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("                                    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("!0404hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI!HI!HI!HI!HI!HI!HI!Haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaHI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!Haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaHI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!Haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaHI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("####################################################", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################################################" });
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111", "                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1111111111111" });
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("104104hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi410410" + "'", str2, "hi410410");
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih!ih0");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "!", "ih", "0" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         1", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("      10hi 1010 10       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi 1010 10       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "10hi 1010 10       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10        ...", "10     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#0404HI!##");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#", "0404", "HI", "!##" });
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                    ", "h00h00h00h00h00h00h00h00h", "############0000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                    " + "'", str3, "                                                                                                                                                                                                    ");
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("         4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                             ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         44444444444444444..." + "'", str2, "         44444444444444444...");
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h11111111", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h11111111" });
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                         HHHH                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                         HHHH                             " + "'", str1, "                                                         HHHH                             ");
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Hi!");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                            ", strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "00h" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("..        H4H4!I!                                    ..", "         ...", "        1   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I ", "                                aaa                                00000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                               10", "              0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10" + "'", str2, "                                                                                               10");
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0000000000000000000000000                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000" + "'", str1, "0000000000000000000000000");
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "10hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h!ih!ih0#...", "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444AAA                                    44444444444444AAA                                    44444444444444444444AAA                                    44444444444444AAA           10hi 1010 1", "#######################################################################444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444AAA                                    44444444444444AAA                                    44444444444444444444AAA                                    44444444444444AAA           10hi 1010 1" + "'", str2, "44444444444444AAA                                    44444444444444AAA                                    44444444444444444444AAA                                    44444444444444AAA           10hi 1010 1");
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("4444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "                                                                                    !ih10hi!10hi!  ...                                                                                    ", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             " });
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", "10   00H00H00H00H00H00H00H0                                                ########################   #########################                                 hi   00H00H00H00H00H00H00H0                                                ########################   #########################                                     00H00H00H00H00H00H00H0                                                ########################   #########################                                 1010   00H00H00H00H00H00H00H0                                                ########################   #########################                                     00H00H00H00H00H00H00H0                                                ########################   #########################                                 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 " + "'", str2, "hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("00H!", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                               10", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("                  0000000000000000000000000000000000000000000000000000000000000000000000", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("a44i!a44i!4i!a4a4HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("h", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("HI!1H!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                  00h00h00h00haaa", "0404HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...                                                                                  ...", "0        1    ", "HI!       ..HI!       ..HI!       .", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                                                                  ..." + "'", str4, "...                                                                                  ...");
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("H!ih!ih000H!ih!ih000H!ih!ih000H!i                                                                             10HI! 1010 10", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!a...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("            00h00h00h00h00h00", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("0404hi!                                             ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444                                   ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...                                                                                     AAA", "44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "00", 35);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("0000000000000000000000000000000000000aAAAAAAAAAAAAAAAA!ih!ih01!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("              AAA    10HI!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01!IH01    AAA              " + "'", str1, "01!IH01    AAA              ");
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###00##h##h##h##h##h##h#...##h##h##h#", "", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("AA4A4HI!AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("#         1                                                                                                                                       ##", "                                   ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                     ih4444444444000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                     ih4444444444        aaa...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "                         ih4444444444000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                     ih4444444444        aaa..." });
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("     00H!i", "..", "                                                                                    144I!144I!4I!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1         4444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         4444444444444444444444" });
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("00H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H" + "'", str1, "00H");
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!    144I!144444444444444444444444444444444444444444444HI!     ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!    144I!144444444444444444444444444444444444444444444HI!     " + "'", str2, "HI!    144I!144444444444444444444444444444444444444444444HI!     ");
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444", "                                                                  ", "    aaaaaaaaaaaaaaaaaaaaaaa     1  ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                          ", 97, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa                                                                                          aaaa" + "'", str3, "aaa                                                                                          aaaa");
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("00h00h00h00h00h00h00h00h00h                                                                      ", ' ');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("             ", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str9, "00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "             " + "'", str10, "             ");
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                00h00h00h00h00h00h00h00h00", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                00h00h00h00h00h00h00h00h00           " + "'", str2, "                                                                                                                                                                00h00h00h00h00h00h00h00h00           ");
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              0404HI!              ...", "0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444", 29);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                              0404HI!              ..." });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "0404HI!              ..." });
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "1         ", 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("..        0404hi!                                    ..", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..aaaaaaaa0404hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", str3, "..aaaaaaaa0404hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("00hi!", "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("001001001001001001001001001001001001", "                            4444444444444444444444         44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            4444444444444444444444         44444444444444" + "'", str2, "                            4444444444444444444444         44444444444444");
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444  I ", (int) (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444  I " + "'", str3, "444444  I ");
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                    0hi 1010 10", ' ', 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                       1ahia1ahiahia");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       1ahia1ahiahia" + "'", str1, "                                       1ahia1ahiahia");
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I", 196);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "###############################################000###############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h", 114, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("####################                              ", "              44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444", "hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        char[] charArray9 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("00H!ih!ih0Hi!                                                                                     ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("100                    ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "h");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "I");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "1100" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1100" + "'", str3, "1100");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1100" + "'", str5, "1100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1100" + "'", str7, "1100");
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1         4444444444444444444444                                                                 ", "00");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "10", (int) '4', 10);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444", strArray10, strArray17);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi 1010 10", "00h", (int) (byte) -1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("00h", strArray10, strArray22);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '4');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          ...", strArray4, strArray10);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                11!11!11!11!11!11!11!11!11", strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "1         4444444444444444444444                                                                 " });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "44444444444444444444444444444444444" + "'", str18, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "10hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "00h" + "'", str23, "00h");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "          ..." + "'", str26, "          ...");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("AA!IH4a4aA", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444", "!0404hi!", 201, 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444!0404hi!" + "'", str4, "4444444!0404hi!");
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ", '#', 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhh", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaa44444444444444444444444444", 582, "                                                                                               1 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               1                                                                                                1                                                                                                1                                                                                                1                                                                                                1                                                   aaaaaaaaaaaaaaaaaaaaa44444444444444444444444444" + "'", str3, "                                                                                               1                                                                                                1                                                                                                1                                                                                                1                                                                                                1                                                   aaaaaaaaaaaaaaaaaaaaa44444444444444444444444444");
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("100100100100100100100100...", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 67, "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404                           000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404       " + "'", str3, "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404       ");
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("00H10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", " 144i!144i!4i!                                              0404HI!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "001001   01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah00h00h00h00h00h00h00h00h00   ...001001   01", 47, (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("1111111111111111111111111", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       1111111111111111111111111                                        " + "'", str2, "                                       1111111111111111111111111                                        ");
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("4444444444                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", "01                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010" + "'", str2, "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010");
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!" + "'", str1, "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!");
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444", "aAAAAAAAAAAAAAAAA!ih!ih01!ih0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    444444" + "'", str3, "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    444444");
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1  I 1  I  I ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444#############h00h00h0", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1  I 1  I  I " });
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...              !IH4040");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!IH4040" + "'", str1, "...!IH4040");
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("104HI4 410104 410", "00hi!00hi!00hi!00hi!00hi!00hi!  ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "104HI4 410104 410" });
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("10                                                                                               1010", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010" + "'", str2, "10                                                                                               1010");
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0hi 1010 10", "############0000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaHI!    144I!144444444444444444444444444444444444444444444HI!     aaaaaaaaaaaaaaaaaaaa", "aaa44444444444444444444444", 73);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaHI!    144I!144444444444444444444444444444444444444444444HI!     aaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0404hi!", "HI!10##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h00h00h00h00h00h00h00h00h");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih!ih!ih0                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("00h00h00h00h00h00h00h00h00h                                                                      ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("444444441", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("IH0HI!HI!H00", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     0144...", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     0144..." + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     0144...");
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                               1                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1                                                                                               ", "01 0101 !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   !iH   ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   !iH   " });
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str2, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                                                                                00h00h00h00h00h00h00h00h00", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444104444444410444444441044444!IH!IH01!IH010!IH!IH01!IH01HI!4444444410444444441044444444104444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                00h00h00h00h00h00h00h00h00" + "'", str2, "                                                                                                                                                                00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i!10hi!h", "                                                                                                          144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                          hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00...", "11111111                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih10hi!10hi!  ...!ih10hi!10hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH10HI!10HI!  ...!IH10HI!10HI!H" + "'", str1, "!IH10HI!10HI!  ...!IH10HI!10HI!H");
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih10hi!10hi!hi!010hi!10hi!hi!", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray1, strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                             4444444444444444444444         ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih10hi!10hi!hi!010hi!10hi!hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...", "01                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00..." });
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  #  H00H00H00H#  H00H00H00H#  H00H00H00H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI0HI!I0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HI!", "    !ih!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444                ...4444444      ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444                ...4444444      " });
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...                                                                                  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                                                                  ..." + "'", str1, "...                                                                                  ...");
    }
}

