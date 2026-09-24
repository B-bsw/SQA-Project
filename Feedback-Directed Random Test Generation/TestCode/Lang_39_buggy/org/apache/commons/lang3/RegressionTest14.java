package org.apache.commons.lang3;

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
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                      0404HI!         ", "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih10hi!10hi!  ...", "H!ih!ih000H!ih!ih00...", "                                                                                                 ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!  ..." + "'", str3, "!ih10hi!10hi!  ...");
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("I!", "11!11!11!11!11!11!11!11!11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "", (int) '4', (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray1, strArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "iiiiiiiiii...", 928, 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!                                4444444", "444444444444444##h##h##h##h##h##h#...444444444444444", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 36);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!                                4444444" + "'", str4, "HI!                                4444444");
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                         000                          ", "     ", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "000" });
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1         4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 13, "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                                                                 ..", "                                hi!                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444410                                                                                4444444", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("         1                                                                                                                                       ", "...h!i..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1                                                                                                                                       " + "'", str2, "         1                                                                                                                                       ");
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       10hi!10hi!hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                   ..");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                       ", "10", "hi", "!", "10", "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                          ..10                                   ..hi                                   ..!                                   ..10                                   ..hi                                   ..!                                   ..hi                                   ..!" + "'", str4, "                                                                          ..10                                   ..hi                                   ..!                                   ..10                                   ..hi                                   ..!                                   ..hi                                   ..!");
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h00h00h00h00h00h", "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h0 144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h0 144I!144I!4I!" + "'", str1, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h0 144I!144I!4I!");
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH10HI!1010", "", "", "10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "", "", "HI!HI!010HI!10HI!HI" });
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa", "4444444aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        char[] charArray8 = new char[] { 'a', '#', 'a', '#', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("0!ih!ih01!ih010!ih!ih01!ih01hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("#####################################################################################################################################################################         00h00h00h00h00h00", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', 'a', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10                                                                                               1010                                                                                               10hi!", "00hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1010hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("         00h00h00h00h00h00", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10                                                                                               1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                                                               1010                                                                                               " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "10                                                                                               1010                                                                                               10hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str7, "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("00H00H00H00H", "100100100100100100100100...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H" + "'", str2, "00H00H00H00H");
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("100");
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 aaa", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!10hi!hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10hi!10hi!hi!" + "'", str9, "10hi!10hi!hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "100" });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100", "                                   00h00h00h00h00h00h00h00h00h                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100" + "'", str2, "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100");
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H", "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444104444444410444444441044444!ih!ih01!ih100", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444104444444410444444441044444!ih!ih01!ih100" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444104444444410444444441044444!ih!ih01!ih100" });
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                              ", 104, 928);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 104 out of bounds for length 75");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!ih!ih01!ih", "00h00h00h00h00h00h00h00h00h             4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("########################   #########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################   #########################" + "'", str1, "########################   #########################");
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) 'a', 13);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444444");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00hi!" + "'", str9, "00hi!");
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi" + "'", str1, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi");
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I0HI!I0", 188, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI0HI!I0" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI0HI!I0");
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!", 363);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00..." + "'", str2, "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00...");
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("H00H00H00H00H00H00H00H00H000h00h00aaah00h00h00h00aaaaaah00h00h00h00aaah00h00h00h00aaah00h00h00h00aaa", "0404HI!", "hi!       ..hi!       ..hi!       .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa" + "'", str3, " hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa");
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444                ...4444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#######################################################################444444", 200, "144I!144I!4I!00h00h00h00h00h00h00h00h00h             4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################################################444444144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00" + "'", str3, "#######################################################################444444144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00");
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#####################################################################################################################################################################           1  1  1  1  1  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################################################################################           1  1  1  1  1  " + "'", str1, "#####################################################################################################################################################################           1  1  1  1  1  ");
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...         " + "'", str2, "...         ");
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ", "H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" ", (int) (byte) 1, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aa11401444444440144444444a11401444444440144444444", "            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa11401444444440144444444a11401444444440144444444" + "'", str2, "aa11401444444440144444444a11401444444440144444444");
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       10hi!10hi!hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 197, (int) (short) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "00h00h00h00h00h");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                       ", "10", "hi", "!", "10", "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                       ", "1", "i", "!", "1", "i", "!", "i", "!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                        1 i ! 1 i ! i !" + "'", str9, "                                        1 i ! 1 i ! i !");
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00H!IH!IH0HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!IH!IH0HI" + "'", str1, "00H!IH!IH0HI");
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse(" 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0    0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0 " + "'", str1, "   0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0    0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00    0 ");
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###################################h##h##h##h##h##h#...#################################", "            00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################h##h##h##h##h##h#...#################################" + "'", str2, "###################################h##h##h##h##h##h#...#################################");
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h", '#', 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" 1                                                                                               ", "#################################################################################################################################################         00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("         44444444104444444410411a44444444104444444410411aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("        1  ", "######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        1  " + "'", str2, "        1  ");
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...", "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     " + "'", str2, "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444", "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih!ih!ih0                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               000                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "00H!ih!ih0#####################################################################################################################################################################################");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                               000                                               " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               000                                               " + "'", str4, "                                               000                                               ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "000" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                           ", "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           " + "'", str3, "                           ");
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("10                                                                                          ...", 198, 182);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                          ..." + "'", str3, "10                                                                                          ...");
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...aaa", " 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa" + "'", str2, "...aaa");
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("40        1    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "40        1    " + "'", str2, "40        1    ");
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "00H!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            " + "'", str3, "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                               hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih10hi!10hi!hi!010hi!10hi!hi!", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str3, "!ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        int int1 = org.apache.commons.lang3.StringUtils.length("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 133 + "'", int1 == 133);
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    ", "1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    " + "'", str2, "0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    ");
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", 0, " hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H" + "'", str3, "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("######################", "00h00h00h00h00h00h00h00h00h", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00H!ih!ih0H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!ih!ih0H" + "'", str1, "00H!ih!ih0H");
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("01 0101 !i", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !i" + "'", str2, "01 0101 !i");
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        char[] charArray12 = new char[] { 'a', ' ' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("144I!144I!4I!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("10hi! 1010 10", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444         1                                                                                                                    ", charArray12);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray12);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone("...   00h00h00h00h00h00h00h00h00h", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                            hi!       ..                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!       .." + "'", str1, "hi!       ..");
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("144i!1", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1", "i!1" });
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("h00h00h00h00h00h00h00h00", "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#################################################################################################AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################AAA" + "'", str1, "#################################################################################################AAA");
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                ########################   #########################", 928, "                      4444444aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                ########################   #########################" + "'", str3, "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                ########################   #########################");
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                hi!                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "144I!1    ..", 92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   4444444", " 00H00H00H00H00H00H00H00H00H             ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00H!ih!ih0#####################################################################################################################################################################################", "141414444444414444144444444144441444141414");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("a", "4444444444444444444444444444444444444444444444444444444444444444444444", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00", strArray8, strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0hi 1010 10", "            00h00h00h00h00h00h00h00h00h            ", 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray12, strArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, ' ');
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("  ", ' ');
        java.lang.Object[] objArray25 = new java.lang.Object[] { "          ", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", str20, strArray23, "aaa" };
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(objArray25, ' ', 145, (int) (short) -1);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(objArray25, '#', 629, 133);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10   ", "10   10   ", "10" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00" + "'", str13, "00");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str18, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00hi!" + "'", str20, "00hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[          , 100100100100100100100100100100100100100100100100100100100100100100100100100100100100100, 00hi!, [], aaa]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h", 25, 186);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        0..." + "'", str3, "...0h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        0...");
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00hi!", "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h00h00h00h00h00h", "                                                ########################   #########################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("00h00h00h00h00h00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("104104hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("144i!144444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1", "i!1" });
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("1         4444444444444444444444                                                                 ", "1         4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1         4444444444444444444444                                                                 " + "'", str2, "1         4444444444444444444444                                                                 ");
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!10hi!hi!");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "44444444104444444410444444441044444!ih!ih01!ih100.........................................");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10hi!10hi!hi!" + "'", str4, "10hi!10hi!hi!");
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("######################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "######################" });
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", "                                                                           0!ih!ih01!ih010!ih!ih01!ih01hi!0000                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI" + "'", str2, "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("..   ", "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..   " + "'", str2, "..   ");
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("44444444444444444444444444444444444                                                                                                              ", "                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   00H00H00H00H00H00H00H00H00H             ", "h00h00h00h00h00h00h00h                 ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 290");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   00H00H00H00H00H00H00H00H00H             " });
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("H!ih!ih000H!ih!ih00...", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00..." + "'", str2, "H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...");
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h", "0hi!10hi!hi!", 186);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      " + "'", str3, "                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      ");
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                            hi!       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("00000000000000000000000000000000000", "0404HI!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H!ih!ih0Hi!                                                                                                 ", "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h10hI!", "   11 1 11 1 11 1 11 1 11 1", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h10hI!" });
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "!ih!i", 363, 188);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!i" + "'", str4, "!ih!i");
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("40        1    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0        1    " + "'", str2, "0        1    ");
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1aaaaaaaaa" + "'", str1, "1aaaaaaaaa");
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", 90, 191);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 104, 102);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1  I 1  I  I" + "'", str1, "1  I 1  I  I");
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0", 'a', 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split(".", "44...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("104HI4 410104 410", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...H!ih!ih000H!ih!ih00...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444", "", 5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            00h00h00h00h00h00h00h00h00h             ", ' ');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "01                                                                                               ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("10HI!10##########", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 26");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00H!ih!ih0Hi!                                                                                                 ", "101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!10HI!10##########", "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..00h00h.00                                                                                                 " + "'", str3, "..00h00h.00                                                                                                 ");
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 72, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAA", "#####################################################################################################################################################################           1  1  1  1  1  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAA" });
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   ", (int) '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   " + "'", str3, " 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   ");
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("#####################################################################################################################################################################           1  1  1  1  1  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("144I!144I!4I!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("4444444410", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                00h00h00h00h00h00h00h00h00", "Aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                00h00h00h00h00h00h00h00h00" + "'", str2, "                                                                                                                                                                00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "10", (int) '4', 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", strArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10" + "'", str12, "10");
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!       ..4444444410", 176, "0000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..444444441000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..444444441000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hI!", "", "                                                                                                                                                        00                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!" + "'", str3, "hI!");
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" 144i!144i!4i!                                              0404HI!                                               ", "aaaaaaa                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 144i!144i!4i!                                              0404HI!                                               " + "'", str2, " 144i!144i!4i!                                              0404HI!                                               ");
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("01                                                                                               ", "4444444                ...4444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01                                                                                               " + "'", str2, "01                                                                                               ");
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                ", "444444                                    ..444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                " + "'", str2, "4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                ");
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0h00h00h00h00h00h00h0", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii          1 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", "h00h00h00h00h00h00h00h                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                                                                  HI!                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010" + "'", str1, "144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010");
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("144I!144444444444444444444444444444444444444444444", "0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0h00h00h00h00h00h00h0", "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h00h00h00h00h0" + "'", str2, "0h00h00h00h00h00h00h0");
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#0404HI!##", "                                                                          ..10                                   ..hi                                   ..!                                   ..10                                   ..hi                                   ..!                                   ..hi                                   ..!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#0404HI!##" + "'", str2, "#0404HI!##");
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    10   1001001001001001001001001001001001001001001001001001001001001001001001001001001001001001" + "'", str1, "    10   1001001001001001001001001001001001001001001001001001001001001001001001001001001001001001");
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("...44400h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("        1 ", "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                                                                     ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                     ");
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", (int) '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str3, "                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!0!ih!ih01!ih010!ih!ih01!ih01hi", "0H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!0!ih!ih01!ih010!ih!ih01!ih01hi" + "'", str2, "!0!ih!ih01!ih010!ih!ih01!ih01hi");
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        char[] charArray5 = new char[] { 'a', ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!ih01!ih01", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("..        0404HI!                                    ..", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00000000000000000000000000000000000000000000000000000000000000000000000000000HI!       ..444444441000000000000000000000000000000000000000000000000000000000000000000000000000000", "aaaaaaa                                                                                           ", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00000000000000000000000000000000000000000000000000000000000000000000000000000HI!", "..444444441000000000000000000000000000000000000000000000000000000000000000000000000000000" });
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray4, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hi!", 10, (int) (short) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("0000000000000000000000000000000000000000000000000000000000000000000000", strArray16, strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("0000000000000000000000000000000000000000000000000000000000000000000000", strArray5, strArray20);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, 'a', 41, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str21, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str22, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                              0404HI!              ...", "                                       111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!              ..." + "'", str2, "                                              0404HI!              ...");
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00H!ih!ih0", '#');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444                                                                                           ", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                            00h!i");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H!ih!ih0" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "H" });
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("########################   #########################", "0404hi!444444444444444444444444444444444444444444444", "h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih0", 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################   #########################" + "'", str4, "########################   #########################");
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!       ..", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!", "", 14);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00h00h00h00h00h00h00h00h00h", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444   ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str7, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                            hi!       ..                                                                                            ", '4', 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("104104hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 444444444444444444444444444...", "h11111111                                                                               ", 186);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "01 0101 ", 651);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" 144i!144i!4i!                                              0404HI!                                               ", "                                                                       !IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 144i!144i!4i!                                              0404HI!                                               " + "'", str2, " 144i!144i!4i!                                              0404HI!                                               ");
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                      0404HI!         ", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("   11 1 11 1 11 1 11 1 11 ", 56, 651);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444104444444410411", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi 1010 10", "00h", (int) (byte) -1);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                          ", 198, 191);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10hi 1010 10" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih", "         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih" + "'", str2, "  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "aaaaaaaa#0404HI!##aaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                    ...", "HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...aaa00h00h00h00h00h00h00h00h00h", "0H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                                00h00h00h00h00h00h00h00h00", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!" + "'", str2, "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!");
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0hi!10hi!hi!", "#0404HI!##", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("10...", "                                                                         000                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0H!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...h!i...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h!i..." + "'", str1, "...h!i...");
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10101010HI!", "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10101010HI!" });
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "         1                                                                                                                                       ", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray5, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "                                                                                                                                                                                              10hi!10");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444                                                                                                              ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", strArray9, strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str10, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "######################" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str15, "                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "44444444444444444444444444444444444" + "'", str16, "44444444444444444444444444444444444");
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                ########################   #########################", "11111HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("Aaa", "                                                                                       aaaaaaaaaa1a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("1                                                                                                 aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                      4444444                                    ..444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", "                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 0, (-1));
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       10hi!10hi!hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("00", "10hi 1010 10", (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444                                                                                                              ", strArray11, strArray16);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("10HI!10", strArray4, strArray16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                       ", "10", "hi", "!", "10", "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                       10hi!10hi!hi!" + "'", str12, "                                       10hi!10hi!hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44444444444444444444444444444444444                                                                                                              " + "'", str17, "44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10HI!10" + "'", str18, "10HI!10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00hi!" + "'", str20, "00hi!");
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...", 70, "########################   #########################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################   ######...########################   #######" + "'", str3, "########################   ######...########################   #######");
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444                                   ", '#');
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray8 = new java.lang.String[] {};
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray7, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("          ...", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444                                   " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                            HHHH", "                                    0404HI!              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            HHHH" + "'", str2, "                            HHHH");
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "         1                                                                                                                                       ", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray5, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "                                                                                                                                                                                              10hi!10");
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("h00h00h00h00h00h00h00haaaaaaaaaaaaa", strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str10, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "######################" });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h00h00h00h00h00h00h00h                 ", "aaaaaaaaaaaaaaaaaaaaaaa###00aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "h", "h", "h", "h", "h", "h", "h                 " });
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                  0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                  ", "0000000000000000000000000000000000000000000000000000000000000000000000" });
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0h00h00h             ", "4444444               ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h             " + "'", str2, "0h00h00h             ");
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aAAAAAAAAAAAAAAAA!ih!ih01!ih0", "H00", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aAAAAAAAAAAAAAAAA!ih!ih01!ih0" });
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0###00###00###00###00", "11                                                                                         11111111                                                                                         1", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                 ", "..        0404HI!                                    .");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                           0!ih!ih01!ih010!ih!ih01!ih01hi!0000                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" + "'", str1, "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!100" + "'", str2, "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!100");
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        int int1 = org.apache.commons.lang3.StringUtils.length("00H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      " + "'", str2, "                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      ");
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              0404hi!                                               ", '#', 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000" + "'", str1, "000");
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1011aaaaaaaaa", "AAAAAAAAAAAA00", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1", "11aaaaaaaaa" });
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444                                                                                            ", "aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa", 96);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444                                                                                            " });
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "10hi 1010 1", 188, 928);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10hi 1010 1" + "'", str4, "10hi 1010 1");
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0hi! 1010 10", "Hi!                                                                                                 ", "0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!ih10hi!10hi!  ...!ih10hi!10hi!h", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!10hi!h" + "'", str2, "i!10hi!h");
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0404hi!444444444444444444444444444444444444444444444", "h00h00h00h00h00h00h00h00", "01                                                                                               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa", 154, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa######################################################" + "'", str3, "aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa######################################################");
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...aaa                           ...aaa             ", "                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa                           ...aaa             " + "'", str2, "...aaa                           ...aaa             ");
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("01 0101 !");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "01", "0101", "!" });
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                            HHHH", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00H!ih!ih0Hi", "         1", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H!ih!ih0Hi" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00H!ih!ih0Hi" + "'", str5, "00H!ih!ih0Hi");
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaa####################################", 200, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("0h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0h00h00h00h00h00h00h00h00h" + "'", str1, "0h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0404HI!...    ......    ......  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00H", 57, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H444444444444444444444444444444444444444444444444444444" + "'", str3, "00H444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("...44400h00h...44400h00h...4...44400h00h...44400h00h...44", "00h!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0h00h00h00h00h00h00h00", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("H00h00h00h00h00h00h00h00h", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0h00h00h00h00h00h00h00" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0h00h00h00h00h00h00h00" + "'", str5, "0h00h00h00h00h00h00h00");
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("01 0101 !ih01", "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("00000000000000000000000000000000000", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                11!11!11!11!11!11!11!11!11", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          1                      ", "00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "          1                      " });
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", "0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H" + "'", str2, "aa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!..", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!IH", "aaa", "                                aaa                                ", 67);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH" + "'", str4, "!IH");
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric(" 144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "1                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!10HI!10##########", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 140 + "'", int2 == 140);
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("        1 ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!ih10hi!10hi!hi!010hi!10hi!hi!", "H!ih!ih0Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("100100100100100100100100100100100100", "00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H!ih!ih0H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("AAA", "44...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 199 + "'", int2 == 199);
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410", "     H  H  H  H  H  H  H  H  H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410");
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                             10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                             10HI! 1010 10" + "'", str1, "                                                                             10HI! 1010 10");
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("141414444444414444144444444144441444141414", "HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "141414444444414444144444444144441444141414" + "'", str2, "141414444444414444144444444144441444141414");
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("01 0101 !ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010hi! 1010 10" + "'", str1, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010hi! 1010 10");
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444", 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                                        00                                          ", "4444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "10     ...", "001001001001001001001001001001001001", 200);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("104HI4 410104 410", "                                                                 4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "104HI4 410104 410" + "'", str2, "104HI4 410104 410");
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  ", "...aaa                           ...aaa             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!", 66, "0hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!" + "'", str3, "0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!");
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      ", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      " + "'", str2, "                                                         ########################   #########################                                                         ########################   #########################                                                         ########################   #########################      ");
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H00H00H00H", "h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "H", "H", "H" });
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                        00                                          ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("         1                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         1                                                                                                                                       " + "'", str1, "         1                                                                                                                                       ");
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                               00h00h00h00h00h00h00h00h00", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00" + "'", str2, "                                                                                                               00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" !ih10hi!10hi!hi!010hi!10hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("11111111                                                                                         11111111                                                                                         1 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1", 154);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h", "                      ###00                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa" + "'", str1, "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa");
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444                                                                                                              ", "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("          1 ", "aaaaaaaaaaaa00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0404hi!444444444444444444444444444444444444444444444                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444                                                                                           ", "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "                                                                                           " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aaaaaaa                                                                                           " + "'", str5, "aaaaaaa                                                                                           ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00H!ih!ih0H", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("404HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("        1    ", "IH0HI!HI!H00", (int) ' ', 178);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "        1    IH0HI!HI!H00" + "'", str4, "        1    IH0HI!HI!H00");
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("11!11!11!11!11!11!11!11!11", "                               hi", "104hi4 410104 410");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("h00h00h00h00h00h00h00h     1  I 1  I  I", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String[] strArray8 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', (int) '#', 3);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "1");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, '4');
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                 4444444444444444444444         1", strArray15, strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("10                                                                                               1010                                                                                               10HI!", strArray3, strArray21);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0404hi!" + "'", str17, "0404hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str23, "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str24, "10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("H!ih!ih0", "00h!ih!ih0#...00...aaa00h00h00h00h00h00h00h00h00h00h!ih!ih0#...00", "01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!ih!ih0" + "'", str3, "H!ih!ih0");
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("aAAAAAAAAAAAAAAAA!ih!ih01!ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI", 1, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI" + "'", str3, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI");
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aa11401444444440144444444a11401444444440144444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa11401444444440144444444a11401444444440144444444" + "'", str1, "aa11401444444440144444444a11401444444440144444444");
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih0", "00hi!00hi!00hi!00hi!00hi!00hi!  ...", "11");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...00h00h00h00h00h00h00h00h00h ", 544, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("104hi4 410104 410", "4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                    ...", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "11");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("00H!ih!ih0Hi!                                                                                     ", strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4', 65, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10HI! 1010 10                                                   !ih!i     AAA", "  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "AAA" });
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                aaa                                00000000000000000000000", "######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                aaa                                00000000000000000000000" + "'", str2, "                                aaa                                00000000000000000000000");
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 13, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             " + "'", str3, "             ");
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!IH!I");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "IH", "!", "I" });
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("00H!IH!IH0HI", "                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("##h##h##h##h##h##h#...", "10...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##h##h##h##h##h##h#..." + "'", str2, "##h##h##h##h##h##h#...");
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                     44444444444444AAA                                    44444444444444AAA                                    444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                     ", "44444444444444", "AAA", "                                    ", "44444444444444", "AAA", "                                    ", "444444" });
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("144i!144444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444444444444444", "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "144i!144444444444444444444444444444444444444444444" + "'", str3, "144i!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                               10", "1", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                               ", "0" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                               40" + "'", str5, "                                                                                               40");
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444410aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444410aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                            4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            4444444444444444444444         " + "'", str1, "                            4444444444444444444444         ");
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                   ##                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("0###00###00###00###00", "4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...!ih01hi!11111111111111111111111111111111111...", "00H00H00H00H   ", 98);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...!ih", "1hi!11111111111111111111111111111111111..." });
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0h00h...44400h00h...4...44400h00h...44400h00h...44", "01                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h...44400h00h...4...44400h00h...44400h00h...44" + "'", str2, "0h00h...44400h00h...4...44400h00h...44400h00h...44");
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444104444444410444444441044444!ih!ih01!ih100.........................................", "  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih40", "                                                                    01", "                                                                 4444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih40" + "'", str3, "!ih40");
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", 192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     0144..." + "'", str2, "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     0144...");
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("H00h00h00h00h00h00h00h00h              1  I!1  I! I!", "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I0HI!I0", "", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0hi!10hi!hi!", "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", 31);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0hi!10hi!hi!" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aa", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa" + "'", str2, "aa");
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444410                                                                                       4444444410                                                                                       411", "!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444...", "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("1001001001001");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1001001001001" + "'", str1, "1001001001001");
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa" + "'", str1, "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa");
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!ih01!ih0", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih01!ih0" + "'", str3, "!ih!ih01!ih0");
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...    ...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...    ..." + "'", str2, "...    ...");
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00");
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...aaa00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih", 4, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih" + "'", str3, "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  1  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  .");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "0h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("0hi 1010 10", "...   00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i 1010 1" + "'", str2, "i 1010 1");
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444410                                                                                4444444", "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "iiiiiiiiii...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("00H!ih!ih0Hi!                                                                                     ", 200, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("100");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 aaa", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444         1                                                                                                                    ", strArray4, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '#');
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray12);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("            00H00H00H00H00H00H00H00H00H            ", strArray7, strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "!ih40        1    ");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "100" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4444444444444444444444         1                                                                                                                    " + "'", str9, "4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10hi!10hi!hi!" + "'", str14, "10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "            00H00H00H00H00H00H00H00H00H            " + "'", str16, "            00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10", '#');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01", "44444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih01" });
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100..." + "'", str1, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                       10HI!10", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10HI!10" + "'", str2, "                                       10HI!10");
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("144I!144I!4I!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("", charArray12);
        java.lang.Class<?> wildcardClass19 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ", "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               000                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "   0444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA000", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 507 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                               000                                               " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih!ih0", "...00h00h00h00h00h00h00h00h00h ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih0" + "'", str2, "!ih!ih0");
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0", "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih!ih!ih0                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10                                                                                                     10        10        10     !ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H", 154, 188);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("10HI! 1010 10", "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010hi! 1010 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444   ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("H00h00h00h00h00h00h00h00h", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44", (int) (byte) 0);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("0000000000000000000000000000000000", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444", "", "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "H00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 414 + "'", int1 == 414);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00HI!              ..", 4, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00HI!              .." + "'", str3, "00HI!              ..");
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("#####################################################################################################################################################################           1  1  1  1  1  ", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444444444444444444444444..", "   00H00H00H00H00H00H00H0        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444.." + "'", str2, "444444444444444444444444444..");
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("01 0101 !ih01", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "10hi 1010 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str2, "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ", "00hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", 24, 186);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("00H!ih!ih0Hi", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ", "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    " + "'", str2, "4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ");
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H00", 182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H00" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        H00");
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10HI! 1010 10                                                   !ih!i     AAA", 73, "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10HI! 1010 10                                                   !ih!i     AAA" + "'", str3, "10HI! 1010 10                                                   !ih!i     AAA");
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0h00h00h             ", 148, "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404hi!          0h00h00h                                                           0404hi!           " + "'", str3, "                                              0404hi!          0h00h00h                                                           0404hi!           ");
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!ih!ih01!ih010!ih!ih01!ih01hi!101010101010!10HI!10##########", "4444444                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10HI! 1010 10                                                   !ih!i     AAA", '4', 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("10hi 1010 1", "aaa####################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi 1010 1" + "'", str2, "10hi 1010 1");
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                   00h00h00h00h00h00h00h00h00h                                                                                            ", "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi! 1010 10", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "10hi!", "1010", "10" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h" + "'", str7, "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aa", "HI!..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h00h00h00h00h00h00h00h                 ", 150);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0h00h...44400h00h...4...44400h00h...44400h00h...44", 6, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0h00h...44400h00h...4...44400h00h...44400h00h...44" + "'", str3, "0h00h...44400h00h...4...44400h00h...44400h00h...44");
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "aaa00000000000000000000000");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("00H!ih!ih0Hi!", "                                               ", 651);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("        1 ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00H!ih!ih0Hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00H!ih!ih0Hi!" + "'", str5, "00H!ih!ih0Hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10" + "'", str2, "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00h00h00h00h00h00h00h00h00h", "HI!       ..", 188);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!10hi!hi!", 154);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       hi!10hi!hi!                                                                        " + "'", str2, "                                                                       hi!10hi!hi!                                                                        ");
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                 4444444444444444444444         1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                 ", "4444444444444444444444", "         ", "1" });
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1                                                       ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1                                                       " + "'", str2, "1                                                       ");
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH", "aaa00000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH" + "'", str2, "ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH");
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih!ih01!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih0" + "'", str1, "!ih!ih01!ih0");
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                       1ahia1ahiahia");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1ahia1ahiahia" + "'", str1, "1ahia1ahiahia");
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("1                                                       ", "4444444                ...4444444      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("H00H00H00H00H00H00H00H00H              144I!144I!4I!", "4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ..   ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaHHHHHHHHH", "141414444444414444144444444144441444141414", 4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("iiiiiiiiii...", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "..", "", "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaHHHHHHHHH" });
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         1                                                                                                                                       ", 148, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#         1                                                                                                                                       ##" + "'", str3, "#         1                                                                                                                                       ##");
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("   0444444444", "0404HI!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   0444444444" + "'", str2, "   0444444444");
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("i 1010 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("00h00h00h00h   ", "1         4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h" + "'", str2, "00h00h00h00h");
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih10hi!10hi!  ...!ih10hi!10hi!h", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!  ...!ih10hi!10hi!h" + "'", str3, "!ih10hi!10hi!  ...!ih10hi!10hi!h");
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        int int1 = org.apache.commons.lang3.StringUtils.length("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("104104hi!", "..        H4H4!I!                                    ..", "!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "1", (int) (byte) 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("..        H4H4!I!                                    ..", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                       10hi!10hi!hi!", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!" });
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("10HI!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10HI!10" + "'", str1, "10HI!10");
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("101010!ih!ih01!ih010!ih!ih01!ih01hi!101010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih", "11!11!11!11!11!11!11!11!1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     0144...", 56, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("444444   4444444410                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "  I ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("144I!1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", 544, "                                              0404101                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             " + "'", str3, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ");
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10hi 1010 10", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("!ih!i", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("                                                                         000                          ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', ' ', ' ' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("10...", "     H  H  H  H  H  H  H  H  H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10..." + "'", str2, "10...");
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("########################aa", "0H00H00H00H00H00H00H00H00H", "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("     H  H  H  H  H  H  H  H  H             ", "...         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H  H  H  H  H  H  H  H  H             " + "'", str2, "H  H  H  H  H  H  H  H  H             ");
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("..   ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..", "   " });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..   " + "'", str2, "..   ");
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444", "", 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "10...", 24, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 24 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444" });
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10                                                                                          ...", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               00h00h00h00h00h00h00h00h00", "h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44", 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!                                4444444", 190);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                4444444" + "'", str2, "HI!                                4444444");
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "        1  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#####################################################################################################################################################################         00h00h00h00h00h00", "H!ih!ih0Hi!", "0hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################################################################         00h00h00h00h00h00" + "'", str3, "#####################################################################################################################################################################         00h00h00h00h00h00");
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444410                                                                                               1010                                                                                               10HI!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "1");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("000", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("!IH10HI!10HI!HI!010HI!10HI!HI!", strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str6, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("000", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!", "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" ", ' ');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444", 10, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("11111HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "11111HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00H00H00H00H00H00H00H00H00H                                                                      ", "  I ", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("   0444444444", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   0444444" + "'", str2, "   0444444");
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    ", "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("11 1 11 1 11 1 11 1 11 1", "0        1    ", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...   00h00h", "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", (int) (short) -1, 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h" + "'", str4, "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h");
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", "11!11!11!11!11!11!11!11!11", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444", "444444   ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                              11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("H!ih!ih0Hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!", strArray4);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("00000000000000000000000000000000000", strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih!ih", strArray4, strArray15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str8, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4444444444444444444444444444444444" + "'", str10, "4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!ih!ih" + "'", str19, "!ih!ih");
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("11!11!11!11!11!11!11!11!1", "aaa", "...   00h00h00h00h00h00h00h00h00h             ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11!11!11!11!11!11!11!11!1" + "'", str4, "11!11!11!11!11!11!11!11!1");
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", "        1    IH0HI!HI!H00", 191);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("0404HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("AA", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                            4444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ih40        1    ", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih40        1    " + "'", str2, "!ih40        1    ");
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00H!IH!IH0HI", 200);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              00H!IH!IH0HI                                                                                              " + "'", str2, "                                                                                              00H!IH!IH0HI                                                                                              ");
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a", 104, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   a                                                    " + "'", str3, "                                                   a                                                    ");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("10101010HI!                          ", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444410                                                                                4444444", "#######################################################################444444144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih!ih01!ih010!ih!ih01!ih01hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("HI!10##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("..   ", "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HHHHHHHH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!0404hi!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                             " + "'", str1, "         4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                             ");
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" });
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444hI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444hI!" + "'", str2, "4444444hI!");
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444", "...0h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        0...", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444" + "'", str3, "444");
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                   ##                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("            00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00");
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#######################################################################444444144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00", "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################444444144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00" + "'", str2, "#######################################################################444444144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00h00h00h00h00h00h00h00h00h             4144I!144I!4I!00");
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "   00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                               ", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h" });
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1" + "'", str1, " 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("   hi!   ", "...aaa00h00h00h00h00h00h00h00h00hhi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       .", "a0aaaaaa0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   hi!   " + "'", str4, "   hi!   ");
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("10101010HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10101010hi!" + "'", str1, "10101010hi!");
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444" + "'", str1, "014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 73, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               00h00h00h00h00h00h00h00h00", "!444444!4444!  ...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (-1), 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 112");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("..   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..   " + "'", str2, "..   ");
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010" + "'", str1, "144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010");
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("10     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0hi!10hi!hi!AAAAAAAAAAAAAAAAA" + "'", str1, "0hi!10hi!hi!AAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("00H!ih!ih0Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!10##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!10##########" + "'", str1, "HI!10##########");
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410", "44...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "10HI!10##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("10HI! 1010 10                                                   !ih!i     AAA", 186, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                             10HI! 1010 10                                                   !ih!i     AAA" + "'", str3, "                                                                                                             10HI! 1010 10                                                   !ih!i     AAA");
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                          ", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                                                                   0                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("          ", "10", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", 167);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("     10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str1, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("            00H00H00H00H00H00H00H00H00H             ", "014444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00H00H00H00H00H00H00H00H00H             " + "'", str2, "            00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                ########################   #########################                                 ", "00h00h00h00h00h00h00h00h00h             ", 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!                                                                                                 ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I", 4, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I" + "'", str3, "                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I");
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hI!", "###00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!", "4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly("1100", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("     ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100", (int) (byte) 1, " 00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100" + "'", str3, "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100");
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                hi!                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!iH", "404HI!              ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00h00h00h00h00h00h00h00h00h", "...h!i...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444104444444410444444441044444!ih!ih01!i", "44444444444444444444444444444444444444444444444444", 32);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0000000000000000000000000000000000", "1011aaaaaaaaa", "aaa00000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("##h##h##h##h##h##h#...", "11!11!11!11!11!11!11!11!1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}

