package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444" + "'", str1, "444");
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", 498);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "444444444#");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("hi!      hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################", 263);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", "                        h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains(" ", "                                                                              iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "44444444444444444444444444444444444");
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEach("44444444444444444444444444444444444", strArray6, strArray11);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("#########", strArray11);
        int int14 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray11);
        java.lang.String str16 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray11, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444a4444444444########4444444444444444444444444444444444444444444444444444444...");
        java.lang.String[] strArray17 = org.apache.commons.lang.StringUtils.stripAll(strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("           444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", 603, 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444 ########## 44444444444444444444444444444444444444 ##########", "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444 ########## 44444444444444444444444444444444444444 ##########" });
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi", 151, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi" + "'", str3, "4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi");
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                                H!IH!IH!Ih                               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("########################################################################################################################44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH", "                                Hi!                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("4444444########", "", "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", 142);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444########" + "'", str4, "4444444########");
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByCharacterType("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.replaceEach("...################################...################################...################################...################################......", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(objArray0, "                                               !ih                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "###########44444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("4444444444444444444444444##########4444444444444444444444444444444444!iH444444444444444444444444", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444aaaaaaaaaa4444444444444444444444444444444444!iH444444444444444444444444" + "'", str3, "4444444444444444444444444aaaaaaaaaa4444444444444444444444444444444444!iH444444444444444444444444");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "i", "!", "      ", "hi", "!", "                     ", "......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." });
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("...################################...################################...################################...################################......", "   hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...################################...################################...################################...################################......" + "'", str2, "...################################...################################...################################...################################......");
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("#################################################################...", "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################..." + "'", str2, "#################################################################...");
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("444444444aaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 61, "4444444444 ########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444 ########## 4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444444 ########## 4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                                HI!                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("Hi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 219);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                           " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                           ");
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                     444...####...44444                      #########################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     444...####...44444                      #########################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                     444...####...44444                      #########################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 564);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444", " #########");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444" });
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("!4HI!4HI!4HI!", "!iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                    ");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int9 = org.apache.commons.lang.StringUtils.lastIndexOfAny("44444444444444444444444444444444444", strArray3);
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "HI!HI!HI!");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("h                                 ", "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h                                 " + "'", str2, "h                                 ");
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                        4444444444444...                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("#################                                                                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("hI!HI!HI!", 680);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                               hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                               hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                     !I                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("#######44444444444444444444444444444444444444##########444444444", "                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                                                                              ##############################################..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              ##############################################.." + "'", str1, "                                                                                              ##############################################..");
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 97, 162);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444", "...####...                             ...", 184);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) (short) 10, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444" });
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", 219, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                     444...####...44444                      #########################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast(" aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "###################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa" + "'", str2, " aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                Hi!                                                                 ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("44444444444444444444444444444444!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                ", "...             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################                                               ", 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444" + "'", str4, "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("HI!4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!4444444444444444444444444444444444444444444444444" + "'", str1, "HI!4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "...aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("444444444444444                        ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444" + "'", str2, "444444444444444");
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                              iH", 32, 564);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              iH" + "'", str3, "                                              iH");
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("Hi!      hi!                     44444444444444444444444444444444444", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("...####...                             ...", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("i!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i!hi!hi!h" });
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaa                                         444444444444444444444444444444444444444a...####", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 105 + "'", int3 == 105);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                 ", (int) (short) -1, 474);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 " + "'", str3, "                 ");
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("#################", "                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##################################", "4444444444444444444444444##########4444444444444444444444444444444444!iH444444444444444444444444", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4h", "                                                                                                     Hi!hi!hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 67);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4h" + "'", str4, "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4h");
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444", 968);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " });
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        int int1 = org.apache.commons.lang.StringUtils.length("   hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48 + "'", int1 == 48);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("Hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "...################################", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("", "aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", ' ');
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!", "................................................................................................................................................................................................................................................................................................................................................................................................");
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                     ...########...                                      ", strArray5, strArray11);
        boolean boolean13 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444Hi!4444444444444444444444444", strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                     ...########...                                      " + "'", str12, "                                     ...########...                                      ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("##################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##################################" });
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("                                !ih");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("444444444444444444444444444444444444444444444444444444H", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                ", "!", "ih" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444", "                                 ......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444" + "'", str2, "AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444");
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ", "44444444444444444444444444 ##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  " + "'", str2, "                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("                       444444444444444444444444444                                   iHiHiHiHiHiHiHi", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       444444444444444444444444444                                   iHiHiHiHiHiHiHi" + "'", str2, "                       444444444444444444444444444                                   iHiHiHiHiHiHiHi");
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI" + "'", str1, "444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI");
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 57, 80);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4hi!4hi!4hi!4hi!4hi!" + "'", str3, "hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("#########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################################################################################", 663);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################################################################################" + "'", str2, "#########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################################################################################");
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444##########444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444##########444444444444444444444" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444##########444444444444444444444");
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                     ", "H4444444444########4444444444444444444444444444444444444444444444444444444...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     " + "'", str3, "                                     ");
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray4);
        int int7 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        int int9 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("                        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("...########...", "I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      " + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                    " + "'", str1, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                    ");
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("                                                                                                                                                         ", "             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                         " + "'", str2, "                                                                                                                                                         ");
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" });
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("444...####...444444", "4##########                 4444444444444444444444444444444444##########                         ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHH", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "#################                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("", "###########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("...4444444444444444444iH4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444444444444iH4444444444" + "'", str1, "...4444444444444444444iH4444444444");
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("##########");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "########");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEach("44444444444HiHiHiHiHiHiHiHiHiHi", strArray2, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray6);
        int int9 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "...####...                                                                                          " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444444HiHiHiHiHiHiHiHiHiHi" + "'", str7, "44444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "...####..." });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###########################################################################################################################################################################################################################################################################################################################", "...####...                                                                                          ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", 650, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444444444444444444444444444444444444                                         " + "'", str3, "...4444444444444444444444444444444444444444444444444444444                                         ");
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", "ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...4444444444444444444444444444444444444444444444444444444                                         ", "#!ih4#4#4#4#4#4#4#4#4#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("...44444444444444444444444444444444444444444444444444444444444444444h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...44444444444444444444444444444444444444444444444444444444444444444h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "...44444444444444444444444444444444444444444444444444444444444444444h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444" + "'", str1, "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("H4444444444########4444444444444444444444444444444444444444444444444444444...", "              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444" + "'", str1, "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad(" ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ", (int) (short) -1, "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ########## 444444444                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, " ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("i!", "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        int int10 = org.apache.commons.lang.StringUtils.lastIndexOfAny("444444444444444444444444444                                   iHiHiHiHiHiHiHi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("...#################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#################################################################" + "'", str1, "...#################################################################");
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("................................................................................................................................................................................................................................................................................................................................................................................................", 142, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("Hi!      hi!                     44444444444444444444444444444444444", "!                                 H", "...###############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!      hi!                     44444444444444444444444444444444444" + "'", str3, "Hi!      hi!                     44444444444444444444444444444444444");
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############", 399, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############" + "'", str3, "                                                                                                                                                                                                                                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############");
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("HI!4444444444444444444444444444444444444444444444444", "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!4444444444444444444444444444444444444444444444444" + "'", str2, "HI!4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "                                     !I                                      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("               ", 11, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               " + "'", str3, "               ");
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444" });
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsOnly(" ", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("444...####...444444", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("                                                                ...", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("I!HI!HI!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("44444444444HiHiH                        ...                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("#########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################################################################################" + "'", str1, "#########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################################################################################");
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi##############################", "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("A", "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                              HI!", "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              HI!" + "'", str3, "                              HI!");
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "...####...                             ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("iHiHiHiHiHiHiHi", "                                                                ...", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "iHiHiHiHiHiHiHi" });
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("           444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           " + "'", str2, "           444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ");
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                          444...                                                                                                                                                                                                                                                                                                                                           ", "aaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("#################################################################################################44444444444444444444444444444444444444444444444444444444444A", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "...#################################################################################################hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################################################################################################hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "...#################################################################################################hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("####### 44444444444444444444444444444444444444 ...");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#######", "44444444444444444444444444444444444444", "..." });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                 hi!                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 hi!                                                " + "'", str1, "                 hi!                                                ");
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("    ################################################################################################", "4444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 45);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    " });
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   #################################################################", "444444444444444444444444hi!", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   #################################################################" });
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444..." + "'", str1, "...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", " 4444444444  4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######", 886, "...####...                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                #####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######" + "'", str3, "...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                #####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 68, 112);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("...                        ", "4444444444 ########## 4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                        " + "'", str2, "...                        ");
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444", "...####...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################" });
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                 ", 'a');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 " + "'", str3, "                 ");
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("44444444444                 44444444444444444444444444444444444444444444                 ", "                                                                                                                                                                                                                               hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################", '#', 975);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 869 + "'", int3 == 869);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("                 ", "####################################################44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...####...", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("4########4444444444444444444444444444444444444444444444444444444...", charArray5);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("                     444...####...44444                      #########################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", 24, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str3, "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("444444444444444                        44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444                        44444" + "'", str1, "444444444444444                        44444");
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 869, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("4##########                 4444444444444444444444444444444444##########                 ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4##########                 4444444444444444444444444444444444##########                 " + "'", str2, "4##########                 4444444444444444444444444444444444##########                 ");
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("...4444444444444444444iH44444444444444444444444444444444444iH......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444444444444iH44444444444444444444444444444444444iH......" + "'", str1, "...4444444444444444444iH44444444444444444444444444444444444iH......");
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ", "", 16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "..." });
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###################################", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "...                               !ih                               !ih                               !ih                               !ih...");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "a4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                                                                                    ", "ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih44444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str1, "aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("#################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################" + "'", str1, "#################");
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("", "4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI", 'a');
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean10 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "44444444444444444444444444444444444");
        java.lang.String str15 = org.apache.commons.lang.StringUtils.replaceEach("44444444444444444444444444444444444", strArray9, strArray14);
        int int16 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray14);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray3, strArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44444444444444444444444444444444444" + "'", str15, "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str17, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444", "...####...444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                        4444444444444...                        ", "          ...                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." });
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, "                     444...####...44444                      ", 0, 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray6);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("", charArray6);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray6);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444##########44444444444444444444444444444444444444##########", charArray6);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("4444444444444444444444444444444444", charArray6);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                      444444444444444444444444444444444444444444444444444444H                                                                                                                                                                                                                                                                                                                                                                                                                                       ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("Hi!hi!hi!h", "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444" + "'", str2, "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444");
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("...                               !ih                               !ih                               !ih                               !ih...", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                               !ih                               !ih                               !ih                               !ih..." + "'", str2, "...                               !ih                               !ih                               !ih                               !ih...");
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str1, "...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("hi!444444444444444444444444444444444444444444444444                h", "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("4444444444", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("H                                 ", 146);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                                 " + "'", str2, "H                                 ");
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("", "h!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "###############################################...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("Hi!hi!hi!h                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("                 44444444444444444444444444444444444", charArray8);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                         ", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("...####...                             ...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("H", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           i!hi!hi!hi!hi!hi!hi!hi!hihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihih!ih!ih!ih!ih!ih!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "!ihih!ih!ih!ih!ih!ih!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        int int1 = org.apache.commons.lang.StringUtils.length("                                         444444444444hi                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa", "", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("44444hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444HI!" + "'", str1, "44444HI!");
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "                                HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny(" 4444444444  4444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                                ####################################44444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ####################################44444444444444444444444444444444444444" + "'", str2, "                                                                ####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444", "...####...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444" + "'", str2, "4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444");
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" + "'", str1, "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "                                h!ih!ih!iH                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("44444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ", "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......", 755);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......");
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi##############################", "                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!" + "'", str1, "HI!HI!HI!");
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("HI!          ...", "444444444444444444444444444                                   iHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!          ..." + "'", str2, "HI!          ...");
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             #################################################################", "444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444.....#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("####################################################I!HI!HI!HI########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty(".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "h                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("hi!          ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.split("                 4444444444444444444444444444444444", "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", (int) (short) 0);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByCharacterType("");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("", strArray6, strArray8);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8, ' ', (int) (byte) 1, 1);
        int int15 = org.apache.commons.lang.StringUtils.lastIndexOfAny("!Ih", strArray8);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                 " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444", charArray8);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("44444444444444444444444444444444", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          ", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("444...####...444444", charArray8);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("!i", charArray8);
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
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "...444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!             ", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ", "##################################", (int) (short) 1);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi###########################################################################################################################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "###################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("###############################################..", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("", "                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                  ", "...####...444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444", 802);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("44444444444444444444444444 #########", 'a');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444 #########" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444 #########" + "'", str3, "44444444444444444444444444 #########");
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str2, "...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiH", 184, 48);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#" + "'", str1, "444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#");
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("####################################################", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", 65);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "44444444444hihihihihihihihihihi                                              ", 27, 99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################################################" });
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("4", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                        ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444a4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "                 444444444444hi!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly(" 44444444444444444444444444444444444444444444444444444444444444444...", "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                                                                                                                                               hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!                                                                                                                                                                                                                                ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444...", "i!hi!hi!########## 44444444444444444444444444444444444444 ########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ", "              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ", 33, 896);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   " + "'", str4, "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ");
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444" + "'", str2, "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444");
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("44444444444hihihihihihihihihihi", "                                                                                                     Hi!hi!hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "                              HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("44444444444444444444444444444444444444##4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                              HHHHHHHHHHHHHHHH", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        int int1 = org.apache.commons.lang.StringUtils.length("                     444...####...44444                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 61 + "'", int1 == 61);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#');
        int int5 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', 100, 1);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str11, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("Hi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("hi!444444444444444444444444444444444444444444444444", "Hi!      hi!                     ", (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', 3, 735);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center(" ...                          ", 16, "4##########                 4444444Hi!      hi!                     44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ...                          " + "'", str3, " ...                          ");
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("444444444##########44444444444444444444444444444444444444##########", "                                ", 100);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444##########44444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("444444444444444444444444hi!", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444hi!" + "'", str2, "444444444444444444444444hi!");
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", 544);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ");
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!     ", 567);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("444444444444444444444444444444444444444444444444444444H", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444H" + "'", str2, "444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("#!ih4#4#4#4#4#4#4#4#4#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#!ih4#4#4#4#4#4#4#4#4#" + "'", str1, "#!ih4#4#4#4#4#4#4#4#4#");
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("44444444444444444444444444444444###      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("         iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", "...4444444444444444444iH44444444444444444444444444444444444iH......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                     hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", "HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 818 + "'", int2 == 818);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", "44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable(" 44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...####...");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#', 184, 64);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444", 900);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" });
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("a#########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("...####...                                                                               ", "4444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...                                                                               " + "'", str2, "...####...                                                                               ");
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                    aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                                                                                                                                                                                                       ", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                                                                                                                                                                                                       " + "'", str3, "                    aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                                                                                                                                                                                                       ");
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("i!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!" + "'", str1, "i!hi!hi!");
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                               !ih", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", "hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               !ih" + "'", str3, "                                                               !ih");
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("#####################################################################################################Hi!hi!hi!h#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "hi!4444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH" + "'", str3, "#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH");
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("                                                                                                                                                                                                       aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                       ", "###############################################..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########", 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444##########44444444444444444444444444444444444444", "###########44444444444444444444444444444444444444");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("44444444444444444444                ", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "H                                 !");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "4444444444##########44444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "44444444444444444444                " + "'", str7, "44444444444444444444                ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########" + "'", str8, "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########" + "'", str10, "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########");
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ####### 44444444444444444444444444444444444444 ########## 444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", 975);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##", "444...####...44444");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("4##########                 4444444444444444444444444444444444##########                         ...", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4##########                 4444444444444444444444444444444444##########                         ..." + "'", str2, "4##########                 4444444444444444444444444444444444##########                         ...");
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("                                                                                                     Hi!hi!hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "...####...                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", "########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", 837);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" + "'", str4, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH", 'a');
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", "44444444444444444444444444444444444", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a', 43, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......");
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("#");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#" });
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...", "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444..." + "'", str2, "4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...");
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!       ", 32, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaahi!       aaaaaaaaaaa" + "'", str3, "aaaaaaaaaaahi!       aaaaaaaaaaa");
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh444444 ########## 444444", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("44444444444444444444444444 #########", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444 #########" + "'", str8, "44444444444444444444444444 #########");
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("hi!                               ", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                                                                ###################################", 111, "44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                ###################################444444444444" + "'", str3, "                                                                ###################################444444444444");
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("444444444444444", "444444444444444444444444444444HI!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444" + "'", str3, "444444444444444");
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("Hi!hi!hi!h                                                                                         ", "####################################################44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "####################                             #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "                 444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("4444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444##########4444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444##########4444444444444444444444444444444");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("...###############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                        ", "Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ", 603);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "####################################################I!HI!HI!HI########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...                               !ih                               !ih                               !ih                               !ih...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "                 444444444444hi!");
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 10, 0);
        boolean boolean15 = org.apache.commons.lang.StringUtils.startsWithAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", 3, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         " + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ");
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str2, "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("#########", "Hi!      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!      ", "#########################");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("##########", strArray4);
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ##################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!      " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("", "Hi!hi!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "", 172);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hih");
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "444...####...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                    ", 667);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str4, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 49, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiiiiiii4444444444444444444444444444444444444444444444444iiiiiiiiii444444444444444444444iiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                     ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("4444Hi!4444444444444444444444444hi!4hi!4hi!", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444Hi!444444" + "'", str2, "4444Hi!444444");
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("", "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########", "aaaaaaaaaa", "                             ", "hi", "!", "      ", "hi", "!", "      ", "#################" });
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("4444##########", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    4444##########" + "'", str2, "                                                                    4444##########");
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "                                                                                         4444444444444444444444444444444444");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################" + "'", str2, "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################");
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("#444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA", "HI!4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!4444444444444444444444444444444444444444444444444" + "'", str2, "HI!4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", "                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("Hi!      hi!                     44444444444444444444444444444444444", (int) (short) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!      hi!                     44444444444444444444444444444444444" + "'", str3, "Hi!      hi!                     44444444444444444444444444444444444");
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("4HI!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", "#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("4444444444", "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                          4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", "4444444444444444444444444aaaaaaaaaa4444444444444444444444444444444444!iH444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "4444444444##########44444444444444444444444444444444444444##########", 10);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "4444444444##########44444444444444444444444444444444444444", (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!      ", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.startsWithAny("                                                                                                  ", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!      " + "'", str10, "hi!      ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!444444444444444444444444444444444444444444444444", "                                ", (int) (byte) 100);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###", 89, 967);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 199, 181);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("44444444444444444444444444444444!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                ", "", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###", "###", "###", "iHiHiHiHiHiHiHi###", "###", "###" });
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!", 72, 146);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                            ..." + "'", str3, "...                                                                                                                                            ...");
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("         4                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...####...", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("                                ", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("", "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("Hi!                                ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                4444444444" + "'", str2, "                                4444444444");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                 4444444444444444444444444444444444", "###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I", "Hi!      hi!                     ....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................444444444444hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                Hi!                                                                 ", charArray7);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("                                Hi!                                                                 ", charArray7);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                               !ih                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########", 23, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########" + "'", str3, "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########");
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" });
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        int int1 = org.apache.commons.lang.StringUtils.length("aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 174 + "'", int1 == 174);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "   hi!      hi!      hi!      hi!      hi!      ", 612);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str5, "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("HHHHHHHHHHHHHHHHHHHHHHHHHHHH", "...####...44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("############################ 44444444444444444444444444444444444444 ########## 4444444444", 802, "#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################ 44444444444444444444444444444444444444 ########## 4444444444#####################################################################################################H###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "############################ 44444444444444444444444444444444444444 ########## 4444444444#####################################################################################################H###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                               hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("444444444444444444444444Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444Hi" + "'", str1, "444444444444444444444444Hi");
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################" + "'", str1, "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################");
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", " 4444444444  4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("", 1, 142);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 57, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########" + "'", str3, "###########");
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                    ");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        int int8 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                 4444444444444444444444444444444444", "", (int) (byte) 0);
        java.lang.String[] strArray13 = org.apache.commons.lang.StringUtils.stripAll(strArray12);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.replaceEach("44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi4", strArray4, strArray13);
        java.lang.String[] strArray17 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("a", '#');
        java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEach("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", strArray4, strArray17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                 4444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "4444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi4" + "'", str14, "44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi4");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "a" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!" + "'", str18, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str2, "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "444444444444hi", 43);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("##########");
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "########");
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEach("44444444444HiHiHiHiHiHiHiHiHiHi", strArray8, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.stripAll(strArray12);
        java.lang.String str16 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray14, "H4444444444########4444444444444444444444444444444444444444444444444444444...");
        boolean boolean17 = org.apache.commons.lang.StringUtils.startsWithAny("                        ...                        ", strArray14);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEach("", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "...####...                                                                                          " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44444444444HiHiHiHiHiHiHiHiHiHi" + "'", str13, "44444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "...####..." });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "...####..." + "'", str16, "...####...");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("...############################################################################################################################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("           444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", 8, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           " + "'", str3, "   444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ");
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("", "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", "44444HI!", "!", 61);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################" + "'", str4, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################");
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("...                               !ih                               !ih                               !ih                               !ih...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("########################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################################" });
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("...    ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("...                                                                   ...", 40, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                   ..." + "'", str3, "...                                                                   ...");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("########## 44444444444444444444444444444444444444 ##########", "", "", 50);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########## 44444444444444444444444444444444444444 ##########" + "'", str4, "########## 44444444444444444444444444444444444444 ##########");
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("444444444444444444444444Hi", "!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444Hi" + "'", str2, "444444444444444444444444Hi");
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "4444444########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("...####...44444", 'a', 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("ih444444444444ih444hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih444444444444ih444hi!      hi!" + "'", str1, "ih444444444444ih444hi!      hi!");
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "         iHiHiHiHiHiHiH                         hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" });
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!     ", '#', 690);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                                h!ih!ih!iH                               ", ' ', 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "...4444444444444444444444444444444444444444444444444444444                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444H" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###   " + "'", str2, "###   ");
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("#########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#########################################################################################################################", "a4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI" });
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444...", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("####################################44444444444444444444444444444444444444", 81, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa####################################44444444444444444444444444444444444444aaaa" + "'", str3, "aaa####################################44444444444444444444444444444444444444aaaa");
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("###   ", "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###   " + "'", str2, "###   ");
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444...####...444444");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444...####...444444" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444...####...444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444...####...444444" + "'", str3, "444...####...444444");
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("####### 44444444444444444444444444444444444444 ########## 4444444444", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "44444444444444444444444444 #########");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaai#", "HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai" });
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ...");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a', 274, (int) 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "                                               ", "!", "ih", "                                                                ", "!", "ih", "                                                                ", "!", "ih", "                                                                ", "!", "ih", "                 ", "..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("...4444444444444444444iH44444444444444444444444444444444444iH......", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "                       444444444444444444444444444                                   iHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("#..............................................................................................................................................................................................................................................................................................................................................................", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#.............................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "#..............................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("...#################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###################################", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "...                               !ih                               !ih                               !ih                               !ih...");
        int int5 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("HHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####..." + "'", str1, "HHHHHHHHHHHHHHHH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("I!HI!HI!HI", '#', 999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", "......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...####...                                                                                        ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4" + "'", str1, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate(" HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", 18, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("Hi!hi!hi!h                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 193);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("4", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("#################", "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################" + "'", str2, "#################");
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                       444444444444444444444444444                                   iHiHiHiHiHiHiHi", "Hi!hi!44", 12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                       ", "", "", "", "", "", "", "", "", "", "", "4444444444444444                                   iHiHiHiHiHiHiHi" });
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI", "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI" + "'", str2, "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI");
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("..###############################################", "hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                             ########                              ", "                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             ########                              " + "'", str2, "                             ########                              ");
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("4444444444444444444444444##########4444444444444444444444444444444444!iH444444444444444444444444", "                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ", "...444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444##########4444444444444444444444444444444444!iH444444444444444444444444" + "'", str3, "4444444444444444444444444##########4444444444444444444444444444444444!iH444444444444444444444444");
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##########", charArray7);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray7);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("#", charArray7);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444##########44444444444444444444444444444444444444", charArray7);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("4444444444 44444444444444444444444444444444444444 ", charArray7);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("44444444444HiHiHiHiHiHiHiHiHiHi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444hi!", "#########################", 90);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "...4444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("################################..", 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "################################..                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "444444444444hi!                 444444444444hi!                 444444444444hi!                 44444444Hi                                                                              ", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "      " });
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("#################                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################" + "'", str1, "#################");
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("...   ...", "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   ..." + "'", str3, "...   ...");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 967, 42);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                                            ", "4444444444444444444 ########## 444444444444444444444444444444444444444444", "############################ 44444444444444444444444444444444444444 ########## 4444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################" + "'", str3, "############################################################");
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                  ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                  " + "'", str2, "                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                  ");
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH", "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("h!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", 49, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444", 33, 961);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444");
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", 98, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!         iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "hi!         iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray4);
        int int7 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa", 968, 65);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str8, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                         4444444444");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("444...####...44444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("                        444444444444444                        44444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444 444444444444444" + "'", str2, "44444 444444444444444");
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("4444444...", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..." + "'", str2, "4444444...");
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("...####...444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########!4hi!4hi!4hi!4hi!4h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("444...####...44444", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "####################################################I!HI!HI!HI########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###...####...#####" + "'", str3, "###...####...#####");
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("", "###############################################...", 583);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("#########################################", "                                   iHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("44444444444hihihihihihihihihihi ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444", "hihihihihihihihihihi", " ", "..." });
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("############################ 44444444444444444444444444444444444444 ########## 4444444444#####################################################################################################H###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444" + "'", str2, "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444");
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ", 900, "                                      ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               " + "'", str3, "                                      ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ");
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "4##########                 4444444444444444444444444444444444##########                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("..............................................................................................................................................................................................................................................................................................................................................................#                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("Hi!      ", "444444444444444                        44444", (int) (byte) 10, 241);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!      444444444444444                        44444" + "'", str4, "Hi!      444444444444444                        44444");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("4444444444##########44444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444 44444444444444444444444444444444444444 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih444444444444ih44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "#######44444444444444444444444444444444444444##########44444444                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#" + "'", str2, "444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#");
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray6);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...####...", charArray6);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", charArray6);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", charArray6);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("################################..", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("                                                                                                                                                                                                                                              44444444444444444444                ", "                                                                                                     Hi!hi!hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("44444444444hihihihihihihihihihi                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444444444444444444 ##########", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                               ", "                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                               " });
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("   ");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOfAny("....................................................................", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                                                                              iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH" + "'", str1, "iH");
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("########################...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "                                h!ih!ih!iH                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("Hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                                   iHiHiHiHiHiHiHi", "444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   iHiHiHiHiHiHiHi" + "'", str2, "                                   iHiHiHiHiHiHiHi");
    }
}

