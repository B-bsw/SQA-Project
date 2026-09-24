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
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               a                ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                               aaaaaaaaaaaaaaaaaaaaaaaa      ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahiaah                 hi          !aahiaah", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444S", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444444444444####################", "444444444444444444444##########4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444####################" + "'", str2, "444444444444444444444444####################");
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a                ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       ...", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               4A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "ih", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ahi", "     h!                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING       NG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA                                         aaaaaaaaaaaaaaaaaaaaaaaCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLA", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a##########44444444444444444444444444444444444444444444444444444444", 968, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a##########44444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a##########44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", "A               #               A               #               A               #               A               #               A               #               A               #               A               #               A             ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!" });
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Aahi####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aahi####" + "'", str1, "Aahi####");
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "AHi", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { 'a', '#', 'a', '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone(charSequence1, charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...##########################...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("##############################################################A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################################A" + "'", str1, "##############################################################A");
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                !ih                                !ih                     aaaaaaaaa", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih", "!ih", "aaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 47, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ");
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hhhhhh4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAHI!", "CLASS [L");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!" + "'", str2, "AAHI!");
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##########                                ", 9, 690);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#                                " + "'", str3, "#                                ");
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa ########## #########", (java.lang.CharSequence) "#######;gnirts.gnal.avajl[ssalc...#######c[ssalc.");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4                !IH                                                                              44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                !IH                                                                              44" + "'", str1, "4                !IH                                                                              44");
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...C;GNIRTS.aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########aHI##########...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "a                                                  ", (java.lang.CharSequence) "aahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 223);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("4", "", 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "a#hi!!ih################################################################################################");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("                               ", strArray8, strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("aahi##########", '4');
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "    ");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", strArray17, strArray20);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("                         A                                  A         aH                         ", strArray8, strArray17);
        boolean boolean28 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                               AHi############                                ", (java.lang.CharSequence[]) strArray17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "4" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "4" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                               " + "'", str13, "                               ");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "aahi##########" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "aahi!" + "'", str23, "aahi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  " + "'", str24, "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "aahi##########" });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                         A                                  A         aH                         " + "'", str27, "                         A                                  A         aH                         ");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                        ##########                                            ###                                                                                                              ", "                                                                                            a  aahi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", "a  aahi4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 307 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI" });
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAHI###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI###" + "'", str1, "AAHI###");
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          ", "a4!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          " + "'", str2, "                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          ");
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##", (java.lang.CharSequence) "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "     h!                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "    ", (java.lang.CharSequence) "                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..hi4  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..", " #..                                                 a  aahi4 #..                                                 a  aahi4", "                                          a       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..hi4  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   .." + "'", str3, "  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..hi4  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..");
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4", 32, "                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4" + "'", str3, "4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4");
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###AAAAAAAAAAAAAA#..                                                 a  aahi4hiAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih", "AAHI4", "!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih" + "'", str3, "aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih");
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 792);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                             a hi                                                                                                                                                              ", 167, 64);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (short) 1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i" });
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 694, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", "a hi!!ih AAHI! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class" + "'", str2, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class");
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;", 63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaa                 hi          !aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAHIAAAAAAAAAAAAA######################################################################");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaa                 hi          !aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;class[ljava.lang.string;");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         cl4ss[Lj4v4.l4ng.String;cl4ss[Ccl4ss[Lj4v4.l4ng.String;cl4ss[Lj4v4.l4ng.String;", 903);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#########", "...######aahia##########aahia###...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########" + "'", str2, "#########");
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####aahi#####");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444               a               444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...class              #...class [Ljava.lang....", 876);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                   ..." + "'", str1, "                                                   ...");
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                            a  aahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a  aahi" + "'", str1, "a  aahi");
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4 a 4", (java.lang.CharSequence) "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 819 + "'", int2 == 819);
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444", "##########44444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444a##########44444444444444444444444444444444444");
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                !ih           ", 0, 985);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################" + "'", str2, "##################################");
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS ", (java.lang.CharSequence) "                                                         hi!##########444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ");
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, 792);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" + "'", str3, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4                !IH                                                                              44", "                                                                                                 HI!ihaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                !IH                                                                              44" + "'", str2, "4                !IH                                                                              44");
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a hi!               ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                !ih                                !ih", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!IHAA", (java.lang.CharSequence) "                               AAAAAAAAAAAAAAAAAAAAAAAA     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...            a4!...            ", "hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", (int) '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "                                  A", (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, ' ');
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    aahi4!", '#');
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a hi", (java.lang.CharSequence[]) strArray20);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "          ");
        boolean boolean24 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "AAHI##########", (java.lang.CharSequence[]) strArray20);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", '#');
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.split("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", '4');
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("a4hi!", strArray29, strArray32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("                !ih               ", strArray25, strArray29);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444444444444444##########44444444444444444444444444444444444444444444", strArray11, strArray25);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aahi4444444444444444444444444444444444444444444444444444", strArray4, strArray25);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "    aahi4!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "aahi4!" });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str33, "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                !ih               " + "'", str34, "                !ih               ");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4444444444444444444444444444444444444444444##########44444444444444444444444444444444444444444444" + "'", str35, "4444444444444444444444444444444444444444444##########44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "aahi4444444444444444444444444444444444444444444444444444" + "'", str36, "aahi4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  4  ", (java.lang.CharSequence) "                               AAAAAAAAAAAAAAAAAAAAAAAA", 304);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ", "A               #               A               #               A               #               A               #               A               #               A               #               A               #               A              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               " });
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa###############", 7, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AHI       ", "                                !ih                                !ih                     aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("a");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a" + "'", str5, "a");
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAHI", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...aaa                a               ...aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaa                a               ...aaa" + "'", str1, "...aaa                a               ...aaa");
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                     aaaaaaaaaaaaaaaaaaaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih                                                                                                 ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#...", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                             4", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "S", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("a hi!!ih                                                                                                                   AAHI!", "CLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", (int) (byte) 100);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!ih", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "a hi!!ih                                                                                                                   ", "H", "!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAA    AAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAA    AAAAAAAAAAAAAA");
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI", "4", "!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi" });
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", 31);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!IH", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
        java.lang.String[] strArray3 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                       ...", strArray2, strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       ..." + "'", str4, "                                       ...");
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAHI!i", "aaaaaaaaaaaaa################################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 58, 609);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAHI!iaaaaaaaaaaaaa################################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "AAHI!iaaaaaaaaaaaaa################################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "      ###AAAAAAAAAAAAAAaahiAAAAA...", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("     h!               ", "                                      ########## 444444444444444444444444                                      ", 103, 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     h!                                      ########## 444444444444444444444444                                      " + "'", str4, "     h!                                      ########## 444444444444444444444444                                      ");
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", (java.lang.CharSequence) "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 225 + "'", int2 == 225);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!IHAA                         ", "                                                                                    #######...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!IHAA                         " + "'", str2, "HI!IHAA                         ");
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       ...");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "       ", "..." });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "...44444444444444444 ##        Hi!", (java.lang.CharSequence) "44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aAHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "44444444444444444444444444444444444444", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aAHIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " });
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a               #               a               #               a               #               a               #               a               #               a               #               a               #               a             ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#####aahia############aahia############aahia######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####aahia############aahia############aahia######" + "'", str1, "#####aahia############aahia############aahia######");
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444##########4444444444444444444444", 690);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444##########4444444444444444444444" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444##########4444444444444444444444");
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444" + "'", charSequence2, "444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi4   a  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi4a" + "'", str1, "hi4a");
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                                                                ...                                             aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A hi", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                             4", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!                                                     ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                    A              ", 50, 527);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "###########################A4444444444444444444444444444444444444444444444444444  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "       #                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!...", "!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!4IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!..." + "'", str2, "hi!...");
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################" + "'", str1, "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################");
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "########## 444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             444444444444444444444##########4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "a", "hi!" };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence1, charSequenceArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray4, ' ');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a hi!" + "'", str7, "a hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 96 + "'", int8 == 96);
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A HI!!IH                                                                                                                   aahi!", "CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A HI!!IH                                                                                                                   aahi!" + "'", str2, "A HI!!IH                                                                                                                   aahi!");
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                              ", " hi!        ...    a               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aahia##########", "#######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia##########" + "'", str2, "aahia##########");
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                               ", "                               AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AA######################################################################################################", "                                                                                          aHi       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AA######################################################################################################" });
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("               !iH        ## ", "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               !iH        ## " + "'", str2, "               !iH        ## ");
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhh...", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                       ", (java.lang.CharSequence) "44444444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "  ...", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI!ih                                                                                                 ", "A hi!!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "AHI##########", "A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "          ", 111, (int) (short) 10);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "i", "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...                             ##########", 326);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##hi#aaaaaaaaaa    ", "hi!ihaa                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4     4IH4     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 4IH4" + "'", str1, "4 4IH4");
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "a hi", (java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            cl", "ss [Lj", "v", ".l", "ng.String;#######...cl", "ss [C#######...cl", "ss [Lj", "v", ".l", "ng.String;#######...cl", "ss              " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              " + "'", str4, "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa####################", 62, 792);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 56, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################################################################aahi########################################################################################", "...#######a...#######", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########" });
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "     h!                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi", 31, "            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str3, "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A hi", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                         aaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                 a                                                  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          ", 310, ".");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          " + "'", str3, "                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          ");
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate(" A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a", 189);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A               a               A               a               A               a               A               a               A               a               A               a        ..." + "'", str2, " A               a               A               a               A               a               A               a               A               a               A               a        ...");
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) " A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA" + "'", str2, "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          AAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIAAHIA");
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###AAAAAAAAAAAahi#######AAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444", "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444");
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...#####!IH AAHI######!IH AAHI######!IH AAHI######!IH", "##########################################A##########################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!IH", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                                                                                                 " + "'", str2, "!IH                                                                                                 ");
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaa################################################################", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaa################################################################" + "'", str2, "aaaaaaaaaaaaa################################################################");
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############AHi############", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########                 ##########a#hi!!ih#################################################################################################                                                                             a#hi!!ih###########################################################################################################", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########                 ##########", "#hi!!ih#################################################################################################                                                                             ", "#hi!!ih###########################################################################################################" });
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi#...", "                      aaaaaaaaaaaaaaaaaaaaaaaa       A", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!IHAA4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44hi#..." + "'", str3, "44hi#...");
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "  ... ", (java.lang.CharSequence) "aAHI#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "!ihaa                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a hiaahia##########aahia########", "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A   AA  A##########AA  A########" + "'", str3, "A   AA  A##########AA  A########");
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 524, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAHI4                                                                                              ", 180);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI4                                                                                                                                                                               " + "'", str2, "AAHI4                                                                                                                                                                               ");
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi######!ih                                                                 ", (java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      ###AAAAAAAAAAAAAAaahiAAAAA...", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      ###AAAAAAAAAAAAAAaahiAAAAA..." + "'", str3, "      ###AAAAAAAAAAAAAAaahiAAAAA...");
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("a#hi!!ih#################################################################################################", "4a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#hi!!ih#################################################################################################" + "'", str2, "#hi!!ih#################################################################################################");
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa" + "'", str2, "aaaaaaa");
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!I", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!I" + "'", str3, "AAHI######!IH AAHI######!IH AAHI######!IH AAHI######!I");
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        char[] charArray9 = new char[] { 'a', '#', 'a', '#', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaa", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi######ahi##########ahi######", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                      hi!ihaa                       ", "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                ", 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                      hi!ihaa                       " + "'", str4, "                      hi!ihaa                       ");
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih" + "'", str1, "aahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ihaahi!ih");
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str3, "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#####aahia############aahia############aahia######", "                                                                                                                                                                           Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####aahia############aahia############aahia######" + "'", str2, "#####aahia############aahia############aahia######");
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          ##########                                            444444444444444444444444" + "'", str3, "                                          ##########                                            444444444444444444444444");
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################.", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aHi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                  A", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                                                                                              " + "'", str1, "4                                                                                              ");
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!ihaaaaaaaaaaaaaaaaaaaaaaaa                                  A", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4ih" + "'", str1, "4ih");
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ahia##########ahia!aahia##########ahia!aahia##########ahia!aahia##########ahia!aahia##########ahia!aahia##########ahia!aaa#aaa#", 201, 690);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4               a               4");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                          " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                          " + "'", str6, "                                          ");
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                       !ih                                !ih", (java.lang.CharSequence) "                                              a                                               ", 269);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#", "a##########44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.io.Serializable[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "a" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a" + "'", str7, "a");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "a" + "'", str8, "a");
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AAHI!ih", "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 103, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa###########################################################################################################################################################################################################################################################################################################################################################################################################################################", "...############444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa###########################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;aaaaaaaaaaaaaaaaa###########################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!IHAa", " hi!        ...    a               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHA" + "'", str2, "IHA");
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################", "ih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.gnal.avajl[ ssalcih;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalcc[ ssalc;gnirts.4                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################" + "'", str2, "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################");
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  AAHI4  ", "##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI4  " + "'", str2, "AAHI4  ");
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAa", (java.lang.CharSequence) "#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#hi!!ih#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!", 864, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!");
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "A              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("      4               a               4               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      4               A               4               " + "'", str1, "      4               A               4               ");
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       #hi#!", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444", 177);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "LASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aahi######", 516, "AAHI!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aahi######AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                   " + "'", str3, "aahi######AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                   ");
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        char[] charArray11 = new char[] { 'a', '#', 'a', '#', '#' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                            a  aahi4", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#######################################################################################       hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#######...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', '#', 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 87 + "'", int15 == 87);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a4!", "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 58);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a", "!" });
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ih                                !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                hi!" + "'", str1, "hi!                                hi!");
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "      4               A               4               ", "##########################################a                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", "                                                 a                                                  ", 4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A                                  ", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a  aahi4");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                     ##############################################################A                                                                                       ", strArray5, strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "4", "A", "4", "A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "a", "  ", "aahi", "4" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                     ##############################################################                                                                                         " + "'", str9, "                                                     ##############################################################                                                                                         ");
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              ..." + "'", str3, "                                              ...");
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        char[] charArray9 = new char[] { '4', '4', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ##########                                            ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!IHAA", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 a                                                  ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", "hI                                                                                                                                                     ahia a##########                                                                                                                                                                                                                                                                                                        ahia a##########                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str2, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "###aaaaaaaaaaaaaaaahiaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                             4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "###AAAAAAAAAAAAAAaahiAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[", "##################################################################################aahi########################################################################################");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "               a hi!        ...    ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...       aaaaaaaaaaaaaa...", "                                                     aahi!                                                     ", 876);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[" + "'", str5, "H;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCIH;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALCC[ SSALC;GNIRTS.GNAL.AVAJL[");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "...       aaaaaaaaaaaaaa..." });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#####################################################ahi###############################################################", "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA", 33, 225);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###########################################    ##########    AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "###########################################    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                 a                                                  ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("H  HH! 4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H  HH! 4" + "'", str2, "H  HH! 4");
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "###########################A                                  ##########################################hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########                                                              ", 901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("IHA", "..                                                 A  AAHI4", "##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHA" + "'", str3, "IHA");
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                     ahia a##########                                                                                                                                                   ", "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAHI##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                        ...", 864, 819);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA", "                                                     AAHI!                                                     ", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###              aahi             " + "'", str5, "###              aahi             ");
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                    hi!                ", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    hi!                " + "'", str2, "                                    hi!                ");
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", "AAHI######!IHAAHI######!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    " + "'", str2, "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ");
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "a  a  a  a  a  a  a  a  a  a  a", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a  a  a  a  a  a  a  a  a  a  a" + "'", charSequence2, "a  a  a  a  a  a  a  a  a  a  a");
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "a  a  a  a  a  a  a  a  a  a  a", (java.lang.CharSequence) "aih                                                                                                 ", 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH", 310);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI!IH", 970, 523);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########################AAAHI!i############################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "444444444444444444444444####################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!##########444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("              aaaaaaaaaaaaaaaaaaaaaaaa                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              aaaaaaaaaaaaaaaaaaaaaaaa                    " + "'", str1, "              aaaaaaaaaaaaaaaaaaaaaaaa                    ");
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4 4IH4", "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                                                aaaaaaaaaaaaaaaaaaaaaaa                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###Hi!###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                 ", 985);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "44444444", (java.lang.CharSequence) "4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    " + "'", str2, "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi                                                                    ");
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444AAHI444444444444444444444444", "############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ", "AAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444AAHI444444444444444444444444" + "'", str3, "444444444444444444444444AAHI444444444444444444444444");
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                          ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "     h!                                      ########## 444444444444444444444444                                      ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                          " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "....................................................................................#######...", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444", " A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a               A               a");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444" + "'", str3, "444");
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "                                                                                                                                                                                                                                               A HI!        ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", charSequence2, "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          Hi!          ...44444444444444444 ##        Hi!", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                Aahi", "##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                Aahi" + "'", str2, "                                                                                                Aahi");
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI!!IH                                                                                                                   aahi!                                                     " + "'", str1, "A HI!!IH                                                                                                                   aahi!                                                     ");
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str1, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                    A              ", "444444444444444AAHI444444444444444444444444", 119, 915);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                    A              444444444444444AAHI444444444444444444444444" + "'", str4, "                    A              444444444444444AAHI444444444444444444444444");
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                .", (java.lang.CharSequence) "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "#######################################################################################################################                                                                                                                                   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAA", (int) ' ', 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                             aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   AHI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (java.lang.CharSequence) "aahi######ahi##########ahi######", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!aaahi!a", "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", 68);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "!ih           ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ahi!aaahi!a" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ahi!aaahi!a" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ahi!aaahi!a" + "'", str6, "ahi!aaahi!a");
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4a4a4a4a4a4a4a4a4a4a4aaaaaaaaaaaaaaaaaaaaaaaa       A", "aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                          ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                          " });
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AAHIAAAAAAAAAAAAA######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHIAAAAAAAAAAAAA######################################################################" + "'", str1, "aAHIAAAAAAAAAAAAA######################################################################");
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIHAAaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih    aahi4!aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih    aahi4!aaaaaaaaaaaaaaaa" + "'", str1, "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih    aahi4!aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       ", "##        H", "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;                                                                                                                                                                                                                                 ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                       ");
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!", (java.lang.CharSequence) "                                                                                                 hi!!ih A", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...#######a...#######", 77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                            aaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                            aaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                 a                                                  ", "ih A");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A                                  ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 hi!IHAA", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!" });
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               a                ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a hi!     ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                      ##########", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                        ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAaahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi##########", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a                                                  ", (java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "AHI        ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 694, 985);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 694 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "h", "##########" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AHI        AHI        hAHI        ##########" + "'", str7, "AHI        AHI        hAHI        ##########");
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi", "                    #                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str2, "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AHi#######AHi#######a#AHi#######AHi#######", "##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 ##########44444444444444444444444444444444444 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi#######AHi#######a#AHi#######AHi#######" + "'", str2, "AHi#######AHi#######a#AHi#######AHi#######");
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               " + "'", str2, "                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ");
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  " + "'", str1, "                                                                  ");
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!ihaa                       ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!ihaa" });
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (java.lang.CharSequence) "aahi4444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    ", "ahi##########", 24);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "          Hi!           ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########", "aahi4", 31);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaa", strArray6, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 HI!ihaa", (java.lang.CharSequence[]) strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", "                        ...");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444", strArray12, strArray17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "    " + "'", str8, "    ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaaa" + "'", str13, "aaaa");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4444444444" + "'", str18, "4444444444");
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                         hi!                ", "", 103);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                         hi!                " });
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!", 75, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!" + "'", str3, "!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!");
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA ########## ##########", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("               a hi!        ...    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               A HI!        ...    " + "'", str1, "               A HI!        ...    ");
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 0, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################..." + "'", str3, "#######################################...");
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang#A#                                                                   ahi                                                                                                   4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.", 35, 757);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444" });
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("           #########            ", 0, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           #########            " + "'", str3, "           #########            ");
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaa    ", (java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI!ih                                                                                                 ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "## hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "###Hi!###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                              hi4   a                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A                                  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "...                             ##########", (java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "A" });
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ", 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("######################################");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##hi#aaaaaaaaaa                   ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "######################################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "A HI!        ...", (java.lang.CharSequence) "...hhhhhhhhhhhhhhhhhhhhh.......", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("       A                                  a      a       A                                  ", "Ahia##########aHIa!aAhia##########aHIa!aAhia##########aHIa!aAhia##########aHIa!aAhia##########aHIa!aAhia##########aHIa!aAa#aAa#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       A                                  a      a       A                                  " + "'", str2, "       A                                  a      a       A                                  ");
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hi", 151, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hi" + "'", str3, "hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hiCLASS[lJAVA.LANG.sTRING;CLASS[cCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;hi");
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "a hi!!ih AAHI! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 59, 901);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aahi#...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#ihaa" + "'", str1, "...#ihaa");
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi" + "'", str2, "Aah##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAaahi");
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hI                                                                                                                                                     ahia a##########                                                                                                                                                                                                                                                                                                        ahia a##########                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAA");
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" });
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                !ih                                                                              ", "4444444444444444444444444444444444444444444444444444444444444444444444444444 A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !ih                                                                              " + "'", str2, "                !ih                                                                              ");
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [ljava.lang.string;#######...class [c#######...class [ljava.lang.string;#######...class [ljava.lang.string;                                                                                                                                                                                                                     " + "'", str1, "class [ljava.lang.string;#######...class [c#######...class [ljava.lang.string;#######...class [ljava.lang.string;                                                                                                                                                                                                                     ");
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aahi######AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi######AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih" + "'", str1, "aahi######AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih                                                                                                 AAHI!ih");
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAHI!", "AAHI!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '#');
        boolean boolean12 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                a                  ");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray20);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, '4');
        boolean boolean24 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "##########################################A##########################################", (java.lang.CharSequence[]) strArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEach("a#hi!!ih#################################################################################################", strArray16, strArray20);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#..", strArray9, strArray20);
        int int28 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...", (java.lang.CharSequence[]) strArray20);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                   !iH        ##", strArray3, strArray20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    " + "'", str11, "    ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "a" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "a" + "'", str23, "a");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "a" + "'", str25, "a");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str26, "a#hi!!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#.." + "'", str27, "#..");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "                                                                                   !iH        ##" + "'", str29, "                                                                                   !iH        ##");
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    ", "!ih", (-1));
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#", "", 970);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "    " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "#" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str10, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######", (java.lang.CharSequence) "AAHIA!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#####h!###############", "               a               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####h!###############" + "'", str2, "#####h!###############");
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ", "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", "aaaaaa", 312);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    " + "'", str4, "444444444444444444444444       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ");
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) " Hi!          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                a               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hi!", 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                              ####aahia##########aahia##########aahia#####                              ", (java.lang.CharSequence) "##hi#aaaaaaaaaa", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                      ##########", "aahia!", (int) (byte) 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "###############a#hi!########...");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                      ##########" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                      " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##hi#aaaaaaaaa", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "              hI!               ", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "a hi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "####################", (java.lang.CharSequence[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        !aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aih", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "4CLASS", "[lJAVA.LANG.sTRING;CLASS", "[cCLASS", "[lJAVA.LANG.sTRING;CLASS", "[lJAVA.LANG.sTRING;" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "4CLASS", "[lJAVA.LANG.sTRING;CLASS", "[cCLASS", "[lJAVA.LANG.sTRING;CLASS", "[lJAVA.LANG.sTRING;" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "CLASS", "[lJAVA.LANG.sTRING;CLASS", "[cCLASS", "[lJAVA.LANG.sTRING;CLASS", "[lJAVA.LANG.sTRING;" });
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!", 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                                                    ", 18, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "ahi!aaahi!a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi");
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "AAhAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi", (java.lang.CharSequence) "                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa####################", (java.lang.CharSequence) "                               AAAAAAAAAAAAAAAAAAAAAAAA     ", 516);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                     !ihaa                                                     ", 35);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Aahi!!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAAHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ", "  ... #######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", " hi!        ...    a               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAHI      !IH                                                                 AAHI      !IH                                                                 AAHI      !IH                                                                 AAHI      !IH                                                                 " + "'", str3, "aAHI      !IH                                                                 AAHI      !IH                                                                 AAHI      !IH                                                                 AAHI      !IH                                                                 ");
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...HI######", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#a#" + "'", str5, "#a#");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "######################################################444444444444444444444444", 119, 895);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...            a4!...                                                                                                                                                                            ", 249, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" #... ", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                      aaaaaaaaaaaaaa", 305, 6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " #... " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, 694);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "hhhhhhhhhhhhhhhhhhhhh...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaa     ", "############################################               A               ############################################                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            ############################################               A               ############################################                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa     " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa     ");
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444" + "'", str1, "4444444");
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                     ##############################################################A                                                             ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("               A               ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "AAHI44444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...AAAAAAA", 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aAHI!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!i" + "'", str1, "aahi!i");
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "444444444444444444444444AAHI444444444444444444444444", 180, 15);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                   ######################################################444444444444444444444444                                                                                                                    ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Hi!          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 670 + "'", int2 == 670);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!4a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaaAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA");
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            " + "'", str1, "            ");
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!", (java.lang.CharSequence) "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444 a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("a4a", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    a4a" + "'", str2, "                                                                                    a4a");
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "A   AA  A##########AA  A########", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string", (java.lang.CharSequence) "  ahia a##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                             4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" });
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...aaa                a               ...aaa", 189, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################################################################...aaa                a               ...aaa" + "'", str3, "#################################################################################################################################################...aaa                a               ...aaa");
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "               a                ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!4a", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "######################################################################aAAHI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 75 + "'", int1 == 75);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", "a hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaa                                            aaaaaaaaaa                                                                             aaaaaaaaaa", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "       ..." });
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                       ", "                                                                                                          hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str1, "                                                                                                                                                                                                                                                                                                                 4.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "##     #  H #  ##     #  H #  ##     #  H #  ##     #  H #  ", 201, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("            ", 874);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                 ", "                                       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss ##        si!", "###############a################aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 517 + "'", int2 == 517);
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                      444444444444444444444444 ##########                                      ", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444         Hi!               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                               ", "4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########", 249, 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########" + "'", str4, "       4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########");
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aAHIAAAAAAAAAAAAA######################################################################", "ahi       ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAHIAAAAAAAAAAAAA######################################################################" + "'", str3, "aAHIAAAAAAAAAAAAA######################################################################");
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("##########    #HI!AAAAAAAAAAAAAA", "  aahi4   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########    #HI!AAAAAAAAAAAAAA" + "'", str2, "##########    #HI!AAAAAAAAAAAAAA");
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("###", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aIH                                                                                                 ", " ", 304);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aIH" });
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444               A               444444", 524);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##########                                            44444444444444444444444", "aaaaaaaaaaaaa#######################################################################aaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########                                            44444444444444444444444" });
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi4   a  ", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi4   a  " + "'", str7, "hi4   a  ");
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################################################################################################", "A HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################################################" });
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        char[] charArray8 = new char[] { 'a', '#', 'a', '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#######################################################################################################################################################################################################..", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############a#hi!########...", "aH", 44);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###############a#hi!########..." });
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###AAAAAAAAAAAAAA#..                                                 a  aahi4hiAAAAA...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaa                                                                                                 hi!IHAA", 110);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa                                                                                                 hi!IHAA" + "'", str2, "aaaaaa                                                                                                 hi!IHAA");
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       A                                  a...", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       A                                  a..." + "'", str3, "       A                                  a...");
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "....................................................................................#######...", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                            a  aahi4", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;H", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               A HI!               ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi" + "'", str1, "a hi");
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444444444444444444444444444444444444444444444444444444444444444444444444444444", "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "CLASS[cCLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaa... aahi! aahi! aahi!", 250, 305);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", "                                                 a                                                  ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', (int) (byte) 100, 100);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("                !IH                                                                              ", ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!IH" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!IH" + "'", str13, "!IH");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hhhhhhhhhhhhhhhhhhhhh...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("4 4IH4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 4IH4" + "'", str1, "4 4IH4");
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...#######a...#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######...a#######..." + "'", str1, "#######...a#######...");
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAHI##########", "                                                                                                                                                                                                                                                                                                                aH                                                                                                                                                                                                                                                                                                               ", 157);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI##########" + "'", str3, "AAHI##########");
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaa", 11, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaa" + "'", str3, "aaaaaaaaaaa");
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4A4A4A4A4A4A4A4A4A4A4A4A4A4A4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4A4A4A4A4A4A4A4A4A4A4A4A4A4A4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4A4A4A4A4A4A4A4A4A4A4A4A4A4A4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                     hi!...", "                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!..." + "'", str2, "hi!...");
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi", 111, 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        java.lang.String[] strArray8 = new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" };
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "a");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray8, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray8);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4', 0, (-1));
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', 177, (int) 'a');
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "a", "hi!", "", "a", "hi!", "a" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "aahi", "!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 90 + "'", int14 == 90);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                     !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                                                                          !IHAA                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa               A               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("44444 A 444444", "###########################A                                  ##########################################hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########hi##########                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444 A 444444" + "'", str2, "44444 A 444444");
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "     ...");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih", "                                           ##########                                            ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaa44444               A               444444", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaaaaa44444               A               444444" + "'", str8, "aaaaaaaaaaaaa44444               A               444444");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!ih" + "'", str10, "!ih");
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "Ahi##########HI4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "#####################################################", (java.lang.CharSequence) "...class              #...class [Ljava.lang....");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                           aaaaaaaaaaaaaa aaaaaaaaaaaaaa                                                                            ", 0, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                           ..." + "'", str3, "                                                           ...");
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "#..", (java.lang.CharSequence) "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                         a hi!               ", 75, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                         a hi!               " + "'", str3, "                                                                         a hi!               ");
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444444444444", 661);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..hi4  ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ...   ..", (java.lang.CharSequence) "...class              #...class [Ljava.lang...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 742 + "'", int2 == 742);
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44A444A444A444A444A444A444A444A444A444A444A444A444A444A44" + "'", str3, "44A444A444A444A444A444A444A444A444A444A444A444A444A444A44");
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "A HI!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##        Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                          aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44A444A444A444A444A444A444A444A444A444A444A444A444A444A44", 637);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########4444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########4444444444444444444444444444444444");
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       AAAAAAAAAAAAAAaahiAAAAAAAAAAAAA                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", (java.lang.CharSequence) "A   AA  A##########AA  A########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...AAAAAAA", (java.lang.CharSequence) "class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;class[Ljava.lang.Str#ng;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################################################...###########################################################", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        4i!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################...###########################################################" });
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  AAHI4   ", 124, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#...", "444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("a  a  a  a  a  a  a  a  a  a  a aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray7, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#..." + "'", str5, "#...");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "#..." });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "###aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a  a  a  a  a  a  a  a  a  a  a aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str12, "a  a  a  a  a  a  a  a  a  a  a aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!IHAA", "               !iH        ## ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", "", "I", "AA" });
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" ########## aaaaaaaaaaaaaaaaaaaaaaaa", 517, "...               4.STRING;C...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STR ########## aaaaaaaaaaaaaaaaaaaaaaaa...               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRI" + "'", str3, "...               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STR ########## aaaaaaaaaaaaaaaaaaaaaaaa...               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRING;C......               4.STRI");
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 915);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("####################                a           ####################", "", 201, 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############" + "'", str4, "#############");
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAHI", "Aahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI" + "'", str2, "AAHI");
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("       A                                  a...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       A                                  a.." + "'", str1, "       A                                  a..");
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa", 193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                                                                                ", "4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########", 167, 757);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                       4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########" + "'", str4, "                                                                                                                                                                       4444444444444444444444444444444444444444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########44444444444444444444444444444444444##########");
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#..                                                 a  aahi4", "AAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..                                                 ", "  ", "hi4" });
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaa##hi4hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa##hi4hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "aaaaaa##hi4hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "##########                                            444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!" + "'", str1, "hi!hi!");
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                            aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                           ", "hi!                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                            aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                           " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                            aaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                          aHi       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          aHi       " + "'", str1, "                                                                                          aHi       ");
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", (java.lang.CharSequence) "                                                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "444444444444444444444444AAHI444444444444444444444444", 180, 15);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str9, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                   ######################################################444444444444444444444444                                                                                                                    ", "####################################################################################################################################################################################################################################################################################################                                            #                                                                             #                                                     #####################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                   ######################################################444444444444444444444444                                                                                                                    " });
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Aahi######!ih                                                                 aahi######!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2, annotatedElementArray3, annotatedElementArray4 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) annotatedElementArray5, "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertArrayEquals(annotatedElementArray1, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertArrayEquals(annotatedElementArray2, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertArrayEquals(annotatedElementArray3, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertArrayEquals(annotatedElementArray4, new java.lang.reflect.AnnotatedElement[][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray5);
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray14 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[][] charSequenceArray15 = new java.lang.CharSequence[][] { charSequenceArray2, charSequenceArray5, charSequenceArray8, charSequenceArray11, charSequenceArray14 };
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray27 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" };
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] { charSequenceArray18, charSequenceArray21, charSequenceArray24, charSequenceArray27, charSequenceArray30 };
        java.lang.CharSequence[][][] charSequenceArray32 = new java.lang.CharSequence[][][] { charSequenceArray15, charSequenceArray31 };
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(charSequenceArray32);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray32);
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                           ##########                                            ###", "class [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                           ##########                                            ###" });
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######aahi######", (java.lang.CharSequence) "44444444444aahi4444444444444444444444444444444444444444444444444444", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                 ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih    aahi4!aaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!!ih                                                                                                                   AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 767);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" ##        Hi!                                                                                                         ", "4  HI4                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ##        Hi!                                                                                                         " + "'", str2, " ##        Hi!                                                                                                         ");
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" A               4             A               4       ", "                     hi!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " A               4             A               4       " + "'", str2, " A               4             A               4       ");
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("A HI!        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI!..." + "'", str1, "AHI!...");
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) " hi4                                                                                              hi4                                                                           ", (java.lang.CharSequence) "[Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class class");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4                    #                                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4                    #                                                        " + "'", str2, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4                    #                                                        ");
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!                                hi!", (java.lang.CharSequence) "class[Ljava.lang.String;...class[C...class[Ljava.lang.String;...class                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                                                 HI!ihaa                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "ahi       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
}

