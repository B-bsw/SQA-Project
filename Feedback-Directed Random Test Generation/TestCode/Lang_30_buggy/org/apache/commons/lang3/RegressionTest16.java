package org.apache.commons.lang3;

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
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!hi", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi" + "'", str2, "hi!hihi!hi");
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                         ", "#############################################HI!HI!##############################################hI!HI                           h################################", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                               HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI" + "'", str1, "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hhi!hihi!hih################################    ", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hihi!hih################################    " + "'", str2, "Hhi!hihi!hih################################    ");
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444     ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                              ", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                              ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###############################################HI################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                    ", "......!ih!ih!ih!ih!ih!ih!ih", 232, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "......!ih!ih!ih!ih!ih!ih!ih" + "'", str4, "......!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi                           hi!hi            hihi!hi                           hi!hi            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("####", "           H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####" + "'", str2, "####");
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hhi!hihi!hih################################    ", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                            IH!I", 232, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                    IH!I" + "'", str3, "                                                                                                                                                                                                                                    IH!I");
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hI!IIhI!IIh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...                           hi!hi            hihi!hi                           hi!hi          ", "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 32);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############ih!ih###################################", "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("###############################################", strArray4, strArray8);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "############", "", "", "", "", "###################################" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "###############################################" + "'", str9, "###############################################");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ", 159, "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str3, "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("####################################################################################################################################################################################################################################################################", 95, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################" + "'", str3, "#####################################");
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                                                                               hi!HI!HI!HI!HI!                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hI#H", "4444444                   4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#H" + "'", str2, "hI#H");
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444!ih444", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("############444HI!4444     ###############", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################4444444444444444444444444444444444444444444444!HI!HIHI!HI" + "'", str1, "#######################################4444444444444444444444444444444444444444444444!HI!HIHI!HI");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!4444     ##############444hi!4444     ############################444hi!4444     ################", "hi!4444     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!#                          hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           ", "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!   ", (int) '4', 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(".........I#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".........I#I#HIHI#H44444444444444444" + "'", str1, ".........I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI                           HI!HI            ..", "ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HhI!HI            ", (java.lang.CharSequence) "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!HI                           hI!HI  444   4444hI!HI                           hI!HI ", (java.lang.CharSequence) "   hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!HI                           hI!HI  444   4444hI!HI                           hI!HI " + "'", charSequence2, "!HI                           hI!HI  444   4444hI!HI                           hI!HI ");
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!HI!HI!HI!HI!                              ", "               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!  !   hi!hihi!hih################################hi", "ih!ih                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!  !   hi!hihi!hih################################hi" + "'", str2, "!  !   hi!hihi!hih################################hi");
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!ih", "ih!ihih", "ih!ih", "ih!ihih!ih", "ih!ihih", "ih!ih", "ih!ihih!ih", "ih!ihih", "ih!ih", "i" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h    h    h    h    h    h                                             h    h    h    h    h    h  ", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h    h    h    h    h    h                                 ..." + "'", str2, "h    h    h    h    h    h                                 ...");
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         H", (int) (short) 100, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih         Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih         Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hih");
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi        ", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi        " + "'", str2, "hi        ");
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI" + "'", str1, "HI!HI");
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("           HI!HIhI!HIhiHI!HIhI!HIHI!H", "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "           HI!HIhI!HIhiHI!HIhI!HIHI!H" });
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                        hI!HI            ", "###################################hi!hi################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hI!HI            " + "'", str2, "                        hI!HI            ");
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("###############################################hi#!#hi#", "hih!ihih!ih############################### hi#hi hi#hi", 11);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!I", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444", "HI", "Hi", "!", "hi", "Hi", "!", "hi", "H", "################################!", "HI", "#####" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IH!I" + "'", str7, "IH!I");
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#####################################", "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI" + "'", str1, "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI" + "'", str1, "hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI");
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI" + "'", str2, "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI");
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...######################", 89, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################...######################################################" + "'", str3, "################################...######################################################");
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hhi!                               ", "                                                 h                                                  ", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHHHHI!HHHH", "HI!HIHI!HIH################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!HHHH" + "'", str2, "HHHHHI!HHHH");
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "", 76);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH", "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("I                    ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hI#HI!HI                           HI!HI            ..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                     I  I                    ", (java.lang.CharSequence) "!  !   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!" + "'", str1, "HI!HI!HI!");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("           H44H4h44H4hiH44H4h44H4H44H", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H44H4h44H4hiH44H4h44H4H44H" + "'", str2, "H44H4h44H4hiH44H4h44H4H44H");
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi" + "'", str1, "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi");
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI" + "'", str1, "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI");
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444#########################################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray7, strArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny("!4444444444444444444444444444444444444444444444", strArray7);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "AAAAAAA                         AAAAAAA     ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!HI" + "'", str8, "hI!HI");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                          !IHHI            " + "'", str11, "                          !IHHI            ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!" + "'", str14, "hi!hi!");
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...", "I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44HI444", (int) 'a', "HI!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                          44HI444HI!                                          " + "'", str3, "HI!                                          44HI444HI!                                          ");
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##################################hi!hi", "###################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi" });
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                            444!   ", (java.lang.CharSequence) "             hi   hI!HIhI!HIh                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA", 0, "hi!hi!hi!aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA" + "'", str3, "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA");
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!   hi!hihi!hih################################hi4!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hihi!hih################################hi4!" + "'", str1, "!hi!hihi!hih################################hi4!");
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih", '4', 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("         h####################################", "        444hi!4444              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         h####################################" + "'", str2, "         h####################################");
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("############ih!ih###################################", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" hI!HI  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "############ih!ih###################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!4444     ", "i!hiHi!hiH################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444     " + "'", str2, "4444     ");
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#############################################HI!HI!##########################################...", 460, "                       #############################################hi!hi                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################HI!HI!##########################################...                       #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi" + "'", str3, "#############################################HI!HI!##########################################...                       #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi");
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("###################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################" + "'", str2, "###################################");
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  hiHI!HI                           hI!HI           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI" + "'", str1, "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hi" + "'", str1, "hi#hi");
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################" + "'", str1, "#############################");
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "  4444444444444444444444444444444444444444444444hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("444HI!H444", "4444444444444444444444444444444444444444444444444444aaaaaaa                         aaaaaaa     ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", 4);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("###############################################hi#!#hi#                                 ", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################" + "'", str2, "#########################################");
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("  4444444444444444444444444444444444444444444444!   ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444!   " + "'", str2, "  4444444444444444444444444444444444444444444444!   ");
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 36, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    " + "'", str3, "                                    ");
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!IHHI", "", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HIhI!HIhiHI!HIhI!HI", "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                        ", "             hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!   hi!hihi!hih################################hi4!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  !4ih################################hih!ihih!ih   !" + "'", str1, "  !4ih################################hih!ihih!ih   !");
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 258);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!HI                           hI!HI                           h", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI                           hI!HI                           h" + "'", str2, "!HI                           hI!HI                           h");
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HIHi!hiHi!hi#Hi!hiHi!hiHI", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Ih!iHi!444Ih!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!iHi!444Ih!iH" + "'", str1, "Ih!iHi!444Ih!iH");
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!HI                           hI!HI                           h################################", "                                                                                                                                                             ##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI                           h################################" + "'", str2, "I!HI                           hI!HI                           h################################");
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "  hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI#HI                    ", 85, 460);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI                    " + "'", str3, "HI#HI                    ");
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                   I!                        ", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444", 85, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    #HI   Hi!hiHi!hiH", "HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    #HI   Hi!hiHi!hiH" + "'", str2, "    #HI   Hi!hiHi!hiH");
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihh" + "'", str1, "!ihh");
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("     ##############444hi!4444     ############################444hi!4444     ################", "HI!", "hI!HI4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("           H44H4h44H4hiH44H4h44H4H44H", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###########HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########HI!H" + "'", str1, "###########HI!H");
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "###############################################hi#!#hi##############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", "HI ! HI ! HI ! HI", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI", 41, "44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI" + "'", str3, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI");
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI" + "'", str1, "HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hI!HI                           HI!HI            HIHI!HI                           HI!HI", "   hi!hihi!hih################################hi4!  ", 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str3, "hI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("         H                      ", "#########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################" + "'", str2, "#########################################");
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                  ###############################################HI#!#HI#                   ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH", "I!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("IH!IH", "HIHI", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I!I" + "'", str1, "!I!I");
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!hi                           hi!hi       ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47 + "'", int1 == 47);
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...#", "I!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                       a#HI!hi!hi!aa       a###", 998);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  a#HI!hi!hi!aa       a###                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  a#HI!hi!hi!aa       a###                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI!HI!HI!", "################################HhI!HI            ##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####" + "'", str3, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####");
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444444444HI!HI!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "             #############################             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444", "HI", "!", "HI", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str2, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444", "HI", "!", "HI", "!" });
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444HI!HI!...", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       4444444444HI!HI!...        " + "'", str2, "       4444444444HI!HI!...        ");
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("H         H         H         H        hi!         H         H         H         H", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4444444HIHi!hiHi!hiH#########");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                 HI!HIhI!HIhiHI!HIhI!HIHI!", "#########H#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4444444hI!HI                           hI!HI                           hI!HI                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                             I!                                             ", 47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             I!                                             " + "'", str2, "                                             I!                                             ");
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "H44H4h44H4hiH44H4h44H4H44H" });
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("I!HI                           hI!HI            hiHI!HI                           hI!HI", "hI!HIhI!HIh################################", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444   hiHI!HI                           hI!HI", "444444444444444444444444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HIHi!hiHi!hi#Hi!hiHi!hiH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444   hiHI!HI                           hI!HI" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "44444444444   hiHI!HI                           " });
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("iHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################...", "!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("I!HI                                       hiHI!HI                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       IH!IHih                                       IH!I" + "'", str1, "                                       IH!IHih                                       IH!I");
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!", 174, "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     " + "'", str3, "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ");
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hihi!hih################################    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hih################################    " + "'", str2, "hi!hihi!hih################################    ");
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                            444!                                ", "4444444444444444444444444444444!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            444!                                " + "'", str2, "                                                            444!                                ");
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI#################################hi!hi         ", "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih#############");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                   4444444                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI                           hI!HI            hiHI!HI                           hI!HI            ", "!ihhhI!                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!                                                                                                 ", 47, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!                                                                                                 " + "'", str3, "i!                                                                                                 ");
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "##### ######hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI                           hI!HI            hiHI!HI     ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ", "#### ######hi!hi", 50);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("           Hi!hi   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           hi!hi   " + "'", str1, "           hi!hi   ");
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################################################################################################################################################################################" + "'", str1, "#####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I!HI                           hI!HI            hiHI!HI                           hI!HI", 69, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str3, "I!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444HIHi!hiHi!hiH#########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", 19, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...             hI!HI            hiHI!HI    ..." + "'", str3, "...             hI!HI            hiHI!HI    ...");
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                 I!                                                                                                 ", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" ", 'a', 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                            ", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Ih!ih#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!ih#############################################" + "'", str1, "Ih!ih#############################################");
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "           H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444", "hi!ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444hi!4444     ", 66, "hi!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!444hi!4444     " + "'", str3, "hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!444hi!4444     ");
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#############################################hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################hi!hi" + "'", str1, "#############################################hi!hi");
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" H     hi!hi                 ", "          ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hI!HI                           hI!HI             hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "H", "", "", "", "", "hi!hi", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI   Hi!hiHi!hiH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 57, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 998);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!hi! HI!HI                           hI!HI            hiHI!HI       !  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!h", "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "...H!IH                           IH!IHIH            IH!IH                           IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("i!hihi!hi", "            hiHI!HI                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     4444444444444444444444444444444444444444444444 hI!HI                           ", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4444444444444444444444444444444444444444444444 hIHHI                           " + "'", str3, "     4444444444444444444444444444444444444444444444 hIHHI                           ");
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("IH!I", "!I                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!I" + "'", str2, "IH!I");
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaHI#HIaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("####", "IH!IH", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!HIhI!HIh################################", "################################...", (int) (byte) 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################");
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hI!HIhI!HIh################################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#################################i!!                               #################################", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################i!!                               #################################" + "'", str2, "##############################i!!                               #################################");
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...###################################hi#!#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###################################hi#!#hi" + "'", str1, "...###################################hi#!#hi");
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("i!hihi!hi", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hihi!hi" + "'", str2, "i!hihi!hi");
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "I!                 ", (java.lang.CharSequence) "                   4444444                   4444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "I!                 " + "'", charSequence2, "I!                 ");
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!Hi!hiHi!hiHi!hiHi!h...", "i!hiHi!ihHI!HI                           hI!HI            hiHI!HI                           hI!HI#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                        ", "##!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 'a', 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IH#Ih", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h    h    h    h    h    h                                 ...", "##");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...#I!HI", "!ihhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                              ", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              " + "'", str2, "                                                                              ");
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                         ", "                                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi#h", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#h" + "'", str2, "hi#h");
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444###############...", "I!HI                            ", 6);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444###############..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444###############..." + "'", str4, "44444444444444444444444444###############...");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44444444444444444444444444###############..." + "'", str6, "44444444444444444444444444###############...");
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                               hi!HI!HI!HI!HI!                              ", "                 HI!HIhI!HIhiHI!HIhI!HIHI!H", "aaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("##", '#', 873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("             HI   Hi!hiHi!hiH                 ", "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI                           HI!HI                           H################################                                        ", "444hi!4444", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi" + "'", str1, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", 159, "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A#############################################AHIA!AHIA                                                 !HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!" + "'", str3, "A#############################################AHIA!AHIA                                                 !HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("h####################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H         H         H         H        HI!         H         H         H         H         ", "                                      H    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("            #####################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#####################" });
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(".", "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                               ###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               ##################" + "'", str1, "                               ##################");
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("  4444444444444444444444444444444444444444444444!   ", "i!hihi!hi", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  4444444444444444444444444444444444444444444444!   " + "'", str3, "  4444444444444444444444444444444444444444444444!   ");
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#############################################hi!hi!#############################################", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IH!IH", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                       IH!IHih                                       IH!I", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   " + "'", str2, "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ");
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                 HI!HIhI!HIhiHI!HIhI!HIHI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH", "                                                                                                                                                                                                                                                                                               HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH" + "'", str3, "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH");
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ", (java.lang.CharSequence) "4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("44444444444444444444444444###############...", "ih!ih", 56, (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih!ih" + "'", str4, "ih!ih");
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Ih!iH                           ih!ihIH            ih!iH                           ih!ih", "AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                             ##", "", "hi!HI!HI!HI!HI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa", "I!444", 237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("     4444444444444444444444444444444444444444444444 hI!HI                           ", "                 HI!HIhI!HIhiHI!HIhI!HIHI!H", 0, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444 hI!HI                           " + "'", str4, "                 HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444 hI!HI                           ");
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "            IH!Ih                           IH!IHih            IH!Ih                           IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'a', 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray3, strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'a', 2);
        java.lang.String[] strArray21 = null;
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", strArray21, strArray24);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " ");
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#####", strArray29, strArray31);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray24, strArray29);
        boolean boolean34 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444", strArray24);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.replaceEach("I!444", strArray6, strArray24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str25, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "#####" + "'", str32, "#####");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "I!444" + "'", str35, "I!444");
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                               ##################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               ##################" + "'", str1, "                               ##################");
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI", "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 52, 387);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI" });
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444     ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI   Hi!hiHi!hiH    ", "Hhi!hihi!hih################################    ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" + "'", str2, "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa" + "'", str1, "aaaaaa");
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI     ...", "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                  ########                  ########", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  ########                  ########" + "'", str2, "                  ########                  ########");
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444###############...", 260, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444###############...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444###############...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                       #############################################hi!hi                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("AaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaahi!hi#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaahi!hi#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!                              ", "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################" + "'", str1, "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!HI                           hI!HI  444   4444hI!HI                           hI!HI ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                      444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH", "hih!ihih!ih############################### hi#hi hi#hi", "#########                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("       ################################        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################" + "'", str1, "################################");
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4444!ih444", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 19 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!", "HI", "                           ", "h", "I", "!", "HI", "            ", "hi", "HI", "!", "HI", "                           ", "h", "I", "!", "HI", "           " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", "..." });
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str1, "IH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih                                             ", "...                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!ih                                             " });
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444", ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("IH!IH###################################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!hi                           hi!hi            hihi!hi                           hi!hi", 36, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi                           hi!hi            hihi!hi                           hi!hi" + "'", str3, "i!hi                           hi!hi            hihi!hi                           hi!hi");
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################" + "'", str2, "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################");
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("             HI   Hi!hi!hihi!hih################################    iHi!hiH                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHi!hi!hihi!hih################################iHi!hiH" + "'", str1, "HIHi!hi!hihi!hih################################iHi!hiH");
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI#HI                    ", 81, "############444HI!4444     ###############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############444HI!4444     ###########################44HI#HI                    " + "'", str3, "############444HI!4444     ###########################44HI#HI                    ");
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     ", "4444444444444444444444444444444444444444444444hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###############################################hi#4#hi#############################################", "hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!444hi!4444     ", "..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################..##..#############################################" + "'", str3, "###############################################..##..#############################################");
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                    ...", "#####!#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    ..." + "'", str2, "                                                    ...");
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "...                           hi!hi            hihi!hi                           hi!hi           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!##", "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!##" + "'", str2, "hi!##");
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   hiHI!HI                           hI!HI          ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hiHI!HI                           hI!HI          " + "'", str2, "   hiHI!HI                           hI!HI          ");
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ", 54, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  " + "'", str3, "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("#############################################hi!hi", "I!HI                         HI!HIHI!HIH################################!HI                           hI!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi" + "'", str2, "#############################################hi!hi");
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                  ########                  ########", (java.lang.CharSequence) "                                                        ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                  ########                  ########" + "'", charSequence2, "                  ########                  ########");
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("      Hhi!                                     ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "      Hhi!                                     " });
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                   ", "hi!hi!", 89);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...                        hI!H...", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                   " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("I!HI                           hI!HI            hiHI!HI                           hI!HI            #", "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("    H         H         H         H      ", "#######################################", 873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("i!hi                           hi!hi            hihi!hi                           hi!hi            ", "ih!ih                                             ", "                               !ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444HIHi!hiHi!hiH#########", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi", 47);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444HIHi!hiHi!hiH#########" });
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi", "                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444", "i", "i4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444", "i", "i", "i4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444", "i", "i4444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444", "i" });
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" hI!HI  ", 260, "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hI!HI  aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaa" + "'", str3, " hI!HI  aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaa");
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####", 63, "HhI!HI            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####" + "'", str3, "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####");
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        char[] charArray12 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "H", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############################################HI!HI!##############################################hI!HI                           h################################", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###########################################", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "i!                                                                                                 ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#############################################", 349, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "#############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(".........I#I#HIHI#H44444444444444444", 324, "AAAAAAA                         AAAAAAA     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444" + "'", str3, "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi                           hi!hi       ...", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           hi!hi       ..." + "'", str2, "hi!hi                           hi!hi       ...");
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4 4", 52, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa4 4aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                   4444444                                                                          ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str2, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "     ", 67);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("     4444444444444444444444444444444444444444444444      ", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi!aa", "4444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!aa" + "'", str3, "Hi!aa");
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................", "#################################hi!IhI!aaaaaaaaaaaaaaaaa####################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                         aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaa" + "'", str1, "aaaaaaa");
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h", "!IHHI", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444                         aaaaaaa     ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa" + "'", str2, "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa");
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("444!   ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   " + "'", str2, "444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   ");
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("           Hi!hi   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hi" });
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444" + "'", str1, "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H         H         H         H        HI!         H         H         H         H         ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "Ih!iHi!444Ih!iH");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "", 10, 4);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi                           Hi!hi            HIhi!hi              ", "  4444444444444444444444444444444444444444444444hI!HI  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "i", "i", "i", "i", "i" });
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############################################################################################################################################################################################################################################################################################################################################################", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##############################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##############################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ", "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "#############################################HI!HI!######################################44444444444444444444444444444444444#########################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!Haaaaaaa                         aaaaaaa     HI!H", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HHI!                               ", 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HhI!HI            ", "  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...hi!444444444444...", "ih!ih###################################", " #############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...# #444444444444..." + "'", str3, "...# #444444444444...");
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...# #444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...# #444444444444..." + "'", str1, "...# #444444444444...");
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###########HI!", "4444444444444444444444444444444!   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 52, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("   ", "                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("           HI!HIhI!HIhiHI!HIhI!HIHI!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HIhI!HIhiHI!HIhI!HIHI!H" });
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hihi!hih################################", (java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                            hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI", "AAAAAihAAA", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "     4444444444444444444444444444444444444444444444 hIHHI                           ", (java.lang.CharSequence) "                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) " H     hi!hi                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " H     hi!hi                 " + "'", str1, " H     hi!hi                 ");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        char[] charArray6 = new char[] { 'a', '#', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!Haaaaaaa                         aaaaaaa     HI!H", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("############444HI!4444     ###########################44HI#HI                    ", "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "Hi!hi                           Hi!hi                           H################################", (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "############444HI!4444     ###########################44HI#HI                    " + "'", str4, "############444HI!4444     ###########################44HI#HI                    ");
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "I!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!444" + "'", str1, "I!444");
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hiHi!hi");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hiHi!hi" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hi" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!##", '#', 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HIHi!hiHi!hi#Hi!hiHi!hiHI", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          IH!IH                           IH!IHIH            IH!IH                           IH!IH", (int) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          IH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str3, "          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("  hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                               hi!HI!HI!HI!HI!                              ", "444hi!4444", 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          444hi!4444I!HI!HI!HI!                              " + "'", str3, "                                          444hi!4444I!HI!HI!HI!                              ");
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                            IH!I", "", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", 47, 55);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                      H    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      h    " + "'", str1, "                                      h    ");
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', (int) (short) 100, (int) 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', 84, 43);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a', 50, 43);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!  " + "'", str30, "hi!  ");
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        char[] charArray14 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaa                         aaaaaaa", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444HI!H444", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hhi!hihi!hih################################    ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...###################################hi#!#hi#", "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI", "       H         H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###################################hi#!#hi#" + "'", str3, "...###################################hi#!#hi#");
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "##############################i!!                               #################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44444444444444444444444444444444444", "I!HI  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444");
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444hi!4444444444444444444444444", "HI!HI                           HI!HI                           H", 24);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray8, strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "         H         H         H         H        hi!         H         H         H         H         ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HII!HI                                       hiHI!HI", strArray4, strArray8);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI", 65, 31);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444hi", "4444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!                                " + "'", str13, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HII!HI                                       hiHI!HI" + "'", str16, "HII!HI                                       hiHI!HI");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "#################################i!!                               #################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444444444444444444 hI!HI", "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444 hI!HI" + "'", str2, "4444444444444444444444444444444444444444444444 hI!HI");
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!4444     ##############444hi!4444     ############################444hi!4444     ################", 84, 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("             HI   Hi!hiHi!hiH                 ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ", 261);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             HI   Hi!hiHi!hiH                 " + "'", str3, "             HI   Hi!hiHi!hiH                 ");
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hiHI!HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I!HI                           hI!HI                           h################################", "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!HIhI!HIh################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HIhI!HIh" + "'", str2, "hI!HIhI!HIh");
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#####hi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#####hi!hi" });
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("H         H         H         H                    H         H         H         H", "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("     4444444444444444444444444444444444444444444444 hIHHI                           ", 7, "   hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4444444444444444444444444444444444444444444444 hIHHI                           " + "'", str3, "     4444444444444444444444444444444444444444444444 hIHHI                           ");
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hi!4444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444hi!4444" });
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi                           hi!hi       ...", "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           hi!hi       ..." + "'", str2, "hi!hi                           hi!hi       ...");
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  44444444444444444444444444444444444..." + "'", str2, "  44444444444444444444444444444444444...");
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#################################hi!                               #################################", 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI                            ", '#', 236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444", "#############################################hi!hi", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "   ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "4444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444444444444444444" + "'", str7, "4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444" + "'", str1, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444");
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi", "HhI!HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "            #####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            #####################" + "'", str1, "            #####################");
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444" + "'", str3, "4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444");
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray8, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           hI!HI                           h################################", strArray3, strArray8);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("####################################################");
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("             hI!HI             hi", strArray3, strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ", 3, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IH!IH#############################################" + "'", str14, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str15, "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!hiHi!hiH########################" + "'", str16, "Hi!hiHi!hiH########################");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             hI!HI             hi" + "'", str20, "             hI!HI             hi");
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###################", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", 33);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###################" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", (int) (short) 10);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                           hi!hi            hihi!hi                           hi!hi           ", "h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("            IH!Ih                           IH!IHih            IH!Ih                           IH", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "...                           ", "i!", "i            ", "i", "i!", "i                           ", "i!", "i           " });
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 4" + "'", str1, "4 4");
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#############################################HI!HI!##############################################");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    ", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ');
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray13, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray8, strArray18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "hI!HI");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("###########HI!H", strArray3, strArray8);
        int int25 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444", strArray3);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################HI!HI!##############################################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                    " + "'", str19, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "###########HI!H" + "'", str24, "###########HI!H");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "#############################################HI!HI!##############################################" + "'", str27, "#############################################HI!HI!##############################################");
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("       ################################        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ################################        " + "'", str1, "       ################################        ");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444", "     4444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444      " + "'", str2, "     4444444444444444444444444444444444444444444444      ");
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str1, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI!HI!H", "                                             I!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H" + "'", str2, "HI!HI!HI!H");
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                 HI!HIhI!HIhiHI!HIhI!HIHI!", "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("############################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############################################################################################################################################################################################################################################" + "'", str1, "############################################################################################################################################################################################################################################");
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IH IH###################################", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH IH###################################" + "'", str2, "IH IH###################################");
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("     4444444444444444444444444444444444444444444444 hIHHI                           ", 460, 56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                        hI!HI  ", "!44...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI#################################hi!hi         ", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI#################################hi!hi         " + "'", str2, "HI!HI#################################hi!hi         ");
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("... ...                                !ih!ih!ih!ih!ih!ih!ih", "HI!HI                           HI!HI                           H################################                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... ...                                !ih!ih!ih!ih!ih!ih!ih" + "'", str2, "... ...                                !ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444!hi!h444444444444444444444444444hi!h4444444444", "ih!ihih!ih!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH", (java.lang.CharSequence) "                           4            4                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "...#####################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "ih!ihih!ih");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444HI!H444", "##############444hi!4444     ##############", 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "HI", "H", "", "", "" });
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "############...", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "############..." + "'", charSequence2, "############...");
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi                           hi!hi            ..", "                          !IHHI            ", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi                           hi!hi            .." });
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ih!ih##################################", 45, "hi!hiHi!hiHIhi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hiHih!ih##################################" + "'", str3, "hi!hiHih!ih##################################");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH", "hI!HI4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH" + "'", str2, "Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH");
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#############################################################################################################################################################################################################################################", 81, "hI#HI!HI                           HI!HI            ..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################################################################################################################################################################################################################" + "'", str3, "#############################################################################################################################################################################################################################################");
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I!HI                           HI!HI            HIHI!HI                           HI!H...", "Hi!hiHi!hiH########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", "                                                                                                 ", 44);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("H################################ Hi!hi hi!hi", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str3, "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  a#HI!hi!hi!aa       a###                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        HI!         H         H         H         H", "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("H         H         H         H        hi!         H         H         H         H", "ih#ih ih#ih ###############################hi!hihi!hih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!HIhI!HIh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HIhI!HIh" + "'", str1, "!HIhI!HIh");
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###################################hi!hi", "IH!IH#############################################");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "hi" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############", "############4444444444444444444444444444444444444444444444!hi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############" + "'", str2, "HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############");
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!HIhI!HIh################################", 349, "                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         " + "'", str3, "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ");
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###########HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", "                                            HI!HI!HI!AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           " + "'", str1, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ");
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!44...", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        char[] charArray8 = new char[] { '4', '#', 'a', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "            hiHI!HI                           ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', '#', 'a', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     4444444444444444444444444444444444444444444444      ", (int) (byte) 1, 237);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4444444444444444444444444444444444444444444444      " + "'", str3, "     4444444444444444444444444444444444444444444444      ");
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("ih!ih", "            IH!Ih                           IH!IHih            IH!Ih                           IH", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("H!IH", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "                                      444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      444444444" + "'", str2, "                                      444444444");
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("..", "I                    ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".." + "'", str3, "..");
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444################################4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#############################################hi!hi!#############################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi!#############################################" + "'", str2, "#############################################hi!hi!#############################################");
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###############################################", 0, 998);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################" + "'", str3, "###############################################");
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############ih!ih###################################");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "############ih!ih###################################" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############ih!ih###################################" + "'", str2, "############ih!ih###################################");
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Ih!ih#############################################", "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                    HI#HI                    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444################################4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444################################4444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444################################4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ih!ih#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...I   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi                           hi!hi                           h################################", "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           hi!hi                           h################################" + "'", str2, "hi!hi                           hi!hi                           h################################");
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############################################HI################################################", "                                                       #############################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###############################################HI################################################" });
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#HI");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "          ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI#HI" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI#HI" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI#HI" + "'", str5, "HI#HI");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI#HI" + "'", str7, "HI#HI");
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#####    H     ", "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##!ih", "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", "!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###############################################", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444   HIhi!hi                           Hi!hi", "#hi!hi#hihihi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           hI!HI            ...", "             hi   hI!HIhI!HIh                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI                           HI!HI            HIHI!HI                           HI!HI           ", "4444444444444444444444444444444444444444444444HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI                           HI!HI            HIHI!HI                           HI!HI           " });
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hI!HIHI!HIH################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hih################################" + "'", str1, "hi!hihi!hih################################");
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", "                            h          ", "          ################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444##################################HI!HI4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hI   Hi!hiHi!hiH    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI   Hi!hiHi!hiH    " + "'", str2, "hI   Hi!hiHi!hiH    ");
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "         h         h         h         h        hi!         h         h         h         h         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444HI!HI", "!  !   hi!hihi!hih################################hi", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("############aaaaa###################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    !I", "i!hi                           hi!hi            hihi!hi                           hi!hi            ", "#########################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    !I" + "'", str3, "    !I");
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HHI!                               ", "44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             " + "'", str2, "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih#############", "!ihhh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!i!i", "HI#HI                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ih#ih ih#ih ###############################hi!hihi!hih", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihih ihih hi!hihi!hih" + "'", str2, "ihih ihih hi!hihi!hih");
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                       a#HI!hi!hi!aa       a###", "AAAAAihAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444", "                                                                                                                                                                                                                                                                                                        ", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI   Hi!hiHi!hiH################################      hiHI!HI          ", "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI   Hi!hiHi!hiH################################      hiHI!HI          " + "'", str2, "HI   Hi!hiHi!hiH################################      hiHI!HI          ");
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 277);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!" });
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray3, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!                                " + "'", str8, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  a#HI!hi!hi!aa       a###                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("###############################################hi#!#hi", "hih!ihih!ih############################### hi#hi hi#hi", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HI                           hI!HI                           h################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI", "####################################", "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##############444hi!4444###############", "                 HI!HIhI!HIhiHI!HIhI!HIHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ", "hi#h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...##### ######hi!hi", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444" + "'", str1, "4444444444444444444");
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI!HI                           HI!HI            ...", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!HI", "HI!HI", "..." });
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444", 260, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HhI!HI             ", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!" + "'", str1, "!i!");
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi! ", "            hiHI!HI                           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi! " });
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaa...", 25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  " });
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("            IH!Ih                           IH!IHih            IH!Ih                           IH", "# hI!HI hiHI!HI hI!HI I!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            IH!Ih                           IH!IHih            IH!Ih                           IH" + "'", str2, "            IH!Ih                           IH!IHih            IH!Ih                           IH");
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "################################..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("###########HI!H", "#############################################HI!HI!##########################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi                                                                                                                                                                                                                                          ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi                                                                                                                                                                                                                                          " });
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                           4            4                           ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "44444444444   HIhi!hi                           Hi!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI", "I!HI                         HI!HIHI!HIH################################!HI                           hI!H...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI" });
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I!                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("             #############################             ", 1, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            #############################   " + "'", str3, "            #############################   ");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444!ih444", (int) (byte) -1, "HI!HI#################################hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444!ih444" + "'", str3, "4444!ih444");
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ih!iH                           ih!ihIH            ih!iH                           ih!ih", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!iH                           ih!ihIH            ih!i" + "'", str2, "ih!iH                           ih!ihIH            ih!i");
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("I!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...# #444444444444...", 33, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...# #444444444444...aaaaaaaaaaaa" + "'", str3, "...# #444444444444...aaaaaaaaaaaa");
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("h####################################", "I!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h####################################" + "'", str2, "h####################################");
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!HI!HI!HI!HI!", "I!444", 873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  !4ih################################hih!ihih!ih   !", "HI!HI4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  !4ih################################hih!ihih!ih   !" });
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " hI!HI  aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...###################################hi#!#hi#", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!i!", 94, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                        hI!HI   ", "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "                                                                                                             I!HIhI!HIh################################                                                                                                              ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     ###############", "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     " + "'", str2, "HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     ");
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hi", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                     ##########", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#####" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 58 + "'", int3 == 58);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#", 51, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################" + "'", str3, "###################################################");
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444!   444hi!4444   ", "   ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hI!HI            hiHI!HI                           hI!HI            #", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444!", "444hi!4444", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 69 + "'", int4 == 69);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI                           HI!HI            HIHI!HI                           HI!HI           ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI                           HI!HI            HIHI!HI                           HI!HI           " });
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                           4            4                           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444" + "'", str2, "444444444444444444444444444444");
    }
}

