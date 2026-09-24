package org.apache.commons.lang;

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
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("                                                                ###################################", "", "##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("444444444444hi", "#########", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("4444444444 ########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########## 44444444444444444444444444444444444444 ########## 4444444444" + "'", str1, "########## 44444444444444444444444444444444444444 ########## 4444444444");
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("444444444#...####...", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.lowerCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        int int4 = org.apache.commons.lang.StringUtils.lastIndexOfAny("####### 44444444444444444444444444444444444444 ########## 4444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("...####...                                                                                          ", "########");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...####...                                                                                          " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...####...                                                                                          " + "'", str4, "...####...                                                                                          ");
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, ' ', (int) (short) 10, 663);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                                                                         4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                         4444444444" + "'", str1, "                                                                                         4444444444");
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("!                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("                               Hi!hi!hi!h                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                h!ih!ih!iH                               " + "'", str1, "                                h!ih!ih!iH                               ");
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("4444444444444444444444444444444444444444444444444444444444444444H", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444H" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444", "!                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("...4444444444444444444444444444444444444444444444444444444########4444444444H", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf(" ", "...", 900);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 " + "'", str1, "                                 ");
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("444444444444444444444444Hi!4444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("########", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "...####...      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                                ##################################", 14, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                ##################################" + "'", str3, "                                                                ##################################");
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                ...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444");
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444##########44444444444444444444444444444444444444##########", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", "                                                                ###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("4444444444##44444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("###########################################################44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             hi!      hi!      #################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########################                             hi!      hi!      #################" + "'", str2, "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########################                             hi!      hi!      #################");
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("!                                 h", 89, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                 h" + "'", str3, "!                                 h");
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("44444444444444444444444444 ##########", "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444 ##########" + "'", str2, "44444444444444444444444444 ##########");
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("4444444444 ########## 44444444444444444444444444444444444444 ##########", "444...####...444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("444444444444444444444444Hi!4444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("Hi!      hi!                     44444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("444444444##########44444444444444444444444444444444444444##########", "444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                                                ##################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("......", "4444444444", "##################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......" + "'", str3, "......");
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("Hi!                                ", "####################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "hi!      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("hi!                                ", "###########################################################44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                " + "'", str2, "hi!                                ");
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "44444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########", 498);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("##########44444444444444444444444444444444444444##########", "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########44444444444444444444444444444444444444##########" + "'", str2, "##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("", 548, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (int) (short) 10, "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("...####...", "########");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "###################################");
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("4444444444##########44444444444444444444444444444444444444##########", "#", (int) (short) 100);
        java.lang.String[] strArray12 = org.apache.commons.lang.StringUtils.stripAll(strArray10, "###################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("...####...", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...", "", "", "", "..." });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...", "", "", "", "..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...############################################################################################################################################..." + "'", str6, "...############################################################################################################################################...");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "4444444444", "44444444444444444444444444444444444444", "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "4444444444", "44444444444444444444444444444444444444", "" });
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("Hi!hi!hi!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hi!                                ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("         4", "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", 498, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str2, "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("...####...                                                                                          ", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 42, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("......Hi44444444444444444444444444444444444Hi4444444444444444444...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", "44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean3 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray2);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ', 0, 910);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("####################################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("", charArray7);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray7);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly("##########", charArray7);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly(" ", charArray7);
        int int13 = org.apache.commons.lang.StringUtils.indexOfAny("#", charArray7);
        int int14 = org.apache.commons.lang.StringUtils.indexOfAny("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("!                                 ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("", "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444", 548, 968);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444" + "'", str4, "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444");
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("", 64, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("", "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBefore("444444444444hi", "HI!                          444444444444hi!HI!                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444hi" + "'", str2, "444444444444hi");
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("   ", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 " + "'", str1, "                                 ");
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("Hi!      hi!                     ", 968, "......");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!      hi!                     ......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str3, "Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444..." + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("44444444444444444444444444444444444444444444444444444444444444444...", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444..." + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("", "#444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "      ", (int) (byte) 10, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444" + "'", str4, "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", "########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("H4444444444########4444444444444444444444444444444444444444444444444444444...", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "                                                                                                    ");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("#########", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 30 vs 101");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("                                                                                         ", "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         " + "'", str2, "                                                                                         ");
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("...####...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!", 0, "HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!" + "'", str3, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("H4444444444########4444444444444444444444444444444444444444444444444444444...", "                               !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOfAny("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("", "aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", "4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "4hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace(" ", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("#444444444", "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("4444444444##########44444444444444444444444444444444444444", "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "4444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("!", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("!iH4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str1, "!iH4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "          ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 65);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      " });
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("                 44444444444444444444444444444444444", 680);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", "##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     " + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", "                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str2, "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("!iH", "......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("!", "4444444444444444444444444444444444444444444444444444444444444444Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444Hi!" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444Hi!");
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", "a");
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.split("##########", "                                ...", 10);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEach("                                   ", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "##########" + "'", str8, "##########");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##########" + "'", str10, "##########");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                   " + "'", str11, "                                   ");
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", 968, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("                 444444444444hi!");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, '4', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                 ", "444444444444", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("!                                 h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                 h" + "'", str1, "!                                 h");
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("Hi!", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int3 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "                 444444444444hi!");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "                                !ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "##########" + "'", str11, "##########");
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......hI44444444444444444444444444444444444hI4444444444444444444..." + "'", str1, "......hI44444444444444444444444444444444444hI4444444444444444444...");
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("......hI44444444444444444444444444444444444hI4444444444444444444...", "###########################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......hI44444444444444444444444444444444444hI4444444444444444444..." + "'", str2, "......hI44444444444444444444444444444444444hI4444444444444444444...");
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBeforeLast("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "         4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      " + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4", "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih" + "'", str2, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih");
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("HI!4444444444444444444444444444444444444444444444444", ' ', 999);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
        int int2 = org.apache.commons.lang.StringUtils.getLevenshteinDistance("44444444444444444444444444444444444444444444444444444444444444444...", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                                #################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                #################################################################" + "'", str1, "                                #################################################################");
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("                        444444444444444                        44444", 67, "                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        444444444444444                        44444" + "'", str3, "                        444444444444444                        44444");
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("hi!4444444444444444444444444444444444444444444444444", "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("...####...", "................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####..." + "'", str2, "...####...");
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("Hi!      hi!                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", "a");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("#444444444", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#444444444" + "'", str2, "#444444444");
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("444444444444444444444444444444Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("444444444##########44444444444444444444444444444444444444##########", 999, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("", "                                !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "!                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("4hi!#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#44444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("444444444444444444444444444444444444444444444444", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("4444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("hi!          ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!          ..." + "'", str2, "hi!          ...");
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4", 16, "                                                                                         4444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4" + "'", str3, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        int int1 = org.apache.commons.lang.StringUtils.length("               Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 68 + "'", int1 == 68);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("###########################################################44444444444444444444444444444444444444", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################44444444444444444444444444444444444444" + "'", str3, "###########################################################44444444444444444444444444444444444444");
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                         " + "'", str1, "                                                                                         ");
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("Hi!hi!hi!h                                                                                         ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("44444444444444444444444444444444", "HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphaSpace("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("4", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH");
        int int3 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("!iH", "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iH" + "'", str3, "!iH");
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", 498);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                         4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "hi!");
        boolean boolean7 = org.apache.commons.lang.StringUtils.startsWithAny("", strArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "44444444444444444444444444444444444");
        java.lang.String str12 = org.apache.commons.lang.StringUtils.replaceEach("44444444444444444444444444444444444", strArray6, strArray11);
        java.lang.String str13 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray6);
        boolean boolean14 = org.apache.commons.lang.StringUtils.startsWithAny("                                ", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str13, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444H", "4444444444444444444444444444444444##########44444444444444444444444444" });
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", "hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 1, 172);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str4, "Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("......");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", 90, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str3, "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h" + "'", str2, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h");
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("i!hi!hi!h", "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("", '#', 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444" + "'", str3, "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444");
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("444444444#...####...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444#...####..." + "'", str1, "444444444#...####...");
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "!iH4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        int int2 = org.apache.commons.lang.StringUtils.indexOf(" HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...", 999);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("44444444444444444444444444 ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444 ##########" + "'", str1, "44444444444444444444444444 ##########");
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...", "                                #################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 73, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        " + "'", str3, "                        ");
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("!!!!!!!!!!", "444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4", "44444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("...############################################################################################################################################...", "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("44444444444HiHiHiHiHiHiHiHiHiHi", 16, 900);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHiHiHiHiHiHiHi" + "'", str3, "iHiHiHiHiHiHiHi");
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444" + "'", str1, "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("                                ...", 0, "!iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                ..." + "'", str3, "                                ...");
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("4444444444444444444444444444444444444444444444444444444444444444444444444444444", 548, "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("aaaaaaaaaa                             #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 # 44444444444444444444444444444444444444 #4444444444 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!hi!hi!h                                                                                         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!h", 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 755 + "'", int3 == 755);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("44444444444444444444444444444444##########44444444444444444444444444444444444444##########4444444444                             #################################################################", "                                                                                         4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H", "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("4444444444##########44444444444444444444444444444444444444##########", "hi!444444444444444444444444444444444444444444444444                h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########" + "'", str2, "4444444444##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!444444444444444444444444444444444444444444444444                h", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "                                Hi!                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("444...####...444444", "                                                                ##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("          ", 1000, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################          " + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################          ");
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!", "444444444##########44444444444444444444444444444444444444##########");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        int int5 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########################                             hi!      hi!      #################", 900, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########################                             hi!      hi!      #################" + "'", str4, "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########################                             hi!      hi!      #################");
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("Hi!hi!hi!", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!" + "'", str2, "Hi!hi!hi!");
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("                                !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                !ih" + "'", str1, "                                !ih");
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "4444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      " + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ");
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("                 444444444444hi!", "                                                                                         4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("444444444#", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444" + "'", str2, "444444444");
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("!                                 h", (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang.StringUtils.join(objArray0, "      ", (int) 'a', (int) ' ');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("#########", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("H", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("4444444444 ########## 44444444444444444444444444444444444444 ##########", "                                h!ih!ih!iH                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultIfEmpty("...####...                                                                               ", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...                                                                               " + "'", str2, "...####...                                                                               ");
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "                                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H44444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("44444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##", "444444444444444444444444hI!4444444444444444444444444444444444##########44444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("Hi!      hi!                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!      hi!                     " + "'", str2, "Hi!      hi!                     ");
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "                 444444444444hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("HI!                          444444444444hi!HI!                          ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!                          444444444444hi!HI!                          " });
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("...####...                                                                               ", "......Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444Hi44444444444444444444444444444444444H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.abbreviate("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 663);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444444444", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "Hi!", 663);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih" + "'", str4, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih");
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########");
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("!                                 ", "                                #################################################################", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "####################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                                                                    ", "", 498);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("", "", 680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("...4444444444444444444444444444444444444444444444444444444########4444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444444444444444444444444444444444444444444444444444444########4444444444H" + "'", str1, "...4444444444444444444444444444444444444444444444444444444########4444444444H");
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......Hi44444444444444444444444444444444444Hi4444444444444444444..." + "'", str1, "......Hi44444444444444444444444444444444444Hi4444444444444444444...");
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("##########", "                                ...", 10);
        java.lang.String str4 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 10, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##########" + "'", str4, "##########");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##########" + "'", str6, "##########");
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumericSpace("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("HI!                          444444444444hi!HI!                          ", "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("4444444444##########44444444444444444444444444444444444444##########", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444##########444444444444444444444" + "'", str2, "4444444444##########444444444444444444444");
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!       ", "#########", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang.StringUtils.split("");
        boolean boolean8 = org.apache.commons.lang.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", strArray7);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray7, "");
        java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEach("i!hi!hi!h", strArray4, strArray7);
        int int12 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!       " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i!hi!hi!h" + "'", str11, "i!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        int int1 = org.apache.commons.lang.StringUtils.length("Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsNone("", charArray5);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444###########", charArray5);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAnyBut("###################################", charArray5);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("......hI44444444444444444444444444444444444hI4444444444444444444...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("hi!                                ", "###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("...############################################################################################################################################...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "iHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "...####...", 680);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("...####...      ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("                        444444444444444                        44444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        444444444444444                        44444" + "'", str1, "                        444444444444444                        44444");
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("Hi!      hi!                     44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("hi!4444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("####### 44444444444444444444444444444444444444 ########## 4444444444", "                                h!ih!ih!iH                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####### 44444444444444444444444444444444444444 ########## 4444444444" + "'", str2, "####### 44444444444444444444444444444444444444 ########## 4444444444");
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444");
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444##########44444444444444444444444444444444444444##########", "                                                                                         ", 68);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444##########44444444444444444444444444444444444444##########" });
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444                     ", "                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "          #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("!iH", "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", (int) (short) 0, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str3, "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAsciiPrintable("#444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                #################################################################", 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################                                #################################################################", 82, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############                 " + "'", str3, "###############                 ");
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("4444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "HI!4444444444444444444444444444444444444444444444444", 57);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 498);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444" });
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "......");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!" + "'", str2, "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("   ", "hi!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str2, "4444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("hi!4444444444444444444444444444444444444444444444444", "...####...                                                                                         ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("                                                                                         ", "...", (int) (short) 10, 68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          ...                     " + "'", str4, "          ...                     ");
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("###################################", "####################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) (short) 1, 41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 36");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("...####...                                                                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("!                                 H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfterLast("hi!          ...", "                 444444444444hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!" + "'", str1, "HI!HI!HI!");
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        boolean boolean2 = org.apache.commons.lang.StringUtils.contains("44444444444444444444444444444444", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("###########44444444444444444444444444444444444444", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########                                      " + "'", str3, "###########                                      ");
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("                                                                                         4444444444444444444444444444444444", "####### 44444444444444444444444444444444444444 ########## 4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         4444444444444444444444444444444444" + "'", str2, "                                                                                         4444444444444444444444444444444444");
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("4444444444##########44444444444444444444444444444444444444", "......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "4444444444##44444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " });
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("4444444444444444444444444444444444", "                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         " + "'", str2, "                                                                                         ");
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str1, "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("#", "hi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("###########################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################" + "'", str1, "###########################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("################################...", "4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444" + "'", str1, "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        char[] charArray6 = new char[] { 'a', '#', ' ', 'a' };
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAnyBut("                                #################################################################", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.defaultString("##########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("...4444444444444444444444444444444444444444444444444444444########4444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H4444444444########4444444444444444444444444444444444444444444444444444444..." + "'", str1, "H4444444444########4444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsNone("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", "                 444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("...####...                                                                                        ", "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...####...                                                                                        " });
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.center("!                                 ", 1000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove(" HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH..." + "'", str2, " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray5);
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray5);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", charArray5);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("Hi!hi!hi!h", charArray5);
        int int10 = org.apache.commons.lang.StringUtils.indexOfAnyBut("###########################################################################################################################################################################################################################################################################################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isWhitespace("a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                ##################################", "4444444444##########44444444444444444444444444444444444444##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                " });
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.defaultString("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444" + "'", str1, "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444");
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumericSpace("444444444#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByCharacterType("4444444444##########44444444444444444444444444444444444444##########");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.stripAll(strArray2, "...############################################################################################################################################...");
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!444444444444444444444444444444444444444444444444                h", strArray6, strArray9);
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
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "4444444444", "", "44444444444444444444444444444444444444", "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "##########" });
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", "###########################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("444444444#", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("###########################################################################################################################################################################################################################################################################################################################", "hi!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################" + "'", str2, "###########################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
        int int2 = org.apache.commons.lang.StringUtils.indexOf(" ", "444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang.StringUtils.indexOfAny("4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.split("#444444444", "Hi!hi!hi!h");
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEach("Hi!                                ", strArray4, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray9, ' ', 1, 68);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##########" + "'", str5, "##########");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "#444444444" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!                                " + "'", str10, "Hi!                                ");
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "!                                 ", 999);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi", "Hi", "Hi", "Hi", "Hi", "Hi", "Hi", "Hi", "Hi", "Hi", "Hi", "HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" });
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", "HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("                                ", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                    ", "                                                                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray3, "                                         ", 68, 0);
        java.lang.String[] strArray10 = org.apache.commons.lang.StringUtils.splitByCharacterType("Hi!hi!hi!h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 101 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "H", "i", "!", "hi", "!", "hi", "!", "h" });
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                                                                 ...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("###########################################################44444444444444444444444444444444444444", "###########44444444444444444444444444444444444444", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "################################################", "" });
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!      hi!                     ......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str1, "Hi!      hi!                     .......................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                ##########                                      ##########                                       #################################################################" + "'", str3, "                                ##########                                      ##########                                       #################################################################");
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.lowerCase("......Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH", "4444444444444444444444444444444444444444444444444444444444444444Hi!", 64);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("4444444444##44444444444444444444444444444444444444", "4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("", "###", "4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444##########                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("4hi!", "Hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("Hi!hi!hi!h", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!h" + "'", str3, "Hi!hi!hi!h");
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                ...", "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!h", 9);
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.stripAll(strArray3, "HI!4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "                        ..." });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "", "", "", "", "", "                        ..." });
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        int int2 = org.apache.commons.lang.StringUtils.indexOfAnyBut("...####...                                                                                         ", "Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", "444...####...444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444Hi" + "'", str2, "444444444444444444444444Hi");
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "a", (int) '4');
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("          ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("...####...                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...####..." + "'", str1, "...####...");
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                 44444444444444444444444444444444444", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("hi!4444444444444444444444444444444444444444444444444", "4########4444444444444444444444444444444444444444444444444444444...", 755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("!                                 ", "hi!444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("H4444444444########4444444444444444444444444444444444444444444444444444444...", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 73 + "'", int2 == 73);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStart("44444444444444444444444444 ##########", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444 ##########" + "'", str2, "44444444444444444444444444 ##########");
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equals("H4444444444########4444444444444444444444444444444444444444444444444444444...", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444", "##########", "44444444444444444444444444444444444444", "##########", "4444444444444444444444444444444" });
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("###", "iHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("          ", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("...####...                                                                               ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####...                                                                               " + "'", str2, "...####...                                                                               ");
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 hi!444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("                        4444444444444...                        ", "4444444444444444444444444444444444", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("444444444#...####...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", 910);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444" + "'", str2, "                                                                                                                                                                                                                                      #444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444");
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   !                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h44444444444444444444444444444444444444444444444444444444444444444...", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################4hi!##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceChars("H", "#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", (int) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("...####...", "444444444#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####..." + "'", str2, "...####...");
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        java.lang.String[] strArray5 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("", "4444444444##########44444444444444444444444444444444444444##########", 10);
        java.lang.String[] strArray9 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "4444444444##########44444444444444444444444444444444444444", (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("hi!      ", strArray5, strArray9);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", strArray9);
        java.lang.Class<?> wildcardClass12 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!      " + "'", str10, "hi!      ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWith("####### 44444444444444444444444444444444444444 ########## 4444444444", "444...####...444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        int int2 = org.apache.commons.lang.StringUtils.countMatches("Hi!hi!hi!h", "hi!      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsIgnoreCase("########", "!iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("                                                                                         4444444444444444444444444444444444", "########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         4444444444444444444444444444444444" + "'", str2, "                                                                                         4444444444444444444444444444444444");
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("4444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", 9, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444########" + "'", str3, "4444444########");
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        char[] charArray7 = new char[] { 'a', '#', ' ', 'a' };
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsOnly("4", charArray7);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterType("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########");
        java.lang.String str5 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray1, 'a', 57, 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##########" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substring("Hi!hi!hi!h                                                                                         ", 0, 968);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!h                                                                                         " + "'", str3, "Hi!hi!hi!h                                                                                         ");
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("", "...############################################################################################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("A", 'a', 1000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("4444444444########4444444444444444444444444444444444444444444444444444444...", '4', 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...", "hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####..." + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("!                                 h", (int) '4', 968);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                 h" + "'", str3, "!                                 h");
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chop("####### 44444444444444444444444444444444444444 ########## 4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####### 44444444444444444444444444444444444444 ########## 444444444" + "'", str1, "####### 44444444444444444444444444444444444444 ########## 444444444");
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("hi!", "444444444444444444444444Hi!4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H", 34, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H" + "'", str3, "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripStart("##########44444444444444444444444444444444444444##########", "Hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########44444444444444444444444444444444444444##########" + "'", str2, "##########44444444444444444444444444444444444444##########");
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.substringBetween("HI!", "###########                                      ", "####### 44444444444444444444444444444444444444 ########## 444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replaceOnce("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!" + "'", str3, "...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!");
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        char[] charArray6 = new char[] { 'a', '#', ' ', 'a' };
        boolean boolean7 = org.apache.commons.lang.StringUtils.containsAny("hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("          ...                     ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("###############                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############" + "'", str1, "###############");
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("hi!4444444444444444444444444444444444444444444444444", 1, "                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444444444444444444444444444444444444444444444444" + "'", str3, "hi!4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("hi!444444444444444444444444444444444444444444444444                ", (int) (short) -1, "4444444444##########44444444444444444444444444444444444444##########4444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!444444444444444444444444444444444444444444444444                " + "'", str3, "hi!444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.split("...####...                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...####..." });
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("Hi!      hi!                     44444444444444444444444444444444444", 0, 498);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!      hi!                     44444444444444444444444444444444444" + "'", str3, "Hi!      hi!                     44444444444444444444444444444444444");
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray6);
        boolean boolean8 = org.apache.commons.lang.StringUtils.containsNone("", charArray6);
        boolean boolean9 = org.apache.commons.lang.StringUtils.containsNone("##########", charArray6);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsOnly("##########", charArray6);
        boolean boolean11 = org.apache.commons.lang.StringUtils.containsOnly(" ", charArray6);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsOnly("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444", "444...####...44444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.stripEnd("4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444", "Hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444" + "'", str2, "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                                !ih", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.split("444444444#", "", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444#" });
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isBlank((java.lang.CharSequence) "4444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########444444444444444444444444444444444444444444##########44444444444444444444444444444444444444##########44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.repeat("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", "Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444" + "'", str3, "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444");
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str6 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                    ");
        java.lang.String str7 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray4, '#');
        int int10 = org.apache.commons.lang.StringUtils.lastIndexOfAny("44444444444444444444444444444444444", strArray4);
        java.lang.String[] strArray13 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("##########", "                                                                                                    ");
        int int14 = org.apache.commons.lang.StringUtils.indexOfDifference(strArray13);
        java.lang.String str18 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray13, "", (int) (byte) -1, (int) (short) -1);
        java.lang.String[] strArray20 = org.apache.commons.lang.StringUtils.stripAll(strArray13, "                 444444444444hi!");
        java.lang.String str24 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray13, '#', 10, 0);
        java.lang.String str25 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("                                                                ##################################", strArray4, strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "##########" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                ##################################" + "'", str25, "                                                                ##################################");
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("                                         ", 663);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.trimToNull("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("444444444444hi", '#', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#######################################################################################################################################################################################################################", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("4444444########", 0, 102);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444########" + "'", str3, "4444444########");
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAllLowerCase("                 444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########", 968, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ###########################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ###########################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("44444444444444444444444444444444444444444444444444444444444444444...", 97, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H" + "'", str1, "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("!iH", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
        java.lang.String str4 = org.apache.commons.lang.StringUtils.overlay("###########44444444444444444444444444444444444444", "                                                                ###################################", 10, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                ####################################44444444444444444444444444444444444444" + "'", str4, "                                                                ####################################44444444444444444444444444444444444444");
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", "hi!       ");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, '#', 910, 90);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringAfter("Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      " + "'", str2, "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!" + "'", str2, "########################...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!");
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      ");
        java.lang.String[] strArray6 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("Hi!", "###", (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.replaceEachRepeatedly("!!!!!!!!!!", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 61 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "Hi!" });
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.uncapitalize("4444444444##########44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444##########44444444444444444444444444444444444444" + "'", str1, "4444444444##########44444444444444444444444444444444444444");
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.leftPad("444444444444444444444444444444Hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444Hi!" + "'", str2, "444444444444444444444444444444Hi!");
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        java.lang.String[] strArray3 = org.apache.commons.lang.StringUtils.substringsBetween("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4", "#########44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("                                                                                                    ", ' ');
        java.lang.String str3 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang.StringUtils.join((java.lang.Object[]) strArray2, "Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa", 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        int int3 = org.apache.commons.lang.StringUtils.lastIndexOf("......", "Hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.upperCase("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        int int2 = org.apache.commons.lang.StringUtils.lastIndexOf("                               !ih", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        int int1 = org.apache.commons.lang.StringUtils.length("                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEndIgnoreCase("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsOnly("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "HI!4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444", 94, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444" + "'", str3, "444444444444444444444444Hi!4444444444444444444444444444444444##########4444444444444444444444444");
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.reverse("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         " + "'", str1, "!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ");
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("          ");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.right("########", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("44444444444444444444444444 ##########", "########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("", "HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
        boolean boolean2 = org.apache.commons.lang.StringUtils.containsAny("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!", "4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("", 548);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("                        4444444444444...                        ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        ...                        " + "'", str2, "                        ...                        ");
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.rightPad("......", 900, "................................................................................................................................................................................................................................................................................................................................................................................................");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................." + "'", str3, "....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................");
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("4########4444444444444444444444444444444444444444444444444444444...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh", 548);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        hhh");
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("Hi!      hi!                     44444444444444444444444444444444444", "...############################################################################################################################################...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!      hi!                     44444444444444444444444444444444444" });
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.difference("HI!HI!HI!", "!                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                 " + "'", str2, "!                                 ");
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "......Hi44444444444444444444444444444444444Hi4444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 " });
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeEnd("44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4", "4###########################################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4" + "'", str2, "44444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#444444444#!ih4");
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.swapCase("......hI44444444444444444444444444444444444hI4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......Hi44444444444444444444444444444444444Hi4444444444444444444..." + "'", str1, "......Hi44444444444444444444444444444444444Hi4444444444444444444...");
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 41, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444########4444444444444444444444444444444444444444444444444444444...", "      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.replace("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################          ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################          " + "'", str3, "##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################          ");
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hihi!      ", "4hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "H", "      " });
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("...####...                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlpha("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.chomp("444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444" + "'", str1, "444444444444444444444444Hi!4444444444444444444444444444444444##########44444444444444444444444444");
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.strip(" HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", "4444444444##########44444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH..." + "'", str2, " HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.leftPad("                                         ", 67, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaa                                         ");
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("                 44444444444444444444444444444444444", (int) (byte) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    ..." + "'", str3, "...    ...");
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.substringBetween("                                                                                         4444444444", "         4");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        int int1 = org.apache.commons.lang.StringUtils.length("4444444444##44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang.StringUtils.upperCase("                                                                                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        int int2 = org.apache.commons.lang.StringUtils.indexOfDifference("444444444444444444444444Hi!4444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isNumeric("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("...#################################################################################################                                                            HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!4HI!", 99, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#                                                            HI!4HI!" + "'", str3, "#                                                            HI!4HI!");
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang.StringUtils.indexOfAny("##########", charArray6);
        int int8 = org.apache.commons.lang.StringUtils.indexOfAny("", charArray6);
        int int9 = org.apache.commons.lang.StringUtils.indexOfAny("                                                                                                    ", charArray6);
        boolean boolean10 = org.apache.commons.lang.StringUtils.containsNone("Hi!hi!hi!h", charArray6);
        int int11 = org.apache.commons.lang.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", charArray6);
        boolean boolean12 = org.apache.commons.lang.StringUtils.containsNone("hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        int int3 = org.apache.commons.lang.StringUtils.ordinalIndexOf("...#################################################################################################                                                            hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!4hi!", "H4444444444########4444444444444444444444444444444444444444444444444444444...", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.left("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HiHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        java.lang.String[] strArray1 = org.apache.commons.lang.StringUtils.splitByCharacterTypeCamelCase("      444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "      ", "444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444", "                 ", "4444444444444444444444444444444444" });
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.stripToNull("                                                                                         44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!" + "'", str1, "44444444444hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!      hi!");
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########", "                        444444444444444                        44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########" + "'", str2, "444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########");
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("   ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isAlphanumeric("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        boolean boolean2 = org.apache.commons.lang.StringUtils.endsWithIgnoreCase("!ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih      !ih44444444444                                                                                         ", "hi!       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang.StringUtils.abbreviate("####### 44444444444444444444444444444444444444 ########## 4444444444", 36, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        int int2 = org.apache.commons.lang.StringUtils.indexOf("HI!4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.strip("                        ...                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.mid("!iH4444444444########4444444444444444444444444444444444444444444444444444444...", 910, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        boolean boolean2 = org.apache.commons.lang.StringUtils.equalsIgnoreCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##########", "!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        java.lang.String[] strArray4 = org.apache.commons.lang.StringUtils.splitByWholeSeparator("hi!", "Hi!", (int) ' ');
        int int5 = org.apache.commons.lang.StringUtils.indexOfAny("", strArray4);
        java.lang.String str6 = org.apache.commons.lang.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.rightPad("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################444444444##########44444444444444444444444444444444444444############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        java.lang.String[] strArray2 = org.apache.commons.lang.StringUtils.splitPreserveAllTokens("####### 44444444444444444444444444444444444444 ########## 4444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####### 44444444444444444444444444444444444444 ########## 4444444444" });
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.removeStartIgnoreCase("#", "4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444                 4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.repeat("H", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.deleteWhitespace("Hi!hi!hi!h                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!h" + "'", str1, "Hi!hi!hi!h");
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("hi!444444444444444444444444444444444444444444444444                h", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    444444444#...####...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
        java.lang.String str1 = org.apache.commons.lang.StringUtils.capitalize("                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       " + "'", str1, "                                                                                                                                                                                                       Aaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444Hi!4444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                       ");
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        java.lang.String str3 = org.apache.commons.lang.StringUtils.center("a", (int) (short) 100, "...####...444444444444444444444444444444444444444444 ########## 44444444444444444444444444444444444444 ##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####...444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444" + "'", str3, "...####...444444444444444444444444444444444444444a...####...4444444444444444444444444444444444444444");
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        boolean boolean1 = org.apache.commons.lang.StringUtils.isEmpty((java.lang.CharSequence) "HI!                          444444444444hi!HI!                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        int int3 = org.apache.commons.lang.StringUtils.indexOf("                                                                                         4444444444444444444444444444444444", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        java.lang.String str2 = org.apache.commons.lang.StringUtils.remove("HI!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        boolean boolean2 = org.apache.commons.lang.StringUtils.startsWithIgnoreCase("444444444#", "Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ##########4444444444 ########## 44444444444444444444444444444444444444 ######aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaa                             #################################################################Hi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!hHi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

