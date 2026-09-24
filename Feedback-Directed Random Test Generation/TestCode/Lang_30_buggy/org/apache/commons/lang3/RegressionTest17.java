package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###############################################hi#4#hi#############################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                       a#############################################ahia!ahia                        ", "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                 h                                                  ", "         H         H         H         H                    H         H         H         H      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", 58, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hiHi!hi", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI#################################hi!hi", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#############################################################################################################################################################################################################################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!i!!i                           ii!!i            ii!i!!i                           ii!!i", "hi!hihi!hih################################    ", 324);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444!", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444!" + "'", str2, "444444444444444444444444444444444444!");
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                           HI!HI            ...", (int) (byte) 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI            ..." + "'", str3, "HI!HI                           HI!HI            ...");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "    h    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hI!HI                           HI!HI            ...", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           HI!HI            ..." + "'", str2, "hI!HI                           HI!HI            ...");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                  4444444444HI!HI!...                                                                                                                       ", "           hi!hiHi!hiHIhi!hiHi!hihi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH!IH4444444444444444444444444444444444444444444444", "...             hI!HI            hiHI!HI    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH4444444444444444444444444444444444444444444444" + "'", str2, "!IH!IH4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI!HI!HI!HI", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444", "###############################################hi#!#hi#############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str3, "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####################################", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################" + "'", str2, "##################################");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    H  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    H  " + "'", str1, "    H  ");
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44hi!hi!44", "aaaaaaaaaaaaaaaaaaaaa#IH#!#IH###############################################aaaaaaaaaaaaaaaaaaaa", "         h####################################", 874);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44hi!hi!44" + "'", str4, "44hi!hi!44");
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("I!                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                              " + "'", str1, "i!                              ");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444", '#', 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!  ", "##############################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  " + "'", str3, "hi!  ");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!##", "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!##" + "'", str2, "hi!##");
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi                           hi!hi            hihi!hi                           hi!hi            " });
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hihi!hihihi!hihi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih" + "'", str2, "ih!ih");
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hiHi!hi", "                HI!HI!HI!AA", 56);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hiHi!hi" });
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       ih!iH                           ih!ih", "#####hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ih!iH                           ih!ih" + "'", str2, "       ih!iH                           ih!ih");
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444" });
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 55, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("###############", 31, 40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                             !hihi!hi", "  hiHI!HI ", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi");
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...# #444444444444...aaaaaaaaaaaa", "                                              HI#HI                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...# #444444444444...aaaaaaaaaaaa" + "'", str2, "...# #444444444444...aaaaaaaaaaaa");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HIHI", "  4444444444444444444444444444444444444444444444!   ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", "                       4#############################################4hi4!4hi4                        ", (int) (byte) 1);
        java.lang.String[] strArray8 = null;
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", strArray8, strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " ");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####", strArray16, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray11, strArray16);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        boolean boolean23 = org.apache.commons.lang3.StringUtils.startsWithAny("444hi!4444     ", strArray16);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                               ", strArray4, strArray16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str12, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "#####" + "'", str19, "#####");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str22, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!                               " + "'", str24, "hi!                               ");
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                         ", 46, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         " + "'", str3, "                                                                                         ");
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("             hi   hI!HIhI!HIh                 ", "###########HI!", "hi!                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             hi   h    h    h                 " + "'", str3, "             hi   h    h    h                 ");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##############444hi!4444###############", "I!HI                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############444hi", "4444###############" });
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiHI!HI                           hI!HI" + "'", str1, "hiHI!HI                           hI!HI");
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4444!ih444                                                                                  ", (java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4444!ih444                                                                                  " + "'", charSequence2, "4444!ih444                                                                                  ");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hi!4444", "444hi!4444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("...##########################################################################################...", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "ih!iH                           ih!ihIH            ih!i");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i" + "'", str6, "ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i");
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                             !hihi!hi", 296, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################                                                                                                                                                                                                                                                             !hihi!hi##################" + "'", str3, "#################                                                                                                                                                                                                                                                             !hihi!hi##################");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i", "I!HI                           hI!HI            hiHI!HI                           hI!H...", 3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("####################################################################################################################################################################################################################################################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 260 + "'", int5 == 260);
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...###################################hi#!#hi#", '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444   HIhi!hi                           Hi!hi", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!" + "'", str1, "444!");
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", "################HI!HI################", "###############################################   hi#hihi#hih################################h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("          ", "Ih!iH                           ih!ihIH            ih!iH                        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi                           hi!hi       ...", "hi!hi                           hi!hi            hihi!hi                           hi!hi", 162);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..." });
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ihHI!HI                           hI!HI            hiHI!HI                           hI!HI", 4, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str3, "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 76, "################HI!HI################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str3, "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                   ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                   " });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI                           HI!HI            HIHI!HI                           HI!HI", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str3, "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#########                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HHI!                               ", "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################", "#####!#####");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hi", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hi" });
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                    ...", "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", 46);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "" };
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray14);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray14, strArray22);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray14);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "" };
        int int32 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray31);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray31, strArray39);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "" };
        int int47 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray46);
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray46, strArray54);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray39, strArray46);
        java.lang.String str57 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray14, strArray46);
        java.lang.String[] strArray58 = org.apache.commons.lang3.StringUtils.stripAll(strArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                ", strArray6, strArray46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                    ..." });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                                    ..." });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + " " + "'", str57, " ");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertArrayEquals(strArray58, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi                           hi!hi                           h################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           hi!hi                           h################################" + "'", str1, "hi!hi                           hi!hi                           h################################");
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         H", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("       4444444444HI!HI!...        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       4444444444HI!HI!...        " + "'", str1, "       4444444444HI!HI!...        ");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!hihi!hi", "44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hihi#hi!hi#hihihi#hi!");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hihi#hi!hi#hihihi#hi!" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihi#hi!hi#hihihi#hi!" });
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                       A#############################################AHIA!AHIA                        ", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       A#############################################AHIA!AHIA                        " + "'", str2, "                       A#############################################AHIA!AHIA                        ");
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         h         h         h         h        hi!         h         h         h         h         ", "                            IH!I");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         h         h         h         h        hi!         h         h         h         h         " });
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                    ", 162, 29);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...                                !ih!ih!ih!ih!ih!ih!ih", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", 874);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!                               ", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                               " + "'", str2, "hi!                               ");
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("###########################################", "", 6);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###################################hi!hi################", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###########################################" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 15, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "           ih!iH                           ih!ihIH            ih!iH                           ih!ih", (java.lang.CharSequence) "   !4444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ihh", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                HI!HI!HI!AA", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        char[] charArray8 = new char[] { 'a', '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  hiHI!HI ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "                            h          ", 41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI" });
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###############################################hi#!#hi#############################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###############################################hi#!#hi#############################################" });
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            " + "'", str1, "                                            ");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                    ih ih ih ih ih ih ih", "##############################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                    ih ih ih ih ih ih ih" });
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         H         H         H         H        HI!         H         H         H         H         ", "    H                                      ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("####################################################################################################################################################################################################################################################################", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 260 + "'", int4 == 260);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!Haaaaaaa                         aaaaaaa     HI!H", 161, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H" + "'", str3, "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!HI                           hI!HI  444   4444hI!HI                           hI!HI ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str1, "!HI                           hI!HI  444   4444hI!HI                           hI!HI");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "  !4ih################################hih!ihih!ih   !", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#############################################", strArray1, strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#############################################" + "'", str5, "#############################################");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 261 + "'", int1 == 261);
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#####hi!hi", 387, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                            #####hi!hi                                                                                                                                                                                             " + "'", str3, "                                                                                                                                                                                            #####hi!hi                                                                                                                                                                                             ");
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", 26, 998);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaHI!HI!" + "'", str3, "aaaaaaaaaaaHI!HI!");
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444H   aaaaaaaaaaaaa", "hI   Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444H   aaaaaaaaaaaaa" + "'", str2, "4444444444444444444444444444444H   aaaaaaaaaaaaa");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hiHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI!HI" + "'", str1, "HIHI!HI");
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                 h                                                  ", "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444", 281);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 h                                                  " + "'", str3, "                                                 h                                                  ");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   " });
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##############444hi!4444###############", "HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        char[] charArray13 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###################################", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   hiHI!HI                           hI!HI          ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray5, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                    ", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               " + "'", str2, "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               ");
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!                iihi!hi!iiiihi!hi!iiiihi!hi!iihihi                iihi!hi!iiiihi!hi!iiiihi!hi!ii!                iihi!hi!iiiihi!hi!iiiihi!hi!iihi", "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI", "444HI!H444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                iihi!hi!iiiihi!hi!iiiihi!hi!iihihi                iihi!hi!iiiihi!hi!iiiihi!hi!ii!                iihi!hi!iiiihi!hi!iiiihi!hi!iihi" + "'", str3, "!                iihi!hi!iiiihi!hi!iiiihi!hi!iihihi                iihi!hi!iiiihi!hi!iiiihi!hi!ii!                iihi!hi!iiiihi!hi!iiiihi!hi!iihi");
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("     4444444444444444444444444444444444444444444444 hI!HI                           ", 76, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4444444444444444444444444444444444444444444444 hI!HI                           " + "'", str3, "     4444444444444444444444444444444444444444444444 hI!HI                           ");
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                    HI#HI                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                         aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444##################################HI!HI4444", "         ", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444##################################HI!HI4444" });
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           HI!HI            HIHI!HI                           HI!HI", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 387, 324);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI                           HI!HI            HIHI!HI                           HI!HI" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                           " + "'", str2, "                                           ");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ihhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 387);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "HI", "", "I", "HI", "I", "HI", "I", "HI", "I", "HI", "I", "HI", "I", "H" });
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" + "'", str2, "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                      h    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HIHI!HI", (int) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHI!HI" + "'", str3, "HIHI!HI");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("###########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################" + "'", str1, "###########################################");
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "aaa!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###############################################hi#!#hi#############################################", 'a', 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("############444hi!4444     ###############", "     ", 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############444hi!4444     ###############" + "'", str3, "############444hi!4444     ###############");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################" + "'", str1, "###################################");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hhi!                               ", "###############################################hi#!#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HIHi!hiHi!hi#Hi!hiHi!hiHI", strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("IH!IH#############################################", strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "!hihi!hi", 2);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray16, "#############################################################################################################################################################################################################################################");
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                    ...", strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!aa", strArray8, strArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!aa" + "'", str20, "hi!aa");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        char[] charArray9 = new char[] { 'a', '#', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           HI!HI                           H################################", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!H", "I!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H" + "'", str2, "HI!HI!HI!H");
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##############444hi!4444     ##############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############     4444!ih444##############" + "'", str1, "##############     4444!ih444##############");
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                             I!                                             ", "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444                         aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             I!                                             " + "'", str2, "                                             I!                                             ");
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI" + "'", str2, "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI");
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", " hI!HI  aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  " });
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("###############################################hi#!#hi#############################################", "HI!#                          HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#!#hi#############################################" + "'", str2, "###############################################hi#!#hi#############################################");
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############ih!ih##################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "############ih!ih##################################" });
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("...                           hi!hi            hihi!hi                           hi!hi           ", "     4444444444444444444444444444444444444444444444 hI!HI                           ", 34);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 8 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...", "i", "i", "i", "i", "i", "i", "i" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "####################################################" });
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!", (java.lang.CharSequence) "  hi!hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!" + "'", charSequence2, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                               !ih", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444", "hi!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                        hI!HI            ", (java.lang.CharSequence) "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi! HI!HI                           hI!HI            hiHI!HI       ", "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", " ", "                           ", "            ", "i", "       " });
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!HI                           H################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################", "          ################################", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                               #############################################", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                              #############################################" + "'", str2, "                                                                                                                                                                                                                                                              #############################################");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44444444444444444444444444444444", (java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444" + "'", charSequence2, "44444444444444444444444444444444");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                        ", 'a', 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#hi!hi#hihihi#", "Ih!iH                           ih!ihIH            ih!iH                        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI                           h################################" + "'", str1, "HI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hhi!hihi!hih################################    ", 97, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 Hhi!hihi!hih################################    " + "'", str3, "                                                 Hhi!hihi!hih################################    ");
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############", "         H         H         H         H        hi!         H         H         H         H      ", 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "##################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                           HI!HI                           H###############################", "HI!hi!hi!aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           HI!HI                           H###############################" + "'", str2, "                           HI!HI                           H###############################");
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "          ");
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!HHI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                      ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!HI!HI" + "'", str8, "HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!HI!HI!HI" + "'", str10, "HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaa", "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI!HIHI!HIH################################HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HIHI!HIH################################HI" + "'", str1, "HI!HI!HIHI!HIH################################HI");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                hi                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                hi                 " + "'", str1, "                hi                 ");
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa", "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i", 874, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("IH#Ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IH#Ih" });
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi", "#############################################hi!hi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hI!HI                           hI!HI                           h################################", (int) (byte) 0, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi" + "'", str8, "hi");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hihi!hih################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hih################################" + "'", str1, "hi!hihi!hih################################");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI ! HI ! HI ! HI44444444444444444444444444444", "#####    H     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI          HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", (java.lang.CharSequence) "    !I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...################HI", "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "hi!4444     ##############444hi!4444     ############################444hi!4444     ################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...################HI" + "'", str3, "...################HI");
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                   ", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        char[] charArray8 = new char[] { 'a', '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!HI  ...", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("       ih!iH                           ih!ih", "hi!IhI!aaaaaaaaaaaaaaaaa", "hI!HIhI!HIh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ih!iH                           ih!ih" + "'", str3, "       ih!iH                           ih!ih");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ", "hi! HI!HI                           hI!HI            hiHI!HI       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ");
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi#hi", "                       A#############################################AHIA!AHIA                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!aa", 93, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!aa" + "'", str3, "hi!hi!hi!aa");
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI                           HI!HI                           H################################                                        ", "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ", "hi!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI " + "'", str2, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################", "             HI   Hi!hi!hihi!hih################################    iHi!hiH                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaa                         aaaaaaa", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                         aaaaaaa" + "'", str2, "aaaaaaa                         aaaaaaa");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" H     hi!hi                 ", 0, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " H     hi!hi                 " + "'", str3, " H     hi!hi                 ");
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ihhhI!                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H" + "'", str4, "H");
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####################################" });
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!hihi!hihihi!hihi!hi", "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hihi!hihihi!hihi!hi" + "'", str2, "i!hihi!hihihi!hihi!hi");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ", "                                            HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#############################################HI!HI!##############################################hI!HI                           h################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hI!HI                           hI!HI             hi", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI             hi" + "'", str2, "hI!HI                           hI!HI             hi");
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "#############################################HI!HI!######################################44444444444444444444444444444444444#########################################################", (java.lang.CharSequence) "                       #############################################hi!hi                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "            HIhi!hi                           ", 43);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "#", (java.lang.CharSequence) "###############################################hi#4#hi#############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih         Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih         Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih         Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih");
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#################################hi!                               #################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################hi!                               #################################" + "'", str1, "#################################hi!                               #################################");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!HI", "#############################################hi!hi");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!", strArray4, strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray21, strArray24);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray16, strArray21);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray29);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray29, '#', (int) (short) 10, 5);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                                                                                 ", strArray21, strArray29);
        boolean boolean36 = org.apache.commons.lang3.StringUtils.startsWithAny("                       #############################################hi!hi                        ", strArray21);
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray8, strArray21);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + " " + "'", str25, " ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!                                " + "'", str26, "hi!                                ");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!                                                                                                 " + "'", str35, "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " " + "'", str37, " ");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Ih!iHi!444Ih!iH", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    H         H         H         H      ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) 'a', 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("iH!IH#############################################");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i", "H", "!", "IH", "#############################################" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hihi!hihihi!hihi!hi", 281);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hihihi!hihi!hi                                                                                                                                                                                                                                                                   " + "'", str2, "hi!hihi!hihihi!hihi!hi                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray8, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("I!    ", strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach(" ", strArray2, strArray8);
        java.lang.Class<?> wildcardClass15 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    #HI   Hi!hiHi!hiH", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    #HI   Hi!hiHi!hiH" });
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("I!    ", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray12, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray15, strArray18);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi                           hi!hi            hihi!hi                           hi!hi", strArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444!   ", strArray5, strArray18);
        java.lang.String[] strArray22 = null;
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     ", strArray18, strArray22);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hI!HI" + "'", str16, "hI!HI");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                          !IHHI            " + "'", str19, "                          !IHHI            ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "444!   " + "'", str21, "444!   ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     " + "'", str23, "HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     ");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI                           HI!HI                           H################################" + "'", str1, "I!HI                           HI!HI                           H################################");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I                    ", "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I                    " + "'", str2, "I                    ");
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("###############################################hi#!#hi#############################################", "IH IH###################################", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("   !4444444444444444444444444444444", "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################", 387);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   !4444444444444444444444444444444" + "'", str3, "   !4444444444444444444444444444444");
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("     4444444444444444444444444444444444444444444444 hIHHI                           ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "     ", "4444444444444444444444444444444444444444444444", " ", "h", "IHHI", "                           " });
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 2, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###############", (java.lang.CharSequence) "###########HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi#hi!hi#hihihi#hi!" + "'", str1, "hihi#hi!hi#hihihi#hi!");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, "I!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444444444aaaaaaa                         aaaaaaa     ", "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ", "                         aaaaaaa     ", 62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444444aaaaaaa                         aaaaaaa     " + "'", str4, "4444444444444444444444444444444444444444444444444444aaaaaaa                         aaaaaaa     ");
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("     ", "##############444hi!4444###############                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI", 88, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHI!HI!II!                IIHI!H" + "'", str3, "IHI!HI!II!                IIHI!H");
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("......!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "......!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("            #####################", 34, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            ######################" + "'", str3, "            ######################");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  " + "'", str2, "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ");
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ", 874, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str3, "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HII!HI                                       hiHI!HI", 96, "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HII!HI                                       hiHI!HII!HI                           hI!HI        " + "'", str3, "HII!HI                                       hiHI!HII!HI                           hI!HI        ");
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "###################");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                           hI!HI            hiHI!HI                           hI!HI            #", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "44hi!4444444hi!4444444hi!4444444hi!", 58, 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!#######", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444444444444444444444444444", "#################                                                                                                                                                                                                                                                             !hihi!hi##################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!i!i!i!", "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "     ##############444hi!4444     ############################444hi!4444     ################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        char[] charArray12 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#####", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ih#ih ih#ih ###############################hi!hihi!hih", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh" + "'", str2, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh");
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("   hi!hihi!hih################################hi4!  ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                ", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("       4444444444HI!HI!...        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ihih ihih hi!hihi!hih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                         aaaaaaa     ", "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                         ", "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         " + "'", str2, "                                                                                         ");
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "h    h    h    h    h    h                                             h    h    h    h    h    h  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("       H         H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       H         H" + "'", str2, "       H         H");
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("i!hihi!hihihi!hihi!hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                   4444444                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444   HIhi!hi                           Hi!hi", "hi!hihi!hih################################    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("####################################", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("IAHI                           hIAHI            hAHIAHI                           hIAHI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#############################################HI!HI", "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ihhi", "I!HIhI!HIh################################", "ih!ihih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444!       H      H      H      H   ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                444!       H      H      H      H   " + "'", str2, "                444!       H      H      H      H   ");
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         H         H         H         H        hi!         H         H         H         H      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "IHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("    h     ", "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h" + "'", str2, "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih" + "'", str1, "!ih!ih");
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "           HI!HIhI!HIhiHI!HIhI!HIHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("################################4444444444444444444444444444444444444444444444444444444444444444444", "################################HhI!HI            ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#############################################hi!hi!#############################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 96 + "'", int4 == 96);
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...                        hI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                        hI!H..." + "'", str1, "...                        hI!H...");
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ih!ihih!ih", 90, "...44444444444444444HIHi!hiHi!h...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444HIHi!hiHi!h......444ih!ihih!ih...44444444444444444HIHi!hiHi!h......444" + "'", str3, "...44444444444444444HIHi!hiHi!h......444ih!ihih!ih...44444444444444444HIHi!hiHi!h......444");
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!" + "'", str1, "444!");
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                 HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444 hI!HI                           ", 'a', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI", 69, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str3, "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI");
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hiHi!hiH################################", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                              hI!HIhI!HIh################################");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444!   ", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("      4444444444444444444444444444444444444444444444", 'a', 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("    H     hi!hi                 ", "HIHi!hiHi!hi#Hi!hiHi!hiH", "############444hi!4444     ###############", 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    H     hi!hi                 " + "'", str4, "    H     hi!hi                 ");
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444hi!4444444444444444444444444", "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("I!HIhI!HIh################################", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIhI!HIh################################" + "'", str2, "I!HIhI!HIh################################");
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                     I  I                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     I  I                   " + "'", str1, "                     I  I                   ");
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ih!iH                           ih!ihIH            ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!iH                           ih!ihIH            ih!i" + "'", str1, "ih!iH                           ih!ihIH            ih!i");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!hihi!hih################################hi4!  ", "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   hi!hihi!hih################################hi4!  " });
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!4444     ", "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444                         aaaaaaa     ", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("I!", 38, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH", "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                         ", "#######################################", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                 h                                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 h                                                  " + "'", str2, "                                                 h                                                  ");
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "############################hi#!#hi#", (java.lang.CharSequence) "I!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                             ##", "                        ih!ih#############################################                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             ##" + "'", str2, "                                                                                                                                                             ##");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hI#HHI   Hi!hiHi!hiH################################", 43, "HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI#HHI   Hi!hiHi!hiH################################" + "'", str3, "hI#HHI   Hi!hiHi!hiH################################");
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!  ", "hiHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                    HI#HI                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#### ######hi!hi", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  " + "'", str2, "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa", "                   4444444                                                                          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                           ", "                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         H         H         H         H        HI!         H         H         H         H         ", 998, "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ##HI#HI                           #I#HI           4             #I#HI      #IH#IH4#4HI#HI      " + "'", str2, "   ##HI#HI                           #I#HI           4             #I#HI      #IH#IH4#4HI#HI      ");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI                           H################################", "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("################################...", "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!  ", "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#", "I!HI                            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "#########h#####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444HIHi!hiHi!hiH#########", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444HIHi!hiHi!hiH#########" + "'", str2, "4444444HIHi!hiHi!hiH#########");
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI#HI                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!HI!HI!AA", "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                44hi!hi!4444hi!hi!4444hi!hi!44", "444hi!4444     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!", "...I   ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("################################...", "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh" + "'", str1, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh");
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HI#################################hi!hi", "44444444444444444444444444###############################################444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI#################################hi!hi" + "'", str2, "HI!HI#################################hi!hi");
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", "44444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "444444444444444444444444444444444444!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                       4#############################################4hi4!4hi4                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                            HI!HI!HI", "444hi!4444     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                     hi!hi", "hi!IhI!aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!IhI!aaaaaaaaaaaaaaaaa" + "'", str2, "hi!IhI!aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("AAAAAAA                         AAAAAAA     ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("    H     hi!hi                 ", "#########################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi", "################HI!HI################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 865 + "'", int2 == 865);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                       #############################################hi!hi                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################hi!hi" + "'", str1, "#############################################hi!hi");
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI#################################hi!hi444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI#################################HI!HI444444444" + "'", str1, "HI!HI#################################HI!HI444444444");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa" + "'", str1, "aaaaaa");
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "         H                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIHI!HI", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ih!ihih!ih", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                           ih!ihih!ih                                                                            " + "'", str2, "                                                                           ih!ihih!ih                                                                            ");
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str2, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaa...", "HI!HI                           HI!HI            HIHI!HI hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH            HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("         h", "!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         h" + "'", str2, "         h");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("         H                      ", "                                                                                                                                                                                                                                                                                                                                                        I!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H                      " + "'", str2, "         H                      ");
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hI#HI!HI                           HI!HI            ..", "###################################hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#HI!HI                           HI!HI            .." + "'", str2, "hI#HI!HI                           HI!HI            ..");
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#####!#####", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####!#####" + "'", str2, "#####!#####");
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##" + "'", str1, "##");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "                                                                                                                                                                                                                                                                                                                                                        I!444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           4            4                           ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "IH!IHIH!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HII!HI                                       hiHI!HI", "hI!HIHI!HIH################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...##########################################################################################...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 19, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 19 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...##########################################################################################..." });
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi! HI!HI                           hI!HI            hiHI!HI       ", "                           4            4                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! HI!HI                           hI!HI            hiHI!HI       " + "'", str2, "hi! HI!HI                           hI!HI            hiHI!HI       ");
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                            444!   ", "...             hI!HI            hiHI!HI    ...", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444" });
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("         H         H         H         H        hi!         H         H         H         H         ", "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H         H         H         H        hi!         H         H         H         H         " + "'", str2, "         H         H         H         H        hi!         H         H         H         H         ");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah", "             HI   Hi!hi!hihi!hih################################    iHi!hiH                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah" });
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                 I!                                                                                                 ", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hihi!hihihi!hihi!hi                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                   ih!ihih!ihihih!ihih!ih" + "'", str1, "                                                                                                                                                                                                                                                                   ih!ihih!ihihih!ihih!ih");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................", "##################################hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................" + "'", str2, ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi#####" + "'", str1, "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi#####");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaah", (int) (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaah" + "'", str3, "aaaaaaaaah");
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...!IH!IH4444444444444444444444444444444444444444444444                   ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...!", "IH", "!", "IH", "4444444444444444444444444444444444444444444444", "                   ", "..." });
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hI!HI                           ", "aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444   HIhi!hi                           Hi!hi", "                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444   HIhi!hi                           Hi!hi" + "'", str2, "44444444444   HIhi!hi                           Hi!hi");
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444!   ", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!   " + "'", str2, "444!   ");
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################", "##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 136 + "'", int2 == 136);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                        HI!HI                           H###############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              444444" + "'", str2, "                                                                                              444444");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               ", "hiHI!HI", "aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               " + "'", str3, "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               ");
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!HI                           HI!HI            HIHI!HI                           HI!H...", "", "444!       H      H      H      H   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI                           HI!HI            HIHI!HI                           HI!H..." + "'", str3, "I!HI                           HI!HI            HIHI!HI                           HI!H...");
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("H         H         H         H        HI!         H         H         H         H", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H         H         H         H        HI!         H         H         H         H" + "'", str3, "H         H         H         H        HI!         H         H         H         H");
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "                                                                  ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!hi!hi                           Hi!hi            HIhi!hi              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Ih!iH                           ih!ihIH            ih!iH                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                        ..." + "'", str1, "Ih!iH                           ih!ihIH            ih!iH                        ...");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "    H         H         H         H      ", "hI#HI!HI                           HI!HI            ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("I!                              ", "                            IH!I");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444444444444444444444444444#########################################################", 78, 258);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444#########################################################" + "'", str3, "44444444444444444444444444444444444#########################################################");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 'a', 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hiHI!HI                           hI!HI", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiHI!HI                           hI!HI" + "'", str3, "hiHI!HI                           hI!HI");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444444444444444444444444444", "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################" + "'", str1, "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str1, "I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...# #444444444444...aaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...#", " ", "#", "444444444444", "...", "aaaaaaaaaaaa" });
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###############################################hi#!#hi#", "444hi!4444", 10);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...", strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "44hh44h", 0, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###############################################hi#!#hi#" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444444444444444444444444444444444444444444HI!HI!", "                                                                                                                                                                                               hi!HI!HI!HI!HI!                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH" + "'", str1, "H!IH");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa..." + "'", str2, "aaa...");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ", "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi...", "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa" + "'", str1, "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa");
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                    ", "IAHI                           hIAHI            hAHIAHI                           hIAHI", "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!h", "hi#h", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               4               " + "'", str2, "               4               ");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                        ih!ih#############################################                       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                        ", "ih", "!", "ih", "#############################################", "                       " });
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...H!IH                           IH!IHIH            IH!IH                           IH!I", 95, 67);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "IHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HI                           HI!HI                           H################################", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI                           H################################" + "'", str2, "HI!HI                           HI!HI                           H################################");
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah", "hi!4444    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa" + "'", str2, "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hI   Hi!hiHi!hiH    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI   Hi!hiHi!hiH    " + "'", str2, "hI   Hi!hiHi!hiH    ");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("#### ######hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#################################i!!                               #################################", "  #########", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", "HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi" + "'", str2, "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi");
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ", 162);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         " + "'", str2, "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI                           HI!HI                           H", "HI!HI                           HI!HI            HIHI!HI                           HI!HI           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ihhhI!                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 51 + "'", int3 == 51);
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI", "hi!#                          hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ", "                                                                                                                                                                                                                                    IH!I", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         " });
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'a', 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray3, strArray6);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("         H                      ", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                             ##", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                             ##" + "'", str3, "                                                                                                                                                             ##");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("......!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray15 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence4, charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hi!4444     ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "     ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("I!HI                           HI!HI                           H################################", "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################", "HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH4444444444444444444444444444444444444444444444" + "'", str1, "!IH!IH4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HI                           HI!HI                           H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIH" + "'", str1, "HI!HIHI!HIH");
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" H         H         H         H                    H         H         H         H", "#############################################HI#HI###############################################hI#HI                           h################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###############################################hi#!#hi#", "h    h    h    h    h    h                                             h    h    h    h    h    h  ", 50);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###############################################", "i#!#", "i#" });
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("h################################ Hi!hi hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h################################ Hi!hi hi!h" + "'", str1, "h################################ Hi!hi hi!h");
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HIHI!HIH################################", "HI!HI                           hI!HI                           h################################", 53);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("          IH!IH                           IH!IHIH            IH!IH  #############################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          IH!IH                           IH!IHIH            IH!IH  #############################" + "'", str2, "          IH!IH                           IH!IHIH            IH!IH  #############################");
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" #############################################", "IH!IH##########Hi!hiHi!hiH##################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 11, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaa" + "'", str3, "aaaaaaaaaaa");
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI", "                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "##############444hi!4444###############                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 350 + "'", int1 == 350);
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("       ################################        ", "#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "#############################################HI!HI!##########################################...                       #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI#HI", 61, "                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            HI#HI                            " + "'", str3, "                            HI#HI                            ");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH#####!#####IH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH" + "'", str1, "HIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH#####!#####IH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH");
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444hi!4444444444444444444444444", 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444hi!4444444444444444444444444" + "'", str3, "444444444444444444444444hi!4444444444444444444444444");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH", "!  !   hi!hihi!hih################################hi", 387);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I", "", "", "H", "", "444I", "", "", "HI", "", "", "H", "", "444I", "", "", "HI", "", "", "H", "", "444I", "", "", "H" });
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " ", 35, (int) '#');
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("4            4                           ", strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI!HI!" });
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Hi!aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!aa" + "'", str1, "Hi!aa");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!444hi!4444     ", "...######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...######################" + "'", str2, "...######################");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444hi!4444444444444444444444444", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444hi!4444444444444444444444444" + "'", str2, "444444444444444444444444hi!4444444444444444444444444");
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444Hi!hiHi!hi" + "'", str2, "44444444444444444444444444444444444444444444Hi!hiHi!hi");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...H!IH                           IH!IHIH            IH!IH                           IH!I", "                       ###############################################hi#!#hi#                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!HI#################################HI!HI444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI#################################HI!HI444444444" + "'", str1, "HI!HI#################################HI!HI444444444");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444!   444hi!4444   ", "##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444!   444hi!4444   " + "'", str2, "4444444444444444444444444444444!   444hi!4444   ");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...##### ######hi!hi", "...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###################################", (int) '#', "4 4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################" + "'", str3, "###################################");
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("##############################################################################################################################################################################################################################################################################################################################################################", "", 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                              I", "       H         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              I" + "'", str2, "                                                                                              I");
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "#####!#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "                           ", "h", "I", "!", "HI", "            ", "hi", "HI", "!", "HI", "                           ", "h", "I", "!", "HI", "            " });
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih#ih ih#ih ################################h", "                                                                                              I!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih#ih ih#ih ################################h" });
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                        ", (java.lang.CharSequence) "4444!IH444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 45, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!hi!hihi!hih################################hi4!", "                                      444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      444444444444444444444444" + "'", str2, "                                      444444444444444444444444");
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("         H         H         H         H                    H         H         H         H      ", "...I   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H         H         H         H                    H         H         H         H      " + "'", str2, "         H         H         H         H                    H         H         H         H      ");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HIHI!HIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HI" + "'", str1, "HI!HIHI!HI");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("  ", "4            4", "Ih!ih#############################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha##            IH!IhH################################aaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####" });
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("H         H         H         H        hi!         H         H         H         H", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("            hiHI!HI                          ", ' ', 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "                            ##################################hi!hi                             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                            ##################################hi!hi                             " + "'", charSequence2, "                            ##################################hi!hi                             ");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     " + "'", str1, "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ");
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################", "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################" + "'", str4, "########################");
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI ! HI ! HI ! HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hih!ihih!ih############################### hi#hi hi#hi", "...!IH!IH4444444444444444444444444444444444444444444444                   ...", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#hi!hi#hihihi#", "HI!Haaaaaaa                         aaaaaaa     HI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#hi", "hi#hihihi#" });
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...###################################hi#!#hi", "  4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...###################################hi#!#hi" + "'", str2, "...###################################hi#!#hi");
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("     4444444444444444444444444444444444444444444444      ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 0, 26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("         H                      ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ih!ih#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!h4444444444444444");
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 75, 324);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ", "HI                           hI!HI            hiHI!HI                           hI!HI            ", (-1), 68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str4, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh" });
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        char[] charArray13 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###################################", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 46 + "'", int20 == 46);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                               ###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "h    h    h    h    h    h                                 ...", (java.lang.CharSequence) "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "h    h    h    h    h    h                                 ..." + "'", charSequence2, "h    h    h    h    h    h                                 ...");
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                          ", "ih!ih##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          " + "'", str2, "                          ");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " ", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444hi!4444444444444444444444444", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!", "                                                                                                                                                                                                                                                                                                                                                                                                             ...######                   I!                        ...######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         H         H         H         H                    H         H         H         H      ", "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############################################################################################################################################################################################################################################################################################################################################################", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################" + "'", str5, "##############################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi        ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi        " + "'", str2, "hi        ");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###################...###################################hi#!#hi#...#####################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################...###################################hi#!#hi#...#####################" + "'", str2, "###################...###################################hi#!#hi#...#####################");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ", 874, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...             hI!HI            hiHI!HI    ...", "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA", "    !I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...hhi..." + "'", str3, "...hhi...");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "       4444444444HI!HI!...        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", " #############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", "                                                                                                                                                                                               hi!HI!HI!HI!HI!                              ", 873);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444", "################################", "#####" });
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI!", " H     hi!hi                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI" + "'", str2, "I!HI");
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Hi!hiHi!hiH", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hiH" + "'", str2, "Hi!hiHi!hiH");
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HI                           ", "HI!HI                           HI!HI                           H################################", 874);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih" + "'", str1, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                              444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI                           hI!HI            hiHI!HI                           hI!HI            ", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI!HI!AA", strArray2, strArray9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HI!HI!HI!AA" + "'", str11, "HI!HI!HI!AA");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ", "ih#ih ih#ih ###############################hi!hihi!hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI", "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  44444444444444444444444444444hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HHI!                               ", 232);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI!HI!AA");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   hi!hihi!hih################################hi4!  ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                                                        HI!HI                           H###############################", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "AA" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   ", "hi", "!", "hihi", "!", "hih", "################################", "hi", "4", "!", "  " });
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                   ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444444###############...", (java.lang.CharSequence) "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           " + "'", str3, "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("        HI!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!         H         H         H         H" + "'", str1, "HI!         H         H         H         H");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                           HI!HI                           H###############################", "HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           HI!HI                           H###############################" + "'", str2, "                           HI!HI                           H###############################");
    }
}

