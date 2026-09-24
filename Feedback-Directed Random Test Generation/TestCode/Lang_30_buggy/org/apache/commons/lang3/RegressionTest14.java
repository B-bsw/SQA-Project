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
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###############################################   hi#hihi#hih################################h", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                              HI#HI                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           " + "'", str1, "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI  4444444444444444444444444444444444444444#############################################HI!HI", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI" + "'", str2, "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
    }

    @Test
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "IH!IH#############################################", "###################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Hi!hiHi!hi", "i!hiHi!hiH################################", "4444444hI!HI                           hI!HI                           hI!HI                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hi" + "'", str3, "Hi!hiHi!hi");
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                   4444444                                                                          ", "                                                                           ###################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                   4444444                                                                          " });
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!   hi!hihi!hih################################hi4!  ", "hi                                                                                                                                                                                                                                          ", 76);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!   hi!hihi!hih################################hi4!  " });
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 324, 56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444", "HhI!HI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444" + "'", str2, "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444");
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", "HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                  ", "##############hihHhihihihih################################hih################################!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Hi!aa", "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II" + "'", str2, "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!4444     ##############444hi!4444     ############################444hi!4444     ################", "44444444444444444444444444444444444", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "  " });
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa", 96, "44444444444   HIhi!hi                           Hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("###############################################hi#!#hi#", 19, 998);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################hi#!#hi#" + "'", str3, "############################hi#!#hi#");
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################" + "'", str1, "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444IH!IH##################################4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444##################################HI!HI4444" + "'", str1, "4444##################################HI!HI4444");
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray14);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        int int17 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("         H         H         H         H        hi!         H         H         H         H         ", strArray16);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray12, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray7, strArray12);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray20);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, '#', (int) (short) 10, 5);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                                                                                 ", strArray12, strArray20);
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        int int30 = org.apache.commons.lang3.StringUtils.indexOfAny("#############################################hi!hi", strArray29);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("###################", strArray20, strArray29);
        int int32 = org.apache.commons.lang3.StringUtils.indexOfAny("#############################################HI!HI!##############################################", strArray29);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " " + "'", str16, " ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!                                " + "'", str17, "hi!                                ");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!                                                                                                 " + "'", str26, "hi!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "###################" + "'", str31, "###################");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444", 46, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...hi!444444444444..." + "'", str3, "...hi!444444444444...");
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!hi                           hi!hi            hihi!hi                           hi!hi            ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi                           hi!hi            hihi!hi                           hi!hi            " });
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("##############################################################################################hi!hi!", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################hi!hi!" + "'", str2, "##############################################################################################hi!hi!");
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "###############################################", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!hihi!hi", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH!IH4444444444444444444444444444444444444444444444", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        char[] charArray14 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                        hI   Hi!hiHi!hiH                                                                                                                                                                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  4444444444444444444444444444444444444444444444hI!HI  ", "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444", 47, 40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI  " + "'", str4, "  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI  ");
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH IH###################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("44hi!hi!44", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    H     ", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    H     " + "'", str3, "    H     ");
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "#####!#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("          ################################", "44hi!hi!44", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "h####################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!HIHI!HIH################################", "###################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                              hI!HIhI!HIh################################");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                              ", "h", "I", "!", "H", "Ih", "I", "!", "H", "Ih", "################################" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "h", "I", "!", "H", "Ih", "I", "!", "H", "Ih", "################################" });
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "44hi!hi!4444hi!hi!4444hi!hi!44", 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hih!ihih!ih############################### hi#hi hi#hi");
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!ih!ihih!ih", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 83, "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa" + "'", str3, "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa");
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "#############################################hi!hi!#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "I!HIhI!HIh################################", "HI   Hi!hiHi!hiH################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ", "                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                            ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("    H  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                               #############################################", "                                                                                                                                                                                                                                                hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", "         H         H         H         H        4444444444444444444444444444444!   444hi!4444     H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################" + "'", str2, "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################");
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                         ", "!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44!IH!IH4444!IH!IH4444!IH!IH44                ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44!IH!IH4444!IH!IH4444!IH!IH44                " + "'", str3, "44!IH!IH4444!IH!IH4444!IH!IH44                ");
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("i!hiHi!hiH################################", "HI!HI4444444444444444444444444444444444444444#############################################HI!HI", 84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hiHi!hiH################################" + "'", str3, "i!hiHi!hiH################################");
    }

    @Test
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("###############################################hi#!#hi#############################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###############################################hi#!#hi#############################################" });
    }

    @Test
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI!HI!HI", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi        ", "ih!ih#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi        " + "'", str2, "Hi        ");
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hiHi!hiHIhi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hiHi!hiHIhi!hiHi!h" + "'", str1, "hi!hiHi!hiHIhi!hiHi!h");
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#HI", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HhI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI4444444444444444444444444444444444444444#############################################HI!HI", "    h     ", 29);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI4444444444444444444444444444444444444444#############################################HI!HI" });
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!hi                           hi!hi            hihi!hi                           hi!hi            ", "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi                           hi!hi            hihi!hi                           hi!hi            " });
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hI   Hi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...44444444444444444HIHi!hiHi!h...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####", "hi!#                          hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           ", 97);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####" });
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi..." + "'", str1, "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi...");
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    H  ", "                        hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI                           hI!HI            hiHI!HI                           hI!HI            ", (int) (short) 1, 61);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI                           hI!HI            hiHI!HI     ..." + "'", str3, "HI                           hI!HI            hiHI!HI     ...");
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("IH!IH!IH!IH", 42, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("H         H         H         H        HI!         H         H         H         H", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        HI!         H         H         H         H" + "'", str2, "        HI!         H         H         H         H");
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h################################ Hi!hi hi!hi", "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!HI                           HI!HI            ...", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!HI                           HI!HI            ..." });
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###################...###################################hi#!#hi#...#####################", "                                            ", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("####################################################################################################", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################" + "'", str3, "####################################################################################################");
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                             !ihIH!Ih                                            !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                            hI!HIhi!                                             " + "'", str1, "hi!                                            hI!HIhi!                                             ");
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H         H         H         H                    H         H         H         H", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " H         H         H         H                    H         H         H         H" + "'", str2, " H         H         H         H                    H         H         H         H");
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!HIhI!HIhiHI!HIhI!HIHI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" hI!HI  ", ' ', 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 258 + "'", int2 == 258);
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "             hi   hI!HIhI!HIh                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str2, "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str1, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444!   ", 36, "    H  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444!       H      H      H      H   " + "'", str3, "444!       H      H      H      H   ");
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         " + "'", str2, "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                                                                                                                                                                hihi#hi!hi#hihihi#hi!", "                                                            444!   ", (-1), (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!" + "'", str4, "                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!");
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HI!HIHI!HIH################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                       #############################################", "#", 159);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI", 15, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 15 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                       ", "" });
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#############################################", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################" + "'", str2, "#######################################");
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HI#################################hi!hi", "!HI                           hI!HI                           h", "                                                                                         ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "############444hi!4444     ###############", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "................AA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                      444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                      444444444" + "'", str1, "                                      444444444");
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI#################################hi!hi         ", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI#################################hi!hi         " + "'", str2, "HI!HI#################################hi!hi         ");
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 32);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############ih!ih###################################", "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("###############################################", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray9);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "############", "", "", "", "", "###################################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###############################################" + "'", str10, "###############################################");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "############aaaaa###################################" + "'", str12, "############aaaaa###################################");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!    ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("444hi!4444     ", "Hi!hiHi!hiH################################", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "HI!HIHI!HIH################################", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###############################################   hi#hihi#hih################################h", "hi!hi                           hi!hi                           h################################", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HIh################################" + "'", str1, "HI!HIhI!HIh################################");
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##############################################", "", "     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                  ", "                                                                           ###################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hI   Hi!hiHi!hiH    ", "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", 874);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("         H", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH4444444444444444444444444444444444444444444444" + "'", str1, "!IH!IH4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###################################" });
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         " + "'", str1, "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ");
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str2, "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        char[] charArray10 = new char[] { 'a', '#', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "     ", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##################################hi!hi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                                                                                                                                             !hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihi!hi" + "'", str1, "!hihi!hi");
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!#                          hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           hi!hi                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ", "44444444444444444444444444###############...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       " });
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("          IH!IH                           IH!IHIH            IH!IH                           IH!IH", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          IH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str2, "          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hI!HI                           hI!HI                           h################################", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!iH                           ih!ihIH            ih!iH                           ih!ih", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!Hi!hiHi!hiHi!hiHi!h...", "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444");
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("i!hihi!hi", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!ih", "ih!ihih", "ih!ih", "ih!ihih!ih", "ih!ihih", "ih!ih", "ih!ihih!ih", "ih!ihih", "ih!ih", "i" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi" + "'", str4, "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi");
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       ################################        ", "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!HI                         HI!HIHI!HIH################################!HI                           hI!H...", "   hi!hihi!hih################################hi4!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                         HI!HIHI!HIH################################!HI                           hI!H..." + "'", str2, "I!HI                         HI!HIHI!HIH################################!HI                           hI!H...");
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     ", "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     " + "'", str2, "4444444444444444444444444444444444444444444444444444AAAAAAA                         AAAAAAA     ");
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HIHi!hiHi!hi#Hi!hiHi!hiH", "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiH" + "'", str2, "HIHi!hiHi!hi#Hi!hiHi!hiH");
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi                           hi!hi            hihi!hi                           hi!hi           ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "HI   Hi!hiHi!hiH", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         H", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 I!                                                                                                 ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                    ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                    ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                          ", 97);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 237, 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih", "                                      444444444444444444444444", "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#", "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#############################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI                           HI!HI            ..", 159);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                     I  I                    ", "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH", 236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi" + "'", str1, "hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi");
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", "", 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi" + "'", str3, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!i!i", "#####    H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i" + "'", str2, "!i!i");
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!AA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!aa" + "'", str1, "hi!hi!hi!aa");
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "I!HI                                       hiHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 18, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444444444444444444444444444444444444444!");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444", "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 75 + "'", int3 == 75);
    }

    @Test
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...                           hi!hi            hihi!hi                           hi!hi          ", "444!  4444444444444444444444444444444444444444444444!   HI!HIHI!HIH################################HI", 54);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                           hi!hi            hihi!hi                           hi!hi          " + "'", str3, "...                           hi!hi            hihi!hi                           hi!hi          ");
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI                           H################################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray7, strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI                           HI!HI                           H################################", strArray3, strArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("                 HI!HIhI!HIhiHI!HIhI!HIHI!", strArray12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "!", "HI", "                           ", "H", "################################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                    " + "'", str13, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HI!HI                           HI!HI                           H################################" + "'", str16, "HI!HI                           HI!HI                           H################################");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ", "", "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              " + "'", str3, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!HIHI!HIH################################", "                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi####", '4', 236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444", "aaa!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444!       H      H      H      H   ", "I!HI  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HhI!HI                           hI!HI                           h################################HI", 277, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...################HI" + "'", str3, "...################HI");
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", "###################################", (int) ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!" + "'", str7, "!");
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "                HI!HI!HI!AA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########################################" + "'", str1, "###########################################");
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!                                ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...hi!444444444444...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI!", (int) '#', (int) (byte) -1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("H!IH", strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                 I!                                                                                                 ", "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("####", 236);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####" + "'", str2, "####");
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###############################################   hi#hihi#hih################################h", "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!HI                           HI!HI                           H################################                                        ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI                           H################################                                        " + "'", str2, "HI!HI                           HI!HI                           H################################                                        ");
    }

    @Test
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("      Hhi!                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444   hiHI!HI                           hI!HI", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444   hiHI!HI                           hI!HI" });
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                  ###############################################HI#!#HI#                   ", 6, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            #####################" + "'", str3, "            #####################");
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                           HI!HI                           H###############################", 296, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                        HI!HI                           H###############################" + "'", str3, "                                                                                                                                                                                                                                        HI!HI                           H###############################");
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "hi!hihi!hi", 350);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                       #############################################HI!HI                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################HI!HI" + "'", str1, "#############################################HI!HI");
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####", "###########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####" + "'", str2, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####");
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                       4#############################################4hi4!4hi4                        ", "###############################################hi#!#hi#                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#!#hi#                                 " + "'", str2, "###############################################hi#!#hi#                                 ");
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI!HI", "hiHI!HI", "hI!HI", "#" });
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!aa", "44hh44h", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!aa" });
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "                                ", "##############################################################################################hi!hi!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", "AAAAAihAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444..." + "'", str1, "44444444444444444444444...");
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "            IH!Ih                           IH!IHih            IH!Ih                           IH", "                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "444hi!4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             hI!HI             hi", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) ' ', 460);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "             hI!HI             hi" });
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("##### ######hi!hi", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#### ######hi!hi" + "'", str2, "#### ######hi!hi");
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "##!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...                                !ih!ih!ih!ih!ih!ih!ih", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", "                                                                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 11, "...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                hi                 ", "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#", 92);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                hi                 " });
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI                           hI!HI            hiHI!HI     ...", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                           hI!HI            hiHI!HI     ..." + "'", str2, "HI                           hI!HI            hiHI!HI     ...");
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  4444444444444444444444444444444444444444444444!   " + "'", str1, "  4444444444444444444444444444444444444444444444!   ");
    }

    @Test
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("i!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hihi!hihihi!hihi!hi" + "'", str1, "i!hihi!hihihi!hihi!hi");
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "    H                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih!ih###################################", "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "i", "###################################" });
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh", "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                        hI!HI            ", "hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         h####################################", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444HI!HI!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str2, "4444444444444444444444444444444444444444444444HI!HI!");
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###############################################hi#!#hi#                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("I!HI                           hI!HI            hiHI!HI                           hI!H...", "                                                                                                                                                                                                                                                                                                                                                                                                                               #############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!H...");
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################", "################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444" + "'", str2, "444444444444444444444444");
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!44...", "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  " + "'", str1, "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444   hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!HIhI!HIh################################", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!HIhI!HIh################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!HIhI!HIh################################" + "'", str4, "hI!HIhI!HIh################################");
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                   4444444444444444444444444444444444444444444444HI!HI!...                    ", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 40, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...                   ", "HI!HI!...                    " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("......!ih!ih!ih!ih!ih!ih!ih", "#####hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "......!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                       A#############################################AHIA!AHIA                        ", "                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       A#############################################AHIA!AHIA                        " + "'", str2, "                       A#############################################AHIA!AHIA                        ");
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!" + "'", str1, "HI!HI!HI!");
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...44444444444444444HIHi!hiHi!h...", "                                            HI!HI!HI!AA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  ", "#############################################HI!HI!#############################################", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                              I", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", 874);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!HIHI!HIH################################", "!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HIHI!HIH################################" + "'", str2, "!HIHI!HIH################################");
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############################################HI!HI", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...###################################hi#!#hi", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi#hhi   hi!hihi!hih################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hhi   hi!hihi!hih################################" + "'", str1, "hi#hhi   hi!hihi!hih################################");
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HhI!HI             ", "#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              " + "'", str2, "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ");
    }

    @Test
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                       a#############################################ahia!ahia", "#############################################HI!HI!##############################################hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hI!HI                           HI!HI            ...", "aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("################################...", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################..." + "'", str3, "################################...");
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                   ", 65, "!ihhh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   " + "'", str3, "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ");
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!                               ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hhhhhhhhhhhhhhhhhhhhhhh", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
        char[] charArray6 = new char[] { '4', '#', 'a', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444HI!H444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', '#', 'a', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "                                            HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#######################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44hi!hi!44", '4', 296);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hi!hiHi!hiH", "    H         H         H         H      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("H");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaah", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "H" });
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("I!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "I!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("################################hi!                               ############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################hi!                               ############" + "'", str1, "################################hi!                               ############");
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                       a#HI!hi!hi!aa       a###", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       a#HI!hi!hi!aa       a###" + "'", str2, "                       a#HI!hi!hi!aa       a###");
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ih!ih#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HIhI!HIh################################" + "'", str1, "hI!HIhI!HIh################################");
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#####hi!hi", "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!HIHI!HIH##############...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("I!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    !I" + "'", str1, "    !I");
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", (int) 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi###" + "'", str3, "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi###");
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!4444    ", 9, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ", "444444444444444444444444hi!4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              " + "'", str2, "                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ");
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence6, charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############################################HI!HI!#############################################", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           HI!HI            ...", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HHHHHI!HHHH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 260, "############ih!ih###################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################" + "'", str3, "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################");
    }

    @Test
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444hi!hi!" + "'", str1, "4444444444444444444444444444444444444444444444hi!hi!");
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!   hi!hihi!hih################################hi4!  ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!   hi!hihi!hih################################hi4!  " + "'", str2, "!   hi!hihi!hih################################hi4!  ");
    }

    @Test
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                HI!HI!HI!AA", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           HI!HI                           H################################                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI                           H################################" + "'", str1, "HI!HI                           HI!HI                           H################################");
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("      4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      4444444444444444444444444444444444444444444444" + "'", str1, "      4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#############################################hi!hi!#############################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi!#############################################" + "'", str2, "#############################################hi!hi!#############################################");
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi                           hi!hi            hihi!hi                           hi!hi            " + "'", str1, "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                        hI   Hi!hiHi!hiH                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI   Hi!hiHi!hiH" + "'", str1, "hI   Hi!hiHi!hiH");
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI                           hI!HI                           h###############################", "444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HI                           hI!HI                           h###############################" });
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!" + "'", str1, "hi!hi!");
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hih!ihih!ih############################### hi#hi hi#hi", 261, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str2, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                           4            4                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4            4" + "'", str1, "4            4");
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                               ###################", "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("h    h    h    h    h    h                                             h    h    h    h    h    h  ", ' ', 324);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("..", "hi!hi!hi!aa", "    H         H         H         H      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".." + "'", str3, "..");
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           HI!HI                           H################################", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "               ", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!aa", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hih!ihih!ih############################### hi#hi hi#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                iihi!hi!iiiihi!hi!iiiihi!hi!iihihi                iihi!hi!iiiihi!hi!iiiihi!hi!ii!                iihi!hi!iiiihi!hi!iiiihi!hi!iihi" + "'", str1, "!                iihi!hi!iiiihi!hi!iiiihi!hi!iihihi                iihi!hi!iiiihi!hi!iiiihi!hi!ii!                iihi!hi!iiiihi!hi!iiiihi!hi!iihi");
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("             hI!HI             hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "             ", "h", "I", "!", "HI", "             ", "hi" });
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                           HI!HI                           H################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                           HI!HI                           H" });
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ihhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihhh" + "'", str1, "!ihhh");
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444HI!H444      ", "#### ######hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444HI!H444      " + "'", str2, "444HI!H444      ");
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', (int) 'a', 39);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ih!ih", "ih!ihih", "ih!ih", "ih!ihih!ih", "ih!ihih", "ih!ih", "ih!ihih!ih", "ih!ihih", "ih!ih", "i" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("i!444", "4444IH!IH##################################4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "...#I!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!hihi!hih################################    ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!Haaaaaaa                         aaaaaaa     HI!H", "###################################", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!Haaaaaaa                         aaaaaaa     HI!H" });
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("IH!IH", 75, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH######################################################################" + "'", str3, "IH!IH######################################################################");
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         H         H         H         H        HI!         H         H         H         H         ", "    H                                      ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("####################################################################################################################################################################################################################################################################", strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                          ");
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...", strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", '#');
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("               ", strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI   Hi!hiHi!hiH    ", strArray8, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 99 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 260 + "'", int6 == 260);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  " + "'", str1, "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              hI!HIhI!HIh################################", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "iH!IH#############################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                              hI!HIhI!HIh################################" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                              hI!HIhI!HIh################################" + "'", str13, "                                              hI!HIhI!HIh################################");
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###############################################hi#!#hi#############################################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                            444!   ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444", (java.lang.CharSequence) "!IHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("################################HhI!HI            ##", "h################################ hi#hi hi#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("         h");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "         ", "h" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "h" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str4, "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!ih##################################", "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaHI#HIaaa", "HI!hi!hi!aa", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaHI#HIaaa" + "'", str3, "aaHI#HIaaa");
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("           hi!hiHi!hiHIhi!hiHi!hihi!h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hiHi!hiHIhi!hiHi!hihi!h" });
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 281 + "'", int2 == 281);
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", "###################################", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444###############################################444444444444444444444444444", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!" + "'", str6, "!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444444444444444444444444###############################################444444444444444444444444444" + "'", str8, "44444444444444444444444444###############################################444444444444444444444444444");
    }

    @Test
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                              HI#HI                                              ", "###################...###################################hi#!#hi#...#####################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hI#HHI   Hi!hiHi!hiH################################", "    H     hi!hi                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################", "#############################################HI!HI!##########################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################" + "'", str2, "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################");
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("     4444444444444444444444444444444444444444444444 HI!HI                           ", "                                            HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444" + "'", str2, "     4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################", "Ih!iH                           ih!ihIH            ih!iH                        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################" + "'", str2, "############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################");
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray10, strArray15);
        java.lang.String[] strArray18 = null;
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray20, "");
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray18, strArray20);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   ", strArray10, strArray20);
        int int25 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!h", strArray10);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi", strArray3, strArray10);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                    " + "'", str16, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                    " + "'", str22, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "H" + "'", str23, "H");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "   " + "'", str24, "   ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" + "'", str26, "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############################################HI!HI!#############################################", "##########################################################################################################################################################################", 63);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 42, (int) (byte) 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                       A#############################################AHIA!AHIA                        ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################HI!HI!#############################################" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#############################################HI!HI!#############################################" + "'", str11, "#############################################HI!HI!#############################################");
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444", "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#hi!hi#hihihi#" + "'", str2, "#hi!hi#hihihi#");
    }

    @Test
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...                                !ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                   ", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                           HI!HI                           H################################");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                   " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#############################################HI!HI!##############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################", "#################################i!!                               #################################", "hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################" + "'", str3, "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444", "##############444hi!4444###############", "                                                                                                                                                        ##############################################                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              " + "'", str3, "                                              ");
    }

    @Test
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("       aaaaaaa", "HI!HHHHHHHHHHHHHHHHHHHHHHH", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HIHi!hiHi!hi#Hi!hiHi!hiH", 236, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH");
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                HI!HI!HI!AA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                HI!HI!HI!AA" + "'", str1, "                HI!HI!HI!AA");
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                            ", "                    HI#HI                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#HI                    " + "'", str2, "HI#HI                    ");
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!hihi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi" + "'", str2, "hi!hihi!hi");
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#############################################HI!HI!##############################################hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", "                                                                                        ", 39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi" });
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("################################4444444444444444444444444444444444444444444444444444444444444444444", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################4444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "################################4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                            HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi#hi", "I!HI                                       hiHI!HI                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         H         H         H         H        HI!         H         H         H         H         ", "    H                                      ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!444", "...#I!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!444" });
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "           HI!HIhI!HIhiHI!HIhI!HIHI!H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HIHI!HI", 35, 349);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HhI!HI                           hI!HI                           h################################HI", "HI   Hi!hiHi!hiH    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("         H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "         ", "H", "         ", "H", "         ", "H", "         ", "H", "        ", "HI", "!", "         ", "H", "         ", "H", "         ", "H", "         ", "H", "         " });
    }

    @Test
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "!I                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", "#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                        ", "Hi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        " + "'", str2, "                        ");
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", (int) (short) 10);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#HI", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("###################################HI!HI################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################HI!HI################" + "'", str1, "###################################HI!HI################");
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              HI#HI                                              " + "'", str1, "                                              HI#HI                                              ");
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    h     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    h    " + "'", str1, "    h    ");
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###########################################", "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("IH!IH##################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                           ", "                                                                                                                                                                                                                                        HI!HI                           H###############################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH##################################" + "'", str3, "IH!IH##################################");
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("         H                      ", "hi!4444     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H                      " + "'", str2, "         H                      ");
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hI#HHI   Hi!hiHi!hiH################################", "AAAAAAA                         AAAAAAA     ", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hI!HI                           hI!H...", 873, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                        hI!H..." + "'", str3, "...                        hI!H...");
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                       #############################################", "", 97, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###" + "'", str4, "###");
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                       #############################################hi!hi                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        ih!ih#############################################                       " + "'", str1, "                        ih!ih#############################################                       ");
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####", "#############################################HI#HI###############################################hI#HI                           h################################", 237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str1, "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hI!HI                           hI!HI             hi", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI                           hI!HI             hi" + "'", str3, "hI!HI                           hI!HI             hi");
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI", "hI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                 444!   ", 159);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 444!                                                                                                                                          " + "'", str2, "                 444!                                                                                                                                          ");
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                                                                                                                                                                                          HI!HI!HI!AA", "444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!                                             ", "    !I", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" H         H         H         H                    H         H         H         H", "", 45);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " H         H         H         H                    H         H         H         H" });
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("h################################ hi#hi hi#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih#ih ih#ih ################################h" + "'", str1, "ih#ih ih#ih ################################h");
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HhI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "iHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H", 15, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!IIhI!IIh" + "'", str3, "hI!IIhI!IIh");
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!#######", "i!hi                           hi!hi            hihi!hi                           hi!hi            ", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "#######" });
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "##############################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 46 + "'", int1 == 46);
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "HI!HIhI!HIhiHI!HIhI!HIHI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HIHI!H");
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444!  4444444444444444444444444444444444444444444444!   HI!HIHI!HIH################################HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44HI444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44HI444" + "'", str1, "44HI444");
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI", "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI" + "'", str2, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!hihi!hihihi!hihi!hi", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hihi!hihihi!hihi!hi" });
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                                 ", "HI!HI", 52);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hI!HIhI!HIh################################", "###########HI!H", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi####", "hI!HI            hiHI!HI                           hI!HI            #", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaha...", "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaha..." + "'", str2, "aaaaha...");
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hI#H", "HI!HHHHHHHHHHHHHHHHHHHHHHH", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI#HI", "h################################ hi#hi hi#hi", (int) (byte) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHI" + "'", str4, "HIHI");
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI!hi!hi!aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                    ", "hi!#######", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                    " });
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                           hI!HI            hiHI!HI                           hI!HI            #", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("            hiHI!HI                          ", "   !4444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI          " + "'", charSequence2, "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ");
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...##########################################################################################...", "hI!HI", (int) (short) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                        ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...##########################################################################################..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "...##########################################################################################..." + "'", str5, "...##########################################################################################...");
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   hiHI!HI                           hI!HI          ", "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                  ", (java.lang.CharSequence) "          ################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                  " + "'", charSequence2, "                  ");
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH" + "'", str1, "HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH");
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("##", "ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###############################################hi#!#hi#                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###############################################hi#!#hi#" });
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                             I!HIhI!HIh################################                                                                                                              ", "hi!hihi!hih################################", "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#### ######hi!hi", "hI!                               ", 17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####", "######", "i", "i" });
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "       ################################        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("44HI444", 387, 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44HI444" + "'", str3, "44HI444");
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#######################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                   ", "             hi   hI!HIhI!HIh                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str2, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                                                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH", 232, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                                                                                    ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaa                         aaaaaaa", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa ..." + "'", str2, "aaaaaaa ...");
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi" + "'", str2, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("############################hi#!#hi#", "   hi!hihi!hih################################hi4!  ", 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################hi#!#hi#" + "'", str3, "############################hi#!#hi#");
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############" + "'", str1, "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############");
    }

    @Test
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!HI4444444444444444444444444444444444444444#############################################HI!HI", "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################..." + "'", str1, "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("    H         H         H         H      ", "hih!ihih!ih############################### hi#hi hi#hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H         H         H         H      " + "'", str2, "    H         H         H         H      ");
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ", 56, 44);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 277, 81);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "##################################hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################hi!hi" + "'", str1, "##################################hi!hi");
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("H         H         H         H        HI!         H         H         H         H         ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!         H         H         H         H         " + "'", str2, "!         H         H         H         H         ");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!         H         H         H         H         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("IH!IH##########Hi!hiHi!hiH##################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH##########Hi!hiHi!hiH##################################################" + "'", str1, "IH!IH##########Hi!hiHi!hiH##################################################");
    }

    @Test
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############################################   hi#hihi#hih################################h", "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                  ", 35, 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###############################################   hi#hihi#hih################################h" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!HI                           hI!HI                           h################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI                           h################################" + "'", str2, "HI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("         h", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH", (java.lang.CharSequence) "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161 + "'", int2 == 161);
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#####################################################################################################################################################################################################################################################################", "#################################hi!                               #################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################################################################################################################################################################################################################################################################" + "'", str2, "#####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaa", 874, 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH", "IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH" + "'", str2, "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH");
    }

    @Test
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                            ", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444" + "'", str1, "444444444444444444444444");
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", "", 92, 89);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI          HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             " + "'", str4, "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI          HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("#############################################HI!HI!##############################################", 387, 162);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih##############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih#############" + "'", str1, "                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih#############");
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...hi!444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi!444444444444..." + "'", str1, "...hi!444444444444...");
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("      Hhi!                                     ", "####");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaa", "                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                hi                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("I!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!                                                                                                 " + "'", str1, "i!                                                                                                 ");
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!aa", "hi!HI!HI!HI!HI!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           ", strArray5, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!hi");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!HI                           " + "'", str11, "hI!HI                           ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                 h                                                  ", "                       hiHI!HI              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                                                                                                                                                             !hihi!hi", "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         H         H         H         H                    H         H         H         H      ", "                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444", 159, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str1, "                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "##############################################################################################hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("IH!IH                           IH!IHIH            IH!IH                           IH!IH", 460, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!4444     ##############444hi!4444     ############################444hi!4444     ################", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     ##############444hi!4444     ############################444hi!4444     ################" + "'", str2, "     ##############444hi!4444     ############################444hi!4444     ################");
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Ih!iHi!444Ih!iH", "                                                                                                 !ih", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I", "H", "444I", "H" });
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI", "###################################", 873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("############ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###############################################ih!ih###################################", '4', 232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!   hi!hihi!hih################################hi4!  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!   hi!hihi!hih################################hi4!  " + "'", str2, "!   hi!hihi!hih################################hi4!  ");
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################", "Hi!hiHi!hiH########################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "############444hi!4444     ###############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ih!ihih!ih" + "'", str1, "hi!ih!ihih!ih");
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         H", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...                           hi!hi            hihi!hi                           hi!hi          ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                 444!                                                                                                                                          ", "###############################################HI#!#HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 444!                                                                                                                                          " + "'", str2, "                 444!                                                                                                                                          ");
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("        HI!         H         H         H         H", 33, 76);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       H         H" + "'", str3, "       H         H");
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HI   Hi!hiHi!hiH################################    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!  !   hi!hihi!hih################################hi", "             #############################             ", 237);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("i!hiHi!hiH################################", "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI", 7, 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!hiHi!ihHI!HI                           hI!HI            hiHI!HI                           hI!HI#############" + "'", str4, "i!hiHi!ihHI!HI                           hI!HI            hiHI!HI                           hI!HI#############");
    }

    @Test
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         H         H         H         H                    H         H         H         H      ", "IAHI                           hIAHI            hAHIAHI                           hIAHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("I!HI                           HI!HI            HIHI!HI                           HI!H...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI                           HI!HI            HIHI!HI                           HI!H..." + "'", str1, "I!HI                           HI!HI            HIHI!HI                           HI!H...");
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi                                                                                                                                                                                                                                          ", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi                                                                                                                                                                                                                                          " + "'", str2, "hi                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                 !ih", "444hi!4444     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("            hiHI!HI                                       hiHI!HI               4444444444444444444", "444", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 52, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!HI                           H################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI!HI                           hI!HI                           h################################");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    h     ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "I", "!", "HI", "                           ", "h", "I", "!", "HI", "                           ", "h", "################################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

