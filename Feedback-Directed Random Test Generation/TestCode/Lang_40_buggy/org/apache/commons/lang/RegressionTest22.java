package org.apache.commons.lang;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

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
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Ih" + "'", str1, "!Ih");
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444" + "'", str1, "......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444");
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("...4444444444444444444444444##########                 4444444444444444444444444444444444", "I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("444444444444hi!", ' ');
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!      hi!                     44", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "444444444444hi444444444444hi444Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih444444444444hi444444444444hi4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str1, "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444H", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI          ...                     ", "4444444444444444444 ########## 444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444444444444444444H", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", ' ');
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByCharacterType("......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        int int10 = org.apache.commons.lang.StringUtils.lastIndexOfAny("hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", strArray9);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                                        ", strArray5, strArray9);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "......", "H", "i", "44444444444444444444444444444444444", "H", "i", "4444444444444444444", "..." });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 241 + "'", int10 == 241);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                        " + "'", str11, "                                                        ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", '4');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!      hi!                     ", "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444...", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("i!hi!hi!h", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!      hi!                     " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 44444444444444444444A4444444444########4444444444444444444444444444444444444444444444444444444..." });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!hi!hi!h" + "'", str8, "i!hi!hi!h");
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                     ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                    ");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, '#');
        java.lang.String[] strArray14 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("###########################################################################################################################################################################################################################################################################################################################", "                                                                                         ", (int) ' ');
        java.lang.String[] strArray17 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "hi!       ");
        java.lang.String[] strArray18 = org.apache.commons.lang.StringUtils.stripAll(strArray17);
        java.lang.String str19 = org.apache.commons.lang.StringUtils.replaceEach("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", strArray14, strArray18);
        java.lang.String str20 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#", strArray4, strArray18);
        java.lang.String[] strArray24 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                 44444444444444444444444444444444444", "          ", (int) ' ');
        java.lang.String[] strArray26 = org.apache.commons.lang.StringUtils.stripAll(strArray24, "4########4444444444444444444444444444444444444444444444444444444...");
        java.lang.String str27 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("             ", strArray4, strArray26);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "###########################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str19, "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "#" + "'", str20, "#");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "44444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "             " + "'", str27, "             ");
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444..." + "'", str1, "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444...");
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.split("#444444444", "Hi!hi!hi!h");
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEach("Hi!                                ", strArray4, strArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##########" + "'", str5, "##########");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "#444444444" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!                                " + "'", str10, "Hi!                                ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("444...####...44444", "...    ...");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444", "####", "44444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("#########################################################################################################################################################################################################################################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################################################################################################################################################################################################################", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################..." + "'", str2, "##################################################################################...");
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("!ih", ' ', 999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("##### 44444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                 ......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("44444444444444                ", "###########################################################################4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("i!", "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi4", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 190 + "'", int2 == 190);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("hi!         iHiHiHHi!      444444444444444                        44444hi!         iHiHiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!         ihihihhi!      444444444444444                        44444hi!         ihihih" + "'", str1, "hi!         ihihihhi!      444444444444444                        44444hi!         ihihih");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("", charArray8);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("###########################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", charArray8);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444Hi!", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("hi!444444444444444444444444444444444444444444444444                h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("###########################################################################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsOnly("!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih                                                            ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("                                                         ", "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", "#####################################################################################################h#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hhhhhhhhhhhh", 398);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                         " + "'", str4, "                                                         ");
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!#########################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("AAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...", "I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                               Hi!hi!hi!h                               ", '4', 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...####...                             ...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("Hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "Hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("hi!                                ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang.StringUtils.replaceEach("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray2, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "                                " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi", (int) (byte) 10, "#######44444444444444444444444444444444444444##########44444444                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi" + "'", str3, "44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("###########44444444444444444444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join(objArray0, '4');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("...                                                                   ...", "444...                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                   ..." + "'", str2, "...                                                                   ...");
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444Hi!4444444444444444444444444", "a");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444Hi!4444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "#################################################################                             ####################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444..." + "'", str1, "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 4444...");
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("HHHHHHHHHHHHHHHHHHHHHHHHHHHH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444", "...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                               ...####...                                                                #####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                        ...                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!", 869, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("a##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithAny("Hi!      hi!             !ih !ih !ih !ih !ih !ih !ih !ih !ih !ihHi!      hi!             ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                      ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                      ", (int) (byte) -1, 680);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("Hi!hi!hi!h                                                                                         ", 892);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!h                                                                                         " + "'", str2, "Hi!hi!hi!h                                                                                         ");
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444...", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str2, "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("...44444444444444444444444444444444...", "", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...44444444444444444444444444444444..." });
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("                                                                                          ", "###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###      ", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          " + "'", str3, "                                                                                          ");
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("                                         aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "                                         aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "#################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("####################################################444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi", "44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("444444444##########44444444444444444444444444444444444444##########", "");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 99, 9);
        boolean boolean10 = org.apache.commons.lang.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                               AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444##########44444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...################################...################################...################################...################################......");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...################################...################################...################################...################################......" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...################################...################################...################################...################################......" });
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!hi!", "...################################...################################...################################...################################......");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("", "hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", 34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("Hi!      hi!             !ih !ih !ih !ih !ih !ih !ih !ih !ih !ihHi!      hi!", "444444444444444                        44444444444444444444                        44444444444444444444                        444444444444444444          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444444444444444444                        44444444444444444444                        44444444444444444444                        4444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h" });
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I", "!", "Hi", "!", "Hi", "!", "Hi", "!", "Hi", "!", "Hi", "!", "Hi", "!", "Hi", "!", "Hihi", "!" });
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", 199);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih" + "'", str2, "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA        HHH", " ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## 4 ##########4 ########## ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("44444HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444HI!" + "'", str1, "44444HI!");
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("444444444444444444444444444444444444444a...####...", "###########################################################################################################################################################Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!             ###########################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###########" });
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444##########44444444444444444444444444444444444444##########", "#", (int) (short) 100);
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("Hi!", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "44444444444HiHiHiHiHiHiHiHiHiHi");
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "...                                                                   ...");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444", "44444444444444444444444444444444444444", "" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str6, "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi" + "'", str8, "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "4444444444", "44444444444444444444444444444444444444", "" });
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444" + "'", str1, "44444444444444444444444444444hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!444444444444444444444444444444");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "AAAAAAAAAA                  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4444444444##########44444444444444444444444444444444444444", ' ');
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444##########44444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "                               Hi!hi!hi!h                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("4!ih4!ih4!ih4!ih4!ih4!ih4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                #################################", "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", 52);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444Hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "          ...                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##########44444444444444444444444444444444444444##########");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "#                                                            HI!4HI!");
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.split("####################################################", "hi!                                ");
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("...4444444444444444444iH44444444444444444444444444444444444iH......", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("!i", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i" + "'", str2, "!i");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("444444444##########44444444444444444444444444444444444444##########", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            !I                                      ", "Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444##########44444444444444444444444444444444444444##########" + "'", str3, "444444444##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("4444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################", "          hi!               #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################");
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444", "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("###############                 ", "#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("         4", "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         4" });
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###      ", "                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                                                             ", "################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ###########################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             " + "'", str2, "                                                             ");
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("...####...     ", "4444444444444...", "hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####...     " + "'", str3, "...####...     ");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split(" #########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#########44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str1, "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                         aaaaaaaaaaaaaaaaaaaaaaaaaa", 968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ###########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "###########" });
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        char[] charArray5 = new char[] { '#', '#' };
        int int6 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("                               HI!HI!HI!H                               ", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                   ...####...44444", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("444444444444444                        44444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444                        44444" + "'", str2, "444444444444444                        44444");
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("Hi#!#                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        char[] charArray12 = new char[] {};
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray12);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray12);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", charArray12);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("Hi!hi!hi!h", charArray12);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray12);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsOnly("Hi!", charArray12);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsOnly("                 444444444444hi!", charArray12);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!hi!hi!h                                                                                         ", charArray12);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsNone("444444444444hi!", charArray12);
        int int22 = org.apache.commons.lang.StringUtils.indexOfAnyBut("###########################################################44444444444444444444444444444444444444", charArray12);
        int int23 = org.apache.commons.lang.StringUtils.indexOfAny("HI!                          444444444444hi!HI!                          ", charArray12);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsOnly("hi!hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("...aaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        char[] charArray12 = new char[] {};
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray12);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray12);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", charArray12);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("Hi!hi!hi!h", charArray12);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray12);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsOnly("Hi!", charArray12);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsOnly("                 444444444444hi!", charArray12);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!hi!hi!h                                                                                         ", charArray12);
        boolean boolean21 = org.apache.commons.lang.StringUtils.containsNone("444444444444hi!", charArray12);
        int int22 = org.apache.commons.lang.StringUtils.indexOfAnyBut("###########################################################44444444444444444444444444444444444444", charArray12);
        boolean boolean23 = org.apache.commons.lang.StringUtils.containsAny("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                                                                                                                                                                                                       444444444444hi#                                                            HI!4HI!i444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444", charArray12);
        boolean boolean24 = org.apache.commons.lang.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                     ...########...                                      ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                     ...", "", "", "", "", "", "", "", "...                                      " });
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("444444444aaaaaaaaaaaaaaaaaaaaa", "4444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444##########444444444444444444444444444444#####44444444444hihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("", 241);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI", "##########...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi...", " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi" + "'", str2, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("......", 562, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444......" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444......");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("   ");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!                                ", "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444                     ");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray5, "###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEach("...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444...", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "Hi!                                " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str8, "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ......                                               !ih                                                                !ih                                                                !ih                                                                !ih             a4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("         iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHiHiHiHiHiHiHi" + "'", str2, "iHiHiHiHiHiHiHi");
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("###", "4444444444444444444444444444444444444444444444444444444444444444Hi!", (int) (short) 1);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("                 4444444444444444444444444444444444", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         444444444");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "4444444444##########44444444444444444444444444444444444444##########", 10);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                                                                                                                                                                                                                                                                                                    i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("Hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray8);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray8);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsNone("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsNone("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("4444444444", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444", "44444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          ", "#############################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...################################...... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...#...#...#...#...#...#...#...#...#", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!ih4##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########..." + "'", str2, "########...");
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("4444444444 ########## 444444444444444444444444444444444444 #########", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444 ########## 444444444444444444444444444444444444 #########" + "'", str2, "4444444444 ########## 444444444444444444444444444444444444 #########");
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("########aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", 241, "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("44444444444444444444444444 ##########", 300, 142);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################..." });
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444", "...4444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...", 398);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h         4                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h         4" + "'", str1, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h         4");
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "                    aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", "#######44444444444444444444444444444444444444##########4444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                        ####### 44444444444444444444444444444444444444 ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ", 855, "...###############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###############################...#############                                                                                                                                                                                                                                                                                                                                                        ####### 44444444444444444444444444444444444444 ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ...###############################...#############" + "'", str3, "...###############################...#############                                                                                                                                                                                                                                                                                                                                                        ####### 44444444444444444444444444444444444444 ########## 444444444                                                                                                                                                                                                                                                                                                                                                        ...###############################...#############");
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", "               ", 663);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH..." });
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("!ih444444444444                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("", "444444444444444444444444Hi!4444444444444444444444444", (int) '#', 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444" + "'", str4, "444444444444444444444444Hi!4444444444444444444444444");
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ..." + "'", str3, "444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi                                                             ...");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("......##########################################  ######################################", "                                4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......##########################################  ######################################" + "'", str2, "......##########################################  ######################################");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("", "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ##############", "!4hi!4hi!4hi!4hi!4hi!4hi!4", 193);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      ##############" });
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                               !ih                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("                                                  ...                                              ", "i!hi!hi!##########44444444444444444444444444444444444444########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "", 37);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" });
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("", "i!hi!hi!##########44444444444444444444444444444444444444########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("4hi!#444444444#444444444#444444444#4444...", ' ');
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 HI!444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4hi!#444444444#444444444#444444444#4444..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4hi!#444444444#444444444#444444444#4444..." + "'", str4, "4hi!#444444444#444444444#444444444#4444...");
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "                               ", 1);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...####...");
        java.lang.String str8 = org.apache.commons.lang.StringUtils.replaceEach("hi!444444444444444444444444444444444444444444444444                ", strArray5, strArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.startsWithAny("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, ' ', 802, 57);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "...####..." });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!444444444444444444444444444444444444444444444444                " + "'", str8, "hi!444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("iHiHiHiHiHiHiH", "                                                                                                                                                                                                                                                                                                      #..............................................................................................................................................................................................................................................................................................................................................................                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("4444444444444444444444444aaaaaaaaaa4444444444444444444444444444444444!iH444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!" + "'", str1, "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!");
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("444444444444444                        ", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("...                        ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..." });
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("4##########                 4444444444444444444444444444444444##########                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4##########4444444444444444444444444444444444##########" + "'", str1, "4##########4444444444444444444444444444444444##########");
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray7);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray7);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray7);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", charArray7);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444##########444444444444444444444", charArray7);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("4 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "..." });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "..." });
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("4444Hi!4444444444444444444444444hi!4hi!4hi!", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444Hi!4444444444444444444444444hi!4hi!4hi!" + "'", str2, "4444Hi!4444444444444444444444444hi!4hi!4hi!");
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("44444444444#", "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444#" + "'", str2, "44444444444#");
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("hi!                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                     ", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("44444444444444444444444444 #########", "4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("444444444444444444444444444444444444444444444444", 64);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa            HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                 ");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih", 105, 9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("                                                                                                                                                                                                                                                 444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ", "###      ###      ###     ihihihihihihihi###      ###      ###      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                 444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        " + "'", str2, "                                                                                                                                                                                                                                                 444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("!iH4444444444########4444444444444444444444444444444444444444444444444444444..", "                                                                                                                                                                                                                                                                                             ...#...                                                                                                                                                                                                                                                                                                                                                                                       ", 219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("#############################......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi##############################", "                                                                                                                                                                                                                                                                                                                                                                                                                                               44444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                                                  ...                                               ", 204, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  ...                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                                  ...                                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("                                !ih", "                                Hi!                                                                 ", 680);
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("###############", strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "", 102, 32);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!      HI!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                !ih" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                !ih" + "'", str11, "                                !ih");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("###########################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################" + "'", str2, "###########################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444", 112);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#.." + "'", str2, "444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#...####...444444444#..");
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray0, "4444444444444444444444444aaaaaaaaaa4444444444444444444444444444444444!iH444444444444444444444444");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("#################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "#################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("H                                 !", "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("hi!hi!hi!h                                                                                         ", "                               HI!HI!HI!H                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h                                                                                         " + "'", str2, "hi!hi!hi!h                                                                                         ");
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("i!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4" + "'", str2, "i!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        boolean boolean3 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "4444444444" });
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                    aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                       444444444444444                        44444     ", '#', 998);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!###############################################################" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!###############################################################");
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444                 44444444444444444444444444444444444444444444                 ", "hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444                 44444444444444444444444444444444444444444444                 " });
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "########################################################################################################################################################################################################", " 4444444444  4444444444", 193);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str4, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###      #########", "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 444444444444444444444444444444444", 37);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("hi!      hi!                                              ", "Hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi!                                              " + "'", str2, "hi!      hi!                                              ");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 656);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ..." + "'", str2, "hihihihihihihihihihi                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ...");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                                                                                              ", "...                                                                   ...", 94);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################", (int) (byte) 0, 73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                      " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                      ");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444444444444444444444Hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "                                                                ####################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str2, "444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                                                                                                                                                                                                                                                                      #..............................................................................................................................................................................................................................................................................................................................................................                                                                                                                                                                                                                                                       ", 241);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("#################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################" + "'", str1, "#################################################################");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray3);
        boolean boolean5 = org.apache.commons.lang.StringUtils.containsAny("I!HI!HI!HI", charArray3);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a444444444444hi!a#aHI!4HI!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444", "####################################################", "i!hi!hi!hi", 37);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444" + "'", str4, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444");
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ", "...####...                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         " + "'", str2, "!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ");
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                         aaaaaaaaaaaaaaaaaaaaaaaaa", "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                         aaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("...####...     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi#                                                            HI!", " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHaaaaaaaaaaaaaaaaaaaaaaaaaaaaa... HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH... HHHHHHHHHHHHHH", 398);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########", "4444444444444444444444444444444" });
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "#################                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", "44444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI444444444444HI");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                   ", 998, 183);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("hhhhhhhhhhhh#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################h#####################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhh#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################h#####################################################################################################" + "'", str1, "hhhhhhhhhhhh#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################h#####################################################################################################");
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str1, "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("Hi!      hi!                     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase(".", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("44444444444444444444a4444444444########4444444444444444444444444444444444444444444444444444444...", "44444444444444444444444444444444444444##4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("44444444444hihihihihihihihihihi                                              ", "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "h", "h", "h", "h", "h", "h", "h", "h", "h" });
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################" + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "                                   iHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH########################################################################################################################");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("#4#4#4#4#4#4...", (int) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#4#4#4#4#4#4..." + "'", str3, "#4#4#4#4#4#4...");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                                                                               hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!                                                                                                                                                                                                                                ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                               hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!                                                                                                                                                                                                                                " });
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("###      ############      ############      ############      ############      ###      ############      ############      ############      ############      ", "                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaai#                                                            HaaaHaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaaiaaaaaaaaaaaaai");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!                          444444444444hi!HI!                          ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!", "444444444444hi!HI!" });
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#                                H!IH!IH!Ih               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("44444444444444444444444444444444###      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########4444444444444444444444444444444444444444444444444444444444444444", "4444444444 ########## 4444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaa                        444444444444444                        44444aaaaaaaaaaaaaaaaaaaaaa4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "iHiHiHiHiHiHiHiaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("########################...#################################################################################################                                                            HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "         4                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 656);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("444444444444444444444444444                                   iHiHiHiHiHiHiHi", 873, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HI!      HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!      HI" + "'", str2, "HI!      HI");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "......hI44444444444444444444444444444444444hI4444444444444444444...", 892);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." });
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("", 98, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#######################################################################################################################################################################################################################");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#######################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4#######################################################################################################################################################################################################################" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4#######################################################################################################################################################################################################################");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("aaaaaaaaaaahi!       aaaaaaaaaaa", "hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444", 219);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("           444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4HI!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("   #################################################################", "hi!      hi!#####", 204);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, 'a', 567, 583);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 567 out of bounds for length 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("h!ih!ih!iH", "444444444aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 444444444444444...", "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("...################################...################################...################################...################################......", "   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!444444444444444444444444444444444444444444444444                h", "!ih444444444444                 ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", "########## 44444444444444444444444444444444444444 ########## 4444444444aaaaaaaaaa                           ...", "###########44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####..." + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "                                     ...########...                                      ", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("...####...                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...####..." + "'", str1, "...####...");
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...#################################################################...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      ##############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##### 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa                                                                                                                                                                                                                       ", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                                   ", "...#...                                                                                          ", "44444444444                 44444444444444444444444444444444444444444444                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("                                                                                                 ", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii!ihiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaa444444444444444444444444                                #################################################################4444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", 690, 190);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                                                                                                                                                                                                                                                                                                                                                                                                                                      444444444444444444444444444444444444444444444444444444H                                                                                                                                                                                                                                                                                                                                                                                                                                       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("!ih", "####################################################44444444444444444444444444444444444", 1000, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####################################################44444444444444444444444444444444444" + "'", str4, "####################################################44444444444444444444444444444444444");
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 115, "....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                                                                                              44444444444444444444                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                                                                              ", "44444444444444444444", "                " });
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa", "Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa");
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4", "4444444444##########444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4" + "'", str2, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                ...", "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!h", 9);
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "                        ..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "", "", "", "", "..." });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray10);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray10);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray10);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAny("                 44444444444444444444444444444444444", charArray10);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                         ", charArray10);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", charArray10);
        int int18 = org.apache.commons.lang.StringUtils.indexOfAny("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray10);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsAny("#########################################", charArray10);
        boolean boolean20 = org.apache.commons.lang.StringUtils.containsOnly("444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("i!hi!hi!########## 44444444444444444444444444444444444444 ########", "...4444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!hi!hi!h");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "");
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!h" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!h" + "'", str3, "Hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!hi!hi!h" + "'", str5, "Hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", "                 444444444444hi!", (int) '4');
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("                             ########                              ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("aaaaaaaaa...4444444444444444444444444##########                 4444444444444444444444444444444444aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaa...4444444444444444444444444##########                 4444444444444444444444444444444444aaaaaaaaaa" + "'", str1, "aaaaaaaaa...4444444444444444444444444##########                 4444444444444444444444444444444444aaaaaaaaaa");
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                      ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                            ih!Ih!Ih!Ih!Ih!Ih               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, "Hi!      ", 498, 220);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("!                                 ", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        int int6 = org.apache.commons.lang.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!                                 " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                 " });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("##### ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#####", "" });
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "hi!hi!hi!", 540);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." });
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "44444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi444444444444hi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("a", "hi#                                                            HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                                 hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str1, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("", "4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444##########4444444444##########44444444444444444444444444444444444444######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAHI!HI!################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("         4", 295, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "         4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         444444444", 68, "Hi!      hi!             !ih !ih !ih !ih !ih !ih !ih !ih !ih !ihHi!      hi!             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         444444444" + "'", str3, "############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         444444444");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("#####                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 115);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("ih444444444444ih444hi!      hi4##########                 4444444444444444444444444444444444##########                 ", 910);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                           ih444444444444ih444hi!      hi4##########                 4444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                           ih444444444444ih444hi!      hi4##########                 4444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                                                     444444444444hi4444444444444444444444444444444444444444444444444444444444444444                                                    ", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("I!HI!HI");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I!HI!HI" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI" + "'", str2, "I!HI!HI");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4HI!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########4444444444 ########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4HI!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444" });
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 615);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("4hi!#444444444#444444444#444444444#4444...", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!#444444444#444444444#444444444#4444..." + "'", str3, "4hi!#444444444#444444444#444444444#4444...");
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                     ##########                                       #################################################################", 314, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                        ##########                                       #################################################################" + "'", str3, "                                                                                                                                                                                                        ##########                                       #################################################################");
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...aaaa", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 73, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi444444444444444444444HiHiHiHiHiHiH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("!                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#################                                                                         ");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("4444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################" + "'", str3, "#################");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 906 + "'", int4 == 906);
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...4444444444444444444444444##########                 4444444444444444444444444444444444", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...4444444444444444444444444", "", "", "", "", "", "", "", "", "", "                 4444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("Hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "hI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("###########44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########44444444444444444444444444444444444444" + "'", str1, "###########44444444444444444444444444444444444444");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!#HI!4HI!", ".");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!#HI!4HI!" });
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("!IH");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!IH" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", "iH!iH!iH!iH!iH!iH!iH!iH!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 921);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#', 220, 204);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    HHHHHHHHHHHHHHHHHHHHHHHHHHHH", 312, 667);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    HHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    HHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "...                        ");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.replaceEach("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str6, "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 892);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444", 398, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("Hi!      hi!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!      hi!" + "'", str2, "Hi!      hi!");
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                        ...                        ", "hi!hi!hi!h                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        ...                        " + "'", str2, "                        ...                        ");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        char[] charArray9 = new char[] { 'a', '#', ' ', 'a' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsNone("#########", charArray9);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("                                                                                         ", charArray9);
        boolean boolean13 = org.apache.commons.lang.StringUtils.containsAny("                                                             ", charArray9);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("                                                                                         44", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trim("HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("               #                ", "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               #                " + "'", str2, "               #                ");
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                    ");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, '#');
        int int10 = org.apache.commons.lang.StringUtils.lastIndexOfAny("44444444444444444444444444444444444", strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.stripAll(strArray4, "HI!HI!HI!");
        java.lang.String[] strArray13 = null;
        java.lang.String str14 = org.apache.commons.lang.StringUtils.replaceEach("4444444444444444444444444444444444444444444444444444444444444444444", strArray12, strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang.StringUtils.stripAll(strArray12, "...                                               !ih                                                                !ih                                                                !ih                                                                !ih                 ...");
        java.lang.String[] strArray18 = org.apache.commons.lang.StringUtils.stripAll(strArray16, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
        java.lang.String str20 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray16, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444" + "'", str14, "4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("hi!444444444444444444444444444444444444444444444444                hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!444444444444444444444444444444444444444444444444                hHHHHHHHHHHHHHH..." + "'", str2, "hi!444444444444444444444444444444444444444444444444                hHHHHHHHHHHHHHH...");
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("444444444444444                        ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444                        " + "'", str2, "444444444444444                        ");
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsNone("", charArray5);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray5);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!4444444444444444444444444444444444444444444444444", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi!         iHiHiHHi!      444444444444444                        44444hi!         iHiHiH", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!################################################                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("444444444#...####...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 'a', 181);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("!                                 H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                 H" + "'", str1, "!                                 H");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray3);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "4444444444##########44444444444444444444444444444444444444##########", 10);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("", strArray3, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.stripAll(strArray9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray9, '#', 35, 862);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                  ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                  " });
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "44444HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("####################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################44444444444444444444444444444444444444" + "'", str1, "####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                         ", "HI!4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                         " });
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("   ", 'a');
        int int5 = org.apache.commons.lang.StringUtils.lastIndexOfAny("###########44444444444444444444444444444...", strArray4);
        boolean boolean6 = org.apache.commons.lang.StringUtils.startsWithAny("44444444444hihihihihihihihihihi", strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                                                                                                                                                                                                                                                        ", 29, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                        " + "'", str3, "                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                         ####################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         ####################################44444444444444444444444444444444444444" + "'", str2, "                                         ####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("###########                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########" + "'", str1, "###########");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444##########4444444444444444444444444444444444!iH444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444##########4444444444444444444444444444444444!iH444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########AAAAAAAAAA                             HI!      HI!      #################", ' ');
        boolean boolean4 = org.apache.commons.lang.StringUtils.startsWithAny("               #                ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...####...", "444444444444444444444444444444444444444444", " ", "##########", " ", "44444444444444444444444444444444444444", " ", "##########!", "4", "hi", "!", "4", "hi", "!", "4", "hi", "!", "4", "hi", "!", "4", "hi", "!" });
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", "                                   aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########", "ih444444444444ih444hi!      hi4##########                 4444444444444444444444444444444444##########                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("##########...", "...####...                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########..." + "'", str2, "##########...");
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("iH!iH!iH!iH!iH!iH!iH!iH!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("################################..", "                     444...####...44444                      #########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################.." + "'", str2, "################################..");
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("#########################", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int10 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray9);
        java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray9, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray16 = org.apache.commons.lang.StringUtils.stripAll(strArray9, "                 444444444444hi!");
        java.lang.String str17 = org.apache.commons.lang.StringUtils.replaceEach("!                                 ", strArray6, strArray16);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "!                                 " + "'", str17, "!                                 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaa          ...                     aaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaa", "...", "aaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "4444444444##########44444444444444444444444444444444444444##########", 10);
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("", strArray4, strArray10);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                         ", strArray4);
        java.lang.String str16 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ', 1, 0);
        int int17 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        " + "'", str1, "                        ");
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("", "!ihih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 110);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("AAAAAAAAAAAAAAAAAAAAAAAAAA", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" + "'", str2, "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 105, "                                                 !I                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "#################################################################################################44444444444444444444444444444444444444444444444444444444444A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi!hi!" });
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("hi!     ", "         44444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444...444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("4#444444444#444444444#444444444#44444", 190);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4#444444444#444444444#444444444#44444" + "'", str2, "4#444444444#444444444#444444444#44444");
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444" + "'", str1, "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###" + "'", str2, "###      ###      ###     iHiHiHiHiHiHiHi###      ###      ###");
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("                  hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!                  ", "#################################################################                             ####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################                             ####################" + "'", str2, "#################################################################                             ####################");
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("aaa####################################44444444444444444444444444444444444444aaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa####################################44444444444444444444444444444444444444aaaa" + "'", str1, "aaa####################################44444444444444444444444444444444444444aaaa");
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" });
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithAny("####################################################", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                           !                                 h                            ", 510, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444", (int) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!IH444444444444444444444444444444");
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "44444444444444444444444444444444444");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                    " + "'", str5, "                                                                                                    ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "                                HI!                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("#################################################################                             ####################", "########################...##################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################                             ####################" + "'", str2, "#################################################################                             ####################");
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..." });
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) ".................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("!                                 ", 'a');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!                                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                 " + "'", str3, "!                                 ");
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", ' ');
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray5);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray5, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("                 444444444444hi!", strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.splitByCharacterType("                        444444444444444                        44444");
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly(" #########44444444444444444444444444444444444444444444444444444444444A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray5, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                        ", "444444444444444", "                        ", "44444" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " #########44444444444444444444444444444444444444444444444444444444444A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str12, " #########44444444444444444444444444444444444444444444444444444444444A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "#################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("...4444444444444444444444444444444444444444444444444444444                                         ", 295, 184);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("Hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str1, "HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("                                !IH                                                                              HHHHHHHHHHHHHHHH", "                                                                    4444##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "                                                                                                                                                                                                                                                                                                             44444444444hihihihihihihihihihi                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            HI!#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi" + "'", str2, "                                                            HI!#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi");
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...#################################################################################################HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" });
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray10);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444444444444444", charArray10);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAnyBut("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", charArray10);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAnyBut("          ", charArray10);
        boolean boolean15 = org.apache.commons.lang.StringUtils.containsNone("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", charArray10);
        boolean boolean16 = org.apache.commons.lang.StringUtils.containsAny("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", charArray10);
        int int17 = org.apache.commons.lang.StringUtils.indexOfAny("###########################################################################################################################################################################################################################################################################################################################", charArray10);
        boolean boolean18 = org.apache.commons.lang.StringUtils.containsAny("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", charArray10);
        boolean boolean19 = org.apache.commons.lang.StringUtils.containsOnly("Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", charArray10);
        int int20 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                                                                                                                       ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("   444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", "##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########4444444444444444444444444444444##########444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator(".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", "");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str3, ".Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        char[] charArray7 = new char[] { 'a', '4', ' ' };
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", charArray7);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("", charArray7);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("...                                                                                                                                               ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '4', ' ' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 498 + "'", int9 == 498);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray8);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray8);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", charArray8);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("Hi!hi!hi!h", charArray8);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray8);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsOnly("Hi!", charArray8);
        int int15 = org.apache.commons.lang.StringUtils.indexOfAnyBut("a4444444444########4444444444444444444444444444444444444444444444444444444...", charArray8);
        int int16 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                               hi4hi4hi4hi4hi4hi4hi4hi4hi4hi4HI!i4hi#                                                            HI!                                                                                                                                                                                                                                ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        char[] charArray9 = new char[] { 'a', '#', ' ', 'a' };
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("4", charArray9);
        int int12 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", charArray9);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H          ", charArray9);
        boolean boolean14 = org.apache.commons.lang.StringUtils.containsAny("   444444444444hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa           ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           HHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                    ");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int9 = org.apache.commons.lang.StringUtils.lastIndexOfAny("44444444444444444444444444444444444", strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                        ##########                                       #################################################################", "44444444444444444444444444444......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                        ##########                                       #################################################################" });
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444", "i!hi!hi!hi", 968);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH", "444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                                     ##########                                       #################################################################", "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     ##########                                       #################################################################" + "'", str2, "                                     ##########                                       #################################################################");
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#", "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         444444444444444444444444444444444444444a...####", 50);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '4', 49, 36);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("44444444444444444444444444444444###      ", (int) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444###      " + "'", str3, "44444444444444444444444444444444###      ");
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("444444444444hi4444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi4444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444hi4444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("444444444444444444444444444444444444444a...####...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444!ih4                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("I!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi" + "'", str1, "i!hi!hi!hi");
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi" + "'", str2, "444444444444444444444HiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444HiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("#####################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################" + "'", str1, "####################################################################################");
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("                                     ##########                                       #################################################################", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     ##########                       ..." + "'", str2, "                                     ##########                       ...");
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("a4444444444########4444444444444444444444444444444444444444444444444444444...", "Hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str2, "a4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4#######################################################################################################################################################################################################################", 34, 562);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4#######################################################################################################################################################################################################################" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4#######################################################################################################################################################################################################################");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaa####################################44444444444444444444444444444444444444aaaa", "444444444444444444444444444                                   iHiHiHiHiHiHiHi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("...          !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...          !ih" + "'", str1, "...          !ih");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("########################", "###################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H####################################################################################################################################################################################################################");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "########################" + "'", str4, "########################");
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaahi", "                               Hi!hi!hi!h                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("###", '4', 443);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h         4                        ", "####### 44444444444444444444444444444444444444 ########## 444444444", 910);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!hi!hi!h");
        boolean boolean3 = org.apache.commons.lang.StringUtils.startsWithAny("####### 44444444444444444444444444444444444444 ########## 444444444", strArray2);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI!HI!ih444444444444                 HI!HI!HI");
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HHI!HI!HI!ih444444444444                 HI!HI!HIiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIh" + "'", str5, "HHI!HI!HI!ih444444444444                 HI!HI!HIiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIh");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("Hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             ", 999);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hihi!" });
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "                                4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "HHI!HI!HI!ih444444444444                 HI!HI!HIiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIhiHI!HI!HI!ih444444444444                 HI!HI!HI!HI!HI!HI!ih444444444444                 HI!HI!HIh", "                                                                              iH", 220);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str4, "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                                                                                                                                                                                                                                                                                                                  444444444##########44444444444444444444444444444444444444##########                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("                               !ih", "                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               !ih" + "'", str2, "                               !ih");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("444444444444444444444444Hi", "####################################################################################################################################################################################################################################################################################################################4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444Hi" + "'", str2, "444444444444444444444444Hi");
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444444##44444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444", "", "44444444444444444444444444444444444444" });
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("hi!      hi!#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi!#####" + "'", str1, "hi!      hi!#####");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                                                                         4444444444444444444444444444444444", 153, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444                                                                                         4444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444                                                                                         4444444444444444444444444444444444");
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", "########################...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444##########444444444444444444444", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...                        ", "####################################################I!HI!HI!HI########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                         4444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 921, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("", "hi!                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("...       HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "################################..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "Hi!      hi!                     44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("                                           4444444444444444444444444aaaaaaaaaa4444444444444444444444444444444444!iH444444444444444444444444                                            ", "444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444", 196, 60);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                           44444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444" + "'", str4, "                                           44444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!4444444444444444444444444444444444444444444444444Hi!44444");
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444HI!4444444444444444444444444AAAAAAAAAAAAAAAAAA..." });
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("444444444444444                        44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("aAAAAAAAAAAAAAAAAAAAAAAA444444444444444444444444hI!4444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("hi!444444444444444444444444444444444444444444444444                hHHHHHHHHHHHHHH...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("Hi!      hi!             !ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ih4!ihHi!      hi!             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", "                               !ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4" });
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("              i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ###############################################################                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444...###############################...###############################...####", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("########## 44444444444444444444444444444444444444 ########## 4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444 ########## 44444444444444444444444444444444444444 ##########" + "'", str1, "4444444444 ########## 44444444444444444444444444444444444444 ##########");
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("                                                                                        44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I" + "'", str1, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!I");
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("...4444444444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444444444444444444444444444444444444444" + "'", str2, "...4444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray6);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsAny("4444444444##########44444444444444444444444444444444444444##########", charArray6);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("###########                                      ", charArray6);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsAny("4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", charArray6);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#########4444444444 ########## 44444444444444444444444444444444444444 ##########", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                                         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                         " });
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "                                h!ih!ih!iH                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hhi!      hihi!");
        int int5 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................", "444444444444444#4444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!      hi!                     ......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str2, "Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("", 667);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!                                ", "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!                                " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444444444444444444444                                                                                         4444444444444444444444444444444444", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 152 + "'", int2 == 152);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("      ", '4');
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "      " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!#" + "'", str1, "Hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!######hi!#");
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("########################################", '4');
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "########################################" });
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!" + "'", str2, "                444444444444444444444444444444444444444444444444!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!");
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("", "4444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("                                                                                                                                                                                    ###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                    ###################################" + "'", str1, "                                                                                                                                                                                    ###################################");
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("!                                 ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("          #4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!4444444444444444444444444444444444Hi!444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444444444444444444444444444444444... 44444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "                                 " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                            ...", "                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            ..." + "'", str2, "                            ...");
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("h                                 ", "...################################...################################...################################...################################......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444##########44444444444444444444444444444444444444##########", "#", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444", "44444444444444444444444444444444444444", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...44444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str5, "4444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...44444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("Hi!      hi!      hi!      hi!      hi!      hi!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hi!hi!..." + "'", str1, "Hi!hi!hi!hi!hi!hi!...");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH", "Hi!hi!hi!h", "                                 ......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH" + "'", str3, "#####################################################################################################H#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################HHHHHHHHHHHH");
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 315, "###################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H####################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############################################################################################################################" + "'", str3, "###########################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa############################################################################################################################");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("...4444444444444444444Ih44444444444444444444444444444444444Ih......", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...4444444444444444444Ih44444444444444444444444444444444444Ih......" });
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!#HI!4HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!#HI!4HI!" + "'", str1, "444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!444444444444hi!#HI!4HI!");
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "          ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "", 2, 1000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...####...", "" });
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType(" #########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "#########" });
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                       ", 862);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                       AAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444!Ih444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllUpperCase("                                                                                                                                                                                                                                              44444444444444444444                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                !IH                                                                              HHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                                                                              HHHHHHHHHHHHHHHH" + "'", str1, "!IH                                                                              HHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!444444444444444444444444444444444444444444444444################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("...    ...                                                                                          ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("...############################...", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "..." });
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!hi!hi", 690, "                                                                                                                                                        ###########                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                        ###########                                                                                                                                                                                  hi!hi!hi                                                                                                                                                        ###########                                                                                                                                                                                  " + "'", str3, "                                                                                                                                                        ###########                                                                                                                                                                                  hi!hi!hi                                                                                                                                                        ###########                                                                                                                                                                                  ");
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##", "...4444444444444444444444444444444444444444444444444444444                                         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("                                                                                              ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              " + "'", str2, "                                                                                              ");
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean5 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##########44444444444444444444444444444444444444##########");
        java.lang.String str10 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#########", strArray7, strArray9);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########" + "'", str12, "4444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#########" + "'", str13, "#########");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("         4                        ", 663);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                   4                                                                                                                                                                                                                                                                                                                                                   " + "'", str2, "                                                                                                                                                                                                                                                                                                                                   4                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("               ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("44444444444444444444444444444......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", 414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("...    ...", "#####################################################################################################h#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("44444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444" + "'", str1, "44444444444444");
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 172);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, ' ', 544, 886);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 544 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("...4444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("                                     ...########...                                      ", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      ...########...                                        " + "'", str2, "                                      ...########...                                        ");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("HI!HI!HI!", "44444444444444444444444444444444444", "########################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!" + "'", str3, "HI!HI!HI!");
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("Hi                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("H                                 !", 274, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H                                 !444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H                                 !444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!i" });
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", 70, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444" + "'", str3, "4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "...####...", 0);
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("##################################################################################################################################################################################################################################################################44444444444444444444444444444444444444########################################################################################################################################################################################################################################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "...             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

