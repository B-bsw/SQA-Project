package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str1, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##########", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsOnly("                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("", "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray3);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!444444444444444444444444444444444444444444444444                ", strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("Hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ", "4hi!#444444444#444444444#444444444#4444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...", "########################...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 80);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "H                                 !", 263, 818);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 263 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ..." + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444##########44444444444444444444444444444444444444##########", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsOnly("4444444444444444444444444444444444", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4########4444444444444444444444444444444444444444444444444444444...", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("                 ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", "###   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444" + "'", str2, "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################", "444444444444444444444444444444444444444A...#########################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################", "444...####...44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 541 + "'", int2 == 541);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("####### 44444444444444444444444444444444444444 ########## 4444444444", "4444444444444444444 ########## 44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444 ########## 44444444444444444444444444444444444444444" + "'", str2, "4444444444444444444 ########## 44444444444444444444444444444444444444444");
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "                                                                ####################################44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("4444444444########4444444444444444444444444444444444444444444444444444444...", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######" + "'", str1, "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("444", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444" + "'", str2, "444");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("...####...                                                                                          ", "#################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...                                                                                          " + "'", str2, "...####...                                                                                          ");
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "Hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str2, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("ih444444444444ih444hi!      hi!", "...4444444444444444444iH44444444444444444444444444444444444iH......");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("...4444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...", '#', 602);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                  !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                  ", "         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", 975);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444hi!", "#########################", 90);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("      !IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("...                     ", "44444444444hihihihihihihihihihia...", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("         iHiHiHiHiHiHiH                         hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("    ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("                                                 !I                                                 ", "###########################################################################################################################################################Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!             ###########################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("              hi!      hi!             ", "###   ", 836);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("...########...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...########..." + "'", str2, "...########...");
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                                                   ...####...44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...####...44444" + "'", str1, "...####...44444");
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("##########444444444444444444444", "44444444444444444444                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI", "Hi!      444444444444444                        44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("hhhhhhhhhhhh#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################h#####################################################################################################", '#', 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 65 + "'", int3 == 65);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray9);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("#########", charArray9);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsOnly("444444444444444444444444Hi!4444444444444444444444444", charArray9);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("", charArray9);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444hi!", charArray9);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAnyBut("           444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("...                              ...", "4444444444444444444 ########## 444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("...############################################################################################################################################...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                     ", 564, "Hi!                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                                                 444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                     Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!            " + "'", str3, "Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                                                 444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                     Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!            ");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 444444444444444..." + "'", str2, "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 444444444444444...");
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                    " + "'", str1, "                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                    ");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!", 98, "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!" + "'", str3, "                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!");
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("hi!     ", "44444444444444444444a4444444444########4444444444444444444444444444444444444###      #########", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "             HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4H");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "444444444444444444444444hI!4444444444444444444444444");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444444444444444444444" + "'", str5, "44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "44444444444444444444444444444444" });
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("                                                                                                                                                                                                                               hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!                                                                                                                                                                                                                                ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("...                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "                     " });
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHH", "hi!      hi!                                              ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##########44444444444444444444444444444444444444##########");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "#                                                            HI!4HI!");
        int int7 = org.apache.commons.lang.StringUtils.lastIndexOfAny("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        int int1 = org.apache.commons.lang.StringUtils.length("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!################################################                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 900 + "'", int1 == 900);
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("                     ", "H                                 !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("#444444444", "Hi!hi!hi!h");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!hi!hi!h");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6, ' ', 999, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEach("hi!444444444444444444444444444444444444444444444444", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#444444444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi", "AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi" + "'", str2, "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi");
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444                     ", "...!hi!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("   #################################################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHH", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##########" + "'", str5, "##########");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "##########" + "'", str7, "##########");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", "#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("#################################################################...", "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "                                                                #################################", 98);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", strArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 6, 498);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...############################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########4444444444444..." + "'", str3, "...############################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########4444444444444...");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!", "########################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("44444444444444444444444444444444!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", 900);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" });
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################", "#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...###", 28);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ####4444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ####4444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ####4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("                                ##########                                      ##########                                       #################################################################", "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444", "...################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", "!                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444", "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("!I", "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiH", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!I" });
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("Hi#!#                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...", "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################", 4, 690);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAA                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################" + "'", str4, "AAAA                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################");
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!", "                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!" });
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split(" ", "#444444444", (int) (byte) 10);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "########");
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("H4444444444########4444444444444444444444444444444444444444444444444444444...", strArray8);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEach("HHHHHHHHHHHHHHHHHHHHHHHHHHHH", strArray4, strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { " " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "...####...                                                                                          " });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str10, "HHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("", 162, "###      #########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###      ############      ############      ############      ############      ###      ############      ############      ############      ############      " + "'", str3, "###      ############      ############      ############      ############      ###      ############      ############      ############      ############      ");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("########## 44444444444444444444444444444444444444 ##########", "                                                                                                                                                                                                                                                                                                                        ", 910);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########", "44444444444444444444444444444444444444", "##########" });
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", 879, 886);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444", "########################...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444" + "'", str2, "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("44444 444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "#################################################################################################44444444444444444444444444444444444444444444444444444444444A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      " + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "          ");
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("#", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "                        4444444444444...                        ");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...####...", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "####", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "...####...a" + "'", str8, "...####...a");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444", "Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("A", "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 667);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A" });
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!IH4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                ", (int) (byte) -1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        char[] charArray8 = new char[] { '4', 'a', '#', '4' };
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("...4444444444444444444iH4444444444", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', '#', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("#################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################", "...####...                                                                                         ", "                 4444444444444444444444444444444444", 679);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################" + "'", str4, "#################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 470);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("4!ih4!ih4!ih4!ih4!ih4!ih4!", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("###################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", ' ');
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "####################################################", 100, (int) (short) 0);
        java.lang.String[] strArray13 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                 44444444444444444444444444444444444", "", 64);
        boolean boolean14 = org.apache.commons.lang.StringUtils.startsWithAny("aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", strArray13);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("Hi", strArray13);
        java.lang.String str16 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                        ", strArray3, strArray13);
        java.lang.String str17 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                        " + "'", str16, "                        ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44444444444444444444444444444444444" + "'", str17, "44444444444444444444444444444444444");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("I!HI!HI!", 498);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!" + "'", str2, "I!HI!HI!");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("...444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ", ' ');
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 72, 49);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!", "444444444##########44444444444444444444444444444444444444##########");
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.stripAll(strArray10, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        int int13 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang.StringUtils.replaceEach("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             ", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih", "!ih", "!ih", "!ih", "!ih", "!ih", "!ih", "!ih", "!ih", "!ih44444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("i!hi!hi!hi!hi!hi!hi!hi!hihi!", "4##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 451 + "'", int2 == 451);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", " ...                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4" });
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("AAAA                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444444444444444hi!", "4#444444444#444444444#444444444#44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("...             ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 662);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center(" HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHH", 34, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHH" + "'", str3, " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHH");
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("#########################################################################Hi!hi!44", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", 663);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 98);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "444444hihihihihihihihihihi");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" });
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("...aaaa", "hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaa" + "'", str2, "...aaaa");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("                                Hi!                                                              ", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("...####...                                                                                         ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...                                                                                         " + "'", str2, "...####...                                                                                         ");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("", 0, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("####################################################I!HI!HI!HI########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####################################################", "I", "!", "HI", "!", "HI", "!", "HI", "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                                                                         ", "4444444444" });
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("i!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Ih" + "'", str1, "!Ih");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "                                HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str2, "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("###################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################" + "'", str2, "###################################");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("...4444444444444444444444444444444444444444444444444444444########4444444444h", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444########4444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444########4444444444");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("i!hi!hi!########## 44444444444444444444444444444444444444 ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!##########44444444444444444444444444444444444444########" + "'", str1, "i!hi!hi!##########44444444444444444444444444444444444444########");
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!444444444444444444444444444444444444444444444444                ", 204);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("hi!444444444444444444444444444444444444444444444444", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!444444444444444444444444444444444444444444444444" + "'", str2, "hi!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("44444444444444444444444444444444444444##4444444444");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444", "##", "4444444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444", "44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                     hI!HI!HI!", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4##########                 4444444444444444444444444444444444##########                         ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "          hi!     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4##########                 4444444444444444444444444444444444##########                         ..." });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4##########                 4444444444444444444444444444444444##########                         ..." });
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("...####...444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########!4hi!4hi!4hi!4hi!4h", "hi!444444444444444444444444444444444444444444444444                hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("                                 ......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 ......Hi44444444444444444444444444444444444Hi4444444444444444444..." + "'", str1, "                                 ......Hi44444444444444444444444444444444444Hi4444444444444444444...");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("H", "                                                                #################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("44444444444444", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                              ", "                                                         444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("...                   4444444444", 470);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                   4444444444" + "'", str2, "...                   4444444444");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!444444444444" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!444444444444");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("#..............................................................................................................................................................................................................................................................................................................................................................", 541);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#..............................................................................................................................................................................................................................................................................................................................................................                                                                                                                                                                                              " + "'", str2, "#..............................................................................................................................................................................................................................................................................................................................................................                                                                                                                                                                                              ");
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("444444444444444                        44444", "", "                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                               ", "i!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("###########", 315);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                        ###########                                                                                                                                                        " + "'", str2, "                                                                                                                                                        ###########                                                                                                                                                        ");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("         iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "......Hi44444444444444444444444444444444444Hi4444444444444444444..." });
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("          hi!               #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444", "                                              iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("444...", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 43);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..." });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8, '4', (int) (byte) 100, 67);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8, "Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "##########" + "'", str14, "##########");
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("44444444444hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                     hI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444", "hihihihihihihihihihi", "                ", "444444444444444444444444444444444444444444444444", "!", "ih", "                                                                                                     ", "h", "I", "!", "HI", "!", "HI", "!" });
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("                                                            4444444444444...                        ", "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            4444444444444...                        " + "'", str2, "                                                            4444444444444...                        ");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiH", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("HI!                          444444444444hi!HI!                          ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                          444444444444hi!HI!                          " + "'", str3, "HI!                          444444444444hi!HI!                          ");
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("###########44444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H" + "'", str1, "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("HI!HI!HI!ih444444444444                 HI!HI!HI", 184, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!ih444444444444                 HI!HI!HI" + "'", str3, "HI!HI!HI!ih444444444444                 HI!HI!HI");
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("", (int) (short) 1, "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "." + "'", str3, ".");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("#########################################", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################" + "'", str2, "#########################################");
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi", " #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!", charArray9);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("#########", charArray9);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", charArray9);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("                       ", charArray9);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsAny("44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi4", charArray9);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("4444444...", "...                                                                   ...", "444...                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("444444444444444444444444444444444444444444444444444444H", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("...################################", "                                H!IH!IH!IH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...################################" + "'", str2, "...################################");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                          4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 27, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444.....#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 82, "4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444.....#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str3, "444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444...####...44444444.....#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", "Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("4##########                 4444444444444444444444444444444444##########                         ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("4444444444 ########## 444444444444444444444444444444444444 #########", "Hi!      hi!                     ....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("########################################################################################################################44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################################################################################################################44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH" + "'", str2, "########################################################################################################################44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("i!hi!hi!hi", 41, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaai!hi!hi!hiaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaai!hi!hi!hiaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "             ..." + "'", str1, "             ...");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ", "4444444444444444444444444444444444", 1000);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "");
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("H4444444444########4444444444444444444444444444444444444444444444444444444...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         " });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("i!", "#########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444", "   ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "...####...a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444" + "'", str3, "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444");
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                        444444444444444                        44444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                    ", "                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                    " + "'", str2, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                    ");
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("hi!                                ", "hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("hhhhhhhhhhhh#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################h#####################################################################################################", "444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a#aHI!4HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("!Ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                                                                                                                                                                       aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                       ", "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ", "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                       aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                       aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                       ");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        char[] charArray11 = new char[] {};
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray11);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray11);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", charArray11);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("Hi!hi!hi!h", charArray11);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray11);
        boolean boolean17 = org.apache.commons.lang.StringUtils.containsOnly("Hi!", charArray11);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsOnly("                 444444444444hi!", charArray11);
        int int19 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!hi!hi!h                                                                                         ", charArray11);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsOnly("4444444444444444444444444444444444444444444444444444444444444444Hi!", charArray11);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsNone(" HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", charArray11);
        boolean boolean22 = org.apache.commons.lang.StringUtils.containsOnly("Hi!      hi!                     44444444444444444444444444444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("###############################################.", 110, 274);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!hi!hi!h", '4');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!h" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!h" + "'", str3, "Hi!hi!hi!h");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "...444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 444444444444444444444444      ", "iHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 444444444444444444444444      " + "'", str2, "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 444444444444444444444444      ");
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                                                    ###################################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444...###############################...###############################...####", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("########################################################################################################################################################################################################################################################################################################################...", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################################################################################################################################################################################################################################################################################################################..." });
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        int int1 = org.apache.commons.lang.StringUtils.length("...                                                                   ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 73 + "'", int1 == 73);
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!" });
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 ", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str2, "AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                                                 444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                     Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", 375, 196);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("444...                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444", "44444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#################################################################   44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray3);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##########44444444444444444444444444444444444444##########");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#########", strArray6, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang.StringUtils.stripAll(strArray8);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str15 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########" + "'", str11, "4444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#########" + "'", str12, "#########");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########" + "'", str15, "4444444444##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("..###############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..###############################################" + "'", str1, "..###############################################");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 ", 399);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 " + "'", str2, "444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 ");
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("4444444444########4444444444444444444444444444444444444444444444444444444###", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444########44444444444444..." + "'", str2, "4444444444########44444444444444...");
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ", "                                                                                         4444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" + "'", str3, "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray4);
        boolean boolean6 = org.apache.commons.lang.StringUtils.containsOnly(" ", charArray4);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("          ", charArray4);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAnyBut(" #########44444444444444444444444444444444444444444444444444444444444A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("                                                                                                     Hi!hi!hi!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         h!ih!ih!iH                                                                                                     " + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         h!ih!ih!iH                                                                                                     ");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("..............................................................................................................................................................................................................................................................................................................................................................#                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("####################################################################################################################################################################################################################################################################################################################4hi!", 'a', 862);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!", "                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!" });
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", "                             ########                              ", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I" });
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("444444444444444444444444444444444444444a...####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                           hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                           hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "                                                                                                                                                                                                                                                                                                                                           hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444...", 'a');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444..." });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("4!ih4!ih4!ih4!ih4!ih4!ih4!", "4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!ih4!ih4!ih4!ih4!ih4!ih4!" + "'", str2, "4!ih4!ih4!ih4!ih4!ih4!ih4!");
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("Hi!      hi!                     ", "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("Hi!      ", "444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!                 444444444444hi!    #                                                            HI!4HI!", "...####...                                                                                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("...   ...", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("444...####...44444", "444444444444444#4444444444444444", 656, 295);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444...####...44444444444444444444#4444444444444444" + "'", str4, "444...####...44444444444444444444#4444444444444444");
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                         ", "444444444444hi", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                         " });
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I", '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("########################################", "             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih            ");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "###############                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################################" + "'", str4, "########################################");
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "4444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444" });
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai", '#', 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("4444444########", "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("...###############################################", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars(" ...                          ", "                                                                                                                                                                                                                                                                                             ...#...                                                                                                                                                                                                                                                                                                                                                                                       ", "HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HAAAHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "HAAAHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi##############################", "                                4444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi##############################" + "'", str3, "#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi##############################");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("H                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                                 " + "'", str2, "H                                 ");
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("########################...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("44444444444444444444444444444444444########", "HI!                                                                         ", "                                                                              HHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444########" + "'", str3, "44444444444444444444444444444444444########");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("   #################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################" });
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("###################################");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###################################" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################" + "'", str3, "###################################");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("####### 44444444444444444444444444444444444444 ########## 4444444444", "#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                     444...####...44444                      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                     ", "444", "...####...", "44444", "                      " });
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        int int1 = org.apache.commons.lang.StringUtils.length("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("         4");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "          ");
        int int8 = org.apache.commons.lang.StringUtils.lastIndexOfAny("#", strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray7, "                        4444444444444...                        ");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("###############################################..", strArray3, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray15 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" ", "                                                            ");
        java.lang.String[] strArray17 = org.apache.commons.lang.StringUtils.stripAll(strArray15, "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          ");
        java.lang.String str18 = org.apache.commons.lang.StringUtils.replaceEach("aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", strArray3, strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         ", "4" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "...####...", "" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "####", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "###############################################.." + "'", str11, "###############################################..");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "4" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "aaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "aaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("...                                                                                                                                            ...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("H                                 ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "4HI!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("###################################", "", 48);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###################################" });
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (byte) 100, (int) (short) 0);
        java.lang.String[] strArray16 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean17 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray16);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray16);
        java.lang.String[] strArray21 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "44444444444444444444444444444444444");
        java.lang.String str22 = org.apache.commons.lang.StringUtils.replaceEach("44444444444444444444444444444444444", strArray16, strArray21);
        int int23 = org.apache.commons.lang.StringUtils.indexOfAny("#########", strArray21);
        int int24 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray21);
        java.lang.String[] strArray27 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray28 = org.apache.commons.lang.StringUtils.stripAll(strArray27);
        java.lang.String str29 = org.apache.commons.lang.StringUtils.replaceEach("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##", strArray21, strArray27);
        java.lang.String str33 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray27, 'a', 10, (int) (short) 10);
        java.lang.String str34 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                ", strArray4, strArray27);
        java.lang.String[] strArray38 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("      ", "aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        int int39 = org.apache.commons.lang.StringUtils.lastIndexOfAny("###################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", strArray38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = org.apache.commons.lang.StringUtils.replaceEach("#####################################################################################", strArray4, strArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "44444444444444444444444444444444444" + "'", str22, "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##" + "'", str29, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "                                " + "'", str34, "                                ");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "      " });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 961 + "'", int39 == 961);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("", "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###########################################################44444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###########################################################44444444444444444444444444444444444444" });
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("Hi!                                ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi", "!", "                                " });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("iH", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("####################################################44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################44444444444444444444444444444444444" + "'", str1, "####################################################44444444444444444444444444444444444");
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("4444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ", "                                                                                                                                                                                                                                                                                                      #..............................................................................................................................................................................................................................................................................................................................................................                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("#####                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str1, "#####                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ################" + "'", str1, "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ################");
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "...#################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("          ", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi...", 181);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!hi!hi!########## 44444444444444444444444444444444444444 ########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("########################################################################################################################44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         h!ih!ih!iH                                                                                                     ", 999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.split("", "Hi!");
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.splitByCharacterType("44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        java.lang.String str9 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#                                                            HI!4HI!", strArray6, strArray8);
        int int10 = org.apache.commons.lang.StringUtils.lastIndexOfAny("HI!4444444444444444444444444444444444444444444444444", strArray8);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEach("                                                  ...                                               ", strArray1, strArray8);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#                                                            HI!4HI!" + "'", str9, "#                                                            HI!4HI!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 41 + "'", int10 == 41);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                  ...                                               " + "'", str11, "                                                  ...                                               ");
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithAny("               ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("!ih", 204, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!444444444444444444444444444444444444444444444444" + "'", str1, "hi!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a', 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444......", "                                     ...########...                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444......" + "'", str2, "444444444......");
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                                                               !ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               !ih" + "'", str2, "                                                               !ih");
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!", "44444444444hihihihihihihihihihi ...");
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444hi!                 444444444444hi!                 444444444444hi!                 44444444Hi                                                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "...####...", 0);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, '4', (int) 'a', (int) (byte) 0);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "4");
        boolean boolean11 = org.apache.commons.lang.StringUtils.startsWithAny("...4444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("    ################################################################################################", "HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("HHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "                        444444444444444                        44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("ih444444444444ih444hi!      hi", "4##########                 4444444444444444444444444444444444##########                 ", 223, 274);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih444444444444ih444hi!      hi4##########                 4444444444444444444444444444444444##########                 " + "'", str4, "ih444444444444ih444hi!      hi4##########                 4444444444444444444444444444444444##########                 ");
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.repeat("", "                                                                ####################################44444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444" + "'", str1, "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("4444444444########4444444444444444444444444444444444444444444444444444444###", "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444########4444444444444444444444444444444444444444444444444444444###" + "'", str2, "4444444444########4444444444444444444444444444444444444444444444444444444###");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                 ", "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "44444444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "444444444#...####...", "...####...444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########!4hi!4hi!4hi!4hi!4h", 836);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                 !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("###");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "hi!      hi!                     ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###" + "'", str3, "###");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###" + "'", str5, "###");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "###" + "'", str6, "###");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!ihiiiiiiiiiiiiiiiii", "!ihih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("...                                                                                                                                            ...", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                                                            ..." + "'", str2, "...                                                                                                                                            ...");
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("#########################H4444444444########4444444444444444444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                                #################################################################");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray1, "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#################################################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################################################################" });
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                     ...########...                                      ", "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                     ...########...                                      " });
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("...4444444444444444444Ih44444444444444444444444444444444444Ih......", "                                                                                                                                                                                                       ", " ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "                               ", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...####...");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEach("hi!444444444444444444444444444444444444444444444444                ", strArray4, strArray6);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "...####..." });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!444444444444444444444444444444444444444444444444                " + "'", str7, "hi!444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "...####..." + "'", str8, "...####...");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444", 263, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444" + "'", str3, "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("444444444444444#4444444444444444", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444#4444444444444444" + "'", str3, "444444444444444#4444444444444444");
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!      ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "444444444444444444444444444444444444444a...#########################################################", 0, 734);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("", 57, 408);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                        ...", "44444444444444444444444444444444###      ", "                                 !");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 667, "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str3, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("4444444444 ########## 44444444444444444444444444444444444444 ##########", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("444444444444444444444444444444444444444a...####", 350, 108);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444a...####" + "'", str3, "444444444444444444444444444444444444444a...####");
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ", "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "#######44444444444444444444444444444444444444##########44444444                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     " + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi          ...                     ");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################", "                                   iHiHiHiHiHiHiHi", "                                                                   ...####...44444", 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################" + "'", str4, "#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################");
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", 544);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444..." + "'", str2, "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444...");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                 H", "                                ...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("...####...", "                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("!                                 h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "                                 ", "h" });
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, ' ', 162, 190);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 162 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("#!ih4#4#4#4#4#4#4#4#4#", "aaaaaaaaaaaaaaai!hi!hi!hiaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "###############################################..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("i!hi!hi!##########44444444444444444444444444444444444444########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i", "!", "hi", "!", "hi", "!##########", "44444444444444444444444444444444444444", "########" });
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("!!!!!!!!!!", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        char[] charArray5 = new char[] { '#', '#' };
        int int6 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("                               HI!HI!HI!H                               ", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAnyBut("H4###########################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...", 544, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("", 24, 23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("                                                  ...                                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                  ", "...", "                                              " });
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                         ", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                         " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("...aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...AAAA" + "'", str1, "...AAAA");
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("hi!      ", "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("iH!iH!iH!iH!iH!iH!iH!iH!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("H                                 ", "Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 " + "'", str2, "                                 ");
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444", "44444444444444444444444444444444###      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########4444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444" });
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("444444444444444444444444Hi44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########4444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444Hi44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########4444444444444444444444" + "'", str1, "444444444444444444444444Hi44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########44444444444444444444444444 ##########4444444444444444444444");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", (int) (short) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("##########");
        java.lang.String[] strArray15 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean16 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray15);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray15);
        java.lang.String[] strArray20 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "44444444444444444444444444444444444");
        java.lang.String str21 = org.apache.commons.lang.StringUtils.replaceEach("44444444444444444444444444444444444", strArray15, strArray20);
        java.lang.String str22 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray15);
        java.lang.String str23 = org.apache.commons.lang.StringUtils.replaceEach("hi!4444444444444444444444444444444444444444444444444", strArray9, strArray15);
        java.lang.String str24 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("!4hi!4hi!4hi!4hi!4hi!4hi!4", strArray6, strArray15);
        int int25 = org.apache.commons.lang.StringUtils.lastIndexOfAny("#", strArray15);
        int int26 = org.apache.commons.lang.StringUtils.indexOfAny("########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444", strArray15);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "44444444444444444444444444444444444" + "'", str21, "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str22, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!4444444444444444444444444444444444444444444444444" + "'", str23, "hi!4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "!4hi!4hi!4hi!4hi!4hi!4hi!4" + "'", str24, "!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...#################################################################################################", "HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("                        h", "", 183);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                HI!                                                                 ", "###### 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih###### 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("!                                 ", "                                                                                                                                                                                                                                                                                                                                            ...########...                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!                                 " });
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H!IH!IH!Ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("HI!                          444444444444hi!HI!                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                          444444444444hi!HI!                          " + "'", str2, "HI!                          444444444444hi!HI!                          ");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str3, "                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("4444444444##########44444444444444444444444444444444444444##########", "....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("#######44444444444444444444444444444444444444##########444444444", (-1), ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######44444444444444444444444444444444444444##########444444444" + "'", str3, "#######44444444444444444444444444444444444444##########444444444");
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("                                                                                                                                                                                                                                                                                                                        ", "4444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("                                                                                        44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I                                                                                        ", "......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("44444444444444", "iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaiHiHiHiHiHi44444444444444444444a4444444444########4444444444444444444444444444444444444444444444444444444...", "AAAAAAAAAA                             HI!      HI!      #AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        int int1 = org.apache.commons.lang.StringUtils.length("#################################################################################################44444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 755 + "'", int1 == 755);
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", "##########44444444444444444444444444444444444444############44444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444" + "'", str2, "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444");
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 263);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "444444444444HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("###########################################################44444444444444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("###################################", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("...####...", charArray8);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsOnly("...    ...                                                                                          ", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("                                ...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444444##########44444444444444444444444444444444444444", ' ');
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("4444444444444444444 ########## 444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444##########44444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("4444444444 ########## 4444444444...", "                 HI!                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                    ", "                                                                                                                                                                                                                                                 444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                    " });
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################", 45);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" });
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("", '#', 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("HHI!HI!HI!ih444444444444                 HI!HI!HIiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens(" ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " " });
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "Hi!      hi!                     ....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................444444444444hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa" + "'", str2, "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                                              HHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("I", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444a...####", "a");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "hi!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444", "...####" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "...####" });
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("             ...", "   ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "..." });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("Hi!      hi!                     44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI!                     44" + "'", str1, "HI!      HI!                     44");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("", "#444444444", "I!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA", "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("###########################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("####################################################", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsOnly("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########", charArray8);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("444444444#", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("####### 44444444444444444444444444444444444444 ########## 444444444", "...", 295);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444444444444hi!4444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444", "                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("...4444444444444444444Ih44444444444444444444444444444444444Ih......", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("...####...                                                                   ", "                                                            !ih444444444444                                                                              ", "...####...44444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####...                                                                   " + "'", str3, "...####...                                                                   ");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                                                 444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                     Hi!                                Hi!                                Hi!                                Hi!                                Hi!                                Hi!            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("...                              ...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "..." });
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("...########...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...########..." + "'", str1, "...########...");
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAA                        444444444444444                        44444AAAAAAAAAAAAAAAAAAAAAA4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str1, "AAAAAAAAAA                        444444444444444                        44444AAAAAAAAAAAAAAAAAAAAAA4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "                 44444444444444444444444444444444444", 82);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        int int7 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                     ...########...                                      ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str6, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                                                                                  ", "                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                        aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai" + "'", str1, "aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ", "4444444444444444444444444444444444", 1000);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "");
        int int7 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray8);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("4##########                 4444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         " });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##########", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("#", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           i!hi!hi!hi!hi!hi!hi!hi!hihi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAnyBut("##########", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsOnly("                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", charArray5);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                         ####################################44444444444444444444444444444444444444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########4444444444 ########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                        ...                                                                        ", "####### 44444444444444444444444444444444444444 ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("###############################i!hi!hi!hi################################", "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!hi!hi", 0, "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi" + "'", str3, "hi!hi!hi");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "                                h!ih!ih!iH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "Hi!hi!hi!h");
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("########################...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#                                                            HI!4HI!", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "##########" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "########################...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#                                                            HI!4HI!" + "'", str10, "#                                                            HI!4HI!");
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("HI!          ...", "...                                                                                                                                            ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                                                                                                                                                                                                       ", 510, 146);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                                                                                               " + "'", str3, "...                                                                                                                                               ");
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "...###############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444##########444444444444444444444", "44444444444hihihihihihihihihihi", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444##########444444444444444444444" });
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("Hi!      hi!             !ih !ih !ih !ih !ih !ih !ih !ih !ih !ihHi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("", "hi!", (int) (short) 0);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ', (int) 'a', 10);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                         4444444444444444444444444444444444", strArray4);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ###########", "44444444444444444444444444444......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("#####                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####" + "'", str2, "#####");
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("...###############################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("H", "#################################################################################################44444444444444444444444444444444444444444444444444444444444A", 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", charArray8);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly(" 44444444444444444444444444444444444444444444444444444444444444444...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                                                                                    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("444444444444444#4444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444#4444444444444444" + "'", str1, "444444444444444#4444444444444444");
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4########4444444444444444444444444444444444444444444444444444444...#        ", "                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 650);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4########4444444444444444444444444444444444444444444444444444444...#        " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4########4444444444444444444444444444444444444444444444444444444...#        " + "'", str5, "4########4444444444444444444444444444444444444444444444444444444...#        ");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("##### ", "...4444444444444444444444444##4444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 896, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("444444444444444444444444hI!4444444444444444444444444444444444##########44444444444444444444444444", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444hI!4444444444444444444444444444444444##########44444444444444444444444444" + "'", str2, "444444444444444444444444hI!4444444444444444444444444444444444##########44444444444444444444444444");
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("hI!HI!HI!", "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI!HI!" + "'", str2, "hI!HI!HI!");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("##################################################################################################################################################################################################################################################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("...                                                                   ...", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                                   ..." + "'", str3, "...                                                                   ...");
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "                                                        ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str4, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                                                                                        44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I                                                                                        ", "####################################44444444444444444444444444444444444444", "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween(".................................................................................................", "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("aaaaaaaaaaahihihihihihihihihihi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("########################################################################################################################################################################################################", "                                                                                                                                                                                                                                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("444444444444444444444444444444Hi!", "###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                !ih", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", 0);
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("Hi!hi!hi!h", strArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("44444444444444444444444444444......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi444444444444444444444444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                !ih" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                               !ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################", "##################################################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!444444444444444444444444444444444444444444444444################" + "'", str2, "hi!444444444444444444444444444444444444444444444444################");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444" + "'", str1, "444444444");
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444...", "hI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444..." });
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("!                                 h", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444##########44444444444444444444444444444444444444##########", "#", (int) (short) 100);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "###################################");
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("...                                                                                                                                            ...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444", "44444444444444444444444444444444444444", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "4444444444", "44444444444444444444444444444444444444", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("", "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444...###############################...###############################...####", "##### 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!hi!hi!h                                                                                         ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                                                                  ####################                                                                                                                                                                                                                                              ", "44444444444444444444444444444......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 679 + "'", int2 == 679);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray7);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("###########################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("4HI!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", charArray7);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...", charArray7);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("########################");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            !I                                      ", strArray3);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("hi!      hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "########################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################" + "'", str4, "########################");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "                                                                                         4444444444444444444444444444444444");
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                                                                                         4444444444444444444444444444444444", strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444hI!4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih            ", "...44444444444444444444444444444444444444444444444444444444444444444h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444", 90, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444" + "'", str3, "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...####...                                                                                        ", 414);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("#################################################################################################44444444444444444444444444444444444444444444444444444444444a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################44444444444444444444444444444444444444444444444444444444444a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "#################################################################################################44444444444444444444444444444444444444444444444444444444444a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase(" 4444444444  4444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("hi!                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                               " + "'", str1, "HI!                               ");
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("i!hi!hi!########## 44444444444444444444444444444444444444 ########", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                      AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!##########                                        ########" + "'", str3, "i!hi!hi!##########                                        ########");
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("i!", 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "i!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "hi!      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444" });
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", "...    ...                                                                                          ", 399);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("HI!      HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!", "", "", "", "", "", "HI" });
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h4!ih4!ih4!ih4!ih4!########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444...####..." + "'", str1, "h4!ih4!ih4!ih4!ih4!########## 44444444444444444444444444444444444444 ########## 444444444444444444444444444444444444444444...####...");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("i!hi!hi!hi", "#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("   #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!hi!hi! 44444444444444444444444444444444444444 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("aaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!", "44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "aaaaaaaaaa            aaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################", 98);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "                                                                                                    ", 0);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                     ##########                                       #################################################################", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                     ##########                                       #################################################################" });
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("##### ", "44444444444HIHIHIHIHIHIHIHIHIHI                444444444444444444444444444444444444444444444444!IH                                                                                                     HI!HI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##### " + "'", str2, "##### ");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                        ...", "                                      ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "4########4444444444444444444444444444444444444444444444444444444...#        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hi!444444444444444444444444444444444444444444444444                ", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hi!444444444444444444444444444444444444444444444444                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hi!444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!h");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "...", "...", "...", "...", "...", "...", "...", "..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...#...#...#...#...#...#...#...#..." + "'", str4, "...#...#...#...#...#...#...#...#...");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith(" #########44444444444444444444444444444444444444444444444444444444444A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "...#...                                                                                          ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!", 998);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!" + "'", str2, "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################" + "'", str1, "#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("###############################################.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############", "...4444444444444444444444444444444444444444444444444444444########4444444444h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("iH", "      !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                          ", "...####...                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih", "                                                                                                                                                                                                                                                                     Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("                                                         444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                         " + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                         ");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("...############################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########4444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                                                                                                                                        ###########                                                                                                                                                        ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("", "AAAAAAAAAAAAAAAAAAAAAAAAAA", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("#..............................................................................................................................................................................................................................................................................................................................................................", "...####...444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("                                                                                                                                                                                                       aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("###      ###      ###     ihihihihihihihi###      ###      ###      ", 300, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###      ###      ###     ihihihihihihihi###      ###      ###      !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "###      ###      ###     ihihihihihihihi###      ###      ###      !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }
}

