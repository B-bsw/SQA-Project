package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00HI!              ..", "#######################################################################444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00HI!", "", "", "", "", "", "", "", "", "", "", "", "", "", ".." });
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1111111111111", "0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 96, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                             4444444444444444444444         ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         " + "'", str2, "                                             4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444                                                      4444444444444444444444         ");
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H" + "'", str1, "00H00H00H00H");
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                      44...                       ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      44...                       " + "'", str2, "                      44...                       ");
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("001001001001001001001001001001001001", "44444444444444444444444444444444444444444444444444444444444444444");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("00h00h00h00h00h00h00h00h00h                                                                      ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                            HI!       ..                                                                                            ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "001001001001001001001001001001001001" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH0" + "'", str1, "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH0");
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                            100                    ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                                ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100" + "'", str2, "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100");
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   ", "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   " + "'", str3, " 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   ");
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h", "444444444444444444444444444..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       10hi!10", ' ');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("    !ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!i" + "'", str1, "!ih!i");
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", "");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          ", strArray3, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str5, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          " + "'", str9, "          ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str11, "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!ih40", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                !ih40                                                                                                " + "'", str2, "                                                                                                !ih40                                                                                                ");
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "104HI4 410104 410");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010 " + "'", str2, "     10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010 ");
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("11#1#11#1#11#1#11#1#11#1", "HI!10##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10hi!hi!" + "'", str1, "10hi!10hi!hi!");
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       .." + "'", str1, "HI!       ..");
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("10HI! 1010 10                                                                                                 AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa", "00H!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa" + "'", str2, "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa");
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                !ih40                                                                                                ", "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                !ih40                                                                                                " + "'", str2, "                                                                                                !ih40                                                                                                ");
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI" + "'", str1, "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("00h!ih!ih0#####################################################################################################################################################################################", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h!ih!ih0#..." + "'", str2, "00h!ih!ih0#...");
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("00H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                           ", 'a', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           " + "'", str3, "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ");
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("    !IH!I", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii          1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !IH!I" + "'", str2, "    !IH!I");
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "...aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10                                                                                               1010                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h00h00h00h00h00h", '#', 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!ih01!ih", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("                                               ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("141414444444414444144444444144441444141414", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                               00", "11111111                                                                                         11111111                                                                                         1", 930);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("            00H00H00H00H00H00H00H00H00H             ", "10");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            00H00H00H00H00H00H00H00H00H             " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "            00H00H00H00H00H00H00H00H00H             " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "            00H00H00H00H00H00H00H00H00H             " + "'", str6, "            00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444                                                                                           ", "HI!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                    ", "010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                    ");
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ", 2, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10        ..." + "'", str3, "10        ...");
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("44444444104444444410411a44444444104444444410411aa", "HI!10##########", "..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410411a44444444104444444410411aa" + "'", str3, "44444444104444444410411a44444444104444444410411aa");
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", "11                                                                                         11111111                                                                                         1  ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                hi!                                                                 ", "4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                hi!                                                                 " });
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!iH ", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iH " + "'", str3, "!iH ");
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#################################################################################################", "4444444444", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################################################################################################" });
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("0404HI!...    ......    ......  ", (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404HI!...    ......    ......  " + "'", str3, "0404HI!...    ......    ......  ");
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010" + "'", str1, "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi10101000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010");
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010HI!101010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010HI!101010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010HI!101010");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444", "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H00H00H00H00H00H00H00H00H              144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00H00H00H00H00H00H00H00H              144I!144I!4I!" + "'", str1, "H00H00H00H00H00H00H00H00H              144I!144I!4I!");
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...44400h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44400h00h" + "'", str1, "...44400h00h");
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!ih40");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih40" + "'", str1, "!ih40");
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!IH10HI!10HI!HI!010HI!10HI!HI!", "   00H00H00H00H00H00H00H0                                                ########################   #########################                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 150 + "'", int2 == 150);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                             ...", 90, 88);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             ..." + "'", str3, "                             ...");
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "...h!i...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00H", "000H", "000H", "000H", "000H", "000H", "000H", "000H", "000H", "000H", "0" });
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        int int1 = org.apache.commons.lang3.StringUtils.length("01 0101 !");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "        1   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aa4a4hi!aa", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0H!" + "'", str1, "0H!");
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        int int1 = org.apache.commons.lang3.StringUtils.length("4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 167 + "'", int1 == 167);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   00h00h00h00h00h00h00h00h00h                                                                                            " + "'", str2, "                                   00h00h00h00h00h00h00h00h00h                                                                                            ");
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "                                                      0404HI!         ", 102, 200);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                      0404HI!         " + "'", str4, "                                                      0404HI!         ");
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                               000", "", "", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               000" + "'", str4, "                                               000");
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!444444!4444!  ...", "4444444hI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "  ..." });
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000000000000" + "'", str1, "00000000000000000000000000000000000");
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("10hi", 37, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!" + "'", str1, "00H!");
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...   00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   00h00h" + "'", str1, "...   00h00h");
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#####################################################################################################################################################################         00h00h00h00h00h00", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################################################################         00h00h00h00h00h00" + "'", str2, "#################################################################################################################################################         00h00h00h00h00h00");
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                     ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                     ");
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("########################   ########", "4444410411");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("4444410411", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str2, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "         1", 31, 33);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hhhhhhhh", "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10                                                                                               1010                                                                                               10hi!", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        char[] charArray10 = new char[] { 'a', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("                                       10hi!10", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("44...", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih01!ih0", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("4444410411", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny(" 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   ", charArray10);
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
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!ih40", "                                             4444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                 ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II" + "'", str2, "1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II");
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!10hi!hi!" + "'", str1, "hi!10hi!hi!");
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                      0404HI!         ", "                                             4444444444444444444444         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0", "0", "HI!" });
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1100", "00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str1, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih0", 29, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0h!i..." + "'", str3, "...0h!i...");
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("4444444  ", "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("#################################################################################################AAA", "H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##h##h##h##h##h##h##h##h##h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##h##h##h##h##h##h##h##h##h                                                                      " + "'", str1, "##h##h##h##h##h##h##h##h##h                                                                      ");
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "000H!ih!ih0Hi!0h             00000h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###00", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I " + "'", str1, "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                                                11!11!11!11!11!11!11!11!11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11!11!11!11!11!11!11!11!11" + "'", str1, "11!11!11!11!11!11!11!11!11");
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                                    144I!144I!4I!", "...44400h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00h!ih!ih0hi", "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h!ih!ih0hi" + "'", str2, "00h!ih!ih0hi");
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                 44444444444444444444444444444444444", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str3, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444", "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("01", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       10hi!10hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!10##########", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                       ", "10", "hi", "!", "10", "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       10hi!10hi!hi!" + "'", str3, "                                       10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!                                ", "   hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                " + "'", str2, "HI!                                ");
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("00h00h00h00h   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("..", 70);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("11                                                                                         11111111                                                                                         1  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11                                                                                         11111111                                                                                         1" + "'", str1, "11                                                                                         11111111                                                                                         1");
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", "h00h00h00h00h00h00h00h00", 57);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            " + "'", str4, "            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ");
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                               000                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               000                                               " + "'", str1, "                                               000                                               ");
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 4444444444444444444444         1", "141414444444414444144444444144441444141414", 138);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10HI! 1010 10                                                                                                 AAA", "0H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10HI! 1010 10                                                                                                 AAA" });
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                 AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 AAA" + "'", str1, "                                                                                                 AAA");
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0404HI!              ..", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404HI!              .." + "'", str2, "0404HI!              ..");
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("01 0101 !ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 !ih0" + "'", str1, "01 0101 !ih0");
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                    0404HI!              ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "01 0101 !ih01");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI", "44444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str1, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                       10hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("104HI4 410104 410", ' ', 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                    144I!144I!4I!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("1011aaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1011aaaaaaaaa" });
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444410aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4444444410aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 98, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                            hi!       ..", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444410                                                                                       4444444410                                                                                       411", "0H!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("10                                                                                               1010                                            ", "                                    4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1  I 1  I  I", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444                                   ", 1, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444               ..." + "'", str3, "4444444               ...");
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("1001001001001", "01 0101 !ih01  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1001001001001" + "'", str2, "1001001001001");
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!                                4444444", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...00h00h00h00h00h00h00h00h00h ", "AA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("   11 1 11 1 11 1 11 1 11 ", "10hi! 1010 10", "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ", 740);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   11 1 11 1 11 1 11 1 11 " + "'", str4, "   11 1 11 1 11 1 11 1 11 ");
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("4444444", "h00h00h00h00h00h00h00h     1  I 1  I  I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00h00h00h00h00h00h00h00h00h", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444   ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("!4444444aaa", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.Class<?> wildcardClass10 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h00h00h00h00h00h00h00h             ", "...   0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "                                       10HI!10", "!ih40");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "            00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HI!10##########", "00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0hi!hi!", "", 4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0hi!hi!" });
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("        1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        1    " + "'", str1, "        1    ");
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              0404HI!              ...", "         1                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                              0404HI!              ..." });
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444104444444410411", 27, 176);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("        1  ", "...                                                                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("000", "00H!ih!ih0", "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "000" + "'", str4, "000");
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444" + "'", str2, "h01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("10hi! 1010 10", "######################### ########################", "10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hi! 1010 10" + "'", str3, "10hi! 1010 10");
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
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
        boolean boolean27 = org.apache.commons.lang3.StringUtils.startsWithAny("   hi!   ", strArray22);
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
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "!IH!I");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "          ...                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ", 138);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            " + "'", str2, "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ");
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0404HI!                                             ", "                                       10HI!10");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        java.lang.String[] strArray5 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', (int) '#', 3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "1");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '4');
        java.lang.String[] strArray18 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] {};
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray18, strArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "hi!", 10, (int) (short) -1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, ' ');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray12, strArray19);
        int int28 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" 0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0    0    00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0   ", strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0404hi!" + "'", str14, "0404hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 190 + "'", int28 == 190);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            " + "'", str3, "00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ");
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("144I!144444444444444444444444444444444444444444444", 'a', 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aa11401444444440144444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa1140144444444014444444" + "'", str1, "aa1140144444444014444444");
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00H!ih!ih0", 8, "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih0" + "'", str3, "00H!ih!ih0");
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 " + "'", str2, "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        int int1 = org.apache.commons.lang3.StringUtils.length("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 196 + "'", int1 == 196);
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "... ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih01!ih01", "########################   #########################");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih01!ih01" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!ih!ih01!ih01" });
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("141414444444414444144444444144441444141414", 928, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                            HI!       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!.." + "'", str1, "HI!..");
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444" + "'", str1, "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("10HI! 1010 10                                                                                                 AAA", (int) (short) 0, 190);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10HI! 1010 10                                                                                                 AAA" + "'", str3, "10HI! 1010 10                                                                                                 AAA");
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...aaa00h00h00h00h00h00h00h00h00h", 184, "hi!       ..hi!       ..hi!       .");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaa00h00h00h00h00h00h00h00h00hhi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ." + "'", str3, "...aaa00h00h00h00h00h00h00h00h00hhi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       .");
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1         4444444444444444444444                                                                 ", "0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...                                                                                  ...");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         4444444444444444444444                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "1         4444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1         4444444444444444444444" + "'", str5, "1         4444444444444444444444");
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000000000000" + "'", str1, "00000000000000000000000000000000000");
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   ", "11!11!11!11!11!11!11!11!11");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("         1", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!" + "'", str2, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!ih40        1    ", "                    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("01", "###############################################000###############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("444444444444444444444444444..");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("10", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                         000                          ", "###00##h##h##h##h##h##h#...##h##h##h#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!iH ", "00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        char[] charArray16 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("", charArray16);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly("        1  ", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly("    !ih!i", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly("   0", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h00h00h00h00h00h00h00h     1  I 1  I  I", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("10");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "h00h00h00h00h00h00h00h             ", 197, 5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("          ...", strArray11, strArray14);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#');
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.split("", '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("!ih!ih01!ih01", strArray11, strArray24);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                               00", strArray3, strArray24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str4, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          ..." + "'", str19, "          ...");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!ih!ih01!ih01" + "'", str25, "!ih!ih01!ih01");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                                                                               00" + "'", str26, "                                                                                                               00");
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("444444444444444444444444444...", "1                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("         44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10hi 1010 10", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("!ih!i", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("                                                                         000                          ", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("######################### ########################", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', ' ', ' ' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("00h!ih!ih0hi", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("0hi!hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...", "00h!ih!ih0hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("00000000000000000000000000000000000", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000" + "'", str2, "00000000000000000000000000000000000");
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0404HI!...    ......    ......  ", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404HI!...    ......    ......  " + "'", str2, "0404HI!...    ......    ......  ");
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!                                ", "                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                " + "'", str2, "HI!                                ");
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone("", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone("        1    ", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!", "aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10hi", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("h00h00h00h00h00h00h00h00h", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H00H00H00H00H00" + "'", str1, "00H00H00H00H00H00H00H00H00");
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih01!ih0", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih01!ih0" });
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "1  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                    ", "00H!ih!ih0Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                       10HI!10", "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih", 2, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih" + "'", str4, "  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10HI!10", "        1    ", "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I0HI!I0" + "'", str3, "I0HI!I0");
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...00h00h00h00h00h00h00h00h00h ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!" + "'", str2, "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", ' ', 190);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!444444!4444!  ...", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str1, "                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11" + "'", str1, "1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11");
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("0404hi!444444444444444444444444444444444444444444444", "!IH10HI!10HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!444444444444444444444444444444444444444444444" + "'", str2, "0404hi!444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                               ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("00H!ih!ih0Hi!          00H!ih!ih0Hi!          ", "                                               000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444104444444410411a44444444104444444410411aa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("0h00h...44400h00h...4...44400h00h...44400h00h...44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "44444444104444444410444444441044444!ih!ih01!i", "                                              0404HI!              ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", "                                    4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" + "'", str2, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!IH10HI!10HI!HI!010HI!10HI!HI!", "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444" + "'", str2, "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i", "hhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i" + "'", str2, "                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i");
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("     00H!i", "   11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str1, "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("100", "44444444444444444444444444444444444");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 ", strArray4);
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00h00h00h00h   ", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "100" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00h00h00h00h   " + "'", str7, "00h00h00h00h   ");
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                               " + "'", str1, "                                                                                                               ");
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("00h00h00h00h             ", "aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("001001001001001001001001001001001001", 651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "001001001001001001001001001001001001" + "'", str2, "001001001001001001001001001001001001");
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            00H00H00H00H00H00H00H00H00H            ", "I0HI!I0", 198);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!", "                                    4444444", "                                                                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("   4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("100100100100", "     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100100100100" + "'", str2, "100100100100");
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11", "                ########################   #########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01                                                                                                     ", 70, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("Aa", "H00h00h00h00h00h00h00h00h              1  I!1  I! I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                                                                                               00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAA", "###00", 105);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAA" });
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444aaa", "#######  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444aaa" });
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("10hi 1010 1", "444444    ", "00h!ih!ih0hi", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10hi 1010 1" + "'", str4, "10hi 1010 1");
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444410aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                  HI!                                                                 ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("014444444444!!!!!!!!!!!", "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "014444444444" + "'", str2, "014444444444");
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                     ", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                              ", "######################### ########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              " + "'", str2, "                                                                              ");
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", "          1 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                              0404HI!              ...", "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444410                                                                                               1010                                                                                               10HI!44", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("!iH", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444                                                                                           ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("aa11401444444440144444444", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("144I!1", "   ..   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("         44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "         44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("4I4                                44444444144441444444441444414444I4                                44444444144441444444441444414444I4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("00H00H00H00H   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H" + "'", str1, "00H00H00H00H");
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        char[] charArray7 = new char[] { '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("            00H00H00H00H00H00H00H00H00H             ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("11                                                                                         11111111                                                                                         1  ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 98 + "'", int8 == 98);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("     00H!i", "00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                       10hi!10hi!hi!", "!IH!I", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                       10hi", "10hi", "hi" });
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih10hi!10hi!hi!010hi!10hi!hi!", (int) '#', "aaaaaaaaaa1a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa" + "'", str3, "!ih10hi!10hi!hi!010hi!10hi!hi!aaaaa");
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444", "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa000", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih0", "h00h00h00h00h00h00h00haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", "", "144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I " + "'", str3, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("              44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444", "0404hi!444444444444444444444444444444444444444444444                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444" + "'", str2, "              44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     00H!i", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##h##h##h##h##h##h#...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "         1");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (short) 100, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("40        1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00hi!00hi!00hi!00hi!00hi!00hi!  ...", "...44400h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!00hi!00hi!00hi!00hi!00hi!  ..." + "'", str2, "00hi!00hi!00hi!00hi!00hi!00hi!  ...");
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih!ih0");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("...0h!i...", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 75");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "ih", "!", "ih", "0" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            00h00h00h00h00h00", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "00h00h00h00h00h00" });
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!", "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00", 96);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", "H00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H" });
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 15, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) '#', 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 88, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("0000000000000000000000000000000000000000000000000000000000000000000000", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0hi 1010 10", "10hi!10hi!hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                              ", strArray9, strArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("1", strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str10, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                              " + "'", str14, "                              ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0hi 1010 10" + "'", str16, "0hi 1010 10");
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                0!IH!IH01!IH010!IH!IH01!IH01HI!HI!                                0!IH!IH01!IH010!IH!IH01!IH01HI!HI!                                " + "'", str1, "HI!                                0!IH!IH01!IH010!IH!IH01!IH01HI!HI!                                0!IH!IH01!IH010!IH!IH01!IH01HI!HI!                                ");
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("...                                                                                  ...", "00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   11 1 11 1 11 1 11 1 11 ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   11 1 11 1 11 1 11 1 11 " + "'", str3, "   11 1 11 1 11 1 11 1 11 ");
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                     44444444444444AAA                                    44444444444444AAA                                    444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("0404HI!", "...aaa                           ...aaa             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("144I!1    ..", "10hi! 1010 10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444" + "'", str1, "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "         00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0" + "'", str2, "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0");
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                hi!                                                                 ", "###00###00###00###00###00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###00###00###00###00###00" + "'", str2, "###00###00###00###00###00");
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                              0404HI!                                               ", "100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00h00h00h00h00h00h00h00h00h             ", 41, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h             4" + "'", str3, "00h00h00h00h00h00h00h00h00h             4");
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444410                                                       ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                          HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                           ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("########################00H", "                                            00H!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              ", "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              " + "'", str3, "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              ");
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        char[] charArray10 = new char[] { '4', ' ', ' ', ' ' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10hi 1010 10", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("!ih!i", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("                                                                         000                          ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("1                                                       ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', ' ', ' ', ' ' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("100", "44444444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                                                 4444444444444444444444         1");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "100" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H!ih!ih000H!ih!ih00...", "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444", "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", 186);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                           0!ih!ih01!ih010!ih!ih01!ih01hi!0000                                                                            " + "'", str2, "                                                                           0!ih!ih01!ih010!ih!ih01!ih01hi!0000                                                                            ");
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444410                                                                                       ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410                                                                                       " + "'", str2, "4444444410                                                                                       ");
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 AAA", "!ih!ih01!ih0", 32);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                      ###00                      ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                 AAA" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 " + "'", str1, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0404HI!              ...", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "144I41");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "                                       10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("144I!1", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str4, "144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa", "44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H00h00h00h00h00h00h00h00h                                                                      ", "                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                            HI!       ..                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                            hi!       ..                                                                                            " + "'", str1, "                                                                                            hi!       ..                                                                                            ");
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                            00H!i", 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            00H!i" + "'", str3, "                                            00H!i");
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii          1 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a0aaaaaa0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!" + "'", str3, "a0aaaaaa0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a0a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00a00HI!");
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            " + "'", str2, "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ");
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("00H!IH!IH0HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH0HI!HI!H00" + "'", str1, "IH0HI!HI!H00");
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("########################", "########################00H");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("4444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!" + "'", str2, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("101011aaaaaaaaa", "...                                                                ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "101011aaaaaaaaa" + "'", str2, "101011aaaaaaaaa");
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                 4444444444444444444444         1", "      10hi 1010 10       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444" });
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!", " 11 1 11 1 11 1 11 1 11 1", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!" + "'", str3, "hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!");
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10hi", ' ', 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!                                                                                                 " + "'", str1, "Hi!                                                                                                 ");
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                                                            HI!       ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", (int) (short) 100, "!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH404000!IH4040hi!hi!0!ih10hi!10hi!hi!010hi!10hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str3, "144I!1H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                           0!ih!ih01!ih010!ih!ih01!ih01hi!0000                                                                            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" });
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                            HHHH", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         HHHH                             " + "'", str2, "                                                         HHHH                             ");
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("11#1#11#1#11#1#11#1#11#1", 102, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444" + "'", str1, "4444444");
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "aaa####################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaaaaaaaa00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAA00" + "'", str1, "AAAAAAAAAAAA00");
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("00H!IH!IH0HI", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str1, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", 0, "00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str3, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                               00h00h00h00h00h00h00h00h00h", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00h" + "'", str3, "                                                                                                               00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         " + "'", str1, "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ");
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0h00h...44400h00h...4...44400h00h...44400h00h...44", '4', 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("01 0101 !", 'a', 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1         4444444444444444444444", "!ih40        1    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("         ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ..." + "'", str2, "         ...");
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" 10                                                                                          ...", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                          ..." + "'", str2, "10                                                                                          ...");
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str1, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                    ..        0404hi!                                    ..        ", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii          1 ", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                    ..        0404hi!                                    ..        " });
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "144I41", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10" + "'", str2, "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "   0444444444", "HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...44...", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       ..." + "'", str1, "                                       ...");
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...aaa                           ...aaa             ", "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", 14, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     " + "'", str4, "...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!0404hi!0404hi!0404hi!0" + "'", str2, "hi!0404hi!0404hi!0404hi!0");
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#################################################################################################", "...44400h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("a...", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a..." + "'", str2, "a...");
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("404HI", "1         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "404HI" });
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h" + "'", str1, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 138, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                          " + "'", str3, "                                                                                                                                          ");
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00h!ih!ih0#####################################################################################################################################################################################", "HI!       ..4444444410");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("144I!144I!4I!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("            00h00h00h00h00h00", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441", "144I41", 930);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("01 0101 !ih01       ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444144444444444444444444441444444444444444444444414444444444444444444444144444444444444444444441" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                              10hi!10", "10hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI! 100", "0!IH!IH01!IH010!IH!IH01!IH01HI!", "HI!                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH" + "'", str3, "ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH");
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   " + "'", str2, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("11                                                                                         11111111                                                                                         1", "11111111                                                                                         11111111                                                                                         1  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                             4444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!", "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("000", " !ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                              0404HI!", "44444444104444444410411aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("11!11!11!11!11!11!11!11!11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11!11!11!11!11!11!11!11!1" + "'", str1, "11!11!11!11!11!11!11!11!1");
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                            4444444444444444444444         ", "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                          ", "00hi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("11111111                                                                                         11111111                                                                                         1", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa                                                                                         aaaaaaaa                                                                                         a" + "'", str3, "aaaaaaaa                                                                                         aaaaaaaa                                                                                         a");
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("h00h00h00h00h00h00h00h     1  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h00h00h00h00h00h00h00h     1  I 1  I  I" + "'", str1, "h00h00h00h00h00h00h00h     1  I 1  I  I");
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444104444444410411a44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("0hi 1010 10", '4');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                              0404HI!                                               ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                             ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "00H00H00H00H   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H   " + "'", str2, "00H00H00H00H   ");
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih10hi!10hi!hi!010hi!10hi!hi!", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("!ih!ih0", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih10hi!10hi!hi!010hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("         1", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1                                                                              " + "'", str2, "         1                                                                              ");
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                       10hi!10", "0404hi!", (int) (byte) -1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                       1", "", "", "", "1", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "1", "", "", "", "1", "" });
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!iH ", "144I!1    ..", 27);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!iH " });
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaHHHHHHHHH", "                                aaa                                ", "###########    !IH!I############", 67);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaHHHHHHHHH" + "'", str4, "aaaaaaaaaaaaaaaaaaaaHHHHHHHHH");
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", "10HI!10##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 " + "'", str2, "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "00HI!              ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I", "11                                                                                         11111111                                                                                         1  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I" + "'", str2, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I");
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1         4444444444444444444444                                                                 ", "0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...                                                                                  ...");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         4444444444444444444444                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "1         4444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("H00H00H00H00H00H00H00H             ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00H00H00H00H00H00H00H             H00H00H00H00H00H00H00H             H00H00H00H00H00H00H00H             " + "'", str2, "H00H00H00H00H00H00H00H             H00H00H00H00H00H00H00H             H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", "..        0404HI!                                    ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("144I!144I!4I!", "00h00h00h00h00h00h00h00h00h             4", 651, 25);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "144I!144I!4I!00h00h00h00h00h00h00h00h00h             4" + "'", str4, "144I!144I!4I!00h00h00h00h00h00h00h00h00h             4");
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0h00h00h#############4444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "0h00h00h#############4444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("100100100100100100100100100100100100", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444", 35, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444" + "'", str3, "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444");
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410", "                                                                    ", "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410");
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                 ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H00H00H00H", 2, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H00H00H00H" + "'", str3, "H00H00H00H");
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("AAAAAAAAAAAAAAAAA!ih!ih01!ih0", "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...44400h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                            00H!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            00h!i" + "'", str1, "                                            00h!i");
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                    ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("     H  H  H  H  H  H  H  H  H             ", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     H  H  H  H  H  H  H  H  H             " + "'", str2, "     H  H  H  H  H  H  H  H  H             ");
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("44444444104444444410411a44444444104444444410411aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("..        0404HI!                                    ..", "          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               000                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "00H!ih!ih0#####################################################################################################################################################################################");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                               000                                               " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               000                                               " + "'", str4, "                                               000                                               ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                               000                                               " + "'", str5, "                                               000                                               ");
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00" + "'", str1, "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00");
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00" + "'", str8, "00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih40");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih40" + "'", str1, "!ih40");
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         1                                                      ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         1                                                      " });
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", 102);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih01!ih0", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "                                                                    ", 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!       ..", 0, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!  " + "'", str3, "HI!  ");
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("            00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0!ih!ih01!ih010!ih!ih01!ih01hi!", "                                              0404101                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444104444444410411aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaa11401444444440144444444" + "'", str1, "aaaaaaaaa11401444444440144444444");
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHH", 7, 95);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("... ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                    0404HI!              ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                              0404hi!                                               ", "40        1    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("144I!144I!4I!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("141414444444414444144444444144441444141414", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("00h00h00h00h00h00h00h00h00h             ", charArray13);
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
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...   00h00h00h00h00h00h00h00h00h             ", "         00h00h00h00h00h00", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                 ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             4444444444444444444444         ", "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", 150);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                             4444444444444444444444         " });
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("104HI4 410104 410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "014 401014 4IH401" + "'", str1, "014 401014 4IH401");
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                ########################   #########################", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                ########################   #########################" });
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "########################00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("00h00h00h00haaa", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  00h00h00h00haaa" + "'", str2, "                                                                                  00h00h00h00haaa");
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!0!ih!ih01!ih010!ih!ih01!ih01hi" + "'", str2, "!0!ih!ih01!ih010!ih!ih01!ih01hi");
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...aaa00h00h00h00h00h00h00h00h00hhi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       ..hi!       ..hi!       .hi!       .", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 182 + "'", int2 == 182);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("10                                                                                               1010                                                                                               10hi!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("                      ###00                      ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("#######################################################################444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("I!", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("00H", "H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H" + "'", str2, "00H");
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                         000                          ", "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00", 167);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                   ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                   " });
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          " + "'", str1, "                          ");
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H!ih!ih0", "", 32, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(" 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10HI!", "                              ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10101010HI!" + "'", str3, "10101010HI!");
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("4444444                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...44400h00h", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00h00h" + "'", str2, "...00h00h");
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                    ", "10hi! 1010 10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("100", strArray3, strArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "1100");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny("100                                                                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str10, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "H00H00H00H00H00H00H00H00H000h00h00aaah00h00h00h00aaaaaah00h00h00h00aaah00h00h00h00aaah00h00h00h00aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                    ...", "101011aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                        00                                          ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                        00                                          " });
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("44444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("h00h00h00h00h00h00h00h                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444104444444410444444441044444!ih!ih01!ih", "         1                                                                                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444", "044444444", "044444444", "044444!ih!ih0", "!ih" });
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str2, "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("1  I 1  I  I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1  I 1  I  I" + "'", str1, "1  I 1  I  I");
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ", "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("10        ...", "i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                    01", "00H!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!" + "'", str2, "00H!");
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("144I!144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144i!144444444444444444444444444444444444444444444" + "'", str1, "144i!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!0404hi!0404hi!0404hi!0", "                                    ..        0404hi!                                    ..        ", "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000" + "'", str3, "0000000000000000000000000");
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444" + "'", str1, "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444");
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih", 35, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih" + "'", str3, "  00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("          ...", " ", "i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiii..." + "'", str3, "iiiiiiiiii...");
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                               000                                               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!0404hi!0404hi!0404hi!0", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "        1 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   " + "'", str2, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("i", "100100100100100100100100...", "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("            00H00H00H00H00H00H00H00H00H             ", 182);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00H00H00H00H00H00H00H00H00H             " + "'", str2, "            00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("10hi 1010 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi 1010 1" + "'", str1, "10hi 1010 1");
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!       ..hi!       ..hi!       .", "hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!       ..hi!       ..hi!       ." });
    }
}

