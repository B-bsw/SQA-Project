package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("00H!ih!ih0Hi!                                                                                                 ", "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("00H!ih!ih0Hi!                                                                                                 ", "                                              0404HI!                                               ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", 37);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10HI! 1010 10" + "'", str1, "10HI! 1010 10");
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone(" ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00H00H00H00H00H00H00H00H00H                                                                      ", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H00H00H00H00H00H                                                                      " + "'", str2, "00H00H00H00H00H00H00H00H00H                                                                      ");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10HI! 1010 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("            00h00h00h00h00h00h00h00h00h            ", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("4444444410                                                                                       ", "h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!ih10hi!10hi!hi!010hi!10hi!hi!", "h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("         1", "     00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("H", "..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                    ", "0404hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0000000000000000000000000000000000000000000000000000000000000000000000", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        char[] charArray9 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                 ", "0000000000000000000000000000000000000000000000000000000000000000000000", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" 11 1 11 1 11 1 11 1 11 1", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 11 1 11 1 11 1 11 1 11 1" + "'", str2, " 11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("00h00h00h00h00h00h00h00h00h             ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h             " + "'", str2, "00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h00h00h00h00h00h00h00h             ", "                                                                                                 AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" 144i!144i!4i!", "                                              0404HI!                                               ", 651, 138);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " 144i!144i!4i!                                              0404HI!                                               " + "'", str4, " 144i!144i!4i!                                              0404HI!                                               ");
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("   0", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0                                                                                                 " + "'", str2, "                                                                                                   0                                                                                                 ");
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" 144i!144i!4i!", " 1                                                                                               ", " 144I!144I!4I!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                    ...", " 11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                       10hi!10", "144I!1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144I!1" + "'", str2, "144I!1");
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        1   ", "!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("            00H00H00H00H00H00H00H00H00H            ", "                              11", 196);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "            00H00H00H00H00H00H00H00H00H            " });
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih01!ih", "...aaa00h00h00h00h00h00h00h00h00h", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("11", 72, "                                              0404HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   11                                   " + "'", str3, "                                   11                                   ");
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10HI! 1010 10", "1100", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10HI! 1010 10" });
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0404hi!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                               10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                               10" + "'", str1, "                                                                                               10");
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1         4444444444444444444444", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1", 96, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1                                                                                               " + "'", str3, "1                                                                                               ");
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#0404HI!##", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404HI!" + "'", str2, "0404HI!");
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444         1", 148);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444         1                                                                                                                    " + "'", str2, "4444444444444444444444         1                                                                                                                    ");
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1    " + "'", str1, "1    ");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                 4444444444444444444444         1", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                 4444444444444444444444         1" });
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444444444444", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("         1                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("   4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih!ih01!ih010!ih!ih01!ih01hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("0404HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00H!ih!ih0Hi!                                                                                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("   0", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 27, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!                                ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!                                                                 " + "'", str2, "                                HI!                                                                 ");
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444444", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "####", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("1         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1         " + "'", str1, "1         ");
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("10HI! 1010 10", "                                                                                                 AAA", 96, 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10HI! 1010 10                                                                                                 AAA" + "'", str4, "10HI! 1010 10                                                                                                 AAA");
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("100                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100                                                                                              " + "'", str1, "100                                                                                              ");
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        java.lang.String[] strArray4 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) '#', 3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                               10");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 192, 98);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!" + "'", str22, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("            00h00h00h00h00h00", "                                               000                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  ", "        1   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444    ", "0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444    " + "'", str2, "444444    ");
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00" + "'", str2, "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00");
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("        1    ", "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("            00h00h00h00h00h00", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "!ih!ih01!ih010!ih!ih01!ih01hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                                              0404HI!                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("   00H00H00H00H00H00H00H00H00H             ", "        1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   00H00H00H00H00H00H00H00H00H             " + "'", str2, "   00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                HI!                                                                 ", 29, "44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                HI!                                                                 " + "'", str3, "                                HI!                                                                 ");
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                              0404HI!", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!" + "'", str2, "                                              0404HI!");
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa", "          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     00H!i", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "     ", "", "", "", "", "" });
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100100100100100100100100100100100100");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "100100100100100100100100100100100100" });
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str1, "!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                       10HI!10");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10                                                                                               1010                                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("!ih!ih01!ih01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", ' ');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444410", "HI!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410" + "'", str2, "4444444410");
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00H!ih!ih0", 0, "..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih0" + "'", str3, "00H!ih!ih0");
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444   ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444   " + "'", str2, "444444   ");
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("...aaa00h00h00h00h00h00h00h00h00h", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa00h00h00h00h00h00h00h00h00h" + "'", str2, "...aaa00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("00H!ih!ih0Hi!                                                                                     ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0Hi!                                                                                     " + "'", str2, "00H!ih!ih0Hi!                                                                                     ");
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 191);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("00H!ih!ih0Hi!                                                                                     ", "00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0Hi!                                                                                     " + "'", str2, "00H!ih!ih0Hi!                                                                                     ");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("!IH10HI!10HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih40" + "'", str3, "!ih40");
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("11 1 11 1 11 1 11 1 11 1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00H!ih!ih0Hi!                                                                                                 ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", " 1                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("01                                                                                               ", 46, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("        1   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        1   " + "'", str1, "        1   ");
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("100100100100100100100100100100100100", "10HI! 1010 10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                HI!                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("          ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               000                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "00H!ih!ih0#####################################################################################################################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (byte) 1, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                               000                                               " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               000                                               " + "'", str4, "                                               000                                               ");
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("            00h00h00h00h00h00h00h00h00h             ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                 44444444444444444444444444444444444", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 444444444444444444444444444..." + "'", str2, "                                                                 444444444444444444444444444...");
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HHHHHHHHH", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih!ih01!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih" + "'", str1, "!ih!ih01!ih");
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("########################   #########################", (int) (byte) -1, "00h00h00h00h   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################   #########################" + "'", str3, "########################   #########################");
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", "#0404HI!##", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!" + "'", str1, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 0, "          1 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "10HI! 1010 10                                                                                                 AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00H!ih!ih0", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "1100");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 4444444444444444444444         1", "00h00h00h00h00h00h00h00h00h             ", 196);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("000", 1, "10hi!10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000" + "'", str3, "000");
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                ########################   #########################", 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                ########################   #########################                                 " + "'", str2, "                                                ########################   #########################                                 ");
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444  " + "'", str1, "4444444  ");
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("10                                                                                               1010                                                                                               10hi", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       10hi!10hi!hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "44444444", 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                       ", "10", "hi", "!", "10", "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("0000000000000000000000000000000000000000000000000000000000000000000000", strArray3, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0404hi!", 13, 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str8, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "00hi!" + "'", str13, "00hi!");
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "aaaaaaaaaa1a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...", "00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          1 ", "        1    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          1 " + "'", str2, "          1 ");
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(".", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "00H00H00H00H00H00H00H00H00H                                                                      ", "0hi!10hi!hi!", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("01                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  ", "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00H!ih!ih0", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                ########################   #########################                                 ", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "100" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100" + "'", str4, "100");
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4444444410                                                       ", "44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!                                ", "44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                " + "'", str2, "HI!                                ");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("01                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ih!ih0#####################################################################################################################################################################################", "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", '#', 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                                                                                                              10hi!10", "                                       10HI!10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("00H", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444104444444410411", 72, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                 aaa", "                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!IH10HI!10HI!HI!010HI!10HI!HI!", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!" + "'", str4, "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!");
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "444444   ", 27, 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00hi!" + "'", str10, "00hi!");
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 148, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444         1" + "'", str1, "4444444444444444444444         1");
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("100");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 aaa", strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444444444444444444444         1                                                                                                                    ", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "100" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4444444444444444444444         1                                                                                                                    " + "'", str8, "4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...   00h00h00h00h00h00h00h00h00h             ", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h             " + "'", str2, "0h00h00h             ");
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("            00h00h00h00h00h00h00h00h00h             ", "!ih!ih01!ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                              10hi!10", "...00h00h00h00h00h00h00h00h00h ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                              10hi!10" + "'", str2, "                                                                                                                                                                                              10hi!10");
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...00h00h00h00h00h00h00h00h00h ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444   ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444   " + "'", str2, "4444444   ");
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                HI!                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00h00h00h00h00h00h00h00h                                                                      " + "'", str1, "H00h00h00h00h00h00h00h00h                                                                      ");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10hi! 1010 10", "00h00h00h00h00h00h00h00h00", 651);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1", "i! 1", "1", " 1" });
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" + "'", str2, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444441");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444441" + "'", str1, "444444441");
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00", "10                                                                                               1010                                                                                               10hi!", (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10", "1    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!" + "'", str2, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                                                                                                                                                                              10hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("10hi!10hi!hi!", "!ih!ih0", "        1    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 2, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10   ", "10   10   ", "10" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             " + "'", str2, "             ");
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...   00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   00h00h00h00h00h00h00h00h00h" + "'", str1, "...   00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                              0404HI!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!" + "'", str2, "                                              0404HI!");
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("H00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00h00h00h00h00h00h00h00h" + "'", str1, "H00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "                                       10hi!10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("00h00h00h00h00h00h00h00h00", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00" + "'", str2, "00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!", "144i!144i!4i!", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "         1");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', (int) (short) 100, (int) (byte) -1);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0hi 1010 10", " 144I!144I!4I!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("4444444   ", strArray5, strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4444444   " + "'", str13, "4444444   ");
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "########################   #########################", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("10HI! 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi! 1010 10" + "'", str1, "10hi! 1010 10");
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("########################   #########################", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################   #########################" + "'", str2, "########################   #########################");
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "!IH10HI!10HI!HI!010HI!10HI!HI!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444", 3, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444" + "'", str3, "44444444");
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("h00h00h00h00h00h00h00h00h", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str2, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("4444444410                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("10                                                                                               1010                                                                                               10HI!", " ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 105 + "'", int3 == 105);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00", "########################00");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                              0404HI!                                               ", "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str1, "10                                                                                               1010                                                                                               10hi!");
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138 + "'", int1 == 138);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    " + "'", str2, "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ");
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        int int1 = org.apache.commons.lang3.StringUtils.length("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138 + "'", int1 == 138);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("00h00h00h00h   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10                                                                                               1010                                            ", 50, "44444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                            " + "'", str3, "10                                                                                               1010                                            ");
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("000", "         1", 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih!ih01!ih010!ih!ih01!ih01hi!", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "000" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str8, "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "000" + "'", str10, "000");
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", "11");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("                                              0404HI!                                               ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                               00h00h00h00h00h00h00h00h00h", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00h" + "'", str2, "                                                                                                               00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("100                                                                                              ", 186, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            100                                                                                                                                           " + "'", str3, "                                            100                                                                                                                                           ");
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("44444444", "4444444410                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("100", "H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "100" });
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aa", 29, 70);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aa" + "'", str3, "aa");
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "!iH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" });
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  ", "...   00h00h00h00h00h00h00h00h00h             ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("00h00h00h00h00h", "444444                                    ..444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 105);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   " });
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 46, "00H!ih!ih0Hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih0Hi!          00H!ih!ih0Hi!          " + "'", str3, "00H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410                                                                                       4444444410                                                                                       411" + "'", str1, "4444444410                                                                                       4444444410                                                                                       411");
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                                                                                                              10hi!10");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", 14, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str3, "h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "         1", (int) (short) 0, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44444444444444444444444444444444444                                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("00H!ih!ih0#####################################################################################################################################################################################", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                              0404hi!                                               ", "!ih!ih01!ih", "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404101                                               " + "'", str3, "                                              0404101                                               ");
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1         ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444410                                                                                               1010                                                                                               10HI!44", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                 4444444444444444444444         1", "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str2, "                                                                 4444444444444444444444         1");
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("          ...", 8, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ..." + "'", str3, "  ...");
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("01                                                                                               ", "########################   #########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10HI!", "1    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", "4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444" + "'", str2, "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 196, "                                                                                    144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         " + "'", str3, "                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ");
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 7, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str3, "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                   0                                                                                                 ", "                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0                                                                                                 " + "'", str2, "                                                                                                   0                                                                                                 ");
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih" + "'", str1, "44444444104444444410444444441044444!ih!ih01!ih");
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaa" + "'", str1, "Aaa");
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                               ", 37, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "... ..." + "'", str3, "... ...");
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 11 1 11 1 11 1 11 1 11 1", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 11 1 11 1 11 1 11 1 11 1" + "'", str2, " 11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10                                                                                               1010                                                                                               10HI!", (int) '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str3, "10                                                                                               1010                                                                                               10HI!");
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("             ", " 144i!144i!4i!                                              0404HI!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("0404hi!", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!" + "'", str2, "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str2, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!", 96, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!" + "'", str3, "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00h00h00h00h", "00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h" + "'", str2, "00h00h00h00h");
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00h00h00h00h00h00h00h00h" + "'", str1, "H00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(" 144i!144i!4i!                                              0404HI!                                               ", "H00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!IH!IH01!IH010!IH!IH01!IH01HI!" + "'", str1, "0!IH!IH01!IH010!IH!IH01!IH01HI!");
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("100                                                                                              ", "..", "!ih!ih01!ih01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!", "HI!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!" + "'", str2, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                 ", "4444444   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" 1                                                                                               ", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00h00h00h00h00h00h00h00h00h             ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!" + "'", str2, "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!", "                                                                                                 AAA", 35);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("10", 29, "0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000010" + "'", str3, "00000000000000000000000000010");
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00H!ih!ih0Hi!                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!ih!ih0Hi!" + "'", str1, "00H!ih!ih0Hi!");
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                              ", "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "     00H!i");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 133, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 27, 192);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444104444444410411", (int) ' ', "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410411aaaaaaaaa" + "'", str3, "44444444104444444410411aaaaaaaaa");
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "i", "!" });
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                              0404HI!              ...");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H", "                                    ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H" + "'", str2, "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("         1", "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!" + "'", str1, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("00H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00H!ih!ih0Hi!", " 144I!144I!4I!", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H!ih!ih0Hi!" });
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00H!ih!ih0Hi!", "4444444410                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                              11", "444444    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              11" });
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny(" 144I!144I!4I!", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                   ", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("H00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h00h00h00h00h00h00h00h00h                                                                      " + "'", str1, "h00h00h00h00h00h00h00h00h                                                                      ");
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00h00h00h00haaa", "00H!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00haaa" + "'", str2, "00h00h00h00haaa");
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "         1                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44...", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44..." + "'", str3, "44...");
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                    ...", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                    ..." });
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI" + "'", str1, "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", "                                              0404HI!              ...", 145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", "                                    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str2, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                              10hi!10", "H", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                              10hi!10" });
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("10hi!10", "        1    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("     ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 44444444444444444444444444444444444", "        1 ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "10", (int) '4', 10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444", strArray5, strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi 1010 10", "00h", (int) (byte) -1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("00h", strArray5, strArray17);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "00HI!");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44444444444444444444444444444444444" + "'", str13, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "10hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00h" + "'", str18, "00h");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "10hi 1010 1" });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10hi 1010 1" + "'", str22, "10hi 1010 1");
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!" + "'", str2, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("            00h00h00h00h00h00", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00" + "'", str2, "            00h00h00h00h00h00");
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih!ih01!ih", "          1 ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("H00h00h00h00h00h00h00h00h", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00h00h00h00h00h00h00h00h                                                                      " + "'", str2, "H00h00h00h00h00h00h00h00h                                                                      ");
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444444   ", "00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444   " + "'", str2, "444444   ");
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44444444", "                                                ########################   #########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444" + "'", str2, "44444444");
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "1         4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                               00h00h00h00h00h00h00h00h00h", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                               00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "10HI! 1010 10");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAA", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                ########################   #########################                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("4444444410                                                                                       ", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("     H  H  H  H  H  H  H  H  H             ", "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     H  H  H  H  H  H  H  H  H             " + "'", str2, "     H  H  H  H  H  H  H  H  H             ");
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 0, 46);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...00h00h00h00h00h00h00h00h00h ", "10hi!10", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...", " " });
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "########################   #########################", "00H", 105);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444", "                ########################   #########################", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("   00H00H00H00H00H00H00H00H00H             ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00H!ih!ih0Hi!          00H!ih!ih0Hi!          ", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0Hi!          00H!ih!ih0Hi!          " + "'", str2, "00H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Aaa", "10                                                                                               1010                                                                                               10HI!", "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Aaa" + "'", str3, "Aaa");
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                               00h00h00h00h00h00h00h00h00", "                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" ", "            00H00H00H00H00H00H00H00H00H            ", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!", "!IH10HI!10HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!" + "'", str2, "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!");
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        java.lang.String[] strArray0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                                   0                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444                                                                                           ", "     00H!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00000000000000000000000000000000000", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00000000000000000000000000000000000" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00000000000000000000000000000000000" });
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                              11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              11" + "'", str1, "                              11");
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444104444444410444444441044444!ih!ih01!ih", "11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih" + "'", str2, "44444444104444444410444444441044444!ih!ih01!ih");
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str2, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               " + "'", str2, "                                                                                                               ");
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                               000                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("144I!144I!4I!", "                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00H!ih!ih0Hi!                                                                                     ", 27, "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih0Hi!                                                                                     " + "'", str3, "00H!ih!ih0Hi!                                                                                     ");
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih00..." + "'", str2, "H!ih!ih000H!ih!ih00...");
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                              0404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              0404HI!" + "'", str1, "                                              0404HI!");
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                 444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444..." + "'", str1, "444444444444444444444444444...");
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...   00h00h00h00h00h00h00h00h00h", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         " + "'", str1, "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!iH", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH " + "'", str2, "!iH ");
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("10                                                                                          ...", 96, "            00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 10                                                                                          ..." + "'", str3, " 10                                                                                          ...");
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("11", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        int int1 = org.apache.commons.lang3.StringUtils.length("4444444410                                                       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str2, "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                              10hi!10", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "00H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444" + "'", str1, "4444444");
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00H!ih!ih0#####################################################################################################################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0#####################################################################################################################################################################################" + "'", str2, "00H!ih!ih0#####################################################################################################################################################################################");
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444104444444410411");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "001001001001001001001001001001001001" + "'", str1, "001001001001001001001001001001001001");
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "10", (int) '4', 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", strArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 3, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00H", ' ', 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0!ih!ih01!ih010!ih!ih01!ih01hi!", "######################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0!ih!ih01!ih010!ih!ih01!ih01hi!" });
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h                                                                      " + "'", str2, "h00h00h00h00h00h00h00h00h                                                                      ");
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("100", "00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h" + "'", str2, "00h00h00h00h");
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H00H00H00H00H00H" + "'", str1, "00H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444                                                                                           ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                                                                               10", (int) (byte) 0, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444" });
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("h00h00h00h00h00h00h00h00h                                                                      ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("444444441", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00", strArray4, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0hi 1010 10", "            00h00h00h00h00h00h00h00h00h            ", 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", strArray8, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00" + "'", str9, "00");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str14, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00hi!" + "'", str15, "00hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                               000                                               ", "44444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("10                                                                                          ...", "00h", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000", 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10                                                                                          ..." + "'", str4, "10                                                                                          ...");
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0!IH!IH01!IH010!IH!IH01!IH01HI!", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0!IH!IH01!IH010!IH!IH01!IH01HI!" + "'", str3, "0!IH!IH01!IH010!IH!IH01!IH01HI!");
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("00H!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "                                                                                                 AAA", "                                              0404101                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hI!", 98, "!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!" + "'", str3, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!");
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("100                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   ", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  ", 191, "     00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI" + "'", str3, "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI");
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        char[] charArray9 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("     H  H  H  H  H  H  H  H  H             ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("444444   ", "00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1", "");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("H00H00H00H00H00H00H00H00H", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("1100", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 99 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "H00H00H00H00H00H00H00H00H" });
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444410", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410" + "'", str2, "4444444410");
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H" + "'", str1, "00H");
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("h00h00h00h00h00h00h00h             ", "!ih!ih01!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("          ", "00H!ih!ih0Hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih40", "        1    ", 104, 37);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih40        1    " + "'", str4, "!ih40        1    ");
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              0404101                                               ", "                                                                                                                                                                                                    ", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                              0404101                                               " });
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("01 0101 !ih01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("100I0100I00I0", "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00H!ih!ih0Hi!          00H!ih!ih0Hi!          ", "aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi!10", "                                       10hi!10");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                              0404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              0404HI!" + "'", str1, "                                              0404HI!");
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa" + "'", str1, "aa");
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00H!ih!ih0", "4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0" + "'", str2, "00H!ih!ih0");
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("00000000000000000000000000010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444444444444                                                                                                              ", "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("144I!144I!4I!", "  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144I!144I!4I!" + "'", str2, "144I!144I!4I!");
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444104444444410411", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411" + "'", str2, "44444444104444444410411");
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "10HI! 1010 10                                                                                                 AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("   ", "!", "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   " + "'", str4, "   ");
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00HI!", "!ih!ih01!ih01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!" + "'", str2, "00HI!");
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("10");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "h00h00h00h00h00h00h00h             ", 197, 5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("          ...", strArray5, strArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "          ..." + "'", str13, "          ...");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("00h00h00h00h00h", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h" + "'", str2, "00h00h00h00h00h");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                ########################   #########################", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                ########################   #########################" + "'", str3, "                ########################   #########################");
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("00HI!", "                                            00H!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0404hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!                                             " + "'", str2, "0404hi!                                             ");
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                              0404101                                               ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H00H00H00H00H00H00H00H00H");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H00H00H00H00H00H00H00H00H" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00H00H00H00H00H00H00H00H" + "'", str2, "H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", "... ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("H!ih!ih000H!ih!ih00...", "10hi 1010 10", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00..." + "'", str3, "H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...");
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("00H!ih!ih0Hi!                                                                                                 ", "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1         ", "...   00h00h00h00h00h00h00h00h00h", "1");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                   ", (int) ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "4444444   ", 35, 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 22, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("100", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("     ", "AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("100", strArray2, strArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str1, "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("HI!                                ", "0!ih!ih01!ih010!ih!ih01!ih01hi!", 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                " + "'", str3, "HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                ");
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  ...", (int) ' ', "!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!  ...!ih10hi!10hi!h" + "'", str3, "!ih10hi!10hi!  ...!ih10hi!10hi!h");
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0hi!10hi!hi!", "######################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h             " + "'", str2, "00h00h00h00h             ");
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h00h00h00h00h00h00h00h00h", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str1, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("00H!ih!ih0#####################################################################################################################################################################################", "00000000000000000000000000000000000", "001001001001001001001001001001001001");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                              10hi!10", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("00HI!", (int) (byte) 0, 186);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00HI!" + "'", str3, "00HI!");
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444410                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410" + "'", str1, "4444444410");
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!                                ", "..", 46, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!       .." + "'", str4, "HI!       ..");
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!ih10hi!10hi!  ...!ih10hi!10hi!h", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!  ...!ih10hi!10hi!h" + "'", str2, "!ih10hi!10hi!  ...!ih10hi!10hi!h");
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H!ih!ih000H!ih!ih00...", '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("        1   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        1  " + "'", str1, "        1  ");
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "h00h00h00h00h00h00h00h00h", "h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("H00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################" + "'", str1, "######################");
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444444                                                                                                              ", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         " + "'", str2, "                         ");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("11 1 11 1 11 1 11 1 11 1", " 1                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                   ", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   " + "'", str1, "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                  ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0000000000000000000000000000000000000000000000000000000000000000000000", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                               000                                               ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################000###############################################" + "'", str3, "###############################################000###############################################");
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", "        1   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        1   " + "'", str2, "        1   ");
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        int int1 = org.apache.commons.lang3.StringUtils.length("144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410" + "'", str2, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", "        1 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              " + "'", str3, "                                                                              ");
    }
}

