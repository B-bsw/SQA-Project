package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test03001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03001");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HIHi!hiHi!hi#Hi!hiHi!hiHI", (-1));
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "44444444444444444444444444###############...", 71, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I!                                                                                                 ", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  " + "'", str2, "                                                                  ");
    }

    @Test
    public void test03003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444444444444444444444444444444!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444!   " + "'", str1, "4444444444444444444444444444444!   ");
    }

    @Test
    public void test03004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03004");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("##############################################################################################hi!hi!", "      HI!HI#################################hi!hi                        ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03005");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                hi                 ", "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI                           hI!HI                           h################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI                           h################################" + "'", str2, "HI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test03007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03007");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HIHi!hiHi!hi#Hi!hiHi!hiH", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03008");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "hi!hhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test03010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("h    h    h    h    h    h                                             h    h    h    h    h    h   ", "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HHHHHHHHHHHHHHHHHHHHHHH", "HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 44, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            " + "'", str3, "                                            ");
    }

    @Test
    public void test03014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03014");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", 42, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h" + "'", str3, "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h");
    }

    @Test
    public void test03015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444   4444", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!HIhI!HIh################################", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIhI!HIh################################" + "'", str2, "I!HIhI!HIh################################");
    }

    @Test
    public void test03019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03019");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03020");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03021");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!4444444444444444444444444444444444444444444444", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str2, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 I!                                                                                                 " + "'", str1, "                                                                                                 I!                                                                                                 ");
    }

    @Test
    public void test03024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###################################hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                       a#############################################ahia!ahia", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "###################################", "hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi" + "'", str3, "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
    }

    @Test
    public void test03027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Hi!hiHi!hi", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi" + "'", str2, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
    }

    @Test
    public void test03028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###################", 1, "HI!HI                           hI!HI            ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################" + "'", str3, "###################");
    }

    @Test
    public void test03029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03029");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                              I!", 'a', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "                   I!                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test03031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################" + "'", str1, "###########################################");
    }

    @Test
    public void test03032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03032");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###", (java.lang.CharSequence) "HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test03033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!HIhI!HIh################################", (int) (short) 1, "hi!                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HIhI!HIh################################" + "'", str3, "hI!HIhI!HIh################################");
    }

    @Test
    public void test03034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                          hI!HI               ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03035");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", "...###################################hi#!#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03037");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI   HI!HIHI!HIH################################    ", "                               ###################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test03038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test03039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("    H     hi!hi                 ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", "!HIHI!HI");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03041");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03042");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test03043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HIHI!HIH44444444444444444444444444444444", "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03045");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03046");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                44HI!HI!4444HI!HI!4444HI!HI!44", 2, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                44HI!HI!4444HI!HI!4444HI!HI!44" + "'", str3, "                44HI!HI!4444HI!HI!4444HI!HI!44");
    }

    @Test
    public void test03047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03047");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("       ################################        ", "!ih!ih", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444###############################################444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444###############################################444444444444444444444444444" + "'", str2, "44444444444444444444444444###############################################444444444444444444444444444");
    }

    @Test
    public void test03049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03050");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hi", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 63, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 63 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hi" });
    }

    @Test
    public void test03051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", "############ih!ih###################################", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str3, "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test03052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##############################################", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################" + "'", str2, "##############################################");
    }

    @Test
    public void test03053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI#################################hi!hi", "                       a#############################################ahia!ahia");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03054");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 !IH" + "'", str1, "                                                                                                 !IH");
    }

    @Test
    public void test03055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03055");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "" };
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray5);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray13);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, " ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, '#');
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!##" + "'", str18, "hi!##");
    }

    @Test
    public void test03056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03056");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!i!i", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!i!i" });
    }

    @Test
    public void test03057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaa                         aaaaaaa", "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                         aaaaaaa" + "'", str2, "aaaaaaa                         aaaaaaa");
    }

    @Test
    public void test03058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                              I", (java.lang.CharSequence) "                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI           " + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
    }

    @Test
    public void test03060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("####################################################################################################", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!", 24, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!IhI!aaaaaaaaaaaaaaaaa" + "'", str3, "hi!IhI!aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI", "#############################################hi!hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!", strArray3, strArray7);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!" + "'", str8, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HI", "HI" });
    }

    @Test
    public void test03063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("I!                                                                                                 ", "HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ih#ih ih#ih ###############################hi!hihi!hih", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih#ih ih#ih ###############################hi!hihi!hih" + "'", str2, "ih#ih ih#ih ###############################hi!hihi!hih");
    }

    @Test
    public void test03065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03065");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II", (java.lang.CharSequence) "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03066");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...###################################hi#!#hi", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03067");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#############################################HI!HI!##########################################...", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...##########################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...##########################################################################################..." + "'", str1, "...##########################################################################################...");
    }

    @Test
    public void test03069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI                           hI!HI            hiHI!HI                           hI!HI            ", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03070");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!AA", "     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03072");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################", "##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IH!IH                           IH!IHIH            IH!IH                           IH!IH", "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444");
    }

    @Test
    public void test03075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################" + "'", str3, "####################################################");
    }

    @Test
    public void test03076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str2, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test03077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03077");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hi!4444", "444hi!4444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test03078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI#HI", (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("    H     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H     " + "'", str2, "    H     ");
    }

    @Test
    public void test03080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03080");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hI!HI                           hI!HI                           h################################", (java.lang.CharSequence) "####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...                   4444444444444444444444444444444444444444444444HI!HI!...                    ", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444HI!HI!...                    " + "'", str2, "4444444444HI!HI!...                    ");
    }

    @Test
    public void test03082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03082");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("h################################ hi#hi hi#hi", "hi!aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                   ", "IH!IH###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test03084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03084");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...                           hi!hi            hihi!hi                           hi!hi           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) " #############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444!   ", 48, "444hi!4444     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444!   444hi!4444   " + "'", str3, "4444444444444444444444444444444!   444hi!4444   ");
    }

    @Test
    public void test03088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03088");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test03089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03089");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###########HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03090");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "ih!ihih!ih");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("#############################################HI!HI!##########################################...", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                    " + "'", str9, "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 9, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!i!i!" + "'", str3, "!i!i!i!");
    }

    @Test
    public void test03092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03092");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ih!iH                           ih!ihIH            ih!iH                           ih!ih", "##############################################################################################hi!hi!", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03093");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI", "#############################################hi!hi");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03094");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!hihi!hi", (java.lang.CharSequence) "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03095");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "I!HI                                       hiHI!HI", (java.lang.CharSequence) "###############################################hi#!#hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "I!HI                                       hiHI!HI" + "'", charSequence2, "I!HI                                       hiHI!HI");
    }

    @Test
    public void test03096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03096");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################HI!HI!#############################################", "hi!                                                                                                 ", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hI#HI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################HI!HI!#############################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#############################################HI!HI!#############################################" + "'", str5, "#############################################HI!HI!#############################################");
    }

    @Test
    public void test03097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44hi!hi!4444hi!hi!4444hi!hi!44", "                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03098");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "H" });
    }

    @Test
    public void test03099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03099");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih" + "'", str1, "ih!ih");
    }

    @Test
    public void test03101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03101");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("         H         H         H         H        hi!         H         H         H         H         ", "4444444444444444444444444444444444444444444444HI!HI!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03102");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HIhI!HIhiHI!HIhI!HI", 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 5, 84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03104");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h", 'a');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03105");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           " + "'", str2, "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
    }

    @Test
    public void test03106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "                                                                                              I");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...##########################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...##########################################################################################..." + "'", str1, "...##########################################################################################...");
    }

    @Test
    public void test03108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03108");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444HI!HI!...                    ", "###########HI!H", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03109");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#", "###############################################hi#!#hi#", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444", (java.lang.CharSequence) "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!i!i!i!", "     4444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i!i!" + "'", str2, "!i!i!i!");
    }

    @Test
    public void test03112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03112");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444!   " + "'", str1, "4444444444444444444444444444444!   ");
    }

    @Test
    public void test03114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03114");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!i!i", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03115");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03116");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI   Hi!hiHi!hiH################################", 350, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03117");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#####!#####", "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#####!#####" });
    }

    @Test
    public void test03118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03118");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI                           hI!HI            ...", "ih!iH                           ih!ihIH            ih!iH                           ih!ih", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!hiHi!hiH################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hiHi!hiH################################" + "'", str1, "Hi!hiHi!hiH################################");
    }

    @Test
    public void test03120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...", "#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################HI!HI!#############################################" + "'", str2, "#############################################HI!HI!#############################################");
    }

    @Test
    public void test03122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03122");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI#HI", 99, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03123");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                       #############################################hi!hi                        ", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       #############################################hi!hi                        " + "'", str2, "                       #############################################hi!hi                        ");
    }

    @Test
    public void test03125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03125");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                   ", "HI!HI                           HI!HI                           H################################", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                        ", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              " + "'", str2, "                                                                              ");
    }

    @Test
    public void test03128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 2, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test03129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test03130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03130");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray6, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                          !IHHI            " + "'", str10, "                          !IHHI            ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test03131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03131");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hihi!hih################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444HI!HI!...                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03133");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("         H         H         H         H        hi!         H         H         H         H         ", "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H        hi!         H         H         H         H         " + "'", str3, "         H         H         H         H        hi!         H         H         H         H         ");
    }

    @Test
    public void test03134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  4444444444444444444444444444444444444444444444!   ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!   " + "'", str2, "444!   ");
    }

    @Test
    public void test03135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...#####################################################", "HI!HIHI!HIH################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03139");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH", (java.lang.CharSequence) "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 998 + "'", int2 == 998);
    }

    @Test
    public void test03140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("i!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!444" + "'", str1, "I!444");
    }

    @Test
    public void test03141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03141");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444444444444444!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                           4            4                           ", " H     hi!hi                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4            4                           " + "'", str2, "4            4                           ");
    }

    @Test
    public void test03143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03143");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hI!HI                           ", (java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "############...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "#############################################HI!HI!##########################################...", (java.lang.CharSequence) "H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!                                ", (-1), 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03147");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih!ih", "HI!HI!", 32);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih", "ih" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ih", "ih" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "ih", "ih" });
    }

    @Test
    public void test03148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                              ", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    ..." + "'", str2, "                                                    ...");
    }

    @Test
    public void test03149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", "Hi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI" + "'", str2, "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
    }

    @Test
    public void test03150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03150");
        char[] charArray8 = new char[] { 'a', '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444");
    }

    @Test
    public void test03152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#############################################hi!hi!#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I!HIhI!HIh################################", 261);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                             I!HIhI!HIh################################                                                                                                              " + "'", str2, "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
    }

    @Test
    public void test03154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03155");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03156");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!HI!HI!HI!HI!                              ", "                   I!                        ", "hi!hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#####!#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####!#####" + "'", str1, "#####!#####");
    }

    @Test
    public void test03159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str2, "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test03160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03160");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                         ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03161");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444", "##############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03162");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03163");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...###################################hi#!#hi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03164");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("     ", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI                           HI!HI            HIHI!HI                           HI!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str2, "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test03166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03166");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!hiHi!hiH################################", 34, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiH################################" + "'", str3, "Hi!hiHi!hiH################################");
    }

    @Test
    public void test03167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03167");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("h################################ hI!HI HI!HI", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi", "IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03169");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", strArray2, strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " ");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####", strArray10, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray5, strArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str6, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#####" + "'", str13, "#####");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test03170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444");
    }

    @Test
    public void test03171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI                           hI!HI            hiHI!HI                           hI!HI            ", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test03172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!hi!hi!aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03173");
        char[] charArray11 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test03174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03175");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hi!4444", "###########HI!H");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444hi", "4444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test03176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444" + "'", str1, "44444444");
    }

    @Test
    public void test03177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test03178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03178");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI                           hI!HI            hiHI!HI                           hI!HI          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi" + "'", str1, "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
    }

    @Test
    public void test03180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!" + "'", str1, "hi!hi!");
    }

    @Test
    public void test03181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           " + "'", str2, "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
    }

    @Test
    public void test03183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", 9, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03184");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray4, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, '4');
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                          !IHHI            ", "hi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03186");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("            hiHI!HI                           ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "            ", "hi", "HI", "!", "HI", "                           " });
    }

    @Test
    public void test03187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03187");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ihhh", "I!                 ", 7, 71);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ihhhI!                 " + "'", str4, "!ihhhI!                 ");
    }

    @Test
    public void test03188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", 55, "hi!                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI          " + "'", str3, "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ");
    }

    @Test
    public void test03189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI#################################hi!hi         ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI#################################hi!hi444444444" + "'", str3, "HI!HI#################################hi!hi444444444");
    }

    @Test
    public void test03190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03190");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h################################ hI!HI HI!HI", "hi!hi                           hi!hi                           h################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03191");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#################################################################################################", "hi!##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH", "!HI", "4444444444444444444444444h44444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test03193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03193");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "hi!hi                           hi!hi       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03196");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#############################################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03197");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("IH!IH#############################################", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI" + "'", str1, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
    }

    @Test
    public void test03199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03199");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test03200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi#hi", (java.lang.CharSequence) "hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03201");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####" + "'", str1, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
    }

    @Test
    public void test03202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03202");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!                               ", "             hI!HI             hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03203");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("###############################################hi#!#hi#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH", 44, "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH" + "'", str3, "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH");
    }

    @Test
    public void test03205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!HI!HI!H", "HI!HI#################################hi!hi444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03206");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       a#############################################ahia!ahia", "...                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "a#############################################ahia!ahia" });
    }

    @Test
    public void test03207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03207");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hihi!hihihi!hihi!hi", "aaaaaaa                         aaaaaaa", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03208");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03210");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("     4444444444444444444444444444444444444444444444      ", "#####!#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("Hi!hiHi!hiH################################", "hi!##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI", "         h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#############################################hi!hi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03215");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test03217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("H!IH", (int) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH");
    }

    @Test
    public void test03218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03218");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test03219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI", 7, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44HI444" + "'", str3, "44HI444");
    }

    @Test
    public void test03221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI", "h################################ hi#hi hi#hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test03222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444444444444444###############...", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444###############..." + "'", str2, "44444444444444444444444444###############...");
    }

    @Test
    public void test03223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03223");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, "44444444444444444444444444###############...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03224");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test03227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03227");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                            ", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HhI!HI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HhI!HI            " + "'", str1, "HhI!HI            ");
    }

    @Test
    public void test03229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!AA", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            HI!HI!HI!AA" + "'", str2, "                                            HI!HI!HI!AA");
    }

    @Test
    public void test03230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44hi!hi!44", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!44" + "'", str2, "44hi!hi!44");
    }

    @Test
    public void test03231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03231");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                   ", (java.lang.CharSequence) "                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161 + "'", int2 == 161);
    }

    @Test
    public void test03232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray7, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           hI!HI                           h################################", strArray2, strArray7);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4', (int) '4', 48);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IH!IH#############################################" + "'", str13, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str14, "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test03233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                            IH!I", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            " + "'", str2, "                            ");
    }

    @Test
    public void test03234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str1, "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test03235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Hi!hiHi!hi", 159);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("IH!IH                           IH!IHIH            IH!IH                           IH!IH", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str2, "IH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test03237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03237");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "", 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 237 + "'", int3 == 237);
    }

    @Test
    public void test03238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03238");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hi                           hi!hi       ...", "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03239");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HIHi!hiHi!hi#Hi!hiHi!hiH", "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03240");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#HI", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (byte) 100, 100);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " #############################################", 100, 29);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI#HI" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test03241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         H         H         H         H        hi!         H         H         H         H      ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI#HI", "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03243");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ih!ih###################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test03244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03244");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("##############################################", 45, 998);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test03246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#####################################################################################################################################################################################################################################################################", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################################################################################" + "'", str2, "#############################################################################################################################################################################################################################################");
    }

    @Test
    public void test03248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI", "444   4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03251");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "ih!ihih!ih");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "         H         H         H         H        HI!         H         H         H         H         ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", strArray5, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
    }

    @Test
    public void test03252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03252");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH!IH4444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03253");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "    h     ", "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444 hI!HI", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444hI!HI" + "'", str2, "4444444444444444444444444444444444444444444444hI!HI");
    }

    @Test
    public void test03256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44HI444", (int) '4', 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03258");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!HIhI!HIh################################", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03259");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03260");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         h####################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "h####################################" });
    }

    @Test
    public void test03261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03261");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI                           hI!HI                           h###############################", "#############################################hi!hi", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hi!4444", "hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03263");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "          ", (java.lang.CharSequence) "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "          " + "'", charSequence2, "          ");
    }

    @Test
    public void test03264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03264");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444HI!H444", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03265");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03266");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444hi!4444", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Ih!iHi!444Ih!iH", (int) (byte) 0, "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!iHi!444Ih!iH" + "'", str3, "Ih!iHi!444Ih!iH");
    }

    @Test
    public void test03268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("H", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03269");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!hi!hi                           Hi!hi            HIhi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03270");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'a', 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray3, strArray6);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         H         H         H         H        HI!         H         H         H         H         ", "    H                                      ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray6, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 99");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test03271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###############################################hi#!#hi", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#!#hi" + "'", str2, "###############################################hi#!#hi");
    }

    @Test
    public void test03273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##########", "HI!HI#################################hi!hi         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444!   ", "   ", "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str3, "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test03275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "###############################################hi#!#hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03276");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#############################################HI!HI", "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test03277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!HI                           hI!HI            hiHI!HI                           hI!HI", "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test03278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI!HI!AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03279");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih" + "'", str1, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
    }

    @Test
    public void test03280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              hi#hi                                              " + "'", str1, "                                              hi#hi                                              ");
    }

    @Test
    public void test03281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaa                         aaaaaaa", " #############################################", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaa                         aaaaaaa" });
    }

    @Test
    public void test03282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03283");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "I!                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str1, "hI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test03285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                           HI!HI            ...", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI            ..." + "'", str2, "HI!HI                           HI!HI            ...");
    }

    @Test
    public void test03286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03286");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hihi!hi", "   hiHI!HI                           hI!HI          ", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaHI#HIaaa", "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hihi!hi", "                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad(" H     hi!hi                 ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " H     hi!hi                 " + "'", str2, " H     hi!hi                 ");
    }

    @Test
    public void test03291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03292");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!", "4444444444444444444444444444444444444444444444!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!hi!hi                           Hi!hi            HIhi!hi              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "!ihhhI!                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str2, "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test03295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03295");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", "4444444444444444444444444444444444444444444444HI!HI!", 237);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" });
    }

    @Test
    public void test03296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#################################################################################################", "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("         H         H         H         H        HI!         H         H         H         H         ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         " + "'", str2, "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test03298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", "                   ", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444" + "'", str3, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
    }

    @Test
    public void test03299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03299");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03300");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HHHHHHHHHHHHHHHHHHHHHHH", "                                             I!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                              ", "#############################################hi!hi!#############################################", "!i!i!i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test03302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03302");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("h################################ hI!HI HI!HI", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!hiHi!hiH########################" + "'", str4, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test03303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03303");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("      HI!HI#################################hi!hi                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03304");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "I!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03305");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", "#", 6, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!#                          HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           " + "'", str4, "HI!#                          HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
    }

    @Test
    public void test03306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hI!HI                           hI!HI             hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI                           hI!HI             hi" + "'", str1, "hI!HI                           hI!HI             hi");
    }

    @Test
    public void test03307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("################################", 99, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################4444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "################################4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03308");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hiHi!hiH########################", "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03309");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03310");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!HIHI!HIH################################    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "HIHI", "!", "HIH", "################################", "    " });
    }

    @Test
    public void test03311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03311");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("h    h    h    h    h    h                                             h    h    h    h    h    h   ", "!i!i!i!", "#############################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h    h    h    h    h    h                                             h    h    h    h    h    h   " + "'", str3, "h    h    h    h    h    h                                             h    h    h    h    h    h   ");
    }

    @Test
    public void test03312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", "HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03314");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hihi!hih################################", "444hi!4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03315");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!                                            hI!HIhi!                                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03316");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         H         H         H         H        HI!         H         H         H         H         ", 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("444hi!4444", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444" + "'", str2, "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444");
    }

    @Test
    public void test03318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03319");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!hi                           hi!hi            hihi!hi                           hi!hi", "#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03320");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaa                         aaaaaaa", "ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test03321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03321");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   4444444" + "'", str2, "                   4444444");
    }

    @Test
    public void test03323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03323");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#################################################################################################", "                                                                                                   ", "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI   Hi!hiHi!hiH################################    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI   Hi!hiHi!hiH    " + "'", str2, "HI   Hi!hiHi!hiH    ");
    }

    @Test
    public void test03325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03325");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("I!HI                                       hiHI!HI", (int) 'a', 874);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03327");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         h", "IH!IH###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                              hI!HIhI!HIh################################", 29, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              hI!HIhI!HIh################################" + "'", str3, "                                              hI!HIhI!HIh################################");
    }

    @Test
    public void test03329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!4444444444444444444444444444444444444444444444", "###################################hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str2, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03330");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hI!HI                           hI!HI             hi", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03331");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("     4444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                              I", (java.lang.CharSequence) "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                 !IH", "##########################################################################################################################################################################", (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 !IH" + "'", str3, "                                                                                                 !IH");
    }

    @Test
    public void test03334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03334");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi                           hi!hi            hihi!hi                           hi!hi           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03335");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              I", "44hi!hi!44", 52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                              I" });
    }

    @Test
    public void test03336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaa", "44hi!hi!4444hi!hi!4444hi!hi!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI#################################hi!hi444444444", "4444444444444444444444444444444444444444444444hI!HI", "HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI#################################hi!hi444444444" + "'", str3, "HI!HI#################################hi!hi444444444");
    }

    @Test
    public void test03339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi#hi", "         H         H         H         H        hi!         H         H         H         H      ", "hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###########HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03341");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03342");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("IH!IH#############################################", "##############444hi!4444     ###############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#############################################HI!HI!##########################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################HI!HI!##########################################..." + "'", str1, "#############################################HI!HI!##########################################...");
    }

    @Test
    public void test03344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI  4444444444444444444444444444444444444444#############################################HI!HI", "44444444444444444444444444###############################################444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI" + "'", str2, "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
    }

    @Test
    public void test03345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444!   ", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!   " + "'", str2, "444!   ");
    }

    @Test
    public void test03346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444!   ", "hi        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!   " + "'", str2, "444!   ");
    }

    @Test
    public void test03347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi", 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" + "'", str3, "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
    }

    @Test
    public void test03348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03348");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("############ih!ih###################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "#################################################################################################", (java.lang.CharSequence) "aaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("44444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03351");
        char[] charArray12 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###################################", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I!HI                            ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test03352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("   ", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test03353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03353");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi#hi", "         H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (int) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test03355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", "                       #############################################hi!hi                        ", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test03356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03356");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HhI!HI            ", "h    h    h    h    h    h                                             h    h    h    h    h    h   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI  4444444444444444444444444444444444444444#############################################HI!HI", "444hi!4444     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI" + "'", str2, "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
    }

    @Test
    public void test03358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                44HI!HI!4444HI!HI!4444HI!HI!44", "       ################################        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("################################...", "####################################################", "                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################..." + "'", str3, "################################...");
    }

    @Test
    public void test03360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03360");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", 'a');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03361");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test03362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03362");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi        ", (java.lang.CharSequence) "      HI!HI#################################hi!hi                        ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi        " + "'", charSequence2, "hi        ");
    }

    @Test
    public void test03363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hihi!hi", "##############444hi!4444     ###############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("IH!IH###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH##################################" + "'", str1, "IH!IH##################################");
    }

    @Test
    public void test03365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi" + "'", str2, "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
    }

    @Test
    public void test03366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...##########################################################################################...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...##########################################################################################..." + "'", str2, "...##########################################################################################...");
    }

    @Test
    public void test03367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03367");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###############################################", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H         ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test03368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03368");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("##############################################################################################hi!hi!", "##########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 261);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test03370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi", 78);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi" + "'", str2, "hi!hi");
    }

    @Test
    public void test03371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                              I", "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              I" + "'", str2, "                                                                                              I");
    }

    @Test
    public void test03372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03372");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("################################", "HhI!HI            ", 998, 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "################################HhI!HI            " + "'", str4, "################################HhI!HI            ");
    }

    @Test
    public void test03373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!HIHI!HI", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03374");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!hi!hi                           Hi!hi            HIhi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03375");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("ih!ih", '#', 349);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!                                                                                                 ", "###################################HI!HI################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                                 " + "'", str2, "HI!                                                                                                 ");
    }

    @Test
    public void test03377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03377");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...###################################hi#!#hi", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test03378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "aaaaaaa", "HhI!HI                           hI!HI                           h################################HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03379");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("################################4444444444444444444444444444444444444444444444444444444444444444444", "I!HI                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", "I!444", "############...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################   hi#hihi#hih################################h" + "'", str3, "###############################################   hi#hihi#hih################################h");
    }

    @Test
    public void test03381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!HIHI!HIH44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIH44444444444444444444444444444444" + "'", str1, "HI!HIHI!HIH44444444444444444444444444444444");
    }

    @Test
    public void test03382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44hi!hi!44", "##################################hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                 ", "HI   Hi!hiHi!hiH    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test03384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str1, "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
    }

    @Test
    public void test03385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                   ", "###################################hi!hi################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                           hI!HI            hiHI!HI                           hI!HI            #", "                                                                                              I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str2, "                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test03387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03387");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test03388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03388");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Hi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test03389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!HI!", "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03391");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03392");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#hi", "!IH!IH4444444444444444444444444444444444444444444444", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi#hi" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                           4            4                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03394");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#############################################HI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03395");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "           ih!iH                           ih!ihIH            ih!iH                           ih!ih", (java.lang.CharSequence) "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test03396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!                               ", (int) (short) 1, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!                              " + "'", str3, "I!                              ");
    }

    @Test
    public void test03397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444HI!HI!...                    ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444HI!HI!...                    " + "'", str2, "4444444444HI!HI!...                    ");
    }

    @Test
    public void test03399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444" + "'", str2, "44444444444444444444");
    }

    @Test
    public void test03400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hihi!hihihi!hihi!hi", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03401");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444HI!H444", "hi!aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                             I!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03403");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test03404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03404");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaa", "i!444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03405");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("   hiHI!HI                           hI!HI          ", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03406");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "" };
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray8);
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray8, strArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray8);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "" };
        int int26 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray25);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray25, strArray33);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "" };
        int int41 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray40);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray40, strArray48);
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray33, strArray40);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray8, strArray40);
        int int52 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("ihHI!HI                           hI!HI            hiHI!HI                           hI!HI", strArray8);
        java.lang.String str53 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + " " + "'", str51, " ");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 90 + "'", int52 == 90);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
    }

    @Test
    public void test03407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                        ", "HI!HIHI!HIH################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03408");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hih!ihih!ih############################### hi#hi hi#hi", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str4, "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hihi!hi", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hihi!hi" + "'", str2, "i!hihi!hi");
    }

    @Test
    public void test03410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03410");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "HhI!HI             ", 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             " + "'", str3, "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
    }

    @Test
    public void test03411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", 71, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hih!ihih!ih############################### hi#hi hi#hi");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                 I!                                                                                                 ", "44444444444444444444444444###############...", 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 I!                                                                                                 " });
    }

    @Test
    public void test03415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03415");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hihi!hihihi!hihi!hi", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03416");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("IH!IH###################################", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("         H", 32, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H                      " + "'", str3, "         H                      ");
    }

    @Test
    public void test03418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!hi!", "         H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!" + "'", str2, "hi!hi!");
    }

    @Test
    public void test03419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("################################4444444444444444444444444444444444444444444444444444444444444444444", 40, "##############################################################################################hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################4444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "################################4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!#                          HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", "     4444444444444444444444444444444444444444444444 hI!HI                           ", "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test03421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hI!HI                           hI!HI                           h################################", "IH!IH###################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "hi!hhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test03423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("    h     ", "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444", 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h     " + "'", str3, "    h     ");
    }

    @Test
    public void test03424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah", 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha..." + "'", str2, "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha...");
    }

    @Test
    public void test03425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("###############################################hi#!#hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################HI#!#HI#" + "'", str1, "###############################################HI#!#HI#");
    }

    @Test
    public void test03426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03426");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                   ", "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI!HI!HI", "#####!#####", "HI!HI#################################hi!hi         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI" + "'", str3, "HI!HI!HI!HI");
    }

    @Test
    public void test03428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444!   444hi!4444   ", 4, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444!   444hi!4444   " + "'", str3, "4444444444444444444444444444444!   444hi!4444   ");
    }

    @Test
    public void test03429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hihi!hih################################", "H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hih################################" + "'", str2, "hi!hihi!hih################################");
    }

    @Test
    public void test03430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HIhI!HIhiHI!HIhI!HIHI!H", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 HI!HIhI!HIhiHI!HIhI!HIHI!H" + "'", str2, "                 HI!HIhI!HIhiHI!HIhI!HIHI!H");
    }

    @Test
    public void test03432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str1, "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test03433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03433");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("##############################################################################################hi!hi!", "", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test03434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI" + "'", str1, "hI!HI");
    }

    @Test
    public void test03436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03436");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        " + "'", str1, "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ");
    }

    @Test
    public void test03437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hhhhhhhhhhhhhhhhhhhhhhh", "!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("##########", "I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test03440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#############################################", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                       #############################################" + "'", str2, "                                                       #############################################");
    }

    @Test
    public void test03441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03441");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444" });
    }

    @Test
    public void test03442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              " + "'", str2, "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ");
    }

    @Test
    public void test03443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03443");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi                           hi!hi       ...", "hi!hi                           hi!hi       ...", "44444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                              ", (int) (byte) 100, "HI!HI#################################hi!hi444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test03445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!", "################HI!HI################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!" + "'", str2, "hi!hi!");
    }

    @Test
    public void test03448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!IH!IH4444444444444444444444444444444444444444444444", "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03449");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       a#############################################ahia!ahia                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       A#############################################AHIA!AHIA                        " + "'", str1, "                       A#############################################AHIA!AHIA                        ");
    }

    @Test
    public void test03451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "##########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hihi!hihihi!hihi!hi", "                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HIHi!hiHi!hi#Hi!hiHi!hiH", "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03455");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hI!HI                           hI!HI             hi", "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", "       ih!iH                           ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03456");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!HI!HI!HI!HI!                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!HI!HI!HI!HI!" + "'", str1, "hi!HI!HI!HI!HI!");
    }

    @Test
    public void test03457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444   hiHI!HI                           hI!HI" + "'", str2, "44444444444   hiHI!HI                           hI!HI");
    }

    @Test
    public void test03458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03458");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 162 + "'", int2 == 162);
    }

    @Test
    public void test03459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03459");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!hiHi!hi", "hi!HI!HI!HI!HI!", "HI!#                          HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#I!HI#I!HI" + "'", str3, "#I!HI#I!HI");
    }

    @Test
    public void test03460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hi" + "'", str1, "hi#hi");
    }

    @Test
    public void test03461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03461");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HhI!HI             ", (java.lang.CharSequence) "HI!HI                           HI!HI            ...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HhI!HI             " + "'", charSequence2, "HhI!HI             ");
    }

    @Test
    public void test03462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                            " + "'", str1, "                            ");
    }

    @Test
    public void test03463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03463");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03464");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                       #############################################", (java.lang.CharSequence) "##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###########HI!H", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03466");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI" + "'", str1, "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
    }

    @Test
    public void test03468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03469");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!hi!hi!aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hi!hi!aa" + "'", str1, "HI!hi!hi!aa");
    }

    @Test
    public void test03471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "                                                       #############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test03472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03472");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test03473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI", "                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI" + "'", str2, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI");
    }

    @Test
    public void test03474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03474");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                            IH!I", "HI", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03475");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                       a#############################################ahia!ahia", (java.lang.CharSequence) "h################################ hI!HI HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("###############################################   hi#hihi#hih################################h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################   hi#hihi#hih################################h" + "'", str1, "###############################################   hi#hihi#hih################################h");
    }

    @Test
    public void test03477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "###############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", "###############################################HI################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi" + "'", str2, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
    }

    @Test
    public void test03481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###############################################HI#!#HI#", "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03482");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                  ", "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03484");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("################################", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "################################" });
    }

    @Test
    public void test03485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03485");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444444444444444444444hi!4444444444444444444444444", "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03487");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("IH!IH#############################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IH", "!", "IH", "#############################################" });
    }

    @Test
    public void test03488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("I!HI                           hI!HI                           h###############################", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI  ..." + "'", str2, "I!HI  ...");
    }

    @Test
    public void test03490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("####################################################################################################################################################################################################################################################################", "                           HI!HI                           H################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################################################################################################################################################################################" + "'", str2, "####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test03491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03491");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       ###############################################hi#!#hi#                        ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03493");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                         ", "ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test03494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03494");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 94, 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test03495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###############################################hi#!#hi#", (int) (byte) 10, "HhI!HI                           hI!HI                           h################################HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################hi#!#hi#" + "'", str3, "###############################################hi#!#hi#");
    }

    @Test
    public void test03497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                       A#############################################AHIA!AHIA                        ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HhI!HI             ", 94, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" ", "HIHi!hiHi!hi#Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test03500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test03500");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H!IH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H!IH" });
    }
}

