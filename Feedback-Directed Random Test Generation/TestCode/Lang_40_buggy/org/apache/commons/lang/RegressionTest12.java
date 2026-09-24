package org.apache.commons.lang;

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
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("", "                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("         iHiHiHiHiHiHiH                         hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########################                             hi!      hi!      #################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("4444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!                                 H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         " + "'", str1, "         ");
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("                                                            ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            " + "'", str2, "                                                            ");
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     " + "'", str1, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ");
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " });
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("................................................................................................................................................................................................................................................................................................................................................................................................", "###### 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("########## 44444444444444444444444444444444444444 ########## 4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("###########################################################44444444444444444444444444444444444444", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h", "#########################################");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                         ", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                         " + "'", str7, "                                         ");
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", "444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih" });
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("         4");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "          ");
        int int8 = org.apache.commons.lang.StringUtils.lastIndexOfAny("#", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray7, "                        4444444444444...                        ");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("###############################################..", strArray3, strArray7);
        int int12 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray7);
        int int13 = org.apache.commons.lang.StringUtils.lastIndexOfAny("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444", strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         ", "4" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "...####...", "" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "####", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "###############################################.." + "'", str11, "###############################################..");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 99 + "'", int13 == 99);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", "             ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("44444444444444444444444444444444444444", "...####...                                                                                          ", "#################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444");
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray6);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", charArray6);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("Hi!hi!hi!h", charArray6);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray6);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("                                                  ...                                               ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "                                                                                         4444444444444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "444...####...44444");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "...444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str6, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa", "########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa");
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("####### 44444444444444444444444444444444444444 ########## 444444444", 460, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                    ####### 44444444444444444444444444444444444444 ########## 444444444                                                                                                                                                                                                     " + "'", str3, "                                                                                                                                                                                                    ####### 44444444444444444444444444444444444444 ########## 444444444                                                                                                                                                                                                     ");
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "...                            ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("4444444444444...", 76, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444...444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444...444444444444444444444444444444");
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "...4444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 263 + "'", int2 == 263);
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "444444444444444444444444444444Hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                 ", "                        h", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("###########44444444444444444444444444444444444444", "4########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("                                               !ih                 ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               !ih                 " + "'", str2, "                                               !ih                 ");
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("                                 ......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("44444444444444444444a4444444444########4444444444444444444444444444444444444444444444444444444...", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444a4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str2, "44444444444444444444a4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", "4444444444444444444 ########## 444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         " + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ");
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("!                                 H", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                 H" + "'", str2, "!                                 H");
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#" + "'", str1, "444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#");
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", '#', 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444", charArray8);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("44444444444444444444444444444444", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          ", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("444...####...444444", charArray8);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih44444", 85, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih44444" + "'", str3, "ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih44444");
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################", "444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 12, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("", "#444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("4444444444444444444444444444444444", "      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444");
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", "hi!hi!hi!h                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 886 + "'", int2 == 886);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...####...                                                                                         ", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", "!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "4444444444########4444444444444444444444444444444444444444444444444444444...", "                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("!!!!!!!!!!", "hi!                               ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("hi!       ", "44444444444hihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("!                                 H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                 H" + "'", str1, "!                                 H");
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("...####...                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("4444Hi!4444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("444444444444444444444444Hi!4444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444Hi!4444444444444444444444444" });
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str1, "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("!4hi!4hi!4hi!4hi!4hi!4hi!4", "...                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!4hi!4hi!4hi!4hi!4hi!4hi!4" });
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", 105, "444...####...44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str3, "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("hi!444444444444444444444444444444444444444444444444                h", "Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", 900, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("444...####...44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444...####...44444" + "'", str1, "444...####...44444");
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 15);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("i!hi!hi!hi!hi!hi!hi!hi!hihi!", "hi!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("...444#444444444#444444444#444444444#444444444#444444444#444444444", "H                                 !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "#################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               " + "'", str1, "                               ");
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad(" #########", 97, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #########                                                                                       " + "'", str3, " #########                                                                                       ");
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("###############################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###############################################" + "'", str1, "...###############################################");
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa" + "'", str2, "   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("444...####...444444", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("....................................................................", "########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...................................................................." });
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center(" #########                                                                                       ", (-1), '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #########                                                                                       " + "'", str3, " #########                                                                                       ");
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!                                 h");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        int int1 = org.apache.commons.lang.StringUtils.length("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1000 + "'", int1 == 1000);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", "                     444...####...44444                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444" + "'", str2, "         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########4444444444 ########## 44444444444444444444444444444444444444 ##########", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########4444444444 ########## 44444444444444444444444444444444444444 ##########" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########4444444444 ########## 44444444444444444444444444444444444444 ##########");
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str1, "...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("                        ...                        ", "################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ###########################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("444444444444444444444444444                                   iHiHiHiHiHiHiHi", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       444444444444444444444444444                                   iHiHiHiHiHiHiHi" + "'", str2, "                       444444444444444444444444444                                   iHiHiHiHiHiHiHi");
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("44444444444444444444                ", "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444                " + "'", str2, "44444444444444444444                ");
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                 4444444444444444444444444444444444", "                                                                                                    ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                 4444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 4444444444444444444444444444444444" + "'", str3, "                 4444444444444444444444444444444444");
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                        ", "!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                 H", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4444444444##44444444444444444444444444444444444444", "hi!       ", 1000);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444##44444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444##44444444444444444444444444444444444444" + "'", str4, "4444444444##44444444444444444444444444444444444444");
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                               !ih", "HI!                          444444444444hi!HI!                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 99, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444" + "'", str3, "4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444");
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...###", "444...####...44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...###" + "'", str2, "#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...###");
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("###########44444444444444444444444444444...", "...####...      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("................................................................................................................................................................................................................................................................................................................................................................................................", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("444444444#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("...####...                                                                               ", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", 0);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...####...                                                                               " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...####...                                                                               " + "'", str5, "...####...                                                                               ");
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("#################################", "", 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("hi!hi!hi!h                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi", "...                              ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("##################################", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("444444444444444444444444444444444444444a...####", "i!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444a...####" + "'", str2, "444444444444444444444444444444444444444a...####");
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4HI!4HI!4HI!" + "'", str2, "!4HI!4HI!4HI!");
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("                               ", "###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("##########", "###########################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444" + "'", str1, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444");
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray7);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...####...", charArray7);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("                                                                                         ", charArray7);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", charArray7);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("!Ih", charArray7);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("H                                 !", "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 153);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H                                 !" });
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                        h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        h" + "'", str1, "                        h");
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                        4444444444444...                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        4444444444444...                        " + "'", str1, "                        4444444444444...                        ");
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("...                               !ih                               !ih                               !ih                               !ih...", 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                               !ih                               !ih                               !ih                               !ih..." + "'", str2, "...                               !ih                               !ih                               !ih                               !ih...");
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("444...####...444444", "a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444...####...444444" + "'", str2, "444...####...444444");
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("...####...                                                                               ", "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...                                                                               " + "'", str2, "...####...                                                                               ");
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!", "Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih");
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                         ", "hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444" + "'", str2, "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("444...####...444444", strArray3);
        java.lang.String[] strArray5 = null;
        java.lang.String str6 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("....................................................................", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...................................................................." + "'", str6, "....................................................................");
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("4##########                 4444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4##########                 4444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "4##########                 4444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter(" HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "####### 44444444444444444444444444444444444444 ########## 4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("444444444444hi444444444444hi444Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih444444444444hi444444444444hi4444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("###############################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################..." + "'", str1, "###############################################...");
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai", "......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("###      ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.repeat("44444hi!", ".................................................................................................", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("####### 44444444444444444444444444444444444444 ...", 184, 679);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####### 44444444444444444444444444444444444444 ..." + "'", str3, "####### 44444444444444444444444444444444444444 ...");
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("Hi!hi!hi!h                                                                                         ", "..###############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("HI!4444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################", 879, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("444444444444hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi" + "'", str1, "444444444444hi");
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny(" aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                H!IH!IH!Ih                               ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                H!IH!IH!Ih                               " + "'", str3, "                                H!IH!IH!Ih                               ");
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("####################################################################################################", "4444444444 44444444444444444444444444444444444444 ", 663);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####################################################################################################" + "'", str4, "####################################################################################################");
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "444...####...444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("I!", "44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                     hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("###############################################..", "                                                                                              ", (int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                              ##############################################.." + "'", str4, "                                                                                              ##############################################..");
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.stripAll(strArray0);
        org.junit.Assert.assertNull(strArray1);
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("444...####...444444", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray9, 'a', (int) (byte) 100, (int) (short) 0);
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.stripAll(strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                  ", strArray5, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444444444444" + "'", str6, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH");
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("444444444444444444444444", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####### 44444444444444444444444444444444444444 ########## 444444444", "444444444444444444444444", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####### ", "44444444444444 ########## 444444444" });
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                    ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("      ", "                                !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray4);
        boolean boolean6 = org.apache.commons.lang.StringUtils.containsNone("hi!4444444444444444444444444444444444444444444444444", charArray4);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########4444444444 ########## 44444444444444444444444444444444444444 ##########", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", 8, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444..." + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                        444444444444444                        44444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444hihihihihihihihihihi", "......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType(" 4444444444  4444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "4444444444", "  ", "4444444444" });
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 105, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("hi!4444444444444444444444444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", "                                                            4444444444444...                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "444444444444444444444444444444444444444444444444", "###########", 190);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str4, "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                     !I                                      ", 910);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("A", "4444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiH", "                                                                                              ##############################################..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!", "                                                                ##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray7);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("###########################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", charArray7);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444Hi!", charArray7);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!444444444444444444444444444444444444444444444444                ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("444444444444hi", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         444444444444hi                                          " + "'", str2, "                                         444444444444hi                                          ");
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                                Hi!                                                                 ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                Hi!                                                                 " + "'", str2, "                                Hi!                                                                 ");
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                ####################################44444444444444444444444444444444444444", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                ####################################44444444444444444444444444444444444444" + "'", str3, "                                                                ####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("444444444444444444444444444444444444444444444444444444H", "                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 153 + "'", int2 == 153);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("##########", strArray3);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", strArray3);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("!IH", "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH", "####################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH");
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################", 663);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################");
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!             " + "'", str2, "            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!             ");
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("", "############################ 44444444444444444444444444444444444444 ########## 4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("44444444444hihihihihihihihihihi", 886, "4444444444##########44444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi" + "'", str3, "4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi");
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        int int1 = org.apache.commons.lang.StringUtils.length("HI!4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("                       ", "#########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 1, 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, " #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", strArray3);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("                                 ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 399 + "'", int4 == 399);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str1, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("                                                                                         4444444444444444444444444444444444", "4########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("                                                                ...", "Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("Hi                                                                              ", "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444" + "'", str1, "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444");
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("                                h!ih!ih!iH                               ", "#################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                h!ih!ih!iH                               " + "'", str2, "                                h!ih!ih!iH                               ");
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444444444444iH44444444444444444444444444444444444iH......" + "'", str1, "...4444444444444444444iH44444444444444444444444444444444444iH......");
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "###################################");
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray3);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##########", charArray3);
        boolean boolean6 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("               #                ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444#4444444444444444" + "'", str3, "444444444444444#4444444444444444");
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase(" 4444444444  4444444444", "444444444444444444444444Hi!4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                         ", "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("4444444444 44444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai", "!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai" + "'", str2, "aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai");
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                                                                              HHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                              HHHHHHHHHHHHHHHH" + "'", str1, "                                                                              HHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("###      ", 18, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###      #########" + "'", str3, "###      #########");
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("44444444444hihihihihihihihihihi ...", "                                HI!                                                                 ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("Hi!hi!hi!h", "444444444444444                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                               Hi!hi!hi!h                                ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("####################################44444444444444444444444444444444444444", "                                HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################44444444444444444444444444444444444444" + "'", str2, "####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444" + "'", str1, "########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444");
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("44444444444444444444444444444444444", 896, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444");
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("4hi!#444444444#444444444#444444444#4444...", "", "A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!#444444444#444444444#444444444#4444..." + "'", str3, "4hi!#444444444#444444444#444444444#4444...");
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        char[] charArray9 = new char[] { 'a', '#', '#', '#', '4', '4' };
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444...", charArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', '#', '#', '4', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "   #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444" + "'", str2, "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444");
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("hi!hi!hi!h                                                                                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("Hi                                                                              ", "                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 755, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str3, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("Hi                                                                              ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi                                                                              " + "'", str2, "Hi                                                                              ");
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!hi!h                                                                                         ", "HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!h                                                                                         " });
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("HI!HI!HI!", "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "###############                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih", "#######44444444444444444444444444444444444444##########4444444444", 735);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("###########################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", charArray8);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444Hi!", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsAny("...####...                                                                                          ", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("                                               !ih                 ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                        4444444444444...                        ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               " + "'", str2, "               ");
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("4##########                 4444444444444444444444444444444444##########                 ", 193, 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("              hi!      hi!             ", "                                                                                         4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("#######44444444444444444444444444444444444444##########444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######44444444444444444444444444444444444444##########444444444" + "'", str1, "#######44444444444444444444444444444444444444##########444444444");
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", ' ');
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str4, "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444...", "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", 85);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " });
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("Hi!      hi!                     44444444444444444444444444444444444", (-1), 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!      hi!                    " + "'", str3, "Hi!      hi!                    ");
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("...                                                                   ...", "44444444444444444444444444444444444444##4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                   ..." + "'", str2, "...                                                                   ...");
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("iHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHiHiHiHiHiHiHi" + "'", str1, "iHiHiHiHiHiHiHi");
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("                 44444444444444444444444444444444444", charArray8);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                         ", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                !ih", "                                Hi!                                                                 ", 680);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("###############", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                !ih" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("I!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!HI!" + "'", str1, "I!HI!HI!");
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444...", "                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444444444444444444444444444444444444444444444444444h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "...44444444444444444444444444444444444444444444444444444444444444444h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", "44444444444444", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444##########                 ", "444444##########                 ", "444444##########                 ", "444444##########                 ", "444444##########                 ", "444444##########                 ", "444444##########                 ", "444444##########                 ", "444444##########                 ", "444444" });
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################", "44444444444HiHiH                        ...                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444...", 'a', 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray7);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444##########44444444444444444444444444444444444444##########", charArray7);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("4444444444444444444444444444444444", charArray7);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsOnly("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", charArray7);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("#444444444", 11, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#4444444444" + "'", str3, "#4444444444");
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ", "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih" + "'", str2, "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("H4444444444########4444444444444444444444444444444444444444444444444444444...", "hi!", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", 18, "                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!" + "'", str3, "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##########", charArray4);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsOnly("                                ...", charArray4);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsAny("44444444444444", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "444444444444hi#                                                            HI!4HI!i444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!" });
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                                H!IH!IH!Ih                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("i!hi!hi!h", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("####################################44444444444444444444444444444444444444", 12, "                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################44444444444444444444444444444444444444" + "'", str3, "####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("                                                                                                                                                                                     Hi!", "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                               Hi!hi!hi!h                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", 968, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "", "Hi!", 663);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", "...                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H" + "'", str2, "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", "4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 604 + "'", int2 == 604);
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("iHiHiHiHiHiHiH", 315);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                    ", "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", 92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                    " });
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("                                 !", "####################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "########################...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        int int3 = org.apache.commons.lang.StringUtils.indexOf(" #########", 'a', 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("!Ih", "44444444444444444444444444444444444", 89, 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!Ih44444444444444444444444444444444444" + "'", str4, "!Ih44444444444444444444444444444444444");
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", 184, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################" + "'", str3, "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################");
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("iH!iH!iH!iH!iH!iH!iH!iH!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                        444444444444444                        44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "iH!iH!iH!iH!iH!iH!iH!iH!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("!!!!!!!!!!");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("4444444444", 'a');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444" + "'", str3, "4444444444");
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                                                                              HHHHHHHHHHHHHHHH", 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ", 921);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                 444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        " + "'", str2, "                                                                                                                                                                                                                                                 444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("!Ih", "444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Ih" + "'", str2, "!Ih");
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray3);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!", "aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!" + "'", str2, "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!");
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "###############                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("4444444444##########444444444444444444444", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "!ih444444444444                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444" + "'", str2, "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444");
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("44444444444hihihihihihihihihihi ...", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("i!hi!hi!hi!hi!hi!hi!hi!hihi!", "                                                                #################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hihi!" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hihi!");
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("aIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("HHHHHHHHHHHHHHHH", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", 73, 90);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####..." + "'", str4, "HHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("             ...", "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!                                 h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                 h" + "'", str2, "!                                 h");
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("###############################################...", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "4##########                 4444444444444444444444444444444444##########                         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("...4444444444444444444444444444444444444444444444444444444########4444444444h", "#########################H4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444444444444444444444444444444444444444########4444444444h" + "'", str2, "...4444444444444444444444444444444444444444444444444444444########4444444444h");
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########", "##########" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################################################################################################################################################################################################" + "'", str4, "########################################################################################################################################################################################################");
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!             ", "...###############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("i!hi!hi!hi", "44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                     hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("...444#444444444#444444444#444444444#444444444#444444444#444444444", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "...444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("444444444444444444444444Hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444Hi" + "'", str2, "444444444444444444444444Hi");
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("444444444444444444444444444                                   iHiHiHiHiHiHiHi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", 'a', 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", "...############################################################################################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih" + "'", str2, "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", "4hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("444444444444HI444444444444HI444IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH444444444444HI444444444444HI4444", 662);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444HI444444444444HI444IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH444444444444HI444444444444HI4444" + "'", str2, "444444444444HI444444444444HI444IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH444444444444HI444444444444HI4444");
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("####################################44444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("AAAAAAAAAA                  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("4444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ##############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 7, 900);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444" });
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", "###########################################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "...                        ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", (int) (byte) 0, 67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("4444444444##########44444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444" + "'", str1, "4444444444##########44444444444444444444");
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444" + "'", str1, "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("                               ", "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("..###############################################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", "#################################################################################################44444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         " + "'", str2, "         ");
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih");
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str1, "########################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("h##########hh##########h##########hh##########h##########hh##########h##########hh##########h##########hh##########h##########hh##########h##########hh##########h##########hh##########h##########hh##########h##########hh######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaahhhhhhhhhhhhhhhhhhhhhhhhhhhhh#################################################################", "                                                 !I                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 61, 315);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################" + "'", str1, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################");
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         " + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ");
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("...", 98, "########################...##################################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...########################...##################################...########################...####" + "'", str3, "...########################...##################################...########################...####");
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH" + "'", str3, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH");
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        int int1 = org.apache.commons.lang.StringUtils.length("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 606 + "'", int1 == 606);
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("               #                ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", "                                                                                                 ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!             ", "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                                Hi!                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("I!", "................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!" + "'", str2, "I!");
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HI", "!", "HIHI", "!" });
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ..." + "'", str1, "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...");
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("444444444444hi444444444444hi444Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih444444444444hi444444444444hi4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!       ", "#########", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean8 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray7);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEach("i!hi!hi!h", strArray4, strArray7);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str16 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ', 414, 63);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i!hi!hi!h" + "'", str11, "i!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!       " + "'", str12, "hi!       ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", " 44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("...    ...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("                                                             ", "4444444444##44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        int int2 = org.apache.commons.lang.StringUtils.countMatches(" #########                                                                                       ", "!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("#################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!          ...", "                                     !I                                      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI", '4', 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast(" 44444444444444444444444444444444444444444444444444444444444444444...", "####################################################44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("444444444444444444444444Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444Hi" + "'", str1, "444444444444444444444444Hi");
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444", "#################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("###### 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 837 + "'", int2 == 837);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("i!hi!hi!hi", 73, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################i!hi!hi!hi################################" + "'", str3, "###############################i!hi!hi!hi################################");
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("#########################", strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        int int6 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 199, " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHH" + "'", str3, " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHH");
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("                                                                ##################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################" + "'", str1, "##################################");
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("                                   ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "444444444444hi", 43);
        int int5 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        boolean boolean6 = org.apache.commons.lang.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("...####...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...####...     " + "'", str1, "...####...     ");
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", (int) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ");
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                                                                                                                                                                                                                                              44444444444444444444                ", "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########", "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("...###############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###############################################" + "'", str1, "...###############################################");
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("                                h!ih!ih!iH                               ", "......", 900);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("###########################################################################################################################################################################################################################################################################################################################", "                                                                                         ", (int) ' ');
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                       444444444444444444444444444                                   iHiHiHiHiHiHiHi", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                h!ih!ih!iH                               " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "###########################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################" + "'", str9, "###########################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                       444444444444444444444444444                                   iHiHiHiHiHiHiHi" + "'", str10, "                       444444444444444444444444444                                   iHiHiHiHiHiHiHi");
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "Hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByCharacterType("44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#                                                            HI!4HI!", strArray3, strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "   #################################################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#                                                            HI!4HI!" + "'", str6, "#                                                            HI!4HI!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4H", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("###      #########", 18, "44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###      #########" + "'", str3, "###      #########");
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("########", "####################################################");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", ' ');
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray4);
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!             ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHH", "44444444444hihihihihihihihihihi                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("!ih", "44444444444444444444444444444444444444##4444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("I!HI!HI!HI", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "########################...##################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("                                                                              HHHHHHHHHHHHHHHH", "                                                                                                                                                                                                                                              44444444444444444444                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              HHHHHHHHHHHHHHHH" + "'", str2, "                                                                              HHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("444...####...44444", 460, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa", "         iHiHiHiHiHiHiH                         hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 97, "444444 ########## 444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh444444 ########## 444444" + "'", str3, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh444444 ########## 444444");
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("hi!          ...", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("hi!hi!hi", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("###########################################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################################44444444444444444444444444444444444444" + "'", str1, "###########################################################44444444444444444444444444444444444444");
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ", "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("44444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444" });
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("###########################################################################################################################################################################################################################################################################################################################", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################" + "'", str3, "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiH", "HI!", 837);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "                 444444444444hi!");
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 10, 0);
        java.lang.String str15 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        boolean boolean16 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "##########" + "'", str15, "##########");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444##########444444444444444444444", 460, 1000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                  4444444444##########444444444444444444444" + "'", str3, "                                                                                                                                                                  4444444444##########444444444444444444444");
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", "Hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("iHiHiHiHiHiHiHi", "                                                                ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHiHiHiHiHiHiHi" + "'", str2, "iHiHiHiHiHiHiHi");
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!Ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!       ", "#########", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean8 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray7);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEach("i!hi!hi!h", strArray4, strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray13, "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", (int) (short) 0, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i!hi!hi!h" + "'", str11, "i!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!       " });
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("################################...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "################################..." });
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("I!HI!HI!", "                        4444444444444...                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!" + "'", str2, "I!HI!HI!");
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("Hi!hi!hi!", "                               !                                 h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("Hi!", "                                                                              HHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", 3, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("iHiHiHiHiHiHiH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                                HI!                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444", "!4HI!4HI!4HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444" });
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiii", "                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("hi!hi!hi!", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!" + "'", str3, "hi!hi!hi!");
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        char[] charArray8 = new char[] { 'a', '#', ' ', 'a' };
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("#########", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("                                                                                         ", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 24 + "'", int12 == 24);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444hi#                                                            HI!4HI!i444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 220 + "'", int2 == 220);
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray3);
        boolean boolean5 = org.apache.commons.lang.StringUtils.containsAny("...############################################################################################################################################...", charArray3);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAnyBut("!Ih44444444444444444444444444444444444", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "...########################...##################################...########################...####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa");
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsNone("", charArray5);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", charArray5);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("###################################", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", "", "", "", "", "", "" });
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                             ########                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "4444444444##########44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "444444444444hi#                                                            HI!4HI!i444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("HI!                          444444444444hi!HI!                          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                          444444444444hi!HI!                          " + "'", str2, "HI!                          444444444444hi!HI!                          ");
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("...             ", 663, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 564 + "'", int2 == 564);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("...4444444444444444444444444444444444444444444444444444444########4444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444444444444444444444444444444444444444444444444########4444444444H" + "'", str1, "...4444444444444444444444444444444444444444444444444444444########4444444444H");
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("             HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4H", "444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "             ", "I", "I", "I", "I", "I", "I", "I", "I", "I" });
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444...####...44444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "444444444444444                        ", (int) (short) -1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444...####...44444" });
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", "                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                        " + "'", str2, "                                                        ");
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("###############################################...", "                                                                                              ##############################################..", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###############################################..." + "'", str4, "###############################################...");
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("...####...      ", "                                 ......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...      " + "'", str2, "...####...      ");
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("########################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "########################################################################################################################################################################################################################################################################################################################..." });
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("444444444##########44444444444444444444444444444444444444##########...####...                                                                                          ...####...                                                                                          ...####...                                                                                          ...####...                                                                                          ...####...                                                                                          ...####...                                                                                          ...####...                                                                                          ...####...                                                                                          ...####...                                                                                          .", ' ', 975);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                  ...                                               ", "                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                  ...                                               " + "'", str2, "                                                  ...                                               ");
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 65, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("!ih444444444444                 ", 153);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            !ih444444444444                                                                              " + "'", str2, "                                                            !ih444444444444                                                                              ");
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "                        444444444444444                        44444", 604, 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str4, "aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########", "                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########" });
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("                                                                                                                                                                                     Hi!", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                     Hi!" + "'", str2, "                                                                                                                                                                                     Hi!");
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("##################################", 32, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################" + "'", str3, "##################################");
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str2, "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih", "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("", ".................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "................................................................................................." + "'", str2, ".................................................................................................");
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################", "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.repeat("                                #################################################################", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str1, "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########", 34, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########" + "'", str3, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("!                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("Hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str1, "hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444...####...444444");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", (int) (byte) 10, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444...####...444444" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444...####...444444" });
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ", 193);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        " + "'", str2, "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                        444444444444444                        44444", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        444444444444444                        44444" + "'", str2, "                        444444444444444                        44444");
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################", 755);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################" + "'", str2, "           #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 0);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444", "4444444444444444444 ########## 444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str1, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444##4444444444", "444444444444444444444444Hi", 102);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ");
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("#                                                            HI!4HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   #################################################################", "aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   #################################################################" });
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("hi!      ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("..###############################################", 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..###############################################" + "'", str2, "..###############################################");
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444########");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444########" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "########" });
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop(" #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " #########44444444444444444444444444444444444444444444444444444444444A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, " #########44444444444444444444444444444444444444444444444444444444444A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", 67, 564);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 101 out of bounds for length 101");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("#444444444", "                                                                              HHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#444444444" + "'", str2, "#444444444");
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!", "...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!" });
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("#################                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################" + "'", str1, "#################");
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("!ih444444444444                 ", '4', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                Hi!                                                                 ", "!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                Hi!                                                                 " });
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!444444444444444444444444444444444444444444444444                ", "   ", (int) (short) 0);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "");
        int int6 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################" + "'", str8, "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################");
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444", "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#...#...#...#...#...#...#...#...#" + "'", str3, "...#...#...#...#...#...#...#...#...#");
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", 190, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa########" + "'", str3, "########aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa########");
    }
}

