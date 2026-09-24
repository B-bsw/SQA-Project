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
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                              0404HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("i!", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!", "00h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00" + "'", str2, "h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00");
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("144I!1    ..aaaaaaaaaaaaaaaaa", "11111111                                                                                         11111111                                                                                         1 ", "!ih10hi!10hi!  ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "144I!1    ..aaaaaaaaaaaaaaaaa" + "'", str3, "144I!1    ..aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AA11401444444440144444444A11401444444440144444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AA11401444444440144444444A11401444444440144444444" });
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 22, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#########################   ########################                ", "aaa44444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("1100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "h");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "1100" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1100" + "'", str3, "1100");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "         4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                 4444...", 544, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         4444..." + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         4444...");
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         4444...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1         4444444444444444444444", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1         4444444444444444444444" + "'", str2, "1         4444444444444444444444");
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", "...   0aa11401444444440144444444aa114014444444401444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("11", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "11" });
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                 444444444444444444444444444...", "014444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ", "444444   4444444410                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     " + "'", str2, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ");
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...   00h00h00h00h00h00h00h00h00h", "h00h00h00h00h00h00h00h                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "         1                                                                                                                                       ", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray5, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "                                                                                                                                                                                              10hi!10");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, 'a');
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str10, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "######################" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "######################" + "'", str14, "######################");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi! 1010 10", "                                                                                                                                                                00H00H00H00H00H00H00H00H00", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10" + "'", str3, "hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "10hi 1010 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("104104hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "    10   1001001001001001001001001001001001001001001001001001001001001001001001001001001001001001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101001001001001001001001001001001001001001001001001001001001001001001001001001001001001001010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100..." + "'", str1, "101001001001001001001001001001001001001001001001001001001001001001001001001001001001001001010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("########################   #########################", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("00hi!", strArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("!ih!ih01!ih0", strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("                    ...", strArray4, strArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny(" ", strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "   " + "'", str6, "   ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00hi!00hi!00hi!00hi!00hi!00hi!  ..." + "'", str15, "00hi!00hi!00hi!00hi!00hi!00hi!  ...");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                       hi!10hi!hi!                                                                        ", "##########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            00H00H00H00H00H00H00H00H00H             ", "                                                ########################   #########################");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("11111111                                                                                         11111111                                                                                         1 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("", "aa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                              0404HI!              ..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                              ", "0404", "HI", "!", "              ", ".." });
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   0", "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!", 199);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("10                                   ##                                   10                                   ##                                   hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "10", "                                   ", "##", "                                   ", "10", "                                   ", "##", "                                   ", "hi", "!" });
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444", 129, "h10hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444" + "'", str3, "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444");
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0404HI!                                             ", '4', 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  ", "        1  ", 35);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  " + "'", str4, "  ");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "                                                            HI!                                ", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("##h##h##h##h##h##h##h##h##h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" 1                                                                                               ", 140, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1                                                                                                                                          " + "'", str3, " 1                                                                                                                                          ");
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("   00H00H00H00H00H00H00H0        ", "   00H00H00H00H00H00H00H0                                                ########################   #########################                                 ", "", 176);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   00H00H00H00H00H00H00H0        " + "'", str4, "   00H00H00H00H00H00H00H0        ");
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaa00000000000000", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", "44444444104444444410411aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa00000000000000" + "'", str3, "aaa00000000000000");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!" + "'", str1, "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!");
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!!!!I!!II!!!!I!!I!!I!!!!I!!II!!!!I!!I!!IIH" + "'", str3, "H!!!!I!!II!!!!I!!I!!I!!!!I!!II!!!!I!!I!!IIH");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444", "h00h00h00h00h00h00h00h                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00..." + "'", str2, "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00...");
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10                                                                                          ...", "0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0404hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0404", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("100I!100I!0I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100i!100i!0i!" + "'", str1, "100i!100i!0i!");
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("10                                                                                          ...", "AA11401444444440144444444A11401444444440144444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                          ..." + "'", str2, "10                                                                                          ...");
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h", "0h00h...44400h00h...4...44400h00h...44400h00h...44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        int int1 = org.apache.commons.lang3.StringUtils.length("4444444410                                                                                4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444", "4444444                                                                                            ", " A44I!A44I!4I!                                              A4A4HI!                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                            4444444444444444444444         ", 0, "                                                                       hi!10hi!hi!                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            4444444444444444444444         " + "'", str3, "                            4444444444444444444444         ");
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10HI! 1010 10                                                                                                 AAA", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10HI! 1010 10                                                                                                 AAA" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10HI! 1010 10                                                                                                 AAA" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10HI! 1010 10                                                                                                 AAA" + "'", str5, "10HI! 1010 10                                                                                                 AAA");
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                                    ", "10hi!10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00H!ih!ih0#####################################################################################################################################################################################", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", (int) '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H!ih!ih0#####################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("01 0101 ", "00H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1  I 1 01 0101 !ih01  I 1 ", '#', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                    ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("            00h00h00h00h00h00", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("...!ih01hi!11111111111111111111111111111111111...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444410                                                                                       ", "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410                                                                                       " + "'", str2, "4444444410                                                                                       ");
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("      10hi 1010 10       ", 198);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                   10hi 1010 10       " + "'", str2, "                                                                                                                                                                                   10hi 1010 10       ");
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444104444444410411", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10", "10", "11" });
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "10                                                                      00h00h00h00h0!ih!ih01!ih010!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444AAA                                    44444444444444AAA                                    444444", "44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("10                                                                                               1010                                            ", 73, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                            " + "'", str3, "10                                                                                               1010                                            ");
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                 ", "                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("00hi!", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444410                                                                                4444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444", strArray5, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 81");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!", "                                                                                                                                                                                   10hi 1010 10       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   11 1 11 1 11 1 11 1 11 ", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   11 1 11 1 11 1 11 1 11 " + "'", str2, "   11 1 11 1 11 1 11 1 11 ");
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!       ..4444444410                                                                                       ", (int) (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!       ..4444444410                                                                                       " + "'", str3, "HI!       ..4444444410                                                                                       ");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "1  I 1  I  I ", "4444444aaa", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#', 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410", 629);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", "44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ", 928);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      " + "'", str2, "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HHHHHHHHH", "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH" + "'", str2, "HHHHHHHHH");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        int int1 = org.apache.commons.lang3.StringUtils.length("hI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   11 1 11 1 11 1 11 1 11 1", 928, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   11 1 11 1 11 1 11 1 11 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   11 1 11 1 11 1 11 1 11 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                         000                          ", "h00h00h00h00h00h00h00h     1  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         000                          " + "'", str2, "                                                                         000                          ");
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                       !IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI" + "'", str1, "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        char[] charArray9 = new char[] { 'a', ' ' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(" ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("                                              0404hi!                                               ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("        1 ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                  144i!144i!4i!0H!                            0404HI!                                               ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("444444    ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444410                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410" + "'", str1, "4444444410");
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                           ", "00H00H00H00H00H00H00H00H00H", "#0404HI!##                                                                                                                                                                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("            00h00h00h00h00h00h00h00h00h            ", "                                                                                                 ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                            HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4444444444444444444444444444444444", "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       .." + "'", str1, "hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..");
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("H00H00H00H00H00H00H00H00H0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "101011aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                               ", 67, "101001001001001001001001001001001001001001001001001001001001001001001001001001001001001001010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               " + "'", str3, "                                                                                               ");
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("HI!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00H!ih!ih0Hi!                                                                                                 ", "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0Hi!                                                                                                 " + "'", str2, "00H!ih!ih0Hi!                                                                                                 ");
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", "                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                      ", 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("014444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "014444444444" + "'", str2, "014444444444");
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00HI!              ..", '4', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", "HI!..", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I " });
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("11!11!11!11!11!11!11!11!1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11!11!11!11!11!11!11!11!1" + "'", str1, "11!11!11!11!11!11!11!11!1");
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("######################### ########################", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################### ########################" + "'", str2, "######################### ########################");
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    ", "00H!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("      ", "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...   00h00h00h00h00h00h00h00h00h             ", "...   00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h             " + "'", str2, "00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1ahia1ahiahia", "aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".", "44...");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        char[] charArray14 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("   00H00H00H00H00H00H00H00H00H             ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny("...h!i...", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         ", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############", "0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############" + "'", str2, "44444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444444410444444441044444!ih!ih01!ih10044444444104444###########    !IH!I############");
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("    10   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("11!11!11!11!11!11!11!11!1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444", 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444");
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("100                                                                                              ", "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100                                                                                              " + "'", str2, "100                                                                                              ");
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "HI!", 102);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444104444444410444444441044444", "ih", "ih01", "ih010", "ih", "ih01", "ih01hi", "44444444104444444410444444441044444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  " + "'", str1, "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H00", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444410                                                                                       ", "a...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410                                                                                       " + "'", str2, "4444444410                                                                                       ");
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("IH0HI!HI!H00", "00H!ih!ih0Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("40        1    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40        1    " + "'", str2, "40        1    ");
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                            HHHH", "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            HHHH" + "'", str2, "                            HHHH");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00", 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00" + "'", str2, "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                         ..", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H00H00H00H00H00H00H00H00H");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H00H00H00H00H00H00H00H00H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H00H00H00H00H00H00H00H00H" + "'", str3, "H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("..   ", "1111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..   " + "'", str2, "..   ");
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10        ...", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                              0404HI!                                               ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("h00h00h00h00h00h00h00h00h                                                                      ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("                             ...", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("4444444444444444444444         1                                                                                                                    ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        int int1 = org.apache.commons.lang3.StringUtils.length("HI!..");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("144i!144444444444444444444444444444444444444444444", 200, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa144i!144444444444444444444444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa144i!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaa1a", " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                               hi", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("000", "         1", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("            00h00h00h00h00h00");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", strArray4, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "000" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "00h00h00h00h00h00" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str7, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "000" + "'", str9, "000");
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("141414444444414444144444444144441444141414");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "141414444444414444144444444144441444141414" + "'", str1, "141414444444414444144444444144441444141414");
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!", 138, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str3, "...!ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("10HI! 1010 10                                                   !ih!i     AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10HI! 1010 10                                                   !ih!i     AAA" + "'", str1, "10HI! 1010 10                                                   !ih!i     AAA");
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                    ...", "!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    ..." + "'", str2, "                    ...");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str1, "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("11111HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "##h##h##h##h##h##h##h##h##h                                                                      ", (int) (byte) -1, 40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0hi 1010 10", "            00h00h00h00h00h00h00h00h00h            ", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 35, 3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0hi 1010 10" + "'", str8, "0hi 1010 10");
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" 144i!144i!4i!", "..        0404HI!                                    ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                               40", "#0404HI!##                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("014 401014 4IH401", ' ', 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0404hi!010101!ih01000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444444         1                                                                                                                    ", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0a0ahi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaa         1                                                                                                                    " + "'", str3, "0a0ahi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaa         1                                                                                                                    ");
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        int int1 = org.apache.commons.lang3.StringUtils.length("00h!ih!ih0hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                             4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444" + "'", str1, "4444444444444444444444");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0404hi!                                             ", 10, "######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404hi!                                             " + "'", str3, "0404hi!                                             ");
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaa00", "11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaa00" + "'", str2, "aaaaaaaaaaaa00");
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00H!IH!IH0HI!                                        H00h00h00h00h00h00h00h00h              144I!144I!4I!", "HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H!IH!IH0HI!                                        H00h00h00h00h00h00h00h00h              144I!144I!4I!" });
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#######!ih!ih01!ih01", "11111111                                                                                         11111111                                                                                         1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!444444!4444!  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                              0404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404HI!" + "'", str1, "0404HI!");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                            00h!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h!i" + "'", str1, "00h!i");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             #####################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444", 190, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                    ", 178, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...                                                                ...", "#0404HI!##", 133);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...                                                                ..." });
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100                                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             " + "'", str1, "             ");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("100100100100100100100100100100100100", "    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100100100100100100100100100100100100" + "'", str2, "100100100100100100100100100100100100");
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        int int1 = org.apache.commons.lang3.StringUtils.length("...   0aa11401444444440144444444aa114014444444401444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone("", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("        1    ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("00h00h00h00h   ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " !ih10hi!10hi!hi!010hi!10hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10     ...", "44444444104444444410411444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 35);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "     ..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("H00H00H00H00H00H00H00H00H              144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#######################################################################444444", "   11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("#         1                                                                                                                                       ##", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str2, "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444                                    ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        char[] charArray6 = new char[] { '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("            00h00h00h00h00h00", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!ih01!ih01", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("i 1010 1", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h", "1  I 1  I  I ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               00h00h00h00h00h00h00h00h00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("4444444410                                                       ", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 112");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                              040...", "444444444444444444444444444..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("01 0101 !", "                                              0404101                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##I#", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##I#" + "'", str2, "##I#");
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("1  I 1 01 0101 !ih01  I 1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1  I 1 01 0101 !ih01  I 1" + "'", str1, "1  I 1 01 0101 !ih01  I 1");
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (byte) -1, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" });
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHH" + "'", str1, "HHHHHHHH");
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444", "!444444!4444!  ...", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444" + "'", str1, "0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                ########################   #########################                                 ", 204, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444                                                ########################   #########################                                 444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444                                                ########################   #########################                                 444444444444444444444444444444444444");
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11401444444440144444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str1, "!ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                    ", "AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("   11 1 11 1 11 1 11 1 11 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI0HI!I0", "4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...   00h00h", 441);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   00h00h" + "'", str2, "...   00h00h");
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("40        1    ", 104, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa40        1    " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa40        1    ");
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1010HI!", "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("101001001001001001001001001001001001001001001001001001001001001001001001001001001001001001010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101001001001001001001001001001001001001001001001001001001001001001001001001001001001001001010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100..." + "'", str1, "101001001001001001001001001001001001001001001001001001001001001001001001001001001001001001010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str1, "144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("..00h00h.00                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..", "00", "h", "00", "h", ".", "00", "                                                                                                 " });
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0h00h00h             0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0h00h00h             0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h" + "'", str1, "0h00h00h             0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h");
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                 4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444" + "'", str1, "4444444444444444444444");
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                    ...", 22, "44444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    ..." + "'", str3, "                                    ...");
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444104444444410444444441044444!ih!ih01!ih100", "...   0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih100" + "'", str2, "44444444104444444410444444441044444!ih!ih01!ih100");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("H00h00h00h00h00h00h00h00h              1  I!1  I! I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    ", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                               1                                                                                                                                               ", "    10   ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0H00H00H00H00H00H00H0", "4444444", 414);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0H00H00H00H00H00H00H0" });
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "   ", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "             " });
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", "00H!ih!ih0Hi!                                                                                                 ", "     00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!0");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "10hi 1010 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444         1", "                                              0404hi!          0h00h00h                                                           0404hi!           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1         ", "                                                ########################   #########################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   00H00H00H00H00H00H00H0                                                ########################   #########################                                 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "hh", "hh", "hh", "hh", "hh", "hh", "hh", "hh", "hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa" });
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00", strArray4, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("00000000000000000000000000000000000", strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00" + "'", str9, "00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    10   ", "44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                               00h00h00h00h00h00h00h00h00", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00" + "'", str2, "                                                                                                               00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("1    ", "A", "                                                                 4444..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1    " + "'", str3, "1    ");
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0        1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("10                                                                                               10100h00h00h00h00h00h00h00h00h       ", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               10100h00h00h00h00h00h00h00h00h       " + "'", str2, "10                                                                                               10100h00h00h00h00h00h00h00h00h       ");
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("... ...", "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...         " + "'", str1, "...         ");
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!i" });
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("10101010hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10101010hi" + "'", str1, "10101010hi");
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                              11                 ", "h10hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              11                 " + "'", str2, "                              11                 ");
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "             h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             h00h00h00h00" + "'", str2, "             h00h00h00h00");
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("1         4444444444444444444444", "..        0404HI!                                    ..", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444" + "'", str3, "1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444");
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    444444", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    444444" + "'", str2, "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    444444");
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#######################################################################444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "..        H4H4!I!                                    ..", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######################################################################444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " });
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                                                                                               10hi!10                                                                                               1010                       ", "1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404                           000" + "'", str2, "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404                           000");
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                          ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10hi!10", '#', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#######  ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######  " + "'", str3, "#######  ");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HHHHHHHH", "        1    IH0HI!HI!H00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1  I 1  I  I ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                   1  I 1  I  I " + "'", str2, "                                                                                   1  I 1  I  I ");
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!", "            00h00h00h00h00h00");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("            00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00h00h00h00h00h0" + "'", str1, "            00h00h00h00h00h0");
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#', 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10                                   ##                                   10                                   ##                                   hi!", "44444444104444444410411AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                   ##                                   ", "                                   ##                                   hi!" });
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                            HI!       ..", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("#######  #######  #######  #######  #######  ############  #######  #######  #######  #######  #####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaa                                                                                           ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                                                                                           " + "'", str2, "aaaaaaa                                                                                           ");
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h" });
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI", "11111111                                                                                         11111111                                                                                         1 ", 129);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI" });
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("            00h00h00h00h00h00h00h00h00h             ", "     ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, " 144I!144I!4I!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str6, "00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str8, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("H!ih!ih0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                              0404HI!              ...", "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I" + "'", str2, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0hi!10hi!hi!", "AA4A4HI!AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi!10hi!hi!" + "'", str2, "0hi!10hi!hi!");
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("141414444444414444144444444144441444141414", "...44400h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444", "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444" });
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444444                                                ########################   #########################                                 444444444444444444444444444444444444", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   444444444444444444444444444444444444" + "'", str2, "   444444444444444444444444444444444444");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH", "                                                                 4444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 4444.." + "'", str2, "                                                                 4444..");
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00..." + "'", str2, "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...");
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H!!!!I!!II!!!!I!!I!!I!!!!I!!II!!!!I!!I!!IIH", 'a', 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                    ..", 'a', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   0", "00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H0" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H0");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444441044H!ih!ih000H!ih!ih00...444444441044", "1  I 1 01 0101 !ih01  I 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444441044H!ih!ih000H!ih!ih00...444444441044" + "'", str2, "444444441044H!ih!ih000H!ih!ih00...444444441044");
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                              0404HI!              ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404HI!..." + "'", str2, "0404HI!...");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00HI!              ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", (int) ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "00H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H00H00H00H00H00H00H00H00H0", "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 29);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        char[] charArray8 = new char[] { '4', ' ', ' ', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10hi 1010 10", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("        1   ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', ' ', ' ', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444440hi! 1010 1044444444444444444444444444444444444444444444");
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                     ih4444444444000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                     ih4444444444        aaa..." + "'", str1, "                                     ih4444444444000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000                                     ih4444444444        aaa...");
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "h00h00h00h00h00h00h00h                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I" + "'", str1, "01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I");
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...h!i..", "                                    ..        0404hi!                                    ..        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!", "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!" + "'", str2, "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!");
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hhhhhhhh", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...", (int) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00..." + "'", str3, "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...");
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("000", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00H!ih!ih0H", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0H" + "'", str2, "00H!ih!ih0H");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaa                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA                                                                                           " + "'", str1, "AAAAAAA                                                                                           ");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", "                                       10HI!10", 138);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " });
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Aaa", "#######  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                           ", 32, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           " + "'", str3, "                                           ");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                              44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    444444", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441", "aaaaa4444444               ...aaaaa", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..444444441000000000000000000000000000000000000000000000000000000000000000000000000000000", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray5, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hi!", 10, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "1", (int) (byte) 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                               10", strArray6, strArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny("iiiiiiiiii...", strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                               10" + "'", str20, "                                                                                               10");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 105);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" });
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("     00H!i", "101011aaaaaaaaa", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" A44I!A44I!4I!                                              A4A4HI!                                               ", "i!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " A44I", "A44I", "4I", "                                              A4A4HI", "                                               " });
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                                                                                                 aaa", "########################   ######...########################   #######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                   10hi 1010 10       ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444" + "'", str1, "444444");
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040", "0                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   4444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4444444" + "'", str2, "   4444444");
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa40        1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa40        1    " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa40        1    ");
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!", "00H00H00H00H00H00H00H00H00H                                                                      ", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("        1    IH0HI!HI!H00", "404HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        1    IH0HI!HI!H00" + "'", str2, "        1    IH0HI!HI!H00");
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44...", 14, 176);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44..." + "'", str3, "44...");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("     00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!0", "                                HI!                                                                 ", (int) 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1            00h00h00h00h00h00                                                                                             ", "4444444  ", 67);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                             4444444444444444444444         ", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 39 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "1            00h00h00h00h00h00                                                                                             " });
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a44i!a44i!4i!                                              a4a4HI!", "10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...", "01010101010101010101010101010101010101010101010101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a44i!a44i!4i!                                              a4a4HI!" + "'", str3, "a44i!a44i!4i!                                              a4a4HI!");
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...   0", 36, 928);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   0" + "'", str3, "...   0");
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 144I!144I!4I!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("01 0101 !ih01  I 1  I  I ", "                                !IH!i10i!10i!i!010i!10i!i!0                                !IH!i10i!10i!i!010i!10i!i!0                                !IH", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("H00H00H00H00H00H00H00H00H");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                       10hi!10", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "01 0101 !ih01  I 1  I  I " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "H00H00H00H00H00H00H00H00H" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                       10hi!10" + "'", str7, "                                       10hi!10");
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", "!IH10HI!10HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010" + "'", str2, "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010");
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..444444441000000000000000000000000000000000000000000000000000000000000000000000000000000", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..44444444" + "'", str2, "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..44444444");
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                       10hi!10hi!hi!", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               10hi!10hi!hi!                                                                         " + "'", str2, "                                                                                                               10hi!10hi!hi!                                                                         ");
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 " + "'", str2, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("H00H00H00H00H00H00H00H00H              144I!144I!4I!", 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("01 0101 !ih01  I 1  ...", "01 0101 !ih01       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !ih01  I 1  ..." + "'", str2, "01 0101 !ih01  I 1  ...");
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444", "!IH10HI!10HI!HI!010HI!10HI!HI!01!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "10...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", "HI!..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...h!i..", "                                               000                                               ", "                                                                                    !ih10hi!10hi!  ...                                                                                    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("10                                                                      00h00h00h00h0!ih!ih01!ih010!", "#0404HI!##                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                      00h00h00h00h0!ih!ih01!ih010!" + "'", str2, "10                                                                      00h00h00h00h0!ih!ih01!ih010!");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        int int1 = org.apache.commons.lang3.StringUtils.length("aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("         4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                             ", 39, "1  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                             " + "'", str3, "         4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                             ");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444104444444410411444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 196, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444104444444410411444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444104444444410411444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aahi", "11#1#11#1#11#1#11#1#11#1");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!       ..4444444410                                                                                       ###################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       ..4444444410                                                                                       ###################################################################################" + "'", str1, "HI!       ..4444444410                                                                                       ###################################################################################");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("1    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!" + "'", str2, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", " hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa", 150);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444410", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410" });
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("144I!144I!4I!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("141414444444414444144444444144441444141414", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("0h00h00h             ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 6, 100);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str1, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("11                                                                                         11111111                                                                                         1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1                                                                                         11111111                                                                                         11" + "'", str1, "1                                                                                         11111111                                                                                         11");
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("00H00H00H00H00H00H00H00H00H                                                                      ", "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h0 144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#####################################################################################################################################################################         00h00h00h00h00h00", 51, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####..." + "'", str3, "...####...");
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1    " + "'", str1, "1    ");
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###00###00###00###00###00", 186, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###00###00###00###00###00                                                                                                                                                                 " + "'", str3, "###00###00###00###00###00                                                                                                                                                                 ");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                        ", "aaa44444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        " + "'", str2, "                                                                                        ");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h             " + "'", str2, "0h00h             ");
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4444444444444444444444444444444444444444444444444444444444444444444444", "!ih10hi!10hi!  ...1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("H  H  H  H  H  H  H  H  H             ", "", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 72);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H  H  H  H  H  H  H  H  H             " + "'", str4, "H  H  H  H  H  H  H  H  H             ");
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00H00H" + "'", str1, "H00H00H");
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "1");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("000", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str5, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("            00h00h00h00h00h00h00h00h00h             ", "01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01                                                                                                     ", 196);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "            00h00h00h00h00h00h00h00h00h             " });
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("1", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        char[] charArray7 = new char[] { ' ', 'a', 'a', '4', '#' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("0!ih!ih01!ih010!ih!ih01!ih01hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("00H!ih!ih0Hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', 'a', 'a', '4', '#' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444" + "'", str2, "                h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "                                                                                                   0                                                                                                 ", "11111111                                                                                         11111111                                                                                         1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#######!ih!ih01!ih01", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI0HI!I0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######!ih!ih01!ih01" + "'", str2, "#######!ih!ih01!ih01");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10                                                                                                                                                                00H00H00H00H00H00H00H00H00hi! 1010 10", "H00h00h00h00h00h00h00h00h", "    !ih!i");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444", 47, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa44444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaa44444444444444444444444444");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...   00h00h", "4444444               ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   0", 928);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!", "00hi!                                                                                                                                                                                                   ", 129);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("00h00h00h00h00h00h00h00h00h                                                                      ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("          1 ", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0404hi!444444444444444444444444444444444444444444444", "44444444104444444410444444441044444!ih!ih01!ih100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H00H00H", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                      44...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("..                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa", "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     0144...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa" + "'", str2, "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa");
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("H", 190, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444                                                                                                              ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                    ..        0404hi!                                    ..        ", "00H!IH!IH0HI!                                                                                     ", "4I4       aaaaaaa                                                                                           ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##############################################################################################################################################################                                              ", 5, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####..." + "'", str3, "...####...");
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", "1  ...", 32, 191);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    aaaaaaaaaaaaaaaaaaaaaaa     1  ..." + "'", str4, "    aaaaaaaaaaaaaaaaaaaaaaa     1  ...");
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("10   100100...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10   100100", "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   100100...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10   100100" + "'", str2, "10   100100...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10   100100");
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("01 0101 ", "10HI! 1010 10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("01 0101 !ih01  I 1  ...", 47, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444401 0101 !ih01  I 1  ...444444444444" + "'", str3, "44444444444401 0101 !ih01  I 1  ...444444444444");
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "IH0HI!HI!H00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0404HI!              ..", "4444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404HI!              .." + "'", str2, "0404HI!              ..");
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("100I!100I!0I!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "100", "I", "!", "100", "I", "!", "0", "I", "!" });
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   11 1 11 1 11 1 11 1 11 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "1");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("000", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "44444444444401 0101 !ih01  I 1  ...444444444444", 24, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 24 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str5, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str11, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1010hi!", "144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("########################   ########", "...    ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1", "                                                ########################   #########################                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1" + "'", str2, "!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1");
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!iH ", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040" + "'", str1, "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                              ", 50, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################                              " + "'", str3, "####################                              ");
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("             h00h00h00h00", 2, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             h00h00h00h00" + "'", str3, "             h00h00h00h00");
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H  H  H  H  H  H  H  H  H             ", 'a', 176);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!       ..4444444410                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44444444444400H00H00H00H00H00H00H00H00444444444444", 36, 133);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444400H00H00H00H00H00H00H00H00444444444444" + "'", str3, "44444444444400H00H00H00H00H00H00H00H00444444444444");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("00h!ih!ih0#####################################################################################################################################################################################", "                                       111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h!ih!ih0#####################################################################################################################################################################################" + "'", str2, "00h!ih!ih0#####################################################################################################################################################################################");
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("11111111                                                 ", "11#1#11#1#11#1#11#1#11#1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HI!", "11");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1", 100, "##h##h##h##h##h##h#...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##" + "'", str3, "1##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents(" 144i!144i!4i!                                              0404HI!                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1  I 1 01 0101 !ih01  I 1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1  i 1 01 0101 !ih01  i 1 " + "'", str1, "1  i 1 01 0101 !ih01  i 1 ");
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              ", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", 197);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi", (int) '4', 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0h00h00h#############4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444#############h00h00h0" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444#############h00h00h0");
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", 8, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     " + "'", str3, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("########################", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################" + "'", str2, "########################");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                ########################   #########################", "00H00H00H00H   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################   #########################" + "'", str2, "########################   #########################");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444");
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!       ..HI!       ..HI!       .");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!..HI!..HI!." + "'", str1, "HI!..HI!..HI!.");
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0H!", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0H!" + "'", str2, "0H!");
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aa4a4hi!aa", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("#######  ", "H00H00H00H", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######  H00H00H00H#######  H00H00H00H#######  H00H00H00H#######  " + "'", str3, "#######  H00H00H00H#######  H00H00H00H#######  H00H00H00H#######  ");
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("..                                    !I!4H4H        ..", "h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 154);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhh" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhhhhhhh");
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                 4444..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444.." });
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("########################00H", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                          ..10                                   ..hi                                   ..!                                   ..10                                   ..hi                                   ..!                                   ..hi                                   ..!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!..                                   ih..                                   !..                                   ih..                                   01..                                   !..                                   ih..                                   01..                                                                          " + "'", str1, "!..                                   ih..                                   !..                                   ih..                                   01..                                   !..                                   ih..                                   01..                                                                          ");
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("##H##H##H##H##H##H##H##H##H                                                                      ", "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        1", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("100                                                                                              ", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100                                                                                              " + "'", str2, "100                                                                                              ");
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ", " A44I!A44I!4I!                                              A4A4HI!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           " + "'", str2, "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ");
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h", "                                                                           0!ih!ih01!ih010!ih!ih01!ih01hi!0000                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAA00H00H00H00HAAA00H00H00H00HAAA00H00H00H00HAAA", "1            00h00h00h00h00h00                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaa", "HI!                                4444444", "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("00H", "                                                                                                   0                                                                                                 ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1ahia1ahiahia");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1ahia1ahiahia" + "'", str1, "1ahia1ahiahia");
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###############################################000###############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################000###############################################" + "'", str1, "###############################################000###############################################");
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00h00h00h00h00h00", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444..        0404HI!                                    ..1         4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                    4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                            HI!       ..", "#################################################################################################################################################         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            HI!       .." + "'", str2, "                                                            HI!       ..");
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("00hi!                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("     144I!1    ..      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!                                                                                                 ", "########################   ########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!                                                                                                 " });
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI", "                                       1ahia1ahiahia", "44444444104444444410444444441044444!ih!ih01!ih100");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444               ...", "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444               ..." + "'", str2, "4444444               ...");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "00H00H00H00H00H00H00H00H00H                                                                      ");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("104hi4 410104 410", "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "104hi4 410104 410" + "'", str2, "104hi4 410104 410");
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!" + "'", str1, "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!");
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0404hi!", "!ih!ih01!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!" + "'", str2, "0404hi!");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaa00", 150, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################################################################################################################################aaaaaaaaaaaa00" + "'", str3, "########################################################################################################################################aaaaaaaaaaaa00");
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("1aaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            00H00H00H00H00H00H00H00H00H            ", "I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", "aaa44444444444444444444444", (int) (byte) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("0hi 1010 10", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                11!11!11!11!11!11!11!11!11", strArray4, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "            00h00h00h00h00h00h00h00h00h             ", 186, 12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                11!11!11!11!11!11!11!11!11" + "'", str8, "                                                                                                                                                                11!11!11!11!11!11!11!11!11");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih10hi!10hi!  ...!ih10hi!10hi!h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "10", "hi", "!", "10", "hi", "!", "  ", "...!", "ih", "10", "hi", "!", "10", "hi", "!", "h" });
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH" + "'", str1, "..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH..       !IH");
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih" + "'", str1, "!ih!ih");
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                               00h00h00h00h00h00h00h00h00", "                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00" + "'", str2, "                                                                                                               00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("10HI!10##########", 544, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("     00H!i", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     00H!i" + "'", str2, "     00H!i");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444444444##h##h##h##h##h##h#...444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444##h##h##h##h##h##h#...444444444444444" + "'", str2, "444444444444444##h##h##h##h##h##h#...444444444444444");
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("144i!1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144i!1" + "'", str1, "144i!1");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!", 32, 167);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444", "!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444                                                                                                               11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 ", 99, "!ih!ih01!ih0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444                                                                                                               11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 " + "'", str3, "44444444444444444444444444444444444                                                                                                               11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 ");
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11401444444440144444444", "", "                ########################   #########################", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11401444444440144444444" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa11401444444440144444444");
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("    !IH!I");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "    ", "!", "IH", "!", "I" });
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                       44444444444444444444444444444444444", "h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                           hhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hhhhhhhh" });
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ", "0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0" + "'", str1, "144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI!" });
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                       10hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444104444444410411444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "10        ...", 57, 75);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H00H00H00H00H00H00H00H00H", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H00H00H00H00H00H00H00H00H" });
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", "", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("100100100100", "HI!..HI!..HI!.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("10                                                                                               1010                                                                                               10hi!", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("                             ...", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("1aaaaaaaaa", "44444444444401 0101 !ih01  I 1  ...444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1aaaaaaaaa" + "'", str2, "1aaaaaaaaa");
    }
}

