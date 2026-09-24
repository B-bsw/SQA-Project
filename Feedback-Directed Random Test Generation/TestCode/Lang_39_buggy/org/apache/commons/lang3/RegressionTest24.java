package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

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
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("H00h00h00h00h00h00h00h0000H00H00H00H00H00H00H00H00HH00h00h00h00h00h00h00h00", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00h00h00h00h00h00h00h0000H00H00H00H00H00H00H00H00HH00h00h00h00h00h00h00h00" + "'", str2, "H00h00h00h00h00h00h00h0000H00H00H00H00H00H00H00H00HH00h00h00h00h00h00h00h00");
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "4  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0!IH!IH01!IH010!IH!IH01!IH0144i!144i!4i!", "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("!444444!4444!  ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1", "1", "1", "1", "i", "1", "i", "i" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                            HI!       ..                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str1, "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("                                       10hi!10", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("44...", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("                                                     144i!144i!4i", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("10                                                                                          ...", 57, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("1001001001001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("001001   01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah00h00h00h00h00h00h00h00h00   ...001001   01", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "001001   01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah00h00h00h00h00h00h00h00h00   ...001001   01" });
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444410                                                                                               1010                                                                                               10HI!44");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444410", "                                                                                               ", "1010", "                                                                                               ", "10", "HI", "!", "44" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444410", "", "1010", "", "10", "HI", "!", "44" });
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("10                                                                                          ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H00H00H00H00H00H00H00H00H0", "144i!144444444444444444444444444444444444444444444", 629);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H00H00H00H00H00H00H00H00H0" });
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                               1    IH0HI!HI!H00                       ", "4I4       aaaaaaa                                                                                           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1", "H0H", "!H", "!H00" });
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("H00H00H00H00H00H00H00H00H              144I!144I!4I!", "h00h00h00h00h00h00h00h                 ########################  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00H00H00H00H00H00H00H00H              144I!144I!4I!" + "'", str2, "H00H00H00H00H00H00H00H00H              144I!144I!4I!");
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
    }

    @Test
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" });
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "4444444...4444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                       ", "#####################################################################################################################################################################         00h00h00h00h00h00", 140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!I4!I441!I441              h00h00h00h00h00h00h00h00H                                        !IH0HI!HI!H00", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I4!I441!I441              h00h00h00h00h00h00h00h00H                                        !IH0HI!HI!H00" + "'", str2, "!I4!I441!I441              h00h00h00h00h00h00h00h00H                                        !IH0HI!HI!H00");
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("########################00H", " 1                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################00H" + "'", str2, "########################00H");
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10                                                                                               1010                                                                                               10HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str2, "10                                                                                               1010                                                                                               10HI!");
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                        a                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaHI!HI!HI!HI!HI!HI", (int) (short) -1, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaHI!HI!HI!HI!HI!HI" + "'", str3, "aaaHI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                  ####################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                            HI!                                ", "aaaaaaa!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "   4444444");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("########################   ########", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                           ", "                                           iiiiiiiiii...                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                           " + "'", str2, "                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                           ");
    }

    @Test
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("   0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0    0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0 ", "aAAAAAAAAAAAAAAAA!ih!ih01!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0    0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0 " + "'", str2, "   0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0    0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0 ");
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!ih10hi!10hi!  ...!ih10hi!10hi!h", "1ahia1ahiahia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!  ...!ih10hi!10hi!h" + "'", str2, "!ih10hi!10hi!  ...!ih10hi!10hi!h");
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...         ", "0404hi!444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...         " });
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0404HI!              ..", "H!ih!ih000H!ih!ih00...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("1  I 1  I  I 1  I 1  I  I 1  I...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00H!I", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaa00000000000000000000000", "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaa" });
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("10hi!10");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI0HI!I0", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10", "hi", "!", "10" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 185 + "'", int3 == 185);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "10101010hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                      44...", "h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444h!ih01!ih010!ih!ih01!ih000H!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..444444441000000000000000000000000000000000000000000000000000000000000000000000000000000");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                              0404hi!          0h00h00h                                                           0404hi!           ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("100");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 aaa", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444         1                                                                                                                    ", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("0404hi!", ' ');
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01", strArray7, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "100" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444444444444444444         1                                                                                                                    " + "'", str9, "4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "0404hi!" });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01" + "'", str16, "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01");
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!000404HI!000404HI!000404HI!000404HI!00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!000404HI!000404HI!000404HI!000404HI!00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...   0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   0" + "'", str1, "...   0");
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                      4444444aaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      4444444aaa" + "'", str2, "                      4444444aaa");
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("44444444444444AAA                                    44444444444444AAA                                    44444444444444444444AAA                                    44444444444444AAA           10hi 1010 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444AAA                                    44444444444444AAA                                    44444444444444444444AAA                                    44444444444444AAA           10hi 1010 1" + "'", str1, "44444444444444AAA                                    44444444444444AAA                                    44444444444444444444AAA                                    44444444444444AAA           10hi 1010 1");
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                             10hi! 1010 10", "    10   1001001001001001001001001001001001001001001001001001001001001001001001001001001001001001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             10hi! 1010 10" + "'", str2, "                                                                             10hi! 1010 10");
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        char[] charArray7 = new char[] { 'a', '#', 'a', '#', '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                  00h00h00h00haaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', 'a', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa104104hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "                                                                              ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("        10", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(" 144i!144i!4i!                                              0404HI!                                               ", "                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("####################                              ", "HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                              ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              " + "'", str3, "                                                                              ");
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444104444444410444444441044444!ih!ih01!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410444444441044444!ih!ih01!i" + "'", str1, "44444444104444444410444444441044444!ih!ih01!i");
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10" + "'", str2, "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               000                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "   0444444444");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "1         ", 14, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                               000                                               " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("11!11!11!11!11!11!11!11!1", 626);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11!11!11!11!11!11!11!11!1" + "'", str2, "11!11!11!11!11!11!11!11!1");
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" 1                                                                                               ", 28, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1                                                                                               " + "'", str3, " 1                                                                                               ");
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", "10hi 1010 10", 490);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0404HI!              ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1010hi!", "4444444410");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                              0404hi!          0h00h00h                                                           0404hi!           ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 148 + "'", int4 == 148);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                      0404HI!         ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#######!ih!ih01!ih01", 200, 31);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                   ", "10                                                                    ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a10                                                                                               1010aa", "     H  H  H  H  H  H  H  H  H             ", "      10hi 1010 10       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a10                                                                                               1010aa" + "'", str3, "a10                                                                                               1010aa");
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        char[] charArray15 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray15);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray15);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("HI!                                ", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("", charArray15);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaa11401444444440144444444", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone(" AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                   AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny("0HI!00HI!00HI!00HI", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" 144i!144i!4i!                                              0404HI!                                               ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " 144i!144i!4i!                                              0404HI!                                               " });
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0H00H             " + "'", str1, "0H00H             ");
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (byte) 0, (int) (short) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4444444410");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aa4a4HI!AA", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Aa4a4HI!AA" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aa4a4HI!AA" + "'", str4, "Aa4a4HI!AA");
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("   11 1 11 1 11 1 11 1 11 ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11 " + "'", str2, "   11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11    11 1 11 1 11 1 11 1 11 ");
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!000404HI!000404HI!000404HI!000404HI!00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!000404HI!000404HI!000404HI!000404HI!00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HI!000404HI!000404HI!000404HI!000404HI!00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             0404hi!444444444444444444444444444444444444444444444                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ", 455, 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     " + "'", str4, "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ");
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih", "000H!ih!ih0Hi!0h             00000h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("h00h00h00h00h00h00h00h     1  I 1  I  I", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h     1  I 1  I  I" + "'", str2, "h00h00h00h00h00h00h00h     1  I 1  I  I");
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                    ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str4, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("..aaaaaaaa0404hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..aaaaaaaa0404hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.." + "'", str1, "..aaaaaaaa0404hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..");
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("      ..HI!       ..HI!       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        java.lang.String[] strArray4 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) '#', 3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                               10");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "I!H00");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str13, "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str18, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("40        1    ", "10                                                                                               1010                                            ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa144i!144444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa144i!144444444444444444444444444444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa144i!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("10                                                                                               1010                                                                                               10hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                 ...", charArray13);
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
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444", "0000000000000000000000000000000000000aAAAAAAAAAAAAAAAA!ih!ih01!ih", "144I41");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...", 'a', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" a44i!a44i!4i!                                              a4a4HI!                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("#0404HI!##                                                                                                                                                                      ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                 " + "'", str4, "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144i!144444444444444444444444444444444444444444444", "1111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144i!144444444444444444444444444444444444444444444" + "'", str2, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144i!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        char[] charArray6 = new char[] { 'a', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("144I!1", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("a", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 ", "144i!144444444444444444444444444444444444444444444", 26);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                 " + "'", str4, "                                                                                                 ");
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("144I!1", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                    ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#########################   ########################                ", "444444", 12, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444#############   ########################                " + "'", str4, "444444#############   ########################                ");
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!IH!I", "00H00H00H00H00H00H00H00H00H                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!I", "!I" });
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#################################################################################################", "aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa", "1                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################" + "'", str3, "#################################################################################################");
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                    ..        0404hi!                                    ..        ", "AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    ..        0404hi!                                    ..        " + "'", str2, "                                    ..        0404hi!                                    ..        ");
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("!0!ih!ih01!ih010!ih!ih01!ih01h", charArray13);
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
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH" + "'", str3, "..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH");
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        char[] charArray9 = new char[] { 'a', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(" ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("                                              0404hi!                                               ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("        1 ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                  144i!144i!4i!0H!                            0404HI!                                               ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("h00h00h00h00h00h00h00haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1111111111111111111111111", 154);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                 1111111111111111111111111" + "'", str2, "                                                                                                                                 1111111111111111111111111");
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                              0404HI!                                               ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("h00h00h00h00h00h00h00h00h                                                                      ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("                             ...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!i", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "11 1 11 1 11 1 11 1 11 1", "##########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str3, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("104hi4 410104 410", "44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "104hi4 410104 410" + "'", str2, "104hi4 410104 410");
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 22, "111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00h00h00h00h00h00h00h00h00h             ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                       10hi!10hi!hi!", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("0h00h             ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 39 + "'", int16 == 39);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi", "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}

